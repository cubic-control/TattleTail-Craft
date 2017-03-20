package com.cubic_control.TTM.Entity;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIRestrictOpenDoor;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.EnderTeleportEvent;

import com.cubic_control.TTM.Blocks.MBlockManager;
import com.cubic_control.TTM.Config.MConfig;
import com.cubic_control.TTM.Entity.AI.EntityAIStalking;
import com.cubic_control.TTM.Items.MItemManager;
import com.cubic_control.TTM.Lib.RefStrings;

public class EntityPapa extends EntityMob{
	public int timeUntilNextEgg;

	public EntityPapa(World par1World) {
		super(par1World);
		this.timeUntilNextEgg = this.rand.nextInt(6000) + 6000;
		
		this.getNavigator().setAvoidSun(true);
		this.getNavigator().setAvoidsWater(true);
		this.getNavigator().setBreakDoors(true);
		this.getNavigator().setCanSwim(false);
		this.getNavigator().setEnterDoors(true);
		this.tasks.addTask(0, new EntityAIStalking(this));
		
		this.tasks.addTask(2, new EntityAIAttackOnCollide(this, 1.0D, false));
		this.tasks.addTask(3, new EntityAIRestrictOpenDoor(this));
        this.tasks.addTask(4, new EntityAIOpenDoor(this, true));
        this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 0.6D));
        
        this.tasks.addTask(8, new EntityAILookIdle(this));
        this.tasks.addTask(9, new EntityAIWander(this, 0.6D));
        this.tasks.addTask(10, new EntityAIWatchClosest(this, EntityLiving.class, 8.0F));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
	}
	@Override
	protected void applyEntityAttributes() {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(50.0D);
        this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(20.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.235D);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(25.0D);
    }
	@Override
	protected void entityInit() {
        super.entityInit();
        this.getDataWatcher().addObject(12, Byte.valueOf((byte)0));
        this.getDataWatcher().addObject(13, Byte.valueOf((byte)0));
        this.getDataWatcher().addObject(14, Byte.valueOf((byte)0));
    }
	@Override
	protected boolean isAIEnabled() {
        return true;
    }
	@Override
	protected Item getDropItem() {
        return MItemManager.papa_TattleTail;
    }
	@Override
	public EnumCreatureAttribute getCreatureAttribute() {
        return EnumCreatureAttribute.UNDEFINED;
    }
	@Override
	protected void dropRareDrop(int par1) {
        switch (this.rand.nextInt(3)) {
            case 0:
                this.dropItem(MItemManager.ketchup, 1);
                break;
            case 1:
                this.dropItem(MItemManager.mystery_egg, 1);
                break;
            case 2:
                this.dropItem(MItemManager.rechargeable_flashlight_gold, 1);
        }
    }
	@Override
    protected boolean canDespawn() {
		return false;
    }
	@Override
	protected String getHurtSound() {
        return RefStrings.MODID + ":eletric.spark";
    }
	@Override
	protected String getDeathSound() {
        return RefStrings.MODID + ":eletric.spark";
    }
	@Override
	protected float getSoundPitch() {
        return 1.0f;
    }
	
	//Teleportation
	
	protected boolean teleportRandomly() {
        double d0 = this.posX + (this.rand.nextDouble() - 0.5D) * 64.0D;
        double d1 = this.posY + (double)(this.rand.nextInt(64) - 32);
        double d2 = this.posZ + (this.rand.nextDouble() - 0.5D) * 64.0D;
        return this.teleportTo(d0, d1, d2);
    }
	
	protected boolean teleportToEntity(Entity par1Entity) {
        Vec3 vec3 = this.worldObj.getWorldVec3Pool().getVecFromPool(this.posX - par1Entity.posX, this.boundingBox.minY + (double)(this.height / 2.0F) - par1Entity.posY + (double)par1Entity.getEyeHeight(), this.posZ - par1Entity.posZ);
        vec3 = vec3.normalize();
        double d0 = 16.0D;
        double d1 = this.posX + (this.rand.nextDouble() - 0.5D) * 8.0D - vec3.xCoord * d0;
        double d2 = this.posY + (double)(this.rand.nextInt(16) - 8) - vec3.yCoord * d0;
        double d3 = this.posZ + (this.rand.nextDouble() - 0.5D) * 8.0D - vec3.zCoord * d0;
        return this.teleportTo(d1, d2, d3);
    }
	
	protected boolean teleportTo(double par1, double par3, double par5) {
        EnderTeleportEvent event = new EnderTeleportEvent(this, par1, par3, par5, 0);
        if(MinecraftForge.EVENT_BUS.post(event)){
            return false;
        }
        double d3 = this.posX;
        double d4 = this.posY;
        double d5 = this.posZ;
        this.posX = event.targetX;
        this.posY = event.targetY;
        this.posZ = event.targetZ;
        boolean flag = false;
        int i = MathHelper.floor_double(this.posX);
        int j = MathHelper.floor_double(this.posY);
        int k = MathHelper.floor_double(this.posZ);

        if (this.worldObj.blockExists(i, j, k)) {
            boolean flag1 = false;

            while (!flag1 && j > 0) {
                Block block = this.worldObj.getBlock(i, j - 1, k);

                if (block.getMaterial().blocksMovement()) {
                    flag1 = true;
                }else{
                    --this.posY;
                    --j;
                }
            }

            if (flag1) {
                this.setPosition(this.posX, this.posY, this.posZ);

                if (this.worldObj.getCollidingBoundingBoxes(this, this.boundingBox).isEmpty() && !this.worldObj.isAnyLiquid(this.boundingBox)) {
                    flag = true;
                }
            }
        }

        if (!flag) {
            this.setPosition(d3, d4, d5);
            return false;
        }else{
            short short1 = 128;

            for (int l = 0; l < short1; ++l) {
                double d6 = (double)l / ((double)short1 - 1.0D);
                float f = (this.rand.nextFloat() - 0.5F) * 0.2F;
                float f1 = (this.rand.nextFloat() - 0.5F) * 0.2F;
                float f2 = (this.rand.nextFloat() - 0.5F) * 0.2F;
                double d7 = d3 + (this.posX - d3) * d6 + (this.rand.nextDouble() - 0.5D) * (double)this.width * 2.0D;
                double d8 = d4 + (this.posY - d4) * d6 + this.rand.nextDouble() * (double)this.height;
                double d9 = d5 + (this.posZ - d5) * d6 + (this.rand.nextDouble() - 0.5D) * (double)this.width * 2.0D;
            }
            return true;
        }
    }
	@Override
	public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
		if (this.isEntityInvulnerable()) {
            return false;
        }else{
        	if(par1DamageSource instanceof EntityDamageSource && par1DamageSource.getEntity() instanceof EntityPlayer) {
				if(this.teleportRandomly()) {
                	return true;
            	}
				
				return super.attackEntityFrom(par1DamageSource, par2);
        	}else{
        		return super.attackEntityFrom(par1DamageSource, par2);
        	}
        }
	}
	@Override
	public void onLivingUpdate() {
        if (this.isWet()){
            this.attackEntityFrom(DamageSource.drown, 1.0F);
        }

        //if (this.worldObj.isDaytime() && !this.worldObj.isRemote) {
            //float f = this.getBrightness(1.0F);

            //if (f > 0.5F && this.worldObj.canBlockSeeTheSky(MathHelper.floor_double(this.posX), MathHelper.floor_double(this.posY), MathHelper.floor_double(this.posZ)) && this.rand.nextFloat() * 30.0F < (f - 0.4F) * 2.0F) {
                //this.entityToAttack = null;
                //this.teleportRandomly();
            //}
        //}

        if (this.isWet() || this.isBurning()) {
            this.teleportRandomly();
        }

        if (this.entityToAttack != null) {
            this.faceEntity(this.entityToAttack, 100.0F, 100.0F);
        }

        //if (!this.worldObj.isRemote && this.isEntityAlive()) {
            //if (this.entityToAttack != null) {
                //if (this.entityToAttack instanceof EntityPlayer) {
                    //if (this.entityToAttack.getDistanceSqToEntity(this) < 16.0D) {
                        //this.teleportRandomly();
                    //}
                //}
            //}
        //}
        
    	if (!this.worldObj.isRemote && --this.timeUntilNextEgg <= 0) {
    		if(MConfig.doesPapaLayEggs){
    			this.dropItem(MItemManager.mystery_egg, 1);
            	this.timeUntilNextEgg = this.rand.nextInt(6000) + 6000;
    		}
        }

        super.onLivingUpdate();
    }

}

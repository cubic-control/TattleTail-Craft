package com.cubic_control.TTM.Entity;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIFleeSun;
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

public class EntityMama_choco extends EntityMama{

	public EntityMama_choco(World par1World) {
		super(par1World);
	}
	@Override
	protected Item getDropItem() {
        return MItemManager.choco_mama_TattleTail;
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

}

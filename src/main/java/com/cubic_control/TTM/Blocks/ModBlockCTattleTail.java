package com.cubic_control.TTM.Blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

import com.cubic_control.TTM.Entity.TileEntity.TileEntityCTattleTail_bendy;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityCTattleTail_beta;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityCTattleTail_candy_corn;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityCTattleTail_cubic;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityCTattleTail_dark;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityCTattleTail_demonic;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityCTattleTail_fairy;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityCTattleTail_freddy;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityCTattleTail_girrafe;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityCTattleTail_lol;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityCTattleTail_neighbor;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityCTattleTail_pumpkin;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityCTattleTail_red;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityCTattleTail_sans;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityCTattleTail_scott;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityCTattleTail_shadow;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityCTattleTail_spring;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityCTattleTail_withered;
import com.cubic_control.TTM.Items.MItemManager;
import com.cubic_control.TTM.Lib.RefStrings;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlockCTattleTail extends ModBlockContainer{

	protected ModBlockCTattleTail(String name) {
		super(Material.cloth, name, 0.0f, null, 0, 0.0f, Block.soundTypeCloth);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.5F, 1.0F);
		this.setBlockTextureName(RefStrings.MODID + ":" + name);
		this.setCreativeTab(null);
		this.setLightOpacity(0);
		GameRegistry.registerBlock(this, name);
	}
	@Override
	public TileEntity createNewTileEntity(World world, int i1) {
		if(this == MBlockManager.bendy_TattleTail){
			return new TileEntityCTattleTail_bendy();
		}else if(this == MBlockManager.beta_TattleTail){
			return new TileEntityCTattleTail_beta();
		}else if(this == MBlockManager.candy_corn_TattleTail){
			return new TileEntityCTattleTail_candy_corn();
		}else if(this == MBlockManager.cubic_TattleTail){
			return new TileEntityCTattleTail_cubic();
		}else if(this == MBlockManager.dark_TattleTail){
			return new TileEntityCTattleTail_dark();
		}else if(this == MBlockManager.demonic_TattleTail){
			return new TileEntityCTattleTail_demonic();
		}else if(this == MBlockManager.fairy_TattleTail){
			return new TileEntityCTattleTail_fairy();
		}else if(this == MBlockManager.freddy_TattleTail){
			return new TileEntityCTattleTail_freddy();
		}else if(this == MBlockManager.girrafe_TattleTail){
			return new TileEntityCTattleTail_girrafe();
		}else if(this == MBlockManager.lol_TattleTail){
			return new TileEntityCTattleTail_lol();
		}else if(this == MBlockManager.neighbor_TattleTail){
			return new TileEntityCTattleTail_neighbor();
		}else if(this == MBlockManager.pumpkin_TattleTail){
			return new TileEntityCTattleTail_pumpkin();
		}else if(this == MBlockManager.red_TattleTail){
			return new TileEntityCTattleTail_red();
		}else if(this == MBlockManager.sans_TattleTail){
			return new TileEntityCTattleTail_sans();
		}else if(this == MBlockManager.scott_TattleTail){
			return new TileEntityCTattleTail_scott();
		}else if(this == MBlockManager.shadow_TattleTail){
			return new TileEntityCTattleTail_shadow();
		}else if(this == MBlockManager.spring_TattleTail){
			return new TileEntityCTattleTail_spring();
		}else if(this == MBlockManager.withered_TattleTail){
			return new TileEntityCTattleTail_withered();
		}else{
			return null;
		}
	}
	@Override
	public int getRenderType() {
		return -1;
	}
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}
	@Override
	public AxisAlignedBB getCollisionBoundingBoxFromPool(World p_149668_1_, int p_149668_2_, int p_149668_3_, int p_149668_4_) {
		return null;
	}
	
	public Item getItemDropped(int i1, Random rand, int i2) {
		return this == MBlockManager.bendy_TattleTail ? MItemManager.bendy_TattleTail : (
        		this == MBlockManager.beta_TattleTail ? MItemManager.beta_TattleTail : (
        		this == MBlockManager.candy_corn_TattleTail ? MItemManager.candy_corn_TattleTail : (
        		this == MBlockManager.cubic_TattleTail ? MItemManager.cubic_TattleTail : (
        		this == MBlockManager.dark_TattleTail ? MItemManager.dark_TattleTail : (
        		this == MBlockManager.demonic_TattleTail ? MItemManager.demonic_TattleTail : (
        		this == MBlockManager.fairy_TattleTail ? MItemManager.fairy_TattleTail : (
        		this == MBlockManager.freddy_TattleTail ? MItemManager.freddy_TattleTail : (
        		this == MBlockManager.girrafe_TattleTail ? MItemManager.girrafe_TattleTail : (
        		this == MBlockManager.lol_TattleTail ? MItemManager.lol_TattleTail : (
        		this == MBlockManager.neighbor_TattleTail ? MItemManager.neighbor_TattleTail : (
        		this == MBlockManager.pumpkin_TattleTail ? MItemManager.pumpkin_TattleTail : (
        		this == MBlockManager.red_TattleTail ? MItemManager.red_TattleTail : (
        		this == MBlockManager.sans_TattleTail ? MItemManager.sans_TattleTail : (
        		this == MBlockManager.scott_TattleTail ? MItemManager.scott_TattleTail : (
        		this == MBlockManager.shadow_TattleTail ? MItemManager.shadow_TattleTail : (
        		this == MBlockManager.spring_TattleTail ? MItemManager.spring_TattleTail : (
        		this == MBlockManager.withered_TattleTail ? MItemManager.withered_TattleTail :
        			Item.getItemFromBlock(this))))))))))))))))));
    }
	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z) {
		return this == MBlockManager.bendy_TattleTail ? new ItemStack(MItemManager.bendy_TattleTail) : (
        		this == MBlockManager.beta_TattleTail ? new ItemStack(MItemManager.beta_TattleTail) : (
        		this == MBlockManager.candy_corn_TattleTail ? new ItemStack(MItemManager.candy_corn_TattleTail) : (
        		this == MBlockManager.cubic_TattleTail ? new ItemStack(MItemManager.cubic_TattleTail) : (
        		this == MBlockManager.dark_TattleTail ? new ItemStack(MItemManager.dark_TattleTail) : (
        		this == MBlockManager.demonic_TattleTail ? new ItemStack(MItemManager.demonic_TattleTail) : (
        		this == MBlockManager.fairy_TattleTail ? new ItemStack(MItemManager.fairy_TattleTail) : (
        		this == MBlockManager.freddy_TattleTail ? new ItemStack(MItemManager.freddy_TattleTail) : (
        		this == MBlockManager.girrafe_TattleTail ? new ItemStack(MItemManager.girrafe_TattleTail) : (
        		this == MBlockManager.lol_TattleTail ? new ItemStack(MItemManager.lol_TattleTail) : (
        		this == MBlockManager.neighbor_TattleTail ? new ItemStack(MItemManager.neighbor_TattleTail) : (
        		this == MBlockManager.pumpkin_TattleTail ? new ItemStack(MItemManager.pumpkin_TattleTail) : (
        		this == MBlockManager.red_TattleTail ? new ItemStack(MItemManager.red_TattleTail) : (
        		this == MBlockManager.sans_TattleTail ? new ItemStack(MItemManager.sans_TattleTail) : (
        		this == MBlockManager.scott_TattleTail ? new ItemStack(MItemManager.scott_TattleTail) : (
        		this == MBlockManager.shadow_TattleTail ? new ItemStack(MItemManager.shadow_TattleTail) : (
        		this == MBlockManager.spring_TattleTail ? new ItemStack(MItemManager.spring_TattleTail) : (
        		this == MBlockManager.withered_TattleTail ? new ItemStack(MItemManager.withered_TattleTail) :
        			new ItemStack(Item.getItemFromBlock(this)))))))))))))))))));
	}

}

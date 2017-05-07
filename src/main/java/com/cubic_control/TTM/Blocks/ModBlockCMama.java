package com.cubic_control.TTM.Blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

import com.cubic_control.TTM.CreativeTabs.MCreativeTabs;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityCMamaTattleTail_choco;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityCMamaTattleTail_golden;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityCMamaTattleTail_nightmare;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityMama;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityPapa;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityTattleTail_nightnight;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityTattleTail_blue;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityTattleTail_purple;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityTattleTail_snowglobe;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityTattleTail_yellow;
import com.cubic_control.TTM.Items.MItemManager;
import com.cubic_control.TTM.Lib.RefStrings;
import com.cubic_control.cubic_core.Bases.BaseBlock;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlockCMama extends ModBlockContainer{

	protected ModBlockCMama(String name) {
		super(Material.rock, name, 0.0f, null, 0, 0.0f, Block.soundTypeMetal);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
		this.setBlockTextureName(RefStrings.MODID + ":" + name);
		this.setCreativeTab(null);
		this.setLightOpacity(0);
		GameRegistry.registerBlock(this, name);
	}
	@Override
	public TileEntity createNewTileEntity(World world, int i1) {
		if(this == MBlockManager.papa_TattleTail){
			return new TileEntityPapa();
		}else if(this == MBlockManager.choco_mama_TattleTail){
			return new TileEntityCMamaTattleTail_choco();
		}else if(this == MBlockManager.golden_mama_TattleTail){
			return new TileEntityCMamaTattleTail_golden();
		}else if(this == MBlockManager.nightmare_mama_TattleTail){
			return new TileEntityCMamaTattleTail_nightmare();
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
	@Override
	public Item getItemDropped(int i1, Random rand, int i2) {
		return this == MBlockManager.papa_TattleTail ? MItemManager.papa_TattleTail : (
        		this == MBlockManager.choco_mama_TattleTail ? MItemManager.choco_mama_TattleTail : (
        		this == MBlockManager.golden_mama_TattleTail ? MItemManager.golden_mama_TattleTail : (
        		this == MBlockManager.nightmare_mama_TattleTail ? MItemManager.nightmare_mama_TattleTail :
        			Item.getItemFromBlock(this))));
	}
	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z) {
		return this == MBlockManager.papa_TattleTail ? new ItemStack(MItemManager.papa_TattleTail) : (
        		this == MBlockManager.choco_mama_TattleTail ? new ItemStack(MItemManager.choco_mama_TattleTail) : (
        		this == MBlockManager.golden_mama_TattleTail ? new ItemStack(MItemManager.golden_mama_TattleTail) : (
        		this == MBlockManager.nightmare_mama_TattleTail ? new ItemStack(MItemManager.nightmare_mama_TattleTail) :
        			new ItemStack(Item.getItemFromBlock(this)))));
	}
    
}
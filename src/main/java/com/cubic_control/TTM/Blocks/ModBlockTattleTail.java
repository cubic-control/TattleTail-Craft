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
import com.cubic_control.TTM.Entity.TileEntity.TileEntityTattleTail_butternut;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityTattleTail_nightnight;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityTattleTail_blue;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityTattleTail_purple;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityTattleTail_snowglobe;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityTattleTail_yellow;
import com.cubic_control.TTM.Items.MItemManager;
import com.cubic_control.TTM.Lib.RefStrings;
import com.cubic_control.cubic_core.Bases.BaseBlock;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlockTattleTail extends ModBlockContainer{

	protected ModBlockTattleTail(String name) {
		super(Material.cloth, name, 0.0f, null, 0, 0.0f, Block.soundTypeCloth);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
		this.setBlockTextureName(RefStrings.MODID + ":" + name);
		this.setCreativeTab(null);
		this.setLightOpacity(0);
		GameRegistry.registerBlock(this, name);
	}
	@Override
	public TileEntity createNewTileEntity(World world, int i1) {
		if(this == MBlockManager.purple_TattleTail){
			return new TileEntityTattleTail_purple();
		}else if(this == MBlockManager.yellow_TattleTail){
			return new TileEntityTattleTail_yellow();
		}else if(this == MBlockManager.blue_TattleTail){
			return new TileEntityTattleTail_blue();
		}else if(this == MBlockManager.snowglobe_TattleTail){
			return new TileEntityTattleTail_snowglobe();
		}else if(this == MBlockManager.nightnight_TattleTail){
			return new TileEntityTattleTail_nightnight();
		}else if(this == MBlockManager.butternut_TattleTail){
			return new TileEntityTattleTail_butternut();
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
        return this == MBlockManager.purple_TattleTail ? MItemManager.purple_TattleTail : (
        		this == MBlockManager.yellow_TattleTail ? MItemManager.yellow_TattleTail : (
        		this == MBlockManager.blue_TattleTail ? MItemManager.blue_TattleTail : (
        		this == MBlockManager.snowglobe_TattleTail ? MItemManager.snowglobe_TattleTail : (
        		this == MBlockManager.nightnight_TattleTail ? MItemManager.nightnight_TattleTail : (
        		this == MBlockManager.butternut_TattleTail ? MItemManager.butternut_TattleTail : Item.getItemFromBlock(this))))));
    }
	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z) {
		return this == MBlockManager.purple_TattleTail ? new ItemStack(MItemManager.purple_TattleTail) : (
        		this == MBlockManager.yellow_TattleTail ? new ItemStack(MItemManager.yellow_TattleTail) : (
        		this == MBlockManager.blue_TattleTail ? new ItemStack(MItemManager.blue_TattleTail) : (
        		this == MBlockManager.snowglobe_TattleTail ? new ItemStack(MItemManager.snowglobe_TattleTail) : (
        		this == MBlockManager.nightnight_TattleTail ? new ItemStack(MItemManager.nightnight_TattleTail) : (
        		this == MBlockManager.butternut_TattleTail ? new ItemStack(MItemManager.butternut_TattleTail) : new ItemStack(Item.getItemFromBlock(this)))))));
	}

}

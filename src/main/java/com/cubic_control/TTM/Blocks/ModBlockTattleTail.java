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
import net.minecraft.world.World;

import com.cubic_control.TTM.CreativeTabs.MCreativeTabs;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityTattleTail_black;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityTattleTail_blue;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityTattleTail_purple;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityTattleTail_white;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityTattleTail_yellow;
import com.cubic_control.TTM.Items.MItemManager;
import com.cubic_control.TTM.Lib.RefStrings;
import com.cubic_control.cubic_core.Bases.BaseBlock;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlockTattleTail extends ModBlockContainer{

	protected ModBlockTattleTail(String name) {
		super(Material.cloth, name, 10.0f, "axe", -1, 5.0f, Block.soundTypeCloth);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
		this.setBlockTextureName(RefStrings.MODID + ":" + name);
		this.setCreativeTab(MCreativeTabs.tabAll);
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
		}else if(this == MBlockManager.white_TattleTail){
			return new TileEntityTattleTail_white();
		}else if(this == MBlockManager.black_TattleTail){
			return new TileEntityTattleTail_black();
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
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack stack) {
        int l = MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

        if (l == 0) {
            world.setBlockMetadataWithNotify(x, y, z, 1, 2);
        }

        if (l == 1) {
            world.setBlockMetadataWithNotify(x, y, z, 2, 2);
        }

        if (l == 2) {
            world.setBlockMetadataWithNotify(x, y, z, 3, 2);
        }

        if (l == 3) {
            world.setBlockMetadataWithNotify(x, y, z, 4, 2);
        }
    }
	
	public Item getItemDropped(int i1, Random rand, int i2) {
        return this == MBlockManager.purple_TattleTail ? MItemManager.purple_TattleTail : (
        		this == MBlockManager.yellow_TattleTail ? MItemManager.yellow_TattleTail : (
        		this == MBlockManager.blue_TattleTail ? MItemManager.blue_TattleTail : (
        		this == MBlockManager.white_TattleTail ? MItemManager.white_TattleTail : (
        		this == MBlockManager.black_TattleTail ? MItemManager.black_TattleTail : Item.getItemFromBlock(this)))));
    }

}

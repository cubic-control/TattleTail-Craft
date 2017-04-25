package com.cubic_control.TTM.Blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

import com.cubic_control.TTM.Config.MConfig;
import com.cubic_control.TTM.CreativeTabs.MCreativeTabs;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityKetchup;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityVase;
import com.cubic_control.TTM.Items.MItemManager;
import com.cubic_control.TTM.Lib.RefStrings;
import com.cubic_control.cubic_core.Bases.BaseBlock;

import cpw.mods.fml.common.registry.GameRegistry;

public class ModBlockVase extends ModBlockContainer {

	protected ModBlockVase(String name) {
		super(Material.rock, name, 5.0f, null, 0, 10.0f, Block.soundTypeStone);
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
		this.setBlockTextureName(RefStrings.MODID + ":" + name);
		this.setCreativeTab(null);
		this.setLightOpacity(0);
		GameRegistry.registerBlock(this, name);
	}
	@Override
	public TileEntity createNewTileEntity(World var1, int var2) {
		return new TileEntityVase();
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
		if(rand.nextInt(100) <= MConfig.vaseDropCandlesChance){
			return MItemManager.candles;
		}else{
			return null;
		}
    }
	@Override
	public ItemStack getPickBlock(MovingObjectPosition target, World world, int x, int y, int z) {
		return new ItemStack(MItemManager.vase);
	}

}

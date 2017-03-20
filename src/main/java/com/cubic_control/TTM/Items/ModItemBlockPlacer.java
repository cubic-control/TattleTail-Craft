package com.cubic_control.TTM.Items;

import com.cubic_control.cubic_core.Bases.BaseBlock;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class ModItemBlockPlacer extends ModItem{
	private BaseBlock block;
	
	public ModItemBlockPlacer(String name, float f1, BaseBlock block) {
		super(name, f1);
		this.block = block;
	}

	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float f1, float f2, float f3) {
		if (world.getBlock(x, y, z) != Blocks.snow_layer) {
            if(side == 0) {
                --y;
            }else if(side == 1) {
                ++y;
            }else if(side == 2) {
                --z;
            }else if(side == 3) {
                ++z;
            }else if(side == 4) {
                --x;
            }else if(side == 5) {
                ++x;
            }else if(!world.isAirBlock(x, y, z)) {
                return false;
            }
        }
        if(!player.canPlayerEdit(x, y, z, side, stack)) {
            return false;
        }else{
            if(block.canPlaceBlockAt(world, x, y, z)) {
                --stack.stackSize;
                world.setBlock(x, y, z, block);
                int l = MathHelper.floor_double((double)(player.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

                if (l == 0) {
                    world.setBlockMetadataWithNotify(x, y, z, 1, 2);
                    world.markBlockRangeForRenderUpdate(x, y, z, x, y, z);
                }

                if (l == 1) {
                    world.setBlockMetadataWithNotify(x, y, z, 2, 2);
                    world.markBlockRangeForRenderUpdate(x, y, z, x, y, z);
                }

                if (l == 2) {
                    world.setBlockMetadataWithNotify(x, y, z, 3, 2);
                    world.markBlockRangeForRenderUpdate(x, y, z, x, y, z);
                }

                if (l == 3) {
                    world.setBlockMetadataWithNotify(x, y, z, 4, 2);
                    world.markBlockRangeForRenderUpdate(x, y, z, x, y, z);
                }
            }
            return true;
        }
	}

}

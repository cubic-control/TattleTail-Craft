package com.cubic_control.TTM.Items;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cubic_control.TTM.CreativeTabs.MCreativeTabs;
import com.cubic_control.TTM.Lib.RefStrings;

import net.minecraft.block.BlockJukebox;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import net.minecraft.world.World;

public class ModItemDisc extends ItemRecord{
    private static final Map field_150928_b = new HashMap();
    /** The name of the record. */
    public final String recordName;
    private static final String __OBFID = "CL_00000057";

    protected ModItemDisc(String name) {
    	super(name);
    	this.setUnlocalizedName(name);
		this.setCreativeTab(MCreativeTabs.tabOriginal);
		this.setTextureName(RefStrings.MODID + ":" + name);
		GameRegistry.registerItem(this, name);
    	
        this.recordName = name;
        this.maxStackSize = 1;
        this.setCreativeTab(MCreativeTabs.tabOriginal);
        field_150928_b.put("records." + name, this); //Forge Bug Fix: RenderGlobal adds a "records." when looking up below.
    }

    /**
     * Gets an icon index based on an item's damage value
     */
    @Override
    @SideOnly(Side.CLIENT)
    public IIcon getIconFromDamage(int par1) {
        return this.itemIcon;
    }

    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    @Override
    public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int par7, float par8, float par9, float par10) {
        if (world.getBlock(x, y, z) == Blocks.jukebox && world.getBlockMetadata(x, y, z) == 0) {
            if(world.isRemote) {
                return true;
            }else{
                ((BlockJukebox)Blocks.jukebox).func_149926_b(world, x, y, z, stack);
                world.playAuxSFXAtEntity((EntityPlayer)null, 1005, x, y, z, Item.getIdFromItem(this));
                --stack.stackSize;
                return true;
            }
        }else{
            return false;
        }
    }

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    @Override
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean par4) {
        list.add(this.getRecordNameLocal());
    }
    @Override
    @SideOnly(Side.CLIENT)
    public String getRecordNameLocal() {
        return StatCollector.translateToLocal("item.record." + this.recordName + ".desc");
    }

    /**
     * Return an item rarity from EnumRarity
     */
    @Override
    public EnumRarity getRarity(ItemStack stack) {
        return EnumRarity.rare;
    }

    /**
     * Return the record item corresponding to the given name.
     */
    @SideOnly(Side.CLIENT)
    public static ModItemDisc getRecord(String name) {
        return (ModItemDisc)field_150928_b.get(name);
    }

    /**
     * Retrieves the resource location of the sound to play for this record.
     * 
     * @param name The name of the record to play
     * @return The resource location for the audio, null to use default.
     */
    @Override
    public ResourceLocation getRecordResource(String name) {
        return new ResourceLocation(RefStrings.MODID + ":" + name);
    }
}
package com.cubic_control.TTM.Main;

import com.cubic_control.TTM.Entity.EntityMama;
import com.cubic_control.TTM.Entity.EntityPapa;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityKetchup;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityMama;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityTattleTail_blue;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityTattleTail_butternut;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityTattleTail_nightnight;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityTattleTail_purple;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityTattleTail_snowglobe;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityTattleTail_yellow;
import com.cubic_control.TTM.Models.ModelBiped64x64;
import com.cubic_control.TTM.Render.RenderKetchup;
import com.cubic_control.TTM.Render.RenderMama;
import com.cubic_control.TTM.Render.RenderMama_Tattletail;
import com.cubic_control.TTM.Render.RenderPapa;
import com.cubic_control.TTM.Render.RenderTattletail_blue;
import com.cubic_control.TTM.Render.RenderTattletail_butternut;
import com.cubic_control.TTM.Render.RenderTattletail_nightnight;
import com.cubic_control.TTM.Render.RenderTattletail_purple;
import com.cubic_control.TTM.Render.RenderTattletail_snowglobe;
import com.cubic_control.TTM.Render.RenderTattletail_yellow;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;

public class ClientProxy extends ServerProxy{
	public void registerRenderInfo(){
		registerEntity();
		registerRenders();
	}
	public int addArmor(String armor){
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}
	@SuppressWarnings("unchecked")
	private void registerEntity() {
		RenderingRegistry.registerEntityRenderingHandler(EntityMama.class, new RenderMama(new ModelBiped64x64(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityPapa.class, new RenderPapa(new ModelBiped64x64(), 0.5f));
	}
	
	public void registerRenders() {	
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityKetchup.class, new RenderKetchup());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTattleTail_blue.class, new RenderTattletail_blue());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTattleTail_butternut.class, new RenderTattletail_butternut());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTattleTail_nightnight.class, new RenderTattletail_nightnight());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTattleTail_purple.class, new RenderTattletail_purple());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTattleTail_snowglobe.class, new RenderTattletail_snowglobe());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTattleTail_yellow.class, new RenderTattletail_yellow());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMama.class, new RenderMama_Tattletail());
	}
}

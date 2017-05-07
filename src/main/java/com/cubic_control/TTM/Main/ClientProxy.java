package com.cubic_control.TTM.Main;

import com.cubic_control.TTM.Entity.EntityMama;
import com.cubic_control.TTM.Entity.EntityMama_choco;
import com.cubic_control.TTM.Entity.EntityMama_golden;
import com.cubic_control.TTM.Entity.EntityMama_nightmare;
import com.cubic_control.TTM.Entity.EntityPapa;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityCPresent;
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
import com.cubic_control.TTM.Entity.TileEntity.TileEntityCandles;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityKetchup;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityMama;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityPresent;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityTattleTail_blue;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityTattleTail_butternut;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityTattleTail_nightnight;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityTattleTail_purple;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityTattleTail_snowglobe;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityTattleTail_yellow;
import com.cubic_control.TTM.Entity.TileEntity.TileEntityVase;
import com.cubic_control.TTM.Models.ModelBiped64x64;
import com.cubic_control.TTM.Render.RenderCPresent;
import com.cubic_control.TTM.Render.RenderCTattletail_bendy;
import com.cubic_control.TTM.Render.RenderCTattletail_beta;
import com.cubic_control.TTM.Render.RenderCTattletail_candy_corn;
import com.cubic_control.TTM.Render.RenderCTattletail_cubic;
import com.cubic_control.TTM.Render.RenderCTattletail_dark;
import com.cubic_control.TTM.Render.RenderCTattletail_demonic;
import com.cubic_control.TTM.Render.RenderCTattletail_fairy;
import com.cubic_control.TTM.Render.RenderCTattletail_freddy;
import com.cubic_control.TTM.Render.RenderCTattletail_girrafe;
import com.cubic_control.TTM.Render.RenderCTattletail_lol;
import com.cubic_control.TTM.Render.RenderCTattletail_neighbor;
import com.cubic_control.TTM.Render.RenderCTattletail_pumpkin;
import com.cubic_control.TTM.Render.RenderCTattletail_red;
import com.cubic_control.TTM.Render.RenderCTattletail_sans;
import com.cubic_control.TTM.Render.RenderCTattletail_scott;
import com.cubic_control.TTM.Render.RenderCTattletail_shadow;
import com.cubic_control.TTM.Render.RenderCTattletail_spring;
import com.cubic_control.TTM.Render.RenderCTattletail_withered;
import com.cubic_control.TTM.Render.RenderCandles;
import com.cubic_control.TTM.Render.RenderKetchup;
import com.cubic_control.TTM.Render.RenderMama;
import com.cubic_control.TTM.Render.RenderMamaTattleTail_choco;
import com.cubic_control.TTM.Render.RenderMamaTattleTail_golden;
import com.cubic_control.TTM.Render.RenderMamaTattleTail_nightmare;
import com.cubic_control.TTM.Render.RenderMama_Tattletail;
import com.cubic_control.TTM.Render.RenderPapa;
import com.cubic_control.TTM.Render.RenderPresent;
import com.cubic_control.TTM.Render.RenderTattletail_blue;
import com.cubic_control.TTM.Render.RenderTattletail_butternut;
import com.cubic_control.TTM.Render.RenderTattletail_nightnight;
import com.cubic_control.TTM.Render.RenderTattletail_purple;
import com.cubic_control.TTM.Render.RenderTattletail_snowglobe;
import com.cubic_control.TTM.Render.RenderTattletail_yellow;
import com.cubic_control.TTM.Render.RenderVase;

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
		RenderingRegistry.registerEntityRenderingHandler(EntityMama_choco.class, new RenderMamaTattleTail_choco(new ModelBiped64x64(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityMama_golden.class, new RenderMamaTattleTail_golden(new ModelBiped64x64(), 0.5f));
		RenderingRegistry.registerEntityRenderingHandler(EntityMama_nightmare.class, new RenderMamaTattleTail_nightmare(new ModelBiped64x64(), 0.5f));
	}
	
	public void registerRenders() {	
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityKetchup.class, new RenderKetchup());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPresent.class, new RenderPresent());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTattleTail_blue.class, new RenderTattletail_blue());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTattleTail_butternut.class, new RenderTattletail_butternut());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTattleTail_nightnight.class, new RenderTattletail_nightnight());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTattleTail_purple.class, new RenderTattletail_purple());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTattleTail_snowglobe.class, new RenderTattletail_snowglobe());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityTattleTail_yellow.class, new RenderTattletail_yellow());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityMama.class, new RenderMama_Tattletail());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCandles.class, new RenderCandles());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityVase.class, new RenderVase());
		//Custom
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCPresent.class, new RenderCPresent());
			//TattleTails
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCTattleTail_bendy.class, new RenderCTattletail_bendy());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCTattleTail_beta.class, new RenderCTattletail_beta());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCTattleTail_candy_corn.class, new RenderCTattletail_candy_corn());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCTattleTail_cubic.class, new RenderCTattletail_cubic());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCTattleTail_dark.class, new RenderCTattletail_dark());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCTattleTail_demonic.class, new RenderCTattletail_demonic());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCTattleTail_fairy.class, new RenderCTattletail_fairy());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCTattleTail_freddy.class, new RenderCTattletail_freddy());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCTattleTail_girrafe.class, new RenderCTattletail_girrafe());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCTattleTail_lol.class, new RenderCTattletail_lol());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCTattleTail_neighbor.class, new RenderCTattletail_neighbor());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCTattleTail_pumpkin.class, new RenderCTattletail_pumpkin());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCTattleTail_red.class, new RenderCTattletail_red());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCTattleTail_sans.class, new RenderCTattletail_sans());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCTattleTail_scott.class, new RenderCTattletail_scott());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCTattleTail_shadow.class, new RenderCTattletail_shadow());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCTattleTail_spring.class, new RenderCTattletail_spring());
		ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCTattleTail_withered.class, new RenderCTattletail_withered());
	}
}

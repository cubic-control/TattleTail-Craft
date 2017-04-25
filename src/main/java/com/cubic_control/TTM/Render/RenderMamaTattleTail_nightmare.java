package com.cubic_control.TTM.Render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

import com.cubic_control.TTM.Lib.RefStrings;

public class RenderMamaTattleTail_nightmare extends RenderLiving{
	
	protected static ResourceLocation entityTexture;

	public RenderMamaTattleTail_nightmare(ModelBase par1ModelBase, float par2) {
		super(par1ModelBase, par2);
		entityTexture = new ResourceLocation(RefStrings.MODID + ":textures/entity/mama_nightmare.png");
	}
	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
		return entityTexture;
	}


}

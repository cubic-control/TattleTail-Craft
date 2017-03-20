package com.cubic_control.TTM.Gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.ResourceLocation;

import org.lwjgl.opengl.GL11;

import com.cubic_control.TTM.Lib.RefStrings;
import com.cubic_control.cubic_core.Utils.ModUtils;

public class Gui1 extends Gui{
	protected static ResourceLocation resource;
	
	private final double imgWidthPerHeight = 1.7;
	
	public Gui1(){
		resource = new ResourceLocation(RefStrings.MODID + ":textures/overlay/overlay1.png");
	}
	
	public void RenderGui(ScaledResolution resolution){
		double width = resolution.getScaledWidth_double();
		double height = resolution.getScaledHeight_double();
		Minecraft mc = Minecraft.getMinecraft();
		GL11.glPushMatrix();
		GL11.glEnable(GL11.GL_BLEND);
		GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
		mc.getTextureManager().bindTexture(resource);
		double imgWidth = (width + height * this.imgWidthPerHeight) * 0.6;
		double imgHeight = imgWidth / this.imgWidthPerHeight;
		ModUtils.drawTexturedRect((width - imgWidth)/2, (height - imgHeight)/2, imgWidth, imgHeight);
		GL11.glPopMatrix();
	}
}

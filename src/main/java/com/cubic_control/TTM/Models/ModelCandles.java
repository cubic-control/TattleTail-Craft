// Date: 4/9/2017 7:56:32 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.cubic_control.TTM.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCandles extends ModelBase
{
  //fields
    ModelRenderer Candle1Base;
    ModelRenderer Candle2Base;
    ModelRenderer Candle3Base;
    ModelRenderer Candle2Tip;
    ModelRenderer Candle1Tip;
    ModelRenderer Candle3Tip;
  
  public ModelCandles()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Candle1Base = new ModelRenderer(this, 0, 0);
      Candle1Base.addBox(0F, 0F, 0F, 2, 5, 2);
      Candle1Base.setRotationPoint(-4F, 19F, -6F);
      Candle1Base.setTextureSize(64, 32);
      Candle1Base.mirror = true;
      setRotation(Candle1Base, 0F, 0F, 0F);
      Candle2Base = new ModelRenderer(this, 8, 0);
      Candle2Base.addBox(0F, 0F, 0F, 2, 5, 2);
      Candle2Base.setRotationPoint(2F, 19F, 0F);
      Candle2Base.setTextureSize(64, 32);
      Candle2Base.mirror = true;
      setRotation(Candle2Base, 0F, 0F, 0F);
      Candle3Base = new ModelRenderer(this, 16, 0);
      Candle3Base.addBox(0F, 0F, 0F, 2, 5, 2);
      Candle3Base.setRotationPoint(-6F, 19F, 4F);
      Candle3Base.setTextureSize(64, 32);
      Candle3Base.mirror = true;
      setRotation(Candle3Base, 0F, 0F, 0F);
      Candle2Tip = new ModelRenderer(this, 4, 7);
      Candle2Tip.addBox(0F, 0F, 0F, 1, 1, 1);
      Candle2Tip.setRotationPoint(2.5F, 18F, 0.5F);
      Candle2Tip.setTextureSize(64, 32);
      Candle2Tip.mirror = true;
      setRotation(Candle2Tip, 0F, 0F, 0F);
      Candle1Tip = new ModelRenderer(this, 0, 7);
      Candle1Tip.addBox(0F, 0F, 0F, 1, 1, 1);
      Candle1Tip.setRotationPoint(-3.5F, 18F, -5.5F);
      Candle1Tip.setTextureSize(64, 32);
      Candle1Tip.mirror = true;
      setRotation(Candle1Tip, 0F, 0F, 0F);
      Candle3Tip = new ModelRenderer(this, 8, 7);
      Candle3Tip.addBox(0F, 0F, 0F, 1, 1, 1);
      Candle3Tip.setRotationPoint(-5.5F, 18F, 4.5F);
      Candle3Tip.setTextureSize(64, 32);
      Candle3Tip.mirror = true;
      setRotation(Candle3Tip, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Candle1Base.render(f5);
    Candle2Base.render(f5);
    Candle3Base.render(f5);
    Candle2Tip.render(f5);
    Candle1Tip.render(f5);
    Candle3Tip.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}
// Date: 3/5/2017 5:49:27 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.cubic_control.TTM.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTattletail extends ModelBase
{
  //fields
    ModelRenderer RFoot;
    ModelRenderer LFoot;
    ModelRenderer Body;
    ModelRenderer Head;
    ModelRenderer REar;
    ModelRenderer LEar;
    ModelRenderer Top;
    ModelRenderer Nose;
  
  public ModelTattletail()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      RFoot = new ModelRenderer(this, 0, 0);
      RFoot.addBox(-4F, 23F, -2F, 2, 1, 4);
      RFoot.setRotationPoint(0F, 0F, 0F);
      RFoot.setTextureSize(64, 32);
      RFoot.mirror = true;
      setRotation(RFoot, 0F, 0F, 0F);
      LFoot = new ModelRenderer(this, 12, 0);
      LFoot.addBox(2F, 23F, -2F, 2, 1, 4);
      LFoot.setRotationPoint(0F, 0F, 0F);
      LFoot.setTextureSize(64, 32);
      LFoot.mirror = true;
      setRotation(LFoot, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 24, 0);
      Body.addBox(-4.5F, 14F, -1F, 9, 9, 4);
      Body.setRotationPoint(0F, 0F, 0F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Head = new ModelRenderer(this, 0, 5);
      Head.addBox(-3F, 11F, -1F, 6, 3, 4);
      Head.setRotationPoint(0F, 0F, 0F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      REar = new ModelRenderer(this, 0, 12);
      REar.addBox(-5F, 8F, -0.5F, 1, 6, 3);
      REar.setRotationPoint(0F, 0F, 0F);
      REar.setTextureSize(64, 32);
      REar.mirror = true;
      setRotation(REar, 0F, 0F, 0F);
      LEar = new ModelRenderer(this, 8, 12);
      LEar.addBox(4F, 8F, -0.5F, 1, 6, 3);
      LEar.setRotationPoint(0F, 0F, 0F);
      LEar.setTextureSize(64, 32);
      LEar.mirror = true;
      setRotation(LEar, 0F, 0F, 0F);
      Top = new ModelRenderer(this, 50, 0);
      Top.addBox(-0.5F, 10F, 0.5F, 1, 1, 1);
      Top.setRotationPoint(0F, 0F, 0F);
      Top.setTextureSize(64, 32);
      Top.mirror = true;
      setRotation(Top, 0F, 0F, 0F);
      Nose = new ModelRenderer(this, 54, 0);
      Nose.addBox(-1F, 14F, -2F, 2, 1, 1);
      Nose.setRotationPoint(0F, 0F, 0F);
      Nose.setTextureSize(64, 32);
      Nose.mirror = true;
      setRotation(Nose, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    RFoot.render(f5);
    LFoot.render(f5);
    Body.render(f5);
    Head.render(f5);
    REar.render(f5);
    LEar.render(f5);
    Top.render(f5);
    Nose.render(f5);
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

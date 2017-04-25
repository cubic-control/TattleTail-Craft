// Date: 4/9/2017 2:05:13 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.cubic_control.TTM.Models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelNewTattletail_freddy extends ModelBase
{
  //fields
    ModelRenderer RFoot;
    ModelRenderer RToe1;
    ModelRenderer RToe2;
    ModelRenderer RToe3;
    ModelRenderer LFoot;
    ModelRenderer LToe1;
    ModelRenderer LToe2;
    ModelRenderer LToe3;
    ModelRenderer LAnkle;
    ModelRenderer RAnkle;
    ModelRenderer LHeel;
    ModelRenderer RHeel;
    ModelRenderer BodyMain;
    ModelRenderer BodyPart1;
    ModelRenderer BodyPart2;
    ModelRenderer BodyPart3;
    ModelRenderer BodyPart4;
    ModelRenderer FacePart1;
    ModelRenderer FacePart2;
    ModelRenderer FacePart4;
    ModelRenderer FacePart5;
    ModelRenderer BodyPartTop1;
    ModelRenderer BodyPartTop2;
    ModelRenderer FacePart6;
    ModelRenderer FacePart7;
    ModelRenderer FacePart8;
    ModelRenderer Nose;
    ModelRenderer REye;
    ModelRenderer LEye;
    ModelRenderer Top;
    ModelRenderer REar;
    ModelRenderer REarTip;
    ModelRenderer LEar;
    ModelRenderer LEarTip;
    ModelRenderer RInnerEar;
    ModelRenderer LInnerEar;
    ModelRenderer TopHat;
    ModelRenderer TopHatTrim;
  
  public ModelNewTattletail_freddy()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      RFoot = new ModelRenderer(this, 0, 59);
      RFoot.addBox(0F, 0F, 0F, 5, 2, 3);
      RFoot.setRotationPoint(-5.5F, 22F, 0F);
      RFoot.setTextureSize(64, 64);
      RFoot.mirror = true;
      setRotation(RFoot, 0F, 0F, 0F);
      RToe1 = new ModelRenderer(this, 0, 57);
      RToe1.addBox(0F, 0F, 0F, 1, 1, 1);
      RToe1.setRotationPoint(-2F, 23F, -1F);
      RToe1.setTextureSize(64, 64);
      RToe1.mirror = true;
      setRotation(RToe1, 0F, 0F, 0F);
      RToe2 = new ModelRenderer(this, 0, 55);
      RToe2.addBox(0F, 0F, 0F, 1, 1, 1);
      RToe2.setRotationPoint(-3.5F, 23F, -1F);
      RToe2.setTextureSize(64, 64);
      RToe2.mirror = true;
      setRotation(RToe2, 0F, 0F, 0F);
      RToe3 = new ModelRenderer(this, 0, 53);
      RToe3.addBox(0F, 0F, 0F, 1, 1, 1);
      RToe3.setRotationPoint(-5F, 23F, -1F);
      RToe3.setTextureSize(64, 64);
      RToe3.mirror = true;
      setRotation(RToe3, 0F, 0F, 0F);
      LFoot = new ModelRenderer(this, 16, 59);
      LFoot.addBox(0F, 0F, 0F, 5, 2, 3);
      LFoot.setRotationPoint(0.5F, 22F, 0F);
      LFoot.setTextureSize(64, 64);
      LFoot.mirror = true;
      setRotation(LFoot, 0F, 0F, 0F);
      LToe1 = new ModelRenderer(this, 16, 57);
      LToe1.addBox(0F, 0F, 0F, 1, 1, 1);
      LToe1.setRotationPoint(4F, 23F, -1F);
      LToe1.setTextureSize(64, 64);
      LToe1.mirror = true;
      setRotation(LToe1, 0F, 0F, 0F);
      LToe2 = new ModelRenderer(this, 16, 55);
      LToe2.addBox(0F, 0F, 0F, 1, 1, 1);
      LToe2.setRotationPoint(2.5F, 23F, -1F);
      LToe2.setTextureSize(64, 64);
      LToe2.mirror = true;
      setRotation(LToe2, 0F, 0F, 0F);
      LToe3 = new ModelRenderer(this, 16, 53);
      LToe3.addBox(0F, 0F, 0F, 1, 1, 1);
      LToe3.setRotationPoint(1F, 23F, -1F);
      LToe3.setTextureSize(64, 64);
      LToe3.mirror = true;
      setRotation(LToe3, 0F, 0F, 0F);
      LAnkle = new ModelRenderer(this, 20, 56);
      LAnkle.addBox(0F, 0F, 0F, 4, 1, 2);
      LAnkle.setRotationPoint(1F, 21F, 0.5F);
      LAnkle.setTextureSize(64, 64);
      LAnkle.mirror = true;
      setRotation(LAnkle, 0F, 0F, 0F);
      RAnkle = new ModelRenderer(this, 4, 56);
      RAnkle.addBox(0F, 0F, 0F, 4, 1, 2);
      RAnkle.setRotationPoint(-5F, 21F, 0.5F);
      RAnkle.setTextureSize(64, 64);
      RAnkle.mirror = true;
      setRotation(RAnkle, 0F, 0F, 0F);
      LHeel = new ModelRenderer(this, 20, 54);
      LHeel.addBox(0F, 0F, 0F, 4, 1, 1);
      LHeel.setRotationPoint(1F, 23F, 3F);
      LHeel.setTextureSize(64, 64);
      LHeel.mirror = true;
      setRotation(LHeel, 0F, 0F, 0F);
      RHeel = new ModelRenderer(this, 4, 54);
      RHeel.addBox(0F, 0F, 0F, 4, 1, 1);
      RHeel.setRotationPoint(-5F, 23F, 3F);
      RHeel.setTextureSize(64, 64);
      RHeel.mirror = true;
      setRotation(RHeel, 0F, 0F, 0F);
      BodyMain = new ModelRenderer(this, 36, 0);
      BodyMain.addBox(0F, 0F, 0F, 11, 14, 3);
      BodyMain.setRotationPoint(-5.5F, 7F, 0F);
      BodyMain.setTextureSize(64, 64);
      BodyMain.mirror = true;
      setRotation(BodyMain, 0F, 0F, 0F);
      BodyPart1 = new ModelRenderer(this, 36, 17);
      BodyPart1.addBox(-1F, 0F, 0F, 10, 13, 4);
      BodyPart1.setRotationPoint(-4F, 7.5F, -0.5F);
      BodyPart1.setTextureSize(64, 64);
      BodyPart1.mirror = true;
      setRotation(BodyPart1, 0F, 0F, 0F);
      BodyPart2 = new ModelRenderer(this, 36, 34);
      BodyPart2.addBox(0F, 0F, 0F, 12, 13, 2);
      BodyPart2.setRotationPoint(-6F, 7.5F, 0.5F);
      BodyPart2.setTextureSize(64, 64);
      BodyPart2.mirror = true;
      setRotation(BodyPart2, 0F, 0F, 0F);
      BodyPart3 = new ModelRenderer(this, 8, 0);
      BodyPart3.addBox(0F, 0F, 0F, 9, 12, 5);
      BodyPart3.setRotationPoint(-4.5F, 8F, -1F);
      BodyPart3.setTextureSize(64, 64);
      BodyPart3.mirror = true;
      setRotation(BodyPart3, 0F, 0F, 0F);
      BodyPart4 = new ModelRenderer(this, 36, 49);
      BodyPart4.addBox(0F, 0F, 0F, 13, 12, 1);
      BodyPart4.setRotationPoint(-6.5F, 8F, 1F);
      BodyPart4.setTextureSize(64, 64);
      BodyPart4.mirror = true;
      setRotation(BodyPart4, 0F, 0F, 0F);
      FacePart1 = new ModelRenderer(this, 0, 40);
      FacePart1.addBox(0F, 0F, 0F, 6, 5, 1);
      FacePart1.setRotationPoint(-3F, 14F, -1.5F);
      FacePart1.setTextureSize(64, 64);
      FacePart1.mirror = true;
      setRotation(FacePart1, 0F, 0F, 0F);
      FacePart2 = new ModelRenderer(this, 1, 38);
      FacePart2.addBox(0F, 0F, 0F, 5, 1, 1);
      FacePart2.setRotationPoint(-2.5F, 13.5F, -1.5F);
      FacePart2.setTextureSize(64, 64);
      FacePart2.mirror = true;
      setRotation(FacePart2, 0F, 0F, 0F);
      FacePart4 = new ModelRenderer(this, 0, 36);
      FacePart4.addBox(0F, 0F, 0F, 6, 1, 1);
      FacePart4.setRotationPoint(-3F, 12.5F, -1.466667F);
      FacePart4.setTextureSize(64, 64);
      FacePart4.mirror = true;
      setRotation(FacePart4, 0F, 0F, 0F);
      FacePart5 = new ModelRenderer(this, 1, 34);
      FacePart5.addBox(0F, 0F, 0F, 5, 1, 1);
      FacePart5.setRotationPoint(-2.5F, 12F, -1.5F);
      FacePart5.setTextureSize(64, 64);
      FacePart5.mirror = true;
      setRotation(FacePart5, 0F, 0F, 0F);
      BodyPartTop1 = new ModelRenderer(this, 12, 17);
      BodyPartTop1.addBox(0F, 0F, 0F, 10, 1, 2);
      BodyPartTop1.setRotationPoint(-5F, 6.5F, 0.5F);
      BodyPartTop1.setTextureSize(64, 64);
      BodyPartTop1.mirror = true;
      setRotation(BodyPartTop1, 0F, 0F, 0F);
      BodyPartTop2 = new ModelRenderer(this, 16, 20);
      BodyPartTop2.addBox(0F, 0F, 0F, 9, 1, 1);
      BodyPartTop2.setRotationPoint(-4.5F, 6F, 1F);
      BodyPartTop2.setTextureSize(64, 64);
      BodyPartTop2.mirror = true;
      setRotation(BodyPartTop2, 0F, 0F, 0F);
      FacePart6 = new ModelRenderer(this, 0, 30);
      FacePart6.addBox(0F, 0F, 0F, 6, 3, 1);
      FacePart6.setRotationPoint(-3F, 9F, -1.5F);
      FacePart6.setTextureSize(64, 64);
      FacePart6.mirror = true;
      setRotation(FacePart6, 0F, 0F, 0F);
      FacePart7 = new ModelRenderer(this, 0, 28);
      FacePart7.addBox(0F, 0F, 0F, 2, 1, 1);
      FacePart7.setRotationPoint(-2.5F, 8.5F, -1.5F);
      FacePart7.setTextureSize(64, 64);
      FacePart7.mirror = true;
      setRotation(FacePart7, 0F, 0F, 0F);
      FacePart8 = new ModelRenderer(this, 8, 28);
      FacePart8.addBox(0F, 0F, 0F, 2, 1, 1);
      FacePart8.setRotationPoint(0.5F, 8.5F, -1.5F);
      FacePart8.setTextureSize(64, 64);
      FacePart8.mirror = true;
      setRotation(FacePart8, 0F, 0F, 0F);
      Nose = new ModelRenderer(this, 0, 0);
      Nose.addBox(0F, 0F, 0F, 2, 1, 1);
      Nose.setRotationPoint(-1F, 12.5F, -2F);
      Nose.setTextureSize(64, 64);
      Nose.mirror = true;
      setRotation(Nose, 0F, 0F, 0F);
      REye = new ModelRenderer(this, 0, 2);
      REye.addBox(0F, 0F, 0F, 2, 2, 1);
      REye.setRotationPoint(-2.5F, 9.5F, -1.7F);
      REye.setTextureSize(64, 64);
      REye.mirror = true;
      setRotation(REye, 0F, 0F, 0F);
      LEye = new ModelRenderer(this, 0, 5);
      LEye.addBox(0F, 0F, 0F, 2, 2, 1);
      LEye.setRotationPoint(0.5F, 9.5F, -1.7F);
      LEye.setTextureSize(64, 64);
      LEye.mirror = true;
      setRotation(LEye, 0F, 0F, 0F);
      Top = new ModelRenderer(this, 32, 22);
      Top.addBox(0F, 0F, 0F, 1, 1, 1);
      Top.setRotationPoint(-0.5F, 5F, 1F);
      Top.setTextureSize(64, 64);
      Top.mirror = true;
      setRotation(Top, 0F, 0F, 0F);
      REar = new ModelRenderer(this, 20, 45);
      REar.addBox(0F, 0F, 0F, 3, 5, 1);
      REar.setRotationPoint(-5F, 2F, 2F);
      REar.setTextureSize(64, 64);
      REar.mirror = true;
      setRotation(REar, 0F, 0F, 0F);
      REarTip = new ModelRenderer(this, 20, 43);
      REarTip.addBox(0F, 0F, 0F, 2, 1, 1);
      REarTip.setRotationPoint(-4F, 1F, 2F);
      REarTip.setTextureSize(64, 64);
      REarTip.mirror = true;
      setRotation(REarTip, 0F, 0F, 0F);
      LEar = new ModelRenderer(this, 28, 45);
      LEar.addBox(0F, 0F, 0F, 3, 5, 1);
      LEar.setRotationPoint(2F, 2F, 2F);
      LEar.setTextureSize(64, 64);
      LEar.mirror = true;
      setRotation(LEar, 0F, 0F, 0F);
      LEarTip = new ModelRenderer(this, 30, 43);
      LEarTip.addBox(0F, 0F, 0F, 2, 1, 1);
      LEarTip.setRotationPoint(2F, 1F, 2F);
      LEarTip.setTextureSize(64, 64);
      LEarTip.mirror = true;
      setRotation(LEarTip, 0F, 0F, 0F);
      RInnerEar = new ModelRenderer(this, 20, 38);
      RInnerEar.addBox(0F, 0F, 0F, 2, 4, 1);
      RInnerEar.setRotationPoint(-4.5F, 2.5F, 1.9F);
      RInnerEar.setTextureSize(64, 64);
      RInnerEar.mirror = true;
      setRotation(RInnerEar, 0F, 0F, 0F);
      LInnerEar = new ModelRenderer(this, 30, 38);
      LInnerEar.addBox(0F, 0F, 0F, 2, 4, 1);
      LInnerEar.setRotationPoint(2.5F, 2.5F, 1.9F);
      LInnerEar.setTextureSize(64, 64);
      LInnerEar.mirror = true;
      setRotation(LInnerEar, 0F, 0F, 0F);
      TopHat = new ModelRenderer(this, 24, 24);
      TopHat.addBox(0F, 0F, 0F, 3, 5, 3);
      TopHat.setRotationPoint(-1.5F, 1F, 0F);
      TopHat.setTextureSize(64, 64);
      TopHat.mirror = true;
      setRotation(TopHat, 0F, 0F, 0F);
      TopHatTrim = new ModelRenderer(this, 20, 32);
      TopHatTrim.addBox(0F, 0F, 0F, 4, 1, 4);
      TopHatTrim.setRotationPoint(-2F, 5F, -0.5F);
      TopHatTrim.setTextureSize(64, 64);
      TopHatTrim.mirror = true;
      setRotation(TopHatTrim, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    RFoot.render(f5);
    RToe1.render(f5);
    RToe2.render(f5);
    RToe3.render(f5);
    LFoot.render(f5);
    LToe1.render(f5);
    LToe2.render(f5);
    LToe3.render(f5);
    LAnkle.render(f5);
    RAnkle.render(f5);
    LHeel.render(f5);
    RHeel.render(f5);
    BodyMain.render(f5);
    BodyPart1.render(f5);
    BodyPart2.render(f5);
    BodyPart3.render(f5);
    BodyPart4.render(f5);
    FacePart1.render(f5);
    FacePart2.render(f5);
    FacePart4.render(f5);
    FacePart5.render(f5);
    BodyPartTop1.render(f5);
    BodyPartTop2.render(f5);
    FacePart6.render(f5);
    FacePart7.render(f5);
    FacePart8.render(f5);
    Nose.render(f5);
    REye.render(f5);
    LEye.render(f5);
    Top.render(f5);
    REar.render(f5);
    REarTip.render(f5);
    LEar.render(f5);
    LEarTip.render(f5);
    RInnerEar.render(f5);
    LInnerEar.render(f5);
    TopHat.render(f5);
    TopHatTrim.render(f5);
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

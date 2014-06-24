package com.ilexiconn.jurassicraft.data.entity.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCoelacanth extends ModelBase
{
    //fields
    ModelRenderer Body;
    ModelRenderer Tail;
    ModelRenderer Fin1;
    ModelRenderer Fin2;
    ModelRenderer Fin3;
    ModelRenderer Fin4;
    ModelRenderer DorsalFin2;
    ModelRenderer DorsalFin;
    ModelRenderer DorsalFin3;

    public ModelCoelacanth()
    {
        textureWidth = 64;
        textureHeight = 32;

        Body = new ModelRenderer(this, 0, 0);
        Body.addBox(0F, 0F, 0F, 2, 5, 8);
        Body.setRotationPoint(0F, 19F, -8F);
        Body.setTextureSize(64, 32);
        Body.mirror = true;
        setRotation(Body, 0F, 0F, 0F);
        Tail = new ModelRenderer(this, 20, 0);
        Tail.addBox(0F, 0F, 0F, 1, 4, 10);
        Tail.setRotationPoint(0.5F, 19F, -1F);
        Tail.setTextureSize(64, 32);
        Tail.mirror = true;
        setRotation(Tail, 0F, 0F, 0F);
        Fin1 = new ModelRenderer(this, 0, 0);
        Fin1.addBox(0F, 0F, 0F, 1, 2, 3);
        Fin1.setRotationPoint(1F, 22F, -2.5F);
        Fin1.setTextureSize(64, 32);
        Fin1.mirror = true;
        setRotation(Fin1, 0F, 0.7853982F, 0F);
        Fin2 = new ModelRenderer(this, 0, 0);
        Fin2.addBox(0F, 0F, 0F, 1, 2, 3);
        Fin2.setRotationPoint(1F, 22F, 0F);
        Fin2.setTextureSize(64, 32);
        Fin2.mirror = true;
        setRotation(Fin2, 0F, 0.7853982F, 0F);
        Fin3 = new ModelRenderer(this, 0, 0);
        Fin3.addBox(0F, 0F, 0F, 1, 2, 3);
        Fin3.setRotationPoint(0.3F, 22F, -3.2F);
        Fin3.setTextureSize(64, 32);
        Fin3.mirror = true;
        setRotation(Fin3, 0F, -0.7853982F, 0F);
        Fin4 = new ModelRenderer(this, 0, 0);
        Fin4.addBox(0F, 0F, 0F, 1, 2, 3);
        Fin4.setRotationPoint(0.3F, 22F, -0.7F);
        Fin4.setTextureSize(64, 32);
        Fin4.mirror = true;
        setRotation(Fin4, 0F, -0.7853982F, 0F);
        DorsalFin2 = new ModelRenderer(this, 12, 0);
        DorsalFin2.addBox(0F, 0F, 0F, 0, 2, 3);
        DorsalFin2.setRotationPoint(1F, 19F, 1F);
        DorsalFin2.setTextureSize(64, 32);
        DorsalFin2.mirror = true;
        setRotation(DorsalFin2, 0.7853982F, 0F, 0F);
        DorsalFin = new ModelRenderer(this, 18, 0);
        DorsalFin.addBox(0F, 0F, 0F, 1, 2, 2);
        DorsalFin.setRotationPoint(0.5F, 17.5F, -2F);
        DorsalFin.setTextureSize(64, 32);
        DorsalFin.mirror = true;
        setRotation(DorsalFin, -0.6108652F, 0F, 0F);
        DorsalFin3 = new ModelRenderer(this, 12, 0);
        DorsalFin3.addBox(0F, 0F, 0F, 0, 2, 3);
        DorsalFin3.setRotationPoint(1F, 21.5F, 2F);
        DorsalFin3.setTextureSize(64, 32);
        DorsalFin3.mirror = true;
        setRotation(DorsalFin3, -0.7853982F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5);
        Body.render(f5);
        Tail.render(f5);
        Fin1.render(f5);
        Fin2.render(f5);
        Fin3.render(f5);
        Fin4.render(f5);
        DorsalFin2.render(f5);
        DorsalFin.render(f5);
        DorsalFin3.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z)
    {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
    }

}

package net.ilexiconn.jurassicraft.entity.render.dinosaurs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.ilexiconn.jurassicraft.JurassiCraft;
import net.ilexiconn.jurassicraft.client.model.entity.ModelTriceratops;
import net.ilexiconn.jurassicraft.entity.Creature;
import net.ilexiconn.jurassicraft.entity.dinosaurs.EntityTriceratops;
import net.ilexiconn.jurassicraft.entity.render.RenderDinosaur;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderTriceratops extends RenderDinosaur
{
    public RenderTriceratops(Creature dino)
    {
        super(new ModelTriceratops(), dino, 1.0F);
    }

    @Override
    public ResourceLocation getEntityTexture(Entity entity)
    {
        EntityTriceratops dino = (EntityTriceratops) entity;
        if (dino.isMale())
        {
            return new ResourceLocation(JurassiCraft.getModId() + "textures/entity/Triceratops_Male_1.png");
        }
        else
        {
            return new ResourceLocation(JurassiCraft.getModId() + "textures/entity/Triceratops_Female_1.png");
        }
    }
}

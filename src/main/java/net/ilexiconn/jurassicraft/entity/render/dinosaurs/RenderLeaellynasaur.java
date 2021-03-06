package net.ilexiconn.jurassicraft.entity.render.dinosaurs;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.ilexiconn.jurassicraft.JurassiCraft;
import net.ilexiconn.jurassicraft.client.model.entity.ModelLeaellynasaur;
import net.ilexiconn.jurassicraft.entity.Creature;
import net.ilexiconn.jurassicraft.entity.dinosaurs.EntityLeaellynasaur;
import net.ilexiconn.jurassicraft.entity.render.RenderDinosaur;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderLeaellynasaur extends RenderDinosaur
{
    public RenderLeaellynasaur(Creature dino)
    {
        super(new ModelLeaellynasaur(), dino, 0.45F);
    }

    @Override
    public ResourceLocation getEntityTexture(Entity entity)
    {
        EntityLeaellynasaur dino = (EntityLeaellynasaur) entity;
        if (dino.isMale())
        {
            return new ResourceLocation(JurassiCraft.getModId() + "textures/entity/Leaellynasaura_Male_1.png");
        }
        else
        {
            return new ResourceLocation(JurassiCraft.getModId() + "textures/entity/Leaellynasaura_Female_1.png");
        }
    }
}

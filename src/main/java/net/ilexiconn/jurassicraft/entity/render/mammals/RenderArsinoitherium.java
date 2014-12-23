package net.ilexiconn.jurassicraft.entity.render.mammals;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.ilexiconn.jurassicraft.JurassiCraft;
import net.ilexiconn.jurassicraft.client.model.entity.ModelArsinoitherium;
import net.ilexiconn.jurassicraft.config.JsonCreatureDefinition;
import net.ilexiconn.jurassicraft.entity.mammals.EntityArsinoitherium;
import net.ilexiconn.jurassicraft.entity.render.RenderMammal;

@SideOnly(Side.CLIENT)
public class RenderArsinoitherium extends RenderMammal
{
    public RenderArsinoitherium(JsonCreatureDefinition mammal)
    {
        super(new ModelArsinoitherium(), mammal, 0.8F);
    }

    @Override
    public ResourceLocation getEntityTexture(Entity entity)
    {
        EntityArsinoitherium mammal = (EntityArsinoitherium) entity;
        if (mammal.isMale())
        {
            return new ResourceLocation(JurassiCraft.getModId() + "textures/entity/Arsinoitherium_Male_1.png");
        } 
        else 
        {
            return new ResourceLocation(JurassiCraft.getModId() + "textures/entity/Arsinoitherium_Female_1.png");
        }
    }
}

package net.ilexiconn.jurassicraft.entity.render.mammals;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.ilexiconn.jurassicraft.JurassiCraft;
import net.ilexiconn.jurassicraft.client.model.entity.ModelMammoth;
import net.ilexiconn.jurassicraft.config.JsonCreatureDefinition;
import net.ilexiconn.jurassicraft.entity.mammals.EntityMammoth;
import net.ilexiconn.jurassicraft.entity.render.RenderMammal;

@SideOnly(Side.CLIENT)
public class RenderMammoth extends RenderMammal
{
    public RenderMammoth(JsonCreatureDefinition mammal)
    {
        super(new ModelMammoth(), mammal, 1.4F);
    }

    @Override
    public ResourceLocation getEntityTexture(Entity entity)
    {
        EntityMammoth mammal = (EntityMammoth) entity;
        if (mammal.isMale())
        {
            return new ResourceLocation(JurassiCraft.getModId() + "textures/entity/Mammoth_Male_1.png");
        } 
        else 
        {
            return new ResourceLocation(JurassiCraft.getModId() + "textures/entity/Mammoth_Female_1.png");
        }
    }
}

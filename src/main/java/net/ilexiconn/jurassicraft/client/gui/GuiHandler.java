package net.ilexiconn.jurassicraft.client.gui;

import net.ilexiconn.jurassicraft.container.ContainerCultivate;
import net.ilexiconn.jurassicraft.container.ContainerDNACombinator;
import net.ilexiconn.jurassicraft.container.ContainerDNAExtractor;
import net.ilexiconn.jurassicraft.container.ContainerSecurityFence;
import net.ilexiconn.jurassicraft.tile.TileCultivate;
import net.ilexiconn.jurassicraft.tile.TileDNACombinator;
import net.ilexiconn.jurassicraft.tile.TileDNAExtractor;
import net.ilexiconn.jurassicraft.tile.TileSecurityFence;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import cpw.mods.fml.common.network.IGuiHandler;

public class GuiHandler implements IGuiHandler
{
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        TileEntity tileEntity = world.getTileEntity(x, y, z);
        if (tileEntity instanceof TileCultivate && ID == 0)
            return new ContainerCultivate(player.inventory, (TileCultivate) tileEntity);
        if (tileEntity instanceof TileSecurityFence)
            return new ContainerSecurityFence(player.inventory, (TileSecurityFence) tileEntity);
        if (tileEntity instanceof TileDNAExtractor)
            return new ContainerDNAExtractor(player.inventory, (TileDNAExtractor) tileEntity);
        if (tileEntity instanceof TileDNACombinator)
            return new ContainerDNACombinator(player.inventory, (TileDNACombinator) tileEntity);
        return null;
    }

    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        if (ID == 69) return new GuiDinoPad();
        if (ID == 51) return new GuiDinoPadEgg();
        if (ID == 13) return new GuiDinoPadPregnancy();

        TileEntity tileEntity = world.getTileEntity(x, y, z);
        if (tileEntity instanceof TileCultivate && ID == 0)
            return new GuiCultivate(player.inventory, (TileCultivate) tileEntity);
        if (tileEntity instanceof TileCultivate && ID == 1) return new GuiCultivateProcess((TileCultivate) tileEntity);
        if (tileEntity instanceof TileSecurityFence)
            return new GuiSecurityFence(player.inventory, (TileSecurityFence) tileEntity);
        if (tileEntity instanceof TileDNAExtractor)
            return new GuiDNAExtractor(player.inventory, (TileDNAExtractor) tileEntity);
        if (tileEntity instanceof TileDNACombinator)
            return new GuiDNACombinator(player.inventory, (TileDNACombinator) tileEntity);
        return null;
    }
}

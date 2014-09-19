package to.uk.ilexiconn.jurassicraft.data.gui;

import to.uk.ilexiconn.jurassicraft.data.gui.container.ContainerCultivate;
import to.uk.ilexiconn.jurassicraft.data.gui.container.ContainerDNAExtractor;
import to.uk.ilexiconn.jurassicraft.data.tile.TileAnalyzer;
import to.uk.ilexiconn.jurassicraft.data.tile.TileCultivate;
import to.uk.ilexiconn.jurassicraft.data.tile.TileDNAExtractor;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class GuiHandler implements IGuiHandler
{
    public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        TileEntity tileEntity = world.getTileEntity(x, y, z);
        if (tileEntity instanceof TileDNAExtractor)
            return new ContainerDNAExtractor(player.inventory, (TileDNAExtractor) tileEntity);
        if (tileEntity instanceof TileCultivate)
            return new ContainerCultivate(player.inventory, (TileCultivate) tileEntity);
        return null;
    }

    public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
    {
        TileEntity tileEntity = world.getTileEntity(x, y, z);
        if (tileEntity instanceof TileDNAExtractor) 
        	return new GuiDNAExtractor(player.inventory, (TileDNAExtractor) tileEntity);
        if (tileEntity instanceof TileCultivate) 
        	return new GuiCultivate(player.inventory, (TileCultivate) tileEntity);
        return null;
    }
}

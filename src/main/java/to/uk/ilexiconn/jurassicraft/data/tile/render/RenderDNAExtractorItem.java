package to.uk.ilexiconn.jurassicraft.data.tile.render;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.client.IItemRenderer;

import org.lwjgl.opengl.GL11;

import to.uk.ilexiconn.jurassicraft.data.tile.TileDNAExtractor;

public class RenderDNAExtractorItem implements IItemRenderer {

	private TileEntitySpecialRenderer render = new DNAExtractorRenderer();
	private TileEntity tileEntity = new TileDNAExtractor();

	public RenderDNAExtractorItem() {

	}

	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) {
		return true;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
		return true;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) {
		if (type == IItemRenderer.ItemRenderType.ENTITY) {
			GL11.glTranslatef(-0.5F, -0.35F, -0.5F);
			GL11.glScalef(1.2F, 1.2F, 1.2F);
		}
		this.render.renderTileEntityAt(this.tileEntity, 0.0D, 0.0D, 0.0D, 0.0F);
	}
}
package energy.transformer.common.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import energy.transformer.common.EnergyTransformer;
import energy.transformer.common.blocks.container.ContainerPixelCondenser;
import energy.transformer.common.tileentity.TileEntityPixelCondenser;

public class GuiPixelCondenser extends GuiContainer
{
	private static final ResourceLocation pixelCondenserGuiTexture = new ResourceLocation(EnergyTransformer.MODID.toLowerCase() + ":textures/gui/EnergyPixelCondenserGui.png");

	private TileEntityPixelCondenser pixelCondenser;

	private GuiButton convert;

	private GuiTextField textField;

	public GuiPixelCondenser(InventoryPlayer inventory, TileEntityPixelCondenser te)
	{
		super(new ContainerPixelCondenser(inventory, te));
		this.pixelCondenser = te;
		this.xSize = 256;
		this.ySize = 256;
	}

	@Override
	public void initGui()
	{
		super.initGui();
		int x = (this.width - this.xSize) / 2;
		int y = (this.height - this.ySize) / 2;

		Keyboard.enableRepeatEvents(true);

		this.buttonList.clear();
		this.buttonList.add(this.convert = new GuiButton(0, x + 150, y + 20, 67, 20, "Convert"));

		this.textField = new GuiTextField(this.fontRendererObj, x - 51, y + 92, 90, 12);
		this.textField.setMaxStringLength(120);
		this.textField.setCanLoseFocus(false);
		this.textField.setFocused(true);
	}

	@Override
	public void onGuiClosed()
	{
		super.onGuiClosed();
		Keyboard.enableRepeatEvents(false);
	}

	@Override
	protected void mouseClicked(int i, int j, int k)
	{
		super.mouseClicked(i, j, k);
		int xMin = (this.width - this.xSize) / 2;
		int yMin = (this.height - this.ySize) / 2;
		int x = i - xMin;
		int y = j - yMin;
		int text_x = xMin - 51;
		int text_y = yMin + 92;
		int width = 90;
		int height = 12;
		if(x >= text_x && y >= text_y && x <= text_x + width && y <= text_y + height)
		{
			textField.setFocused(true);
		}
		else
		{
			textField.setFocused(false);
		}
	}

	@Override
	protected void keyTyped(char c, int i)
	{
		if(textField.isFocused())
		{
			if(c == 13 || c == 27)
			{
				textField.setFocused(false);
			}
			else
			{
				textField.textboxKeyTyped(c, i);
			}
		}
		else
		{
			super.keyTyped(c, i);
		}
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int p_146979_1_, int p_146979_2_)
	{
		this.fontRendererObj.drawString(this.pixelCondenser.hasCustomInventoryName() ? this.pixelCondenser.getInventoryName() : StatCollector.translateToLocal(this.pixelCondenser.getInventoryName()), 35, this.ySize - 241, 4210752);
		this.fontRendererObj.drawString(StatCollector.translateToLocal("container.inventory"), 47, this.ySize - 102, 4210752);
		this.textField.drawTextBox();
	}

    private int inventoryRows = 0;
	
	@Override
    protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(pixelCondenserGuiTexture);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k + 27, l + 10, 0, 0, 215, 245);
    }
}
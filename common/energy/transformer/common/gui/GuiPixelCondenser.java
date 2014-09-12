package energy.transformer.common.gui;

import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

import energy.transformer.common.EnergyTransformer;
import energy.transformer.common.blocks.container.ContainerPixelCondenser;
import energy.transformer.common.tileentity.TileEntityPixelCondenser;

public class GuiPixelCondenser extends GuiContainer
{
	private static final ResourceLocation pixelCondenserGuiTexture = new ResourceLocation(EnergyTransformer.MODID.toLowerCase() + ":textures/gui/energypixelcondensergui.png");
	private ResourceLocation pixelCondenserGuiTexture2 = new ResourceLocation(EnergyTransformer.MODID.toLowerCase() + ":textures/gui/energypixelcondensergui_side.png");

	private TileEntityPixelCondenser pixelCondenser;

	private GuiButton convert;

	private GuiTextField textField;

	boolean isScrolling;
	boolean wasClicking;
	float currentScroll = 0.0F;
	int slotPos = 0;
	int prevSlotPos = 0;

	public GuiPixelCondenser(InventoryPlayer inventory, TileEntityPixelCondenser te)
	{
		super(new ContainerPixelCondenser(inventory, te));
		this.pixelCondenser = te;
		this.xSize = 256;
		this.ySize = 256;
	}

	@Override
	public void drawScreen(int mouseX, int mouseY, float par3)
	{
		super.drawScreen(mouseX, mouseY, par3);
		this.updateScrollbar(mouseX, mouseY, par3);
		this.textField.drawTextBox();
	}

	private void updateScrollbar(int mouseX, int mouseY, float par3)
	{
		boolean mouseDown = Mouse.isButtonDown(0);
		int x = (this.width - this.xSize) / 2;
		int y = (this.height - this.ySize) / 2;
		int xScroll = x + 127;
		int yScroll = y + 48;
		int scrollWidth = xScroll + 14;
		int scrollHeight = yScroll + 100;

		if(!this.wasClicking && mouseDown && mouseX >= xScroll && mouseY >= yScroll && mouseX < scrollWidth && mouseY < scrollHeight)
		{
			this.isScrolling = true;
		}

		if(!mouseDown)
		{
			this.isScrolling = false;
		}

		if(wasClicking && !isScrolling && slotPos != prevSlotPos)
		{
			prevSlotPos = slotPos;
		}

		this.wasClicking = mouseDown;

		if(this.isScrolling)
		{
			this.currentScroll = (mouseY - yScroll - 7.5F) / (scrollHeight - yScroll - 15.0F);

			if(this.currentScroll < 0.0F)
			{
				this.currentScroll = 0.0F;
			}

			if(this.currentScroll > 1.0F)
			{
				this.currentScroll = 1.0F;
			}

			((ContainerPixelCondenser)this.inventorySlots).scrollTo(this.currentScroll);
		}
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

		this.textField = new GuiTextField(this.fontRendererObj, x + 35, y + 85, 87, 10);
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

		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.getTextureManager().bindTexture(pixelCondenserGuiTexture2);
		this.drawTexturedModalRect(k + 127, (int)(l + 48 + 89 * currentScroll), 230, 0, 14, 15);
	}
}
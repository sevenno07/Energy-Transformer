package energy.transformer.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelCableRotate extends ModelBase
{
	ModelRenderer cable;
	ModelRenderer cable1;

	public ModelCableRotate()
	{
		textureWidth = 64;
		textureHeight = 32;

		cable = new ModelRenderer(this, 0, 0);
		cable.addBox(-2F, -2F, -2F, 4, 4, 10);
		cable.setRotationPoint(0F, 21F, 0F);
		cable.setTextureSize(64, 32);
		cable.mirror = true;
		setRotation(cable, 0F, 0F, 0F);
		cable1 = new ModelRenderer(this, 0, 0);
		cable1.addBox(-2F, -2F, -2F, 10, 4, 4);
		cable1.setRotationPoint(0F, 21F, 0F);
		cable1.setTextureSize(64, 32);
		cable1.mirror = true;
		setRotation(cable1, 0F, 0F, 0F);
	}

	public void render(float f)
	{
		cable.render(f);
		cable1.render(f);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}
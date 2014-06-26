package energy.transformer.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelCableDirectional extends ModelBase
{
	ModelRenderer cable;

	public ModelCableDirectional()
	{
		textureWidth = 64;
		textureHeight = 32;

		cable = new ModelRenderer(this, 0, 0);
		cable.addBox(-2F, -2F, -8F, 4, 4, 6);
		cable.setRotationPoint(0F, 21F, 0F);
		cable.setTextureSize(64, 32);
		cable.mirror = true;
		setRotation(cable, 0F, 0F, 0F);
	}

	public void render(float f)
	{
		cable.render(f);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z)
	{
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}
}
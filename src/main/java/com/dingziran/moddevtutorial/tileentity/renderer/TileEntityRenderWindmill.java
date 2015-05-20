package com.dingziran.moddevtutorial.tileentity.renderer;

import com.dingziran.moddevtutorial.ModMain;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

/**
 * Created by dingziran on 2015/5/18.
 */
public class TileEntityRenderWindmill extends TileEntitySpecialRenderer {

    private final ResourceLocation textureWindmill = new ResourceLocation(ModMain.MOD_ID,"textures/model/windmill.png");

    private int textureWidth = 64;
    private int textureHeight = 32;

    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f) {
        GL11.glPushMatrix();
            GL11.glTranslatef((float) x, (float) y, (float) z);
            Tessellator tessellator=Tessellator.instance;
            this.bindTexture(textureWindmill);
            tessellator.startDrawingQuads();
            {
                tessellator.addVertexWithUV(0,0,1,1,1);
                tessellator.addVertexWithUV(0,1,1,1/4,1/4);
                tessellator.addVertexWithUV(0,1,0,0,0);
                tessellator.addVertexWithUV(0,0,0,0,1);
            }
            tessellator.draw();
        GL11.glPopMatrix();
    }
}

package com.dingziran.moddevtutorial.renderer.tileentity;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;

/**
 * Created by dingziran on 2015/5/18.
 */
public class TileEntityRenderWindmill extends TileEntitySpecialRenderer {
    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f) {
        System.out.println("RENDERING BLOCK WINDMILL");
    }
}

package com.dingziran.moddevtutorial.proxy;

import com.dingziran.moddevtutorial.TileEntityWindmill;
import com.dingziran.moddevtutorial.renderer.tileentity.TileEntityRenderWindmill;
import cpw.mods.fml.client.registry.ClientRegistry;

/**
 * Created by dingziran on 2015/5/15.
 */
public class ClientProxy extends CommonProxy {
    public void registerProxies() {
        ClientRegistry.bindTileEntitySpecialRenderer(TileEntityWindmill.class,new TileEntityRenderWindmill());
    }
}

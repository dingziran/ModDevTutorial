package com.dingziran.moddevtutorial;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by dingziran on 2015/5/6.
 */
@Mod(modid = "ModDevTutorial", version = "0.0.1")
public class ModMain {
    public static CreativeTabs ModDevTab=new CreativeTabs("Mod Dev Tab") {
        @Override
        public Item getTabIconItem() {
            return Items.apple;
        }
    };
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        System.out.println("DIRT BLOCK >> "+ Blocks.dirt.getUnlocalizedName());
    }
}

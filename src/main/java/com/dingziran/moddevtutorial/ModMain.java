package com.dingziran.moddevtutorial;

import com.dingziran.moddevtutorial.block.BlockRed;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by dingziran on 2015/5/6.
 */
@Mod(modid = "moddevtutorial", version = "0.0.1")
public class ModMain {
    public static CreativeTabs modDevTab=new CreativeTabs("Mod Dev Tab") {
        @Override
        public Item getTabIconItem() {
            return Items.apple;
        }
    };
    public static Block blockRed;
    public static Item itemThingy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        itemThingy=new Item().setUnlocalizedName("itemThingy").setCreativeTab(modDevTab);
        GameRegistry.registerItem(itemThingy,"itemThingy");

        blockRed=new BlockRed().setBlockName("blockRed").setCreativeTab(modDevTab);
        GameRegistry.registerBlock(blockRed,"blockRed");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
    }
}

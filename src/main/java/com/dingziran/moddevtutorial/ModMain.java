package com.dingziran.moddevtutorial;

import com.dingziran.moddevtutorial.block.BlockRed;
import com.dingziran.moddevtutorial.block.BlockWindmill;
import com.dingziran.moddevtutorial.block.BlockWindmillGround;
import com.dingziran.moddevtutorial.item.ItemWindmill;
import com.dingziran.moddevtutorial.proxy.CommonProxy;
import com.dingziran.moddevtutorial.tileentity.TileEntityWindmill;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by dingziran on 2015/5/6.
 */
@Mod(modid = ModMain.MOD_ID, version = "0.0.1")
public class ModMain {
    public static final String MOD_ID="moddevtutorial";
    public static CreativeTabs modDevTab=new CreativeTabs("moddevtab") {
        @Override
        public Item getTabIconItem() {
            return Items.apple;
        }
    };
    public static Block blockRed;
    public static Block blockWindmill;
    public static Block blockWindmillGround;
    public static Item itemThingy;
    public static Item itemWindmill;

    @SidedProxy(clientSide = "com.dingziran.moddevtutorial.proxy.ClientProxy",serverSide = "com.dingziran.moddevtutorial.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event){
        itemThingy=new Item().setUnlocalizedName("itemThingy").setCreativeTab(modDevTab).setTextureName(MOD_ID+":"+"itemThingy");
        itemWindmill=new ItemWindmill().setUnlocalizedName("itemWindmill").setCreativeTab(modDevTab).setTextureName("diamond");
        GameRegistry.registerItem(itemThingy,"itemThingy");
        GameRegistry.registerItem(itemWindmill,"itemWindmill");
        blockWindmill=new BlockWindmill(Material.rock).setBlockName("blockWindmill");
        blockWindmillGround=new BlockWindmillGround(Material.ground).setBlockName("blockWindmillGround").setBlockTextureName(MOD_ID + ":" + "blockWindmillGround").setCreativeTab(modDevTab);
        blockRed=new BlockRed().setBlockName("blockRed").setCreativeTab(modDevTab).setBlockTextureName(MOD_ID + ":" + "blockRed");
        GameRegistry.registerBlock(blockWindmill,"blockWindmill");
        GameRegistry.registerBlock(blockWindmillGround,"blockWindmillGround");
        GameRegistry.registerBlock(blockRed,"blockRed");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event){
        GameRegistry.registerTileEntity(TileEntityWindmill.class,"Windmill");
        proxy.registerProxies();
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
    }
}

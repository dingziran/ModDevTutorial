package com.dingziran.moddevtutorial;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Created by dingziran on 2015/5/14.
 */
public class ItemWindmill extends Item{

    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    public boolean onItemUse(ItemStack itemStack, EntityPlayer entityPlayer, World world, int x, int y, int z, int side, float p_77648_8_, float p_77648_9_, float p_77648_10_)
    {
        if(!world.isRemote){
            System.out.println(side);
//            if(side==0)
//                world.setBlock(x,y-1,z,ModMain.blockWindmill);
            if(side==1)
                world.setBlock(x,y+1,z,ModMain.blockWindmill);
//            if(side==2)
//                world.setBlock(x,y,z-1,ModMain.blockWindmill);
//            if(side==3)
//                world.setBlock(x,y,z+1,ModMain.blockWindmill);
//            if(side==4)
//                world.setBlock(x-1,y,z,ModMain.blockWindmill);
//            if(side==5)
//                world.setBlock(x+1,y,z,ModMain.blockWindmill);
            return true;
        }
        return false;
    }
}

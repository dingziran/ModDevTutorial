package com.dingziran.moddevtutorial.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

/**
 * Created by dingziran on 2015/5/14.
 */
public class BlockWindmill extends BlockContainer{
    public BlockWindmill(Material material) {
        super(material);
    }
    @Override
    public int getRenderType(){
        return -1;
    }
    @Override
    public boolean isOpaqueCube(){
        return false;
    }
    @Override
    public boolean renderAsNormalBlock(){
        return false;
    }
    @Override
    public TileEntity createNewTileEntity(World var1,int var2){
        return new TileEntityWindmill();
    }
}

package com.dingziran.moddevtutorial;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by dingziran on 2015/5/18.
 */
public class BlockWindmillGround extends Block{
    public BlockWindmillGround(Material material) {
        super(material);
        this.setBlockBounds(0,0,0,1,0.3F,1);
    }
    public boolean renderAsNormalBlock(){
        return false;
    }
}

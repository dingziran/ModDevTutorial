package com.dingziran.moddevtutorial.block;

import com.dingziran.moddevtutorial.ModMain;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

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
    @Override
    public void onNeighborBlockChange(World world,int x, int y , int z ,Block neighborBlock){
        updateMultiBlockStructure(world,x,y,z);
    }
    @Override
    public void onBlockAdded(World world, int x, int y,int z){
        updateMultiBlockStructure(world,x,y,z);
    }
    @Override
    public MovingObjectPosition collisionRayTrace(World world,int x,int y,int z,Vec3 startVec, Vec3 endVec){
        float metadata= world.getBlockMetadata(x,y,z);
        this.setBlockBounds(0,0,0,1,(1F/16)*metadata,1);
        return super.collisionRayTrace(world,x,y,z,startVec,endVec);
    }

    public void updateMultiBlockStructure(World world,int x,int y, int z){
        isMultiBlockStructure(world,x,y,z);
    }
    public boolean isMultiBlockStructure(World world,int x1 ,int y1 ,int z1){
        boolean mStructure =false;
        boolean currentCheckStructure =true;
        for(int x2=0;x2<3;x2++){
            for(int z2=0;z2<3;z2++){
                if(!mStructure) {
                    currentCheckStructure =true;

                    for (int x3 = 0; x3 < 3; x3++) {
                        for (int z3 = 0; z3 < 3; z3++) {
                            if (currentCheckStructure && world.getBlock(x1 + x2 - x3, y1, z1 +z2 - z3).equals(ModMain.blockWindmillGround)||!(world.getBlockMetadata(x1+x2-x3,y1,z1+z2-z3)==0)) {
                                currentCheckStructure = false;
                            }
                        }
                    }
                    if(currentCheckStructure){
                        for (int x3 = 0; x3 < 3; x3++) {
                            for (int z3 = 0; z3 < 3; z3++) {
                                world.setBlockMetadataWithNotify(x1+x2-x3,y1,z1+z2-z3,x3*3+z3,2);
                            }
                        }
                    }
                }
                mStructure=currentCheckStructure;
            }
        }
        System.out.println("Not a multi block structure");
        return false;
    }
}

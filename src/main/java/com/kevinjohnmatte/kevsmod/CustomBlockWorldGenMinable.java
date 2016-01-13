package com.kevinjohnmatte.kevsmod;


import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraft.block.Block;


public class CustomBlockWorldGenMinable extends WorldGenerator 
{
	private final IBlockState oreBlock;
    private final int numberOfBlocks;
    private final Block[] genIn;
    private final Block[] genNear;
    private final int genDistance;
    
    public CustomBlockWorldGenMinable(IBlockState block, int veinSize, Block[] generateIn, Block[] generateNear, int generateDistance)
    {
        this.oreBlock = block;
        this.numberOfBlocks = veinSize;
        this.genIn = generateIn;
        this.genNear = generateNear;
        this.genDistance = generateDistance;
    }
    
    public CustomBlockWorldGenMinable(IBlockState block, int veinSize)
    {
        this(block, veinSize, new Block[]{Blocks.stone});
    }
    
    public CustomBlockWorldGenMinable(IBlockState block, int veinSize, Block[] generateIn)
    {
    	this(block, veinSize, generateIn, null, 1);
    }
    
    
    private boolean isReplaceable(World worldIn, BlockPos blockpos, Block[] genIn)
    {
    	for(Block block : genIn)
    	{
    		if(worldIn.getBlockState(blockpos).getBlock() == block)
    		{
    			return true;
    		}    		
    	}    
    	return false;
    }
    
    private boolean isNear(BlockPos blockpos, Block[] near, int distance, World worldIn)
    {
    	for (int x = (blockpos.getX()-distance); x <= (blockpos.getX()+distance); ++x)
        {
			for (int y = (blockpos.getY()-distance); y <= (blockpos.getY()+distance); ++y)
            {
				for (int z = (blockpos.getZ()-distance); z <= (blockpos.getZ()+distance); ++z)
                {
					BlockPos Nearblockpos = new BlockPos(x, y, z);
					  	
					for(Block nearblock : near)
			    	{
						if(worldIn.getBlockState(Nearblockpos).getBlock() == nearblock && Nearblockpos != blockpos)
						{
							return true;
						}
			    	}
                }
            }
        }
    	return false;
    }
    
    public boolean generate(World worldIn, Random p_180709_2_, BlockPos p_180709_3_)
    {
        float f = p_180709_2_.nextFloat() * (float)Math.PI;
        double d0 = (double)((float)(p_180709_3_.getX() + 8) + MathHelper.sin(f) * (float)this.numberOfBlocks / 8.0F);
        double d1 = (double)((float)(p_180709_3_.getX() + 8) - MathHelper.sin(f) * (float)this.numberOfBlocks / 8.0F);
        double d2 = (double)((float)(p_180709_3_.getZ() + 8) + MathHelper.cos(f) * (float)this.numberOfBlocks / 8.0F);
        double d3 = (double)((float)(p_180709_3_.getZ() + 8) - MathHelper.cos(f) * (float)this.numberOfBlocks / 8.0F);
        double d4 = (double)(p_180709_3_.getY() + p_180709_2_.nextInt(3) - 2);
        double d5 = (double)(p_180709_3_.getY() + p_180709_2_.nextInt(3) - 2);

        for (int i = 0; i < this.numberOfBlocks; ++i)
        {
            float f1 = (float)i / (float)this.numberOfBlocks;
            double d6 = d0 + (d1 - d0) * (double)f1;
            double d7 = d4 + (d5 - d4) * (double)f1;
            double d8 = d2 + (d3 - d2) * (double)f1;
            double d9 = p_180709_2_.nextDouble() * (double)this.numberOfBlocks / 16.0D;
            double d10 = (double)(MathHelper.sin((float)Math.PI * f1) + 1.0F) * d9 + 1.0D;
            double d11 = (double)(MathHelper.sin((float)Math.PI * f1) + 1.0F) * d9 + 1.0D;
            int j = MathHelper.floor_double(d6 - d10 / 2.0D);
            int k = MathHelper.floor_double(d7 - d11 / 2.0D);
            int l = MathHelper.floor_double(d8 - d10 / 2.0D);
            int i1 = MathHelper.floor_double(d6 + d10 / 2.0D);
            int j1 = MathHelper.floor_double(d7 + d11 / 2.0D);
            int k1 = MathHelper.floor_double(d8 + d10 / 2.0D);

            for (int l1 = j; l1 <= i1; ++l1)
            {
                double d12 = ((double)l1 + 0.5D - d6) / (d10 / 2.0D);

                if (d12 * d12 < 1.0D)
                {
                    for (int i2 = k; i2 <= j1; ++i2)
                    {
                        double d13 = ((double)i2 + 0.5D - d7) / (d11 / 2.0D);

                        if (d12 * d12 + d13 * d13 < 1.0D)
                        {
                            for (int j2 = l; j2 <= k1; ++j2)
                            {
                                double d14 = ((double)j2 + 0.5D - d8) / (d10 / 2.0D);

                                if (d12 * d12 + d13 * d13 + d14 * d14 < 1.0D)
                                {
                                    BlockPos blockpos1 = new BlockPos(l1, i2, j2);

                                    if (this.isReplaceable(worldIn, blockpos1, this.genIn))
                                    {
                                    	if(this.genNear == null)
                                    	{
                                    		worldIn.setBlockState(blockpos1, this.oreBlock, 2);
                                    	}
                                    	else
                                    	{
                                    		if(this.isNear(blockpos1, this.genNear, this.genDistance, worldIn))
                                    		{
                                    			worldIn.setBlockState(blockpos1, this.oreBlock, 2);
                                    		}
                                    	}
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        return true;
    }
}

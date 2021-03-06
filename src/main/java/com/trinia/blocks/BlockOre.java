package com.trinia.blocks;

import java.util.List;
import java.util.Random;

import com.trinia.TriniaMod;
import com.trinia.items.TriniaItems;
import com.trinia.util.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.IStringSerializable;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockOre extends Block
{
    public BlockOre()
    {
        super(Material.rock);
        this.setDefaultState(this.blockState.getBaseState());
        this.setCreativeTab(TriniaMod.TriniaBlocksTab);
    }
    
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return this == TriniaBlocks.adimiteOre ? TriniaItems.adimite : (this == TriniaBlocks.orcaOre ? TriniaItems.orca : (this == TriniaBlocks.orisoneOre ? TriniaItems.orisone : Item.getItemFromBlock(this)));
    }

    public int quantityDropped(Random random)
    {
        return 4;
    }
}
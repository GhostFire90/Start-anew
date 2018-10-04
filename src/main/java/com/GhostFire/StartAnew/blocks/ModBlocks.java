package com.GhostFire.StartAnew.blocks;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
	public static BlockBase ruby_block = new BlockBase(Material.IRON, "ruby_block").setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	public static void register(IForgeRegistry<Block> registry) {
			registry.registerAll(
					ruby_block);
			
	}

	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
		registry.registerAll(ruby_block.createItemBlock());
		Item.getItemFromBlock(ruby_block);
	}

	public static void registerModels() {
		ruby_block.registerItemModel(Item.getItemFromBlock(ruby_block));
	}
}

package com.GhostFire.StartAnew.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import com.GhostFire.StartAnew.items.ItemBase;

public class ModItems {
	public static ItemBase ruby =  (ItemBase) new ItemBase("ruby").setCreativeTab(CreativeTabs.MATERIALS);
	public static void register(IForgeRegistry<Item> registery) {
		registery.registerAll(ruby);
	}
	public static void registerModels() {
		ruby.registerModels();
	}
	
	
}

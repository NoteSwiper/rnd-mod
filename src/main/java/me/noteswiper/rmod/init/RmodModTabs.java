
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package me.noteswiper.rmod.init;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class RmodModTabs {
	public static CreativeModeTab TAB_CREATIVE_ITEM_TAB;

	public static void load() {
		TAB_CREATIVE_ITEM_TAB = new CreativeModeTab("tabcreative_item_tab") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.BROWN_BED);
			}

			@Override
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}

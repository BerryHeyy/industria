package io.github.berryheyy.industria.item;

import net.minecraft.item.ItemGroup;

public class ColoredItem extends BasicItem{
	
	int color;
	
	public ColoredItem(ItemGroup itemGroup) {
		super(itemGroup);
	}
	
	public int getColor() {
		return color;
	}
	
}


package com.affehund.airplanes.item;

import com.affehund.airplanes.init.AirplanesTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;



public class SteelRod extends Item {
	public static ModelRegistryEvent steel_rod;
	

	public SteelRod() {
		setCreativeTab(AirplanesTabs.tab);
	}
}
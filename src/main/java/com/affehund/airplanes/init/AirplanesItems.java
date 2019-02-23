package com.affehund.airplanes.init;

import com.affehund.airplanes.AirplanesConstants;
import com.affehund.airplanes.item.*;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.IForgeRegistry;

public class AirplanesItems {
	
	//materials 
	public static final AluminumIngot aluminum_ingot = new AluminumIngot();
	public static final AluminumPlate aluminum_plate = new AluminumPlate();
	public static final AluminumRod aluminum_rod = new AluminumRod();
	public static final CopperIngot copper_ingot = new CopperIngot();
	public static final CopperPlate copper_plate = new CopperPlate();
	public static final CopperRod copper_rod = new CopperRod();
	public static final IronPlate iron_plate = new IronPlate();
	public static final IronRod iron_rod = new IronRod();
	public static final SteelIngot steel_ingot = new SteelIngot();
	public static final SteelPlate steel_plate = new SteelPlate();
	public static final SteelRod steel_rod = new SteelRod();
	
	public static final Fuel fuel = new Fuel();
	

	
	public static void init() {
		//materials 
		setName(aluminum_ingot, "aluminum_ingot");
		setName(aluminum_plate, "aluminum_plate");
		setName(aluminum_rod, "aluminum_rod");
		setName(copper_ingot, "copper_ingot");
		setName(copper_plate, "copper_plate");
		setName(copper_rod, "copper_rod");
		setName(iron_plate, "iron_plate");
		setName(iron_rod, "iron_rod");
		setName(steel_ingot, "steel_ingot");
		setName(steel_plate, "steel_plate");
		setName(steel_rod, "steel_rod");
		
		setName(fuel, "fuel");
	}

	@SubscribeEvent
	public static void register(RegistryEvent.Register<Item> event) {
		IForgeRegistry<Item> registry = event.getRegistry();
		//materials 
		registry.register(aluminum_ingot);
		registry.register(aluminum_plate);
		registry.register(aluminum_rod);
		registry.register(copper_ingot);
		registry.register(copper_plate);
		registry.register(copper_rod);
		registry.register(iron_plate);
		registry.register(iron_rod);
		registry.register(steel_ingot);
		registry.register(steel_plate);
		registry.register(steel_rod);
		registry.register(fuel);
	}

	
	public static void setName(Item item, String name) {
		item.setRegistryName(new ResourceLocation(AirplanesConstants.MODID, name));
		item.setUnlocalizedName(name);
	}
}
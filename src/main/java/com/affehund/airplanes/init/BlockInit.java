package com.affehund.airplanes.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

import com.affehund.airplanes.objects.blocks.AluminumBlock;
import com.affehund.airplanes.objects.blocks.AluminumCoil;
import com.affehund.airplanes.objects.blocks.AsphaltBlock;
import com.affehund.airplanes.objects.blocks.BauxiteOre;
import com.affehund.airplanes.objects.blocks.BlockFluid;
import com.affehund.airplanes.objects.blocks.CopperBlock;
import com.affehund.airplanes.objects.blocks.CopperCoil;
import com.affehund.airplanes.objects.blocks.CopperOre;
import com.affehund.airplanes.objects.blocks.GoldCoil;
import com.affehund.airplanes.objects.blocks.MachineBlock;
import com.affehund.airplanes.objects.blocks.PartsBuilder;
import com.affehund.airplanes.objects.blocks.SteelBlock;
import com.affehund.airplanes.objects.blocks.TinBlock;
import com.affehund.airplanes.objects.blocks.TinOre;
import com.affehund.airplanes.objects.blocks.combustion_engine.CombustionEngine;

public class BlockInit 
{

	public static final List<Block> BLOCKS = new ArrayList<Block>();

	//Materials
	public static final Block ALUMINUM_BLOCK = new AluminumBlock("aluminum_block");
	public static final Block ALUMINUM_COIL = new AluminumCoil("aluminum_coil");
	public static final Block ASPHALT_BLOCK = new AsphaltBlock("asphalt_block");
	public static final Block BAUXITE_ORE = new BauxiteOre("bauxite_ore");
	public static final Block COPPER_BLOCK = new CopperBlock("copper_block");
	public static final Block COPPER_COIL = new CopperCoil("copper_coil");
	public static final Block COPPER_ORE = new CopperOre("copper_ore");
	public static final Block GOLD_COIL = new GoldCoil("gold_coil");
	public static final Block STEEL_BLOCK = new SteelBlock("steel_block");
	public static final Block TIN_BLOCK = new TinBlock("tin_block");
	public static final Block TIN_ORE = new TinOre("tin_ore");
	
	public static final Block PARTS_BUILDER = new PartsBuilder("parts_builder");
	public static final Block MACHINE_BLOCK = new MachineBlock("machine_block");


	//Machines
	public static final Block COMBUSTION_ENGINE = new CombustionEngine("combustion_engine");
	
	public static final Block OIL = new BlockFluid("oil", FluidInit.OIL, Material.WATER);
}
	
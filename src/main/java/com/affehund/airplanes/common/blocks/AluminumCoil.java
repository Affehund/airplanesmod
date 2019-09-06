package com.affehund.airplanes.common.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class AluminumCoil extends BlockBase {
	public AluminumCoil(String name) {
		super(name, Material.IRON);
		setHardness(1.5F);
		setResistance(100F);
		setSoundType(SoundType.METAL);
		setHarvestLevel("pickaxe", 2);
	}
}
package PinkBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class CottonCandyBlock extends Block {
	public static final String BLOCK_NAME = "cottoncandyorde";
	
	public CottonCandyOre() {
		super(Material.ROCK);
		
		setCreateTab(CreateTabs.tabBlock);
		setBlockName(BLOCK_NAME);
	}
}

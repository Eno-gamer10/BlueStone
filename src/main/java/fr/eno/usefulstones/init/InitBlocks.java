package fr.eno.usefulstones.init;

import fr.eno.usefulstones.References;
import fr.eno.usefulstones.block.BluestoneBlock;
import fr.eno.usefulstones.block.BluestoneButtonBlock;
import fr.eno.usefulstones.block.BluestoneComparatorBlock;
import fr.eno.usefulstones.block.BluestoneDoorBlock;
import fr.eno.usefulstones.block.BluestoneInfuserBlock;
import fr.eno.usefulstones.block.BluestoneLeverBlock;
import fr.eno.usefulstones.block.BluestonePressurePlateBlock;
import fr.eno.usefulstones.block.BluestoneRepeaterBlock;
import fr.eno.usefulstones.block.BluestoneTorchBlock;
import fr.eno.usefulstones.block.BluestoneTripWireBlock;
import fr.eno.usefulstones.block.BluestoneTripWireHookBlock;
import fr.eno.usefulstones.block.BluestoneWeightedPressurePlateBlock;
import fr.eno.usefulstones.block.BluestoneWireBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.PressurePlateBlock.Sensitivity;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class InitBlocks
{
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, References.MOD_ID);
	
	public static final RegistryObject<BluestoneRepeaterBlock> BLUESTONE_REPEATER = BLOCKS.register("bluestone_repeater", () -> new BluestoneRepeaterBlock());
	public static final RegistryObject<BluestoneWireBlock> BLUESTONE_WIRE = BLOCKS.register("bluestone_wire", () -> new BluestoneWireBlock());
	public static final RegistryObject<BluestoneTorchBlock> BLUESTONE_TORCH = BLOCKS.register("bluestone_torch", () -> new BluestoneTorchBlock());
	public static final RegistryObject<BluestoneBlock> BLUESTONE_BLOCK = BLOCKS.register("bluestone_block", () -> new BluestoneBlock());
	public static final RegistryObject<BluestoneComparatorBlock> BLUESTONE_COMPARATOR = BLOCKS.register("bluestone_comparator", () -> new BluestoneComparatorBlock());
	public static final RegistryObject<BluestoneLeverBlock> BLUESTONE_LEVER = BLOCKS.register("bluestone_lever", () -> new BluestoneLeverBlock());
	
	public static final RegistryObject<BluestoneButtonBlock> BLUESTONE_OAK_BUTTON = BLOCKS.register("bluestone_oak_button", () -> new BluestoneButtonBlock(true));
	public static final RegistryObject<BluestoneButtonBlock> BLUESTONE_SPRUCE_BUTTON = BLOCKS.register("bluestone_spruce_button", () -> new BluestoneButtonBlock(true));
	public static final RegistryObject<BluestoneButtonBlock> BLUESTONE_BIRCH_BUTTON = BLOCKS.register("bluestone_birch_button", () -> new BluestoneButtonBlock(true));
	public static final RegistryObject<BluestoneButtonBlock> BLUESTONE_JUNGLE_BUTTON = BLOCKS.register("bluestone_jungle_button", () -> new BluestoneButtonBlock(true));
	public static final RegistryObject<BluestoneButtonBlock> BLUESTONE_ACACIA_BUTTON = BLOCKS.register("bluestone_acacia_button", () -> new BluestoneButtonBlock(true));
	public static final RegistryObject<BluestoneButtonBlock> BLUESTONE_DARK_OAK_BUTTON = BLOCKS.register("bluestone_dark_oak_button", () -> new BluestoneButtonBlock(true));
	public static final RegistryObject<BluestoneButtonBlock> BLUESTONE_STONE_BUTTON = BLOCKS.register("bluestone_stone_button", () -> new BluestoneButtonBlock(false));
	
	public static final RegistryObject<BluestonePressurePlateBlock> BLUESTONE_OAK_PRESSURE_PLATE = BLOCKS.register("bluestone_oak_pressure_plate", () -> new BluestonePressurePlateBlock(Sensitivity.EVERYTHING));
	public static final RegistryObject<BluestonePressurePlateBlock> BLUESTONE_SPRUCE_PRESSURE_PLATE = BLOCKS.register("bluestone_spruce_pressure_plate", () -> new BluestonePressurePlateBlock(Sensitivity.EVERYTHING));
	public static final RegistryObject<BluestonePressurePlateBlock> BLUESTONE_BIRCH_PRESSURE_PLATE = BLOCKS.register("bluestone_birch_pressure_plate", () -> new BluestonePressurePlateBlock(Sensitivity.EVERYTHING));
	public static final RegistryObject<BluestonePressurePlateBlock> BLUESTONE_JUNGLE_PRESSURE_PLATE = BLOCKS.register("bluestone_jungle_pressure_plate", () -> new BluestonePressurePlateBlock(Sensitivity.EVERYTHING));
	public static final RegistryObject<BluestonePressurePlateBlock> BLUESTONE_ACACIA_PRESSURE_PLATE = BLOCKS.register("bluestone_acacia_pressure_plate", () -> new BluestonePressurePlateBlock(Sensitivity.EVERYTHING));
	public static final RegistryObject<BluestonePressurePlateBlock> BLUESTONE_DARK_OAK_PRESSURE_PLATE = BLOCKS.register("bluestone_dark_oak_pressure_plate", () -> new BluestonePressurePlateBlock(Sensitivity.EVERYTHING));
	public static final RegistryObject<BluestonePressurePlateBlock> BLUESTONE_STONE_PRESSURE_PLATE = BLOCKS.register("bluestone_stone_pressure_plate", () -> new BluestonePressurePlateBlock(Sensitivity.MOBS));
	public static final RegistryObject<BluestoneWeightedPressurePlateBlock> BLUESTONE_LIGHT_WEIGHTED_PRESSURE_PLATE = BLOCKS.register("bluestone_light_weighted_pressure_plate", () -> new BluestoneWeightedPressurePlateBlock(15));
	public static final RegistryObject<BluestoneWeightedPressurePlateBlock> BLUESTONE_HEAVY_WEIGHTED_PRESSURE_PLATE = BLOCKS.register("bluestone_heavy_weighted_pressure_plate", () -> new BluestoneWeightedPressurePlateBlock(150));

	public static final RegistryObject<BluestoneTripWireHookBlock> BLUESTONE_TRIPWIRE_HOOK = BLOCKS.register("bluestone_tripwire_hook", () -> new BluestoneTripWireHookBlock());
	public static final RegistryObject<BluestoneTripWireBlock> BLUESTONE_TRIPWIRE = BLOCKS.register("bluestone_tripwire", () -> new BluestoneTripWireBlock());
	
	public static final RegistryObject<BluestoneDoorBlock> BLUESTONE_SPRUCE_DOOR = BLOCKS.register("bluestone_spruce_door", () -> new BluestoneDoorBlock(Block.Properties.create(Material.WOOD, Blocks.SPRUCE_PLANKS.getDefaultState().getMaterial().getColor()).hardnessAndResistance(3.0F).sound(SoundType.WOOD).notSolid()));
	public static final RegistryObject<BluestoneDoorBlock> BLUESTONE_BIRCH_DOOR = BLOCKS.register("bluestone_birch_door", () -> new BluestoneDoorBlock(Block.Properties.create(Material.WOOD, Blocks.BIRCH_PLANKS.getDefaultState().getMaterial().getColor()).hardnessAndResistance(3.0F).sound(SoundType.WOOD).notSolid()));
	public static final RegistryObject<BluestoneDoorBlock> BLUESTONE_JUNGLE_DOOR = BLOCKS.register("bluestone_jungle_door", () -> new BluestoneDoorBlock(Block.Properties.create(Material.WOOD, Blocks.JUNGLE_PLANKS.getDefaultState().getMaterial().getColor()).hardnessAndResistance(3.0F).sound(SoundType.WOOD).notSolid()));
	public static final RegistryObject<BluestoneDoorBlock> BLUESTONE_ACACIA_DOOR = BLOCKS.register("bluestone_acacia_door", () -> new BluestoneDoorBlock(Block.Properties.create(Material.WOOD, Blocks.ACACIA_PLANKS.getDefaultState().getMaterial().getColor()).hardnessAndResistance(3.0F).sound(SoundType.WOOD).notSolid()));
	public static final RegistryObject<BluestoneDoorBlock> BLUESTONE_DARK_OAK_DOOR = BLOCKS.register("bluestone_dark_oak_door", () -> new BluestoneDoorBlock(Block.Properties.create(Material.WOOD, Blocks.DARK_OAK_PLANKS.getDefaultState().getMaterial().getColor()).hardnessAndResistance(3.0F).sound(SoundType.WOOD).notSolid()));
	public static final RegistryObject<BluestoneDoorBlock> BLUESTONE_OAK_DOOR = BLOCKS.register("bluestone_oak_door", () -> new BluestoneDoorBlock(Block.Properties.create(Material.WOOD, Blocks.OAK_PLANKS.getDefaultState().getMaterial().getColor()).hardnessAndResistance(3.0F).sound(SoundType.WOOD).notSolid()));
	public static final RegistryObject<BluestoneDoorBlock> BLUESTONE_IRON_DOOR = BLOCKS.register("bluestone_iron_door", () -> new BluestoneDoorBlock(Block.Properties.create(Material.IRON, MaterialColor.IRON).hardnessAndResistance(5.0F).sound(SoundType.METAL).notSolid()));
	
	public static final RegistryObject<Block> BLUESTONE_ORE = BLOCKS.register("bluestone_ore", () -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3.0F).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE)));

	public static final RegistryObject<Block> BLUESTONE_INFUSER = BLOCKS.register("bluestone_infuser", () -> new BluestoneInfuserBlock());
}
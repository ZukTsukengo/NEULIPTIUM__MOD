package net.Zuk_Tsukengo.firstmod.block;

import net.Zuk_Tsukengo.firstmod.FirstMod;
import net.Zuk_Tsukengo.firstmod.item.ModCreativeModeTab;
import net.Zuk_Tsukengo.firstmod.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, FirstMod.MOD_ID);

    public static final RegistryObject<Block> NEULIPTIUM_BLOCK =registerBlock("neuliptium_block",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(10f).requiresCorrectToolForDrops()), ModCreativeModeTab.NEULIPTIUM_TAB);
    public static final RegistryObject<Block> NEW_NEULIPTIUM_BLOCK =registerBlock("new_neuliptium_block",
            ()->new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(25f).requiresCorrectToolForDrops()), ModCreativeModeTab.NEULIPTIUM_TAB);
    public static final RegistryObject<Block> NEULIPTIUM_ORE =registerBlock("neuliptium_ore",
            ()->new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(50f).requiresCorrectToolForDrops(),
                    UniformInt.of(5, 10)), ModCreativeModeTab.NEULIPTIUM_TAB);
    public static final RegistryObject<Block> DEEPSLATE_NEULIPTIUM_ORE =registerBlock("deepslate_neuliptium_ore",
            ()->new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(75f).requiresCorrectToolForDrops(),
                    UniformInt.of(10, 20)), ModCreativeModeTab.NEULIPTIUM_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registryBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registryBlockItem(String name, RegistryObject<T> block,
                                                                                CreativeModeTab tab){
        return ModItems.ITEMS.register(name,() -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}

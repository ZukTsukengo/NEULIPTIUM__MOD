package net.Zuk_Tsukengo.firstmod.item;

import net.Zuk_Tsukengo.firstmod.FirstMod;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, FirstMod.MOD_ID);
    public static final RegistryObject<Item> NEULIPTIUM = ITEMS.register("neuliptium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NEULIPTIUM_TAB)));
    public static final RegistryObject<Item> NEW_NEULIPTIUM = ITEMS.register("new_neuliptium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.NEULIPTIUM_TAB)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

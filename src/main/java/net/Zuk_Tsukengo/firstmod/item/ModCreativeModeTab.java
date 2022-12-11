package net.Zuk_Tsukengo.firstmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab NEULIPTIUM_TAB = new CreativeModeTab("neuliptium_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.NEULIPTIUM.get());
        }
    };
}

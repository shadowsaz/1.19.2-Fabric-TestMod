package net.shadowsaz.testmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.shadowsaz.testmod.TestMod;

public class ModItemGroup {
    public static final ItemGroup TANZANITE = FabricItemGroupBuilder.build(
            new Identifier(TestMod.MOD_ID,"tanzanite"),() -> new ItemStack(ModItems.TANZANITE));
}

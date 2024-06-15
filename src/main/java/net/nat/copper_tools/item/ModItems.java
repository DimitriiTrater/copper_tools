package net.nat.copper_tools.item;

import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.nat.copper_tools.CopperTools;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CopperTools.MODID);

    public static final int PICKAXE_DAMAGE = 2;
    public static final float PICKAXE_ATTACK_SPEED = -2;
    public static final RegistryObject<Item> COPPER_PICKAXE = ITEMS.register("copper_pickaxe",
            () -> new PickaxeItem(
                    Tiers.IRON,
                    PICKAXE_DAMAGE,
                    PICKAXE_ATTACK_SPEED,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).stacksTo(1)
            ));

    public static final int AXE_DAMAGE = 15;
    public static final float AXE_ATTACK_SPEED = -2;
    public static final RegistryObject<Item> COPPER_AXE = ITEMS.register("copper_axe",
            () -> new AxeItem(
                    Tiers.IRON,
                    AXE_DAMAGE,
                    AXE_ATTACK_SPEED,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).stacksTo(1)
            ));

    public static final int SHOVEL_DAMAGE = 2;
    public static final float SHOVEL_ATTACK_SPEED = -3;
    public static final RegistryObject<Item> COPPER_SHOVEL = ITEMS.register("copper_shovel",
            () -> new ShovelItem(
                    Tiers.IRON,
                    SHOVEL_DAMAGE,
                    SHOVEL_ATTACK_SPEED,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).stacksTo(1)
            ));
    public static final int HOE_DAMAGE = 3;
    public static final float HOE_ATTACK_SPEED = -2;
    public static final RegistryObject<Item> COPPER_HOE = ITEMS.register("copper_hoe",
            () -> new HoeItem(
                    Tiers.IRON,
                    HOE_DAMAGE,
                    HOE_ATTACK_SPEED,
                    new Item.Properties().tab(CreativeModeTab.TAB_TOOLS).stacksTo(1)
            ));

    public static final int SWORD_DAMAGE = 24;
    public static final float SWORD_ATTACK_SPEED = 0.5f;
    public static final RegistryObject<Item> COPPER_SWORD = ITEMS.register("copper_sword",
            () -> new SwordItem(
                    Tiers.IRON,
                    SWORD_DAMAGE,
                    SWORD_ATTACK_SPEED,
                    new Item.Properties().tab(CreativeModeTab.TAB_COMBAT).stacksTo(1)
            ));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}

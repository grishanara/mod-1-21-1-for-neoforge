package chumbanotz.mutantbeasts;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

@Mod(MutantBeasts.MODID)
public class MutantBeasts {
    public static final String MODID = "mutantbeasts";

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(MODID);

    // Регистрация только руки Эндермена с редкими свойствами
    public static final DeferredItem<Item> ENDERSOUL_HAND = ITEMS.register("endersoul_hand",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC)));

    public MutantBeasts(IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }
}

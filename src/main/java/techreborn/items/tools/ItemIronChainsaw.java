package techreborn.items.tools;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import techreborn.config.ConfigTechReborn;

public class ItemIronChainsaw extends ItemChainsaw {

    public ItemIronChainsaw() {
    	super(ToolMaterial.IRON, "techreborn.ironChainsaw", ConfigTechReborn.IronChainsawCharge, ConfigTechReborn.IronChainsawTier, 2.0F);
    	this.cost = 50;
        }

    @Override
    public boolean canHarvestBlock(Block block, ItemStack stack) {
        return Items.iron_axe.canHarvestBlock(block, stack);
    }

    @Override
    public String getTextureName(int damage) {
        return "techreborn:items/tool/ironChainsaw";
    }

    @Override
    public int getMaxMeta() {
        return 1;
    }
}

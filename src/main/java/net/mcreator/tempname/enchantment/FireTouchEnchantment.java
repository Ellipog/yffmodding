
package net.mcreator.tempname.enchantment;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

import net.mcreator.tempname.item.LavaManPickaxeItem;
import net.mcreator.tempname.TempNameModElements;

@TempNameModElements.ModElement.Tag
public class FireTouchEnchantment extends TempNameModElements.ModElement {
	@ObjectHolder("temp_name:fire_touch")
	public static final Enchantment enchantment = null;
	public FireTouchEnchantment(TempNameModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("fire_touch"));
	}
	public static class CustomEnchantment extends Enchantment {
		public CustomEnchantment(EquipmentSlotType... slots) {
			super(Enchantment.Rarity.VERY_RARE, EnchantmentType.DIGGER, slots);
		}

		@Override
		public int getMinLevel() {
			return 1;
		}

		@Override
		public int getMaxLevel() {
			return 1;
		}

		@Override
		protected boolean canApplyTogether(Enchantment ench) {
			if (ench == Enchantments.EFFICIENCY)
				return true;
			if (ench == Enchantments.UNBREAKING)
				return true;
			if (ench == Enchantments.FORTUNE)
				return true;
			if (ench == Enchantments.MENDING)
				return true;
			return false;
		}

		@Override
		public boolean canApplyAtEnchantingTable(ItemStack stack) {
			if (stack.getItem() == LavaManPickaxeItem.block)
				return true;
			if (stack.getItem() == Items.DIAMOND_PICKAXE)
				return true;
			if (stack.getItem() == Items.IRON_PICKAXE)
				return true;
			if (stack.getItem() == Items.NETHERITE_PICKAXE)
				return true;
			if (stack.getItem() == Items.GOLDEN_PICKAXE)
				return true;
			if (stack.getItem() == Items.WOODEN_PICKAXE)
				return true;
			if (stack.getItem() == Items.STONE_PICKAXE)
				return true;
			return false;
		}

		@Override
		public boolean isTreasureEnchantment() {
			return false;
		}

		@Override
		public boolean isCurse() {
			return false;
		}

		@Override
		public boolean isAllowedOnBooks() {
			return true;
		}

		@Override
		public boolean canGenerateInLoot() {
			return true;
		}

		@Override
		public boolean canVillagerTrade() {
			return true;
		}
	}
}

package practice13.common;

public class SuperHero extends Hero {
	/** 装備しているアイテム */
	private Item equipment;

	/**
	 * 装備しているアイテムを取得します
	 * @return	装備しているアイテム
	 */
	public Item getEquipment() {
		return equipment;
	}

	/**
	 * アイテムを装備します
	 * @param equipment	装備したいアイテム
	 */
	public void setEquipment(Item equipment) {
		this.equipment = equipment;
	}

	@Override
	public int attack() {
		return super.attack() + this.equipment.getAdditionalDamage();
	}
}

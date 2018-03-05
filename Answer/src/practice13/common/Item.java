package practice13.common;

/**
 * 装備品オブジェクト
 * @author rhizome
 *
 */
public class Item {
	/** アイテム名 */
	private String name;

	/** 追加ダメージ量 */
	private int additionalDamage;

	/**
	 * 装備品の初期値を設定するコンストラクタ
	 * @param name	装備品名
	 * @param additionalDamage	追加ダメージ
	 */
	public Item(String name, int additionalDamage) {
		this.name = name;
		this.additionalDamage = additionalDamage;
	}

	/**
	 * アイテム名を取得します
	 * @return アイテム名
	 */
	public String getName() {
		return name;
	}

	/**
	 * アイテム名を設定します
	 * @param name	設定したいアイテム名
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 追加ダメージを取得します
	 * @return	追加ダメージ
	 */
	public int getAdditionalDamage() {
		return additionalDamage;
	}

	/**
	 * 追加ダメージを設定します
	 * @param additionalDamage	設定したい追加ダメージ
	 */
	public void setAdditionalDamage(int additionalDamage) {
		this.additionalDamage = additionalDamage;
	}

}

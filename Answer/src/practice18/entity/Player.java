package practice18.entity;

/**
 * 選手情報を保持しておくクラスです
 * @author rhizome
 *
 */
public class Player {
	/** ポジション */
	private String position;

	/** 名前 */
	private String name;

	/** 国 */
	private String country;

	/** 所属チーム */
	private String team;

	/**
	 * ポジションを取得します
	 * @return	ポジション
	 */
	public String getPosition() {
		return position;
	}
	/**
	 * ポジションを設定します
	 * @param position	設定したいポジション
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * 名前を取得します
	 * @return	名前
	 */
	public String getName() {
		return name;
	}

	/**
	 * 名前を設定します
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 国を取得します
	 * @return
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * 国を設定します
	 * @param country	設定したい国
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * 所属チームを取得します
	 * @return	所属チーム
	 */
	public String getTeam() {
		return team;
	}

	/**
	 * 所属チームを設定します
	 * @param team	設定したい所属チーム
	 */
	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String toString() {
		final String SEP = ",";

		StringBuilder str = new StringBuilder();
		str.append(this.position);
		str.append(SEP);
		str.append(this.name);
		str.append(SEP);
		str.append(this.country);
		str.append(SEP);
		str.append(this.team);

		return str.toString();
	}
}

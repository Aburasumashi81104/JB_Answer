package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
	public static void main(String[] args) {

		// for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□
		 * ■□□□□
		 * ■■□□□
		 * ■■■□□
		 * ■■■■□
		 * ■■■■■
		 * ■■■■□
		 * ■■■□□
		 * ■■□□□
		 * ■□□□□
		 */
		for (int vi = 0; vi < 5; vi++) {
			for (int hi = 0; hi < vi; hi++) {
				System.out.print("■");
			}
			for (int hj = vi; hj < 5; hj++) {
				System.out.print("□");
			}
			System.out.println();
		}
		for (int vj = 5; vj > 0; vj--) {
			for (int hi = 0; hi < vj; hi++) {
				System.out.print("■");
			}
			for (int hj = vj; hj < 5; hj++) {
				System.out.print("□");
			}
			System.out.println();
		}
	}
}

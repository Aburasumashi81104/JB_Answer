package practice03;
/*
 * PTra03_09.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra03_09 {
	public static void main(String[] args) {
		/*
		 * 以下の仕様に沿ってプログラムを完成させてください
		 *
		 * ●入力型プログラミングとしてください
		 * ●０～６までの数字を入力してもらいます
		 * ●０：日曜～６：土曜を、それぞれ入力された数字から判断して出力します
		 * ●０～６以外の場合は、「0～6の整数を入力してください」と出力します
		 *
		 * ※ プログラムは何行書いても良いです
		 */
		// 入力型プログラミングのお決まり文句
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		// 数字を入力する
		// 数字以外はとりあえずエラーとして良い
		int num = scanner.nextInt();

		// 数値に対応した曜日の出力
		if (num == 0) {
			System.out.println("日曜");
		} else if (num == 1) {
			System.out.println("月曜");
		} else if (num == 2) {
			System.out.println("火曜");
		} else if (num == 3) {
			System.out.println("水曜");
		} else if (num == 4) {
			System.out.println("木曜");
		} else if (num == 5) {
			System.out.println("金曜");
		} else if (num == 6) {
			System.out.println("土曜");
		} else {
			System.out.println("0～6の整数を入力してください");
		}

	}
}

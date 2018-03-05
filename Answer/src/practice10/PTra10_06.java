package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
import java.util.Scanner;

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		// 車の製造
		Scanner scanner = new Scanner(System.in);
		Car[] cars = new Car[3];
		for (int i = 0; i < cars.length; i++) {
			System.out.println("------------------------------------");
			System.out.println((i + 1) + "台目");
			cars[i] = new Car();

			System.out.println("シリアル№、車体カラー、ガソリン量をカンマ区切りで入力してください");
			String line = scanner.nextLine();

			String[] inputInfo = line.split(",");

			cars[i].serialNo = Integer.parseInt(inputInfo[0]);
			cars[i].color = inputInfo[1];
			cars[i].gasolin = Integer.parseInt(inputInfo[2]);
		}

		// それぞれの車を走らせる。
		final int distance = 200;
		int[] count = new int[cars.length];

		for (int i = 0; i < cars.length; i++) {
			int move = 0;
			while (distance - move > 0) {
				int ret = cars[i].run();
				if (ret == -1) {
					count[i] = -1;
					break;
				}

				move += ret;
				count[i]++;
			}
		}

		// 出力
		for (int i = 0; i < count.length; i++) {
			if (count[i] == -1) {
				System.out.println((i + 1) + "台目は目的地に到達できませんでした");
			} else {
				System.out.println((i + 1) + "台目の車が掛かった時間：" + count[i] + "時間");
			}
		}
	}
}

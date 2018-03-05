package practice03;
/*
 * PTra03_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra03_04 {
	public static void main(String[] args) {
		// 入力型プログラムです。
		// 下記の命令は、入力型プログラムで必要な記述になります。
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.println("西暦を入力してください");

		// コマンドプロンプトで入力した文字列が変数lineに代入されます
		String line = scanner.nextLine();

		// 文字列を数字に変換して、変数numに代入します
		// ※ コマンドプロンプトで入力された値が、数字ではなかった場合はプログラムがエラーになります
		int num = Integer.parseInt(line);

		//---------------------ここから本題-----------------------
		/*
		 * 入力された値（西暦）がうるう年かどうか判定する条件式を追加してください
		 *
		 * うるう年の条件
		 * ● 西暦の年が 4 で割り切れる年は原則として「～年はうるう年です。」
		 * ● ただし、100で割り切れたら「～年はうるう年ではありません。」
		 * ● しかし、400で割り切れるなら「～年はうるう年です。」と表示する
		 *
		 * ※ プログラムは何行書いても良いです
		 */
		// 4で割り切れる年か判定
		if (num % 4 == 0) {

			// ただし100で割り切れたら・・・
			if (num % 100 == 0) {

				// さらに400で割り切れるか判定する
				if (num % 400 == 0) {

					// うるう年確定
					System.out.println(num + "年はうるう年です。");
				} else {

					// 100で割り切れるが、400では割り切れないのでNG
					System.out.println(num + "年はうるう年ではありません。");
				}

			} else {
				// 割り切れない場合はうるう年確定
				System.out.println(num + "年はうるう年です。");
			}

		} else {
			// 4で割り切れない
			System.out.println(num + "年はうるう年ではありません。");
		}
	}
}

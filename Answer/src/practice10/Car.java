package practice10;

import java.util.Random;

public class Car {
	int serialNo;
	String color;
	int gasolin;

	int run() {
		// もう減らせない場合
		if (gasolin == 0) {
			return -1;
		}

		gasolin--;

		Random random = new Random();
		int distance = random.nextInt(15) + 1;
		return distance;
	}
}

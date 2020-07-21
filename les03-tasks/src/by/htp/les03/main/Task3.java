package by.htp.les03.main;

import java.util.Random;

public class Task3 {

	public static void main(String[] args) {
		Random rand = new Random();
		double[] sequence = new double[3];
		boolean increaseFlag = true;
		
		System.out.print("Последовательность: ");
		for (int i = 0; i < 3; i++) {
			sequence[i] = rand.nextDouble() * 100;
			System.out.printf("%.3f ", sequence[i]);
		}
		
		for (int i = 1; i < sequence.length; i++) {
			if (sequence[i] <= sequence[i - 1]) {
				increaseFlag = false;
				break;
			}
		}
		
		if (increaseFlag) {
			System.out.println("\nПоследовательность является возрастающей!");
		} else {
			System.out.println("\nПоследовательность не является возрастающей!");
		}
	}

}

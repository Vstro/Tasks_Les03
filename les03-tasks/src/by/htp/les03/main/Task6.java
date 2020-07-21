package by.htp.les03.main;

import java.util.Random;

public class Task6 {

	public static void main(String[] args) {
		double z = 6;
		int replaceCount = 0;
		Random rand = new Random();
		double[] sequence = new double[5];
		
		System.out.print("Последовательность: ");
		for (int i = 0; i < sequence.length; i++) {
			sequence[i] = rand.nextDouble() * 20 - 10;
			System.out.printf("%.3f ", sequence[i]);
		}

		for (int i = 0; i < sequence.length; i++) {
			if (sequence[i] > z) {
				sequence[i] = z;
				replaceCount++;
			}
		}
		
		System.out.print("\nПреобразованная последовательность: ");
		for (double x: sequence) {
			System.out.printf("%.3f ", x);
		}
		System.out.print("\nКоличество замен: " + replaceCount);
	}

}

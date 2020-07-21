package by.htp.les03.main;

import java.util.Random;

public class Task7 {

	public static void main(String[] args) {
		Random rand = new Random();
		double[] sequence = new double[5];
		
		System.out.print("Последовательность: ");
		for (int i = 0; i < sequence.length; i++) {
			sequence[i] = rand.nextDouble() * 20 - 10;
			System.out.printf("%.3f ", sequence[i]);
		}

		int minIndex = 0;
		int maxIndex = 0;
		double temp;
		for (int i = 1; i < sequence.length; i++) {
			if (sequence[minIndex] > sequence[i]) {
				minIndex = i;
			}
			if (sequence[maxIndex] < sequence[i]) {
				maxIndex = i;
			}
		}
		if (minIndex != maxIndex) {
			temp = sequence[minIndex];
			sequence[minIndex] = sequence[maxIndex];
			sequence[maxIndex] = temp;
		}
		
		System.out.print("\nПреобразованная последовательность: ");
		for (double x: sequence) {
			System.out.printf("%.3f ", x);
		}
	}

}

package by.htp.les03.main;

import java.util.Random;

public class Task9 {

	public static void main(String[] args) {
		int N = 10;
		int positives = 0;
		int negatives = 0;
		int zeros = 0;
		Random rand = new Random();
		double[] sequence = new double[N];
		
		System.out.print("Последовательность: ");
		for (int i = 0; i < sequence.length; i++) {
			sequence[i] = rand.nextDouble() * 20 - 10;
			System.out.printf("%.3f ", sequence[i]);
		}
		
		for (double x: sequence) {
			if (Math.abs(x) < 0.000001) {
				zeros++;
			} else if (x < 0) {
				negatives++;
			} else {
				positives++;
			}
		}
		System.out.print("\nПоложительных чисел: " + positives + "\nОтрицательных чисел: " + negatives + "\nНулей: " + zeros);
	}

}

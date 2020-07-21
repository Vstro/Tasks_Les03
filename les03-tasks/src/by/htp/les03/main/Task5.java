package by.htp.les03.main;

import java.util.Random;

public class Task5 {

	public static void main(String[] args) {
		Random rand = new Random();
		double[] sequence = new double[5];
		
		for (int i = 0; i < sequence.length; i++) {
			sequence[i] = rand.nextDouble() * 20 - 10;
		}
		
		double min = sequence[0];
		double max = sequence[0];
		for (int i = 1; i < sequence.length; i++) {
			if (min > sequence[i]) {
				min = sequence[i];
			}
			if (max < sequence[i]) {
				max = sequence[i];
			}
		}
		
		System.out.print("Последовательность: ");
		for (double x: sequence) {
			System.out.printf("%.3f ", x);
		}
		System.out.print("\nДлина наименьшей оси, содержащей все числа последовательности: " + (max - min));
	}

}

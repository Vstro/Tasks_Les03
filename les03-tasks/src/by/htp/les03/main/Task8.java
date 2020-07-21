package by.htp.les03.main;

import java.util.Random;

public class Task8 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] sequence = new int[10];
		
		System.out.print("Вся последовательность: ");
		for (int i = 0; i < sequence.length; i++) {
			sequence[i] = rand.nextInt(10);
			System.out.print(sequence[i] + " ");
		}

		System.out.print("\nЭлементы большие своего порядкового номера (начиная с 1): ");
		for (int i = 0; i < sequence.length; i++) {
			if (sequence[i] > (i + 1)) {
				System.out.print(sequence[i] + " ");
			}
		}
	}

}

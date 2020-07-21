package by.htp.les03.main;

public class Task4 {

	public static void main(String[] args) {
		int[] sequence = {2, 1, 34, 41, 7};
		int[] result = new int[sequence.length];
		int actualResultLength = 0;
		
		for (int x: sequence) {
			if (x % 2 == 0) {
				result[actualResultLength] = x;
				actualResultLength++;
			}
		}
		if (actualResultLength == 0) {
			System.out.println("В последовательности нет чётных чисел!");
		} else {
			System.out.print("Последовательность чётных чисел: ");
			for (int i = 0; i < actualResultLength; i++) {
				System.out.print(result[i] + " ");
			}
		}
		
	}

}

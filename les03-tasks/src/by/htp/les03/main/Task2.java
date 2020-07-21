package by.htp.les03.main;

public class Task2 {

	public static void main(String[] args) {
		int[] sequence = {0, 1, -2, 0, 7, 0, 0, -45, 34, 20, 0};
		int[] result = new int[sequence.length];
		int actualResultLength = 0;
		
		for (int i = 0; i < sequence.length; i++) {
			if (sequence[i] == 0) {
				result[actualResultLength] = i;
				actualResultLength++;
			}
		}
		System.out.print("В данной последовательности " + actualResultLength + " нулевых элементов на местах: ");
		for (int i = 0; i < actualResultLength; i++) {
			System.out.print(result[i] + " ");
		}
	}

}

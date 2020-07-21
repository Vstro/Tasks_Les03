package by.htp.les03.main;

public class Task1 {

	public static void main(String[] args) {
		int K = 3;
		int sum = 0; 
		int[] A = {1, 2, 4, 9, 8, 7, 6, 5, 12, 13, 17};
		
		for (int num: A) {
			if (num % K == 0) {
				sum += num;
			}
		}
		System.out.println("Сумма элементов массива кратных " + K + ": " + sum);
	}

}

package by.htp.les03.main;

public class Task10 {

	public static void main(String[] args) {
		double[] sequence = {2.1, 1.2, 3.4, 41.5, 7.9, 10.6};
		double maxPair = sequence[0] + sequence[sequence.length - 1];
		
		for (int i = 1; i < sequence.length / 2; i++) {
			if (sequence[i] + sequence[sequence.length - 1 - i] > maxPair) {
				maxPair = sequence[i] + sequence[sequence.length - 1 - i];
			}
		}
		System.out.print("Наибольшая пара: " + maxPair);
	}

}

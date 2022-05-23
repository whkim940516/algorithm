package AlgorithmPractice;

import java.util.Scanner;

public class AlgorithmPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		String[] stringArray = new String[number];

		for (int i = 0; i < number; i++) {
			stringArray[i] = scanner.next();
		}

		System.out.printf("Hello");

		for (int i = 0; i < number; i++) {
			System.out.printf(" %s", stringArray[i]);
			if (i != number - 1) {
				System.out.print(",");
			}
			if (i == number - 1) {
				System.out.printf(".");
			}
		}

	}

}
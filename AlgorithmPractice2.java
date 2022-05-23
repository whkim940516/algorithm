package AlgorithmPractice;

import java.util.Scanner;

public class AlgorithmPractice2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 변수 선언
		int a = sc.nextInt();	// 공사현장의 x좌표
		int b = sc.nextInt();	// 공사현장의 y좌표
		int r = sc.nextInt();	// 공사장 소음의 크기
		
		int number = sc.nextInt();	// 그늘의 수
		
		// 변수를 활용하기 위한 배열 선언
		int[] xArray = new int[number];		// x좌표를 담기위한 배열 선언
		int[] yArray = new int[number];		// y좌표를 담기위한 배열 선언
		String[] noise = new String[number];	// 좌표에 맞게 문자내용을 출력하기 위한 배열 선언
		
		// 반복문을 통해 배열에 원소 넣기
		for(int i = 0; i < number; i++) {
			xArray[i] = sc.nextInt();
			yArray[i] = sc.nextInt();
		}
		
		// 점과 점사이의 거리를 통해 소음 구간에 맞게 출력
		for(int i = 0; i < number; i++) {
			if(Math.pow(xArray[i]-a, 2) + Math.pow(yArray[i]-b, 2) > Math.pow(r, 2)) {
				noise[i] = "silent";
			} else if(Math.pow(xArray[i]-a, 2) + Math.pow(yArray[i]-b, 2) <= Math.pow(r, 2)) {
				noise[i] = "noisy";
			}
			System.out.println(noise[i]);
		}
		
	}

}

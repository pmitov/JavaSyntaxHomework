package _02_TriangleArea;

import java.util.Scanner;

public class _02_TriangleArea {
	public static void main(String[] args) {

		Scanner read = new Scanner(System.in);
		int aX = read.nextInt();
		int aY = read.nextInt();
		int bX = read.nextInt();
		int bY = read.nextInt();
		int cX = read.nextInt();
		int cY = read.nextInt();
		double area2 = Math.abs(aX * (bY - cY) + bX * (cY - aY) + cX
				* (aY - bY)) / 2;
		int areaInt = Math
				.abs(aX * (bY - cY) + bX * (cY - aY) + cX * (aY - bY)) / 2;
		System.out.printf("%.0f%n", area2);
		System.out.printf("%d%n", areaInt);
		// There is no need to explicitly check if the points can form a
		// triangle because in case they don't, the area would be calculated as
		// 0 by the formula which matches the required answer.
	
	}
}

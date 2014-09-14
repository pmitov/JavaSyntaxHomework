package _01_RectangleArea;

import java.util.Scanner;

public class _01_RectangleArea {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int a = read.nextInt();
		int b = read.nextInt();
		int area = Math.abs(a * b);
		System.out.printf("The area is: %d", area);
	}
}

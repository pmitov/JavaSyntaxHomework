package _06_FormattingNumbers;

import java.util.Locale;
import java.util.Scanner;

public class _06_FormattingNumbers {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		Scanner read = new Scanner(System.in);
		int a = read.nextInt();
		double b = read.nextDouble();
		double c = read.nextDouble();
		String aBinary = Integer.toBinaryString(a);
		System.out.printf("|%-10X|%010d|%10.2f|%-10.3f|%n", a, Integer.parseInt(aBinary), b, c);
	}
}

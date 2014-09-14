package _04_SmallestNumber;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class _04_SmallestNymber {
	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		System.out.println("Please enter three numbers: ");
		Scanner read = new Scanner(System.in);
		double[] numbers = new double[] {read.nextDouble(), read.nextDouble(), read.nextDouble()};
		Arrays.sort(numbers);
		System.out.printf("The smallest number is: " + numbers[0]);
	}
}

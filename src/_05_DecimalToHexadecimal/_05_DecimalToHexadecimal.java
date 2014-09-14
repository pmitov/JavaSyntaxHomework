package _05_DecimalToHexadecimal;

import java.util.Scanner;

public class _05_DecimalToHexadecimal {

	public static void main(String[] args) {
		System.out.println("Please enter a positive integer: ");
		System.out.printf("The hexidecimal representation of the deciaml number %1$d is: %1$X%n", new Scanner(System.in).nextInt());
	}
}

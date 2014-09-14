package _07_CountBitsOne;

import java.util.Scanner;

public class _07_CountBitsOne {

	public static void main(String[] args) {
		int a = new Scanner(System.in).nextInt();
		int ctr = 0;
		while (a > 0) {
			if ((a & 1) == 1) {
				ctr++;
			}
			a >>= 1;
		}
		System.out.println(ctr);
	}
}

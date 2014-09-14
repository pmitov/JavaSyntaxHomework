package _08_CountEqualBitPairs;

import java.util.Scanner;

public class _8_CountEqualBitPairs {

	public static void main(String[] args) {
		int a = new Scanner(System.in).nextInt();
		int ctr = 0;
		while (a > 2) {
			if (((a & 3) == 3) | ((a & 3) == 0)) {
				ctr++;
			}
			a >>= 1;
		}
		System.out.println(ctr);
	}

}

package _03_PointsInsideFigure;

import java.util.Locale;
import java.util.Scanner;

public class _03_PointsInsideFigure {
	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		Scanner read = new Scanner(System.in);
		float x = read.nextFloat();
		float y = read.nextFloat();
		boolean inside = false;
		if (y <= 13.5 && y >= 6) {
			if (x >= 12.5 && x <= 22.5) {
				if (y > 8.5) {
					if (x <= 17.5 || x >= 20) {
						inside = true;
					}
				} else {
					inside = true;
				}
			}
		}
		System.out.printf(inside ? "Inside\n" : "Outside\n");
	}
}

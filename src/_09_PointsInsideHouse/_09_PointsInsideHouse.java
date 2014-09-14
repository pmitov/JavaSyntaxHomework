package _09_PointsInsideHouse;

import java.util.Locale;
import java.util.Scanner;

public class _09_PointsInsideHouse {

	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);

		while (true) {
			Scanner read = new Scanner(System.in);
			float x = read.nextFloat();
			float y = read.nextFloat();
			boolean inside = false;
			if (x >= 12.5) {
				if (x <= 17.5) {
					if (y >= 21 - x && y <= 13.5) {
						inside = true;
					}
				} else {
					if (x <= 20) {
						if (y >= x - 14 && y <= 8.5) {
							inside = true;
						}
					} else {
						if (x <= 22.5) {
							if (y >= x - 14 && y <= 13.5) {
								inside = true;
							}
						}
					}
				}
			}
			System.out.printf(inside ? "Inside\n" : "Outside\n");
		}
	}
}

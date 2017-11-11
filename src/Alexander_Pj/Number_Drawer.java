package Alexander_Pj;

import java.util.Random;
import java.util.Scanner;

public class Number_Drawer {

	public static void main(String[] args) {

		draw();

	}

	static void draw() {
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();

		int randNumber = generator.nextInt(100);

		int x = -1;

		while (randNumber != x) {

			System.out.print("Zgadnij liczbę z zakresu 0-100:");

			while (!scan.hasNextInt()) {
				scan.next();
				System.out.println("To nie jest liczbą");
				System.out.print("Zgadnij liczbę:");
			}

			x = scan.nextInt();

			if (randNumber > x) {
				System.out.println("Za Mało!");

			} else if (randNumber < x) {
				System.out.println("Za Dużo!");

			}

		}
		System.out.println("Zgadłeś!");
	}

}

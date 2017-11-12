package aleksander_pj_game1;

import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Zgadnij liczbę z zakresu 1-100: ");

		int y = random();
		int x = -1;

		while (y != x) {
			while (!scan.hasNextInt()) {
				scan.next();
				System.out.println("Podana wartość nie jest liczbą");
			}
			x = scan.nextInt();

			if (x > y) {
				System.out.println("Za Dużo!");
			} else if (x < y) {
				System.out.println("Za Mało!");
			}

		}
		System.out.println("Zgadłeś!!!");

	}

	static int random() {
		Random generator = new Random();
		int x = generator.nextInt(99) + 1;
		return x;
	}

}

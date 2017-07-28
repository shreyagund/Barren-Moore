import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {

		char[][] grid = new char[10][20];
		int x;
		int y;

		String move;
		boolean validInput;

		int max = 10;
		int min = 1;

		int i;
		int j;

		Random player = new Random();
		x = player.nextInt(max - min + 1) + min;
		y = player.nextInt(max - min + 1) + min;

		grid[x][y] = 'X';

		for (i = 0; i < grid.length; i++) {

			for (j = 0; j < grid[i].length; j++) {
				if (grid[i][j] != grid[x][y]) {

					grid[i][j] = '-';
				}

				System.out.print(grid[i][j]);
			}

			System.out.println();
		}

		System.out.println(
				"Welcome to Barren Moore! \nYou awaken to find yourself in Barren Moore "
				+ "\nGrey foggy clouds float oppressively close to you,"
				+ "\nreflected in the murky grey water which reaches up your shins "
				+ "\nSome black plants barely poke out of the shallow water. "
				+ "\nTry 'north','south','east',or 'west'"
				+ "\nYou notice a small watch-like device in your left hand."
				+ "\nIt has hands like a watch, but the hands don't seem to tell time.");

		System.out.println("Pick a direction: ");

		do {

			Scanner position = new Scanner(System.in);
			move = position.nextLine();

			if (move.equals("North")) {

				grid[x][y] = grid[x + 1][y];
				grid[x][y] = ' ';
				validInput = true;
			}

			if (move.equals("South")) {
				grid[x][y] = grid[x - 1][y];
				grid[x][y] = ' ';
				validInput = true;
			}

			if (move.equals("East")) {
				grid[x][y] = grid[x][y + 1];
				grid[x][y] = ' ';
				validInput = true;
			}

			if (move.equals("West")) {
				grid[x][y] = grid[x][y - 1];
				grid[x][y] = ' ';
				validInput = true;

			}

			else {
				System.out.println("INVALID INPUT! -_-");
				validInput = false;

			}
		}

		while (validInput == false);
	}

}

// private static void userPosition() {
// String direction;
// int position = 0;
//
// Scanner move = new Scanner(System.in);
// System.out.println(
// "Welcome to Barren Moore! \nYou awaken to fing yourself in Barren Moore
// \nGrey foggy clouds float oppressively close to you,\nreflected in the murky
// grey water which reaches up your shins \nSome black plants barely poke out of
// the shallow water");
//
// int i;
// int j = 0;
//
// while (position == 0) {
//
// System.out.println("Pick a direction: ");
// Scanner input = new Scanner(System.in);
// direction = input.next("North");
// // position = input.nextInt();
//
// if (position < 2) {
// grid[2][2] = 'N';
// // System.out.println("Move North");
// }
//
// }
//
// {
//
// }
//
// }

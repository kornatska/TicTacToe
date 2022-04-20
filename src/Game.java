import java.util.Arrays;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        String[][] grid = new String[3][3];
        String player1 = "X";
        String player2 = "O";
        String winner = "";

        Methods.printGrid(grid);
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 9; i++) {

            if (i%2 == 0) {
                System.out.println("Player 1 (X) enter 1-3 for line: ");
                int lineNumber = scan.nextInt() - 1;
                System.out.println("Player 1 (X) enter 1-3 for column: ");
                int columnNumber = scan.nextInt() - 1;
                if (grid[lineNumber][columnNumber] == null) {
                    grid[lineNumber][columnNumber] = "X";
                } else {
                    System.out.println("this cell is used");
                    i--;
                }
            } else {
                System.out.println("Player 2 (Y) enter 1-3 for line: ");
                int lineNumber = scan.nextInt() - 1;
                System.out.println("Player 2 (Y) enter 1-3 for column: ");
                int columnNumber = scan.nextInt() - 1;
                if (grid[lineNumber][columnNumber] == null) {
                    grid[lineNumber][columnNumber] = "Y";
                } else {
                    System.out.println("this cell is used");
                    i--;
                }
            }

        Methods.printGrid(grid);
        System.out.println(Methods.checkWinner(grid) + " WINS!");


    }

}}

import java.util.Arrays;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        String[][] grid = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                grid[i][j] = "_";
            }
        }
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
                if (grid[lineNumber][columnNumber].equals("_")) {
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
                if (grid[lineNumber][columnNumber].equals("_")) {
                    grid[lineNumber][columnNumber] = "Y";
                } else {
                    System.out.println("this cell is used");
                    i--;
                }
            }

        Methods.printGrid(grid);
            if (Methods.checkWinner(grid).contains("Player")) {
                System.out.println(Methods.checkWinner(grid) + " WINS!");
                break;
            }
    }

}}

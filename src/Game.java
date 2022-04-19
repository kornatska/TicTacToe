import java.util.Arrays;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        String[][] grid = new String[3][3];

        String game = "-------------------" +
                "\n| " + grid[0][0] + " | " + grid[0][1] + " | " + grid[0][2] + " | " +
                "\n-------------------" +
                "\n| " + grid[1][0] + " | " + grid[1][1] + " | " + grid[1][2] + " | " +
                "\n-------------------" +
                "\n| " + grid[2][0] + " | " + grid[2][1] + " | " + grid[2][2] + " | " +
                "\n-------------------";

        System.out.println(game);

        Scanner scan = new Scanner(System.in);

        System.out.println("Player 1 (X) enter 1-3 for line: ");
        int lineNumber = scan.nextInt() - 1;
        System.out.println("Player 1 (X) enter 1-3 for column: ");
        int columnNumber = scan.nextInt() - 1;
        if (grid[lineNumber][columnNumber] == null) {
            grid[lineNumber][columnNumber] = "X";


        } else {
            System.out.println("this cell is used");
        }


        System.out.println("-------------------" +
                "\n| " + grid[0][0] + " | " + grid[0][1] + " | " + grid[0][2] + " | " +
                "\n-------------------" +
                "\n| " + grid[1][0] + " | " + grid[1][1] + " | " + grid[1][2] + " | " +
                "\n-------------------" +
                "\n| " + grid[2][0] + " | " + grid[2][1] + " | " + grid[2][2] + " | " +
                "\n-------------------");


    }
}

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        System.out.println("----------------");
        System.out.println("|    |    |    |");
        System.out.println("----------------");
        System.out.println("|    |    |    |");
        System.out.println("----------------");
        System.out.println("|    |    |    |");
        System.out.println("----------------");

        Scanner scan = new Scanner(System.in);
        System.out.println("Player 1 - enter 1-3 for line, 1-3 for column:");
        int player1line = scan.nextInt();
        int player1column = scan.nextInt();

    }
}

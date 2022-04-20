public class Methods {

    public static void printGrid(String[][] grid){
        System.out.println("-------------" +
                "\n| " + grid[0][0] + " | " + grid[0][1] + " | " + grid[0][2] + " | " +
                "\n-------------" +
                "\n| " + grid[1][0] + " | " + grid[1][1] + " | " + grid[1][2] + " | " +
                "\n-------------" +
                "\n| " + grid[2][0] + " | " + grid[2][1] + " | " + grid[2][2] + " | " +
                "\n-------------");
    }

    public static String checkWinner(String[][] grid){
        String winner = "";
        if (grid[0][0].equals("X") && grid[1][1].equals("X") && grid[2][2].equals("X")) {
            winner = "Player 1 (X)";
        }
        if (grid[2][0].equals("X") && grid[1][1].equals("X") && grid[0][2].equals("X")) {
            winner = "Player 1 (X)";
        }
        for (int i = 0; i < 3; i++) {
            if (grid[i][0].equals("X") && grid[i][1].equals("X") && grid[i][2].equals("X")) {
                winner = "Player 1 (X)";
            } else if (grid[0][i].equals("X") && grid[1][i].equals("X") && grid[2][i].equals("X")) {
                winner = "Player 1 (X)";
            }
        }
        if (grid[0][0].equals("O") && grid[1][1].equals("O") && grid[2][2].equals("O")) {
            winner = "Player 1 (X)";
        }
        if (grid[2][0].equals("O") && grid[1][1].equals("O") && grid[0][2].equals("O")) {
            winner = "Player 1 (X)";
        }
        for (int j = 0; j < 3; j++) {
            if (grid[j][0].equals("O") && grid[j][1].equals("O") && grid[j][2].equals("O")) {
                winner = "Player 1 (X)";
            } else if (grid[0][j].equals("O") && grid[1][j].equals("O") && grid[2][j].equals("O")) {
                winner = "Player 1 (X)";
            }
        }
        return winner;
    }

}

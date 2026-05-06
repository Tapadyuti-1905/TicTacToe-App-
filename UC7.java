import java.util.Random;

public class UC7 {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    static char computerSymbol = 'O';

    public static void main(String[] args) {

        computerMove();

        System.out.println("Board after computer move:");
        printBoard();
    }

    static void computerMove() {

        Random random = new Random();

        while (true) {

            int slot = random.nextInt(9) + 1;
            int row = (slot - 1) / 3;
            int col = (slot - 1) % 3;

            if (isValidMove(row, col)) {

                board[row][col] = computerSymbol;

                System.out.println("Computer selected slot: " + slot);
                break;
            }
        }
    }


    static boolean isValidMove(int row, int col) {

        if (row < 0 || row >= 3 || col < 0 || col >= 3) {
            return false;
        }

        return board[row][col] == '-';
    }

    static void printBoard() {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }
    }
}
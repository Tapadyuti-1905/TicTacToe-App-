
public class UC8 {

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    public static void main(String[] args) {

        int turnCount = 0;

        while (!gameOver) {

            // Human turn
            if (isHumanTurn) {
                System.out.println("Human player's turn");
            }

            // Computer turn
            else {
                System.out.println("Computer player's turn");
            }

            // Simulate move completion
            turnCount++;

            // Example condition to stop loop
            if (turnCount == 5) {
                gameOver = true;
                System.out.println("Game Over!");
            }

            // Switch turns
            isHumanTurn = !isHumanTurn;
        }
    }
}
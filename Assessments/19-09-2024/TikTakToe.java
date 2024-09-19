public class TikTakToe {
    public static void main(String[] args) {
        // char[][] board = new char[][];
        char[][] board = {{'x', 'o', 'x'}, {'o', 'o', 'o'}, {'x', 'o', 'x'}};

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]);
                if(j != board[i].length - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
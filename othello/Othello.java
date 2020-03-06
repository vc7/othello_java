package othello;

import java.util.*;

class Othello {

    private String[][] board;

    /**
     * 覆寫 toString 方法，直接印出棋盤的內容
     * @return 格式化後的棋盤
     */
    @Override
    public String toString() {
        String string = "";
        for (int row = 0; row < 8; row++) {
            for (int column = 0; column < 8; column++) {
                if (column > 0) {
                    string += " ";
                }
                string += board[row][column];
            }
            string += "\n";
        }
        return string;
    }

    /**
     * 初始化棋盤
     */
    void initBoard() {
        this.board = new String[8][8];
        String[] row = new String[8];
        Arrays.fill(row, ".");
        Arrays.fill(this.board, row);
    }
}
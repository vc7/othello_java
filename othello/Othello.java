package othello;

import java.util.*;

class Othello {

    private String[][] board;
    private Coordinate[] whites;
    private Coordinate[] blacks;

    /**
     * 覆寫 toString 方法，直接印出棋盤的內容
     * @return 格式化後的棋盤
     */
    @Override
    public String toString() {
        String string = "  a b c d e f g h\n";
        for (int row = 0; row < 8; row++) {
            string += (row + 1) + " ";
            for (int column = 0; column < 8; column++) {
                if (column > 0) {
                    string += " ";
                }
                string += board[row][column];
            }
            string += "\n";
        }
        string += "\n";
        string += "b: " + blacks.length + "\n";
        string += "w: " + whites.length + "\n";
        return string;
    }

    /**
     * 初始化棋盤
     */
    void reset() {
        board = createEmptyBoard();
        insertInitialStones();
    }

    String result() {
        if (blacks.length == whites.length) {
            return "Result: Draw";
        }

        return "Result " + ((blacks.length > whites.length) ? "Black" : "White")+  "win";
    }

    Move nextMove() {
        // TODO: 回傳下一步可以走的位置
        return null;
    }

    /**
     * 遊戲是否結束
     * <p> 結束條件：滿盤 或是 黑和白都沒有地方走
     */
    public boolean isFinished() {
        // TODO: 實作條件判斷
        return false;
    }

    /**
     * 目前盤面是否已滿
     */
    private boolean isFull() {
        // TODO: 錯誤判斷
        return blacks.length + whites.length == 64;
    }

    /**
     * 產生一個 8 * 8 的空棋盤
     */
    private String[][] createEmptyBoard() {
        String[][] emptyBoard = new String[8][8];
        for (int row = 0; row < 8; row++) {
            for (int column = 0; column < 8; column++) {
                emptyBoard[row][column] = ".";
            }
        }
        return emptyBoard;
    }

    /**
     * 放入初始的四個棋子。
     * <p>黑: d5 (3, 4), e4 (4, 3)
     * <p>白: d4 (3, 3), e5 (4, 4)
     * 
     * @param board 目標棋盤
     */
    private void insertInitialStones() {
        blacks = new Coordinate[] {
            new Coordinate(3, 4),
            new Coordinate(4, 3)
        };
        whites = new Coordinate[] {
            new Coordinate(3, 3),
            new Coordinate(4, 4)
        };
        updateBoard();
    }

    /**
     * 根據現在的旗子更新盤面
     * 註記：可能不需要走訪全部的 blacks 和 whites
     */
    private void updateBoard() {
        for (int index = 0; index < blacks.length; index++) {
            Coordinate coordinate = blacks[index];
            board[coordinate.y][coordinate.x] = "b";
        }

        for (int index = 0; index < whites.length; index++) {
            Coordinate coordinate = whites[index];
            board[coordinate.y][coordinate.x] = "w";
        }
    }

    // ------------------------------------------

    /**
     * 座標用 Class
     */
    private class Coordinate {
        int x;
        int y;

        Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }

    // ------------------------------------------

    /**
     * 棋步
     */
    class Move {
        boolean isBlack;
        Coordinate[] possibleMoves;

        Move() {
            isBlack = true;
            possibleMoves = new Coordinate[] {};
        }
    }
}
package com.leetcode.Medium;

// 348. Design Tic-Tac-Toe
public class DesignTicTacToe {
    private int n;
    private int[][] board;

    /**
     * Initialize your data structure here.
     */
    public DesignTicTacToe(int n) {
        this.n = n;
        this.board = new int[n][n];
    }

    /**
     * Player {player} makes a move at ({row}, {col}).
     *
     * @param row    The row of the board.
     * @param col    The column of the board.
     * @param player The player, can be either 1 or 2.
     * @return The current winning condition, can be either:
     * 0: No one wins.
     * 1: Player 1 wins.
     * 2: Player 2 wins.
     */
    public int move(int row, int col, int player) {
        board[row][col] = player;
        if ((checkRow(row, player) || checkColumn(col, player)) || (row == col && checkDiagonal(player)) || (col == n - row - 1 && checkAntiDiagonal(player)))
            return player;

        return 0;
    }

    private boolean checkRow(int row, int player) {
        for (int col = 0; col < n; col++) {
            if (board[row][col] != player)
                return false;
        }
        return true;
    }

    private boolean checkColumn(int col, int player) {
        for (int row = 0; row < n; row++) {
            if (board[row][col] != player)
                return false;
        }
        return true;
    }

    private boolean checkDiagonal(int player) {
        for (int row = 0; row < n; row++) {
            if (board[row][row] != player)
                return false;
        }
        return true;
    }

    private boolean checkAntiDiagonal(int player) {
        for (int row = 0; row < n; row++) {
            if (board[row][n - row - 1] != player)
                return false;
        }
        return true;
    }
}

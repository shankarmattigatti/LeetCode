package com.leetcode.Easy;

// 1275. Find Winner on a Tic Tac Toe Game
public class FindWinnerOnATicTacToeGame {
    public String tictactoe(int[][] moves) {
        int[] A = new int[8], B = new int[8];
        for (int i = 0; i < moves.length; i++) {
            int r = moves[i][0];
            int c = moves[i][1];
            int[] player = (i % 2 == 0) ? A : B;
            player[r]++;
            player[c + 3]++;

            if (r == c)
                player[6]++;
            if (r == 2 - c)
                player[7]++;
        }

        for (int i = 0; i < 8; i++) {
            if (A[i] == 3)
                return "A";
            if (B[i] == 3)
                return "B";
        }

        return moves.length == 9 ? "Draw" : "Pending";
    }
}

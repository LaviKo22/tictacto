package com.example.tictacto;

public class TicTacToe {
    private int[][] board = new int[3][3];
    private int turn = 0, player1, player2;
    private  boolean gameover = false;


    public TicTacToe() {
    }




    public boolean checkWin()
    {
        return check2DiagWin()|| checkAmudaWin()|| checkRowWin()|| checkDiagWin();
    }

    public boolean ISlegal( int row, int tur) {
        if (row < 0 || tur < 0)
            return false;
        if (row > board.length || tur > board[0].length) {
            return false;
        } else {
            return true;

        }
    }


    public int getCurrentPlayer()
    {
        return turn%2;
    }


       public void Domove( int row, int tur) {
        if (turn % 2 == 0) {
            board[row][tur] = 1;
            turn++;

        } else {
            board[row][tur] = 2;
            turn++;
        }
    }


    public boolean available( int row, int tur) {
        if (board[row][tur] == 0) {
            return true;
        }
        return false;
    }

    public boolean checkRowWin() {
        int counterX = 0;
        int counterO = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) {
                    counterX++;
                } else {
                    if (board[i][j] == 2) {
                        counterO++;
                    }
                }

            }

            // finished row
            if (counterX == board.length || counterO == board.length)
                return true;
            counterX = 0;
            counterO = 0;
        }


        return false;

    }

    public boolean checkAmudaWin() {
        int counterX = 0;
        int counterO = 0;
        for (int j = 0; j < board[0].length; j++) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][j] == 1) {
                    counterX++;
                } else {
                    if (board[i][j] == 2) {
                        counterO++;
                    }
                }

            }
            if (counterX == board.length || counterO == board.length)
                return true;
            counterX = 0;
            counterO = 0;

        }
        return false;
    }

    public  boolean checkDiagWin() {
        int counterX=0;
        int counterO=0;
        for (int i=0; i<board.length; i++){
            if (board [i][i]==1){
                counterX++;
            }else if(board [i][i]==2){
                counterO++;
            }
            if(counterX == board.length || counterO==board.length)
                return true;
        }
        return false;
    }
    public boolean check2DiagWin() {
        int counterX=0;
        int counterO=0;
        for (int i=0; i<board.length; i++){
            if (board [i][board.length-1-i]==1){
                counterX++;
            }else if (board [i][board.length-1-i]==2){
                counterO++;
            }
            if(counterX == board.length || counterO==board.length)
                return true;
        }

        return false;
    }


}

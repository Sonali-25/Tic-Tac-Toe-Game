package com.magic.game;

public class TicTacToe {
    public static final int boardSize = 10;
    char computer = ' ';
    char player = ' ';
    public static char board[] = new char[boardSize];

    public static void board(){
        for(int i = 0; i < boardSize; i++)
            board[i] = ' ';
        System.out.println("Welcome to TicTacToe Game!");
    }

    public static void main(String[] args){
        System.out.println("Welcome To Tic-Tac_Toe Game");
        board();
    }
}

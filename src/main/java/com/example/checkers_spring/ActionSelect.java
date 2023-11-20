package com.example.checkers_spring;

import java.util.Scanner;

public class ActionSelect {

    public void actionSelect(boolean flag){
        Scanner console;
        console = new Scanner(System.in);

        for (int j = 0; j <= 7; j++) {
            for (int i = 0; i <= 7; i++) {
                if (j == 7 && CheckersSpringApplication.board[i][j] == 2){
                    CheckersSpringApplication.board[i][j] = 4;
                }
                else if(j == 0 && CheckersSpringApplication.board[i][j] == 1){
                    CheckersSpringApplication.board[i][j] = 3;
                }
                System.out.print(CheckersSpringApplication.board[i][j]);
            }
            System.out.println();
        }

        int select = console.nextInt();
        ActionMove actionMoveObject = new ActionMove();
        actionMoveObject.actionMove(select, flag);
    }
}

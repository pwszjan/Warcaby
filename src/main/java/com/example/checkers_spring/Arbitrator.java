package com.example.checkers_spring;

import static com.example.checkers_spring.CheckersSpringApplication.board;
import static com.example.checkers_spring.CheckersSpringApplication.actingFigure;

public class Arbitrator {

    public void arbitrator(){
        int count = 0;
        for (int j = 0; j <= 7; j++) {
            for (int i = 0; i <= 7; i++) {
                if (board[i][j] == actingFigure){
                    count++;
                    NextMove nextMoveObject = new NextMove();
                    nextMoveObject.nextMove(((i * 10) + j), true);
                }
                else if (board[i][j] == actingFigure + 2){
                    count++;
                    NextMoveKing nextMoveKingObject = new NextMoveKing();
                    nextMoveKingObject.nextMoveKing(((i * 10) + j), true, 88, false);
                }
            }
        }
        if (count == 0){
            System.out.println( actingFigure + " Lost ");
            CheckersBoard checkersBoardObject = new CheckersBoard();
            checkersBoardObject.checkersBoard();
        }
        else {
            Draw drawObject = new Draw();
            drawObject.draw();
            ActionSelect actionSelectObject = new ActionSelect();
            actionSelectObject.actionSelect(false);
        }
    }
}

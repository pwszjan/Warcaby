package com.example.checkers_spring;

import static com.example.checkers_spring.CheckersSpringApplication.board;

public class CheckersBoard {
    public void checkersBoard() {

//        for (int j = 0; j <= 7; j++) {
//            for (int i = 0; i <= 7; i++) {
//                if ((i + j + 1) % 2 != 0) {
//                    board[i][j] = 5;
//                } else {
//                    if (j <= 2) {
//                        board[i][j] = 2;
//                    } else if (j >= 5) {
//                        board[i][j] = 1;
//                    } else {
//                        board[i][j] = 0;
//                    }
//                }
//            }
//        }

        for (int j = 0; j <= 7; j++) {
            for (int i = 0; i <= 7; i++) {
                if ((i + j + 1) % 2 != 0) {
                    board[i][j] = 5;
                }
                else {
                    if (j == 2) {
                        board[i][j] = 4;
                    } else if (j == 5) {
                        board[i][j] = 3;
                    } else {
                        board[i][j] = 0;
                    }
                }
            }
        }

    }
}

package com.example.checkers_spring;


public class CheckersFigure {

    public void checkersFigure(int select, int move, boolean flag){

        int i = select / 10;
        int j = select % 10;

        if ((move == (i - 1) * 10 + (j - 1) || move == (i + 1) * 10 + (j - 1)) &&
                CheckersSpringApplication.board[move / 10][move % 10] == 0 && !flag){
            CheckersSpringApplication.board[move / 10][move % 10] = CheckersSpringApplication.board[select / 10][select % 10];
            CheckersSpringApplication.board[select / 10][select % 10] = 0;
            if (CheckersSpringApplication.actingFigure == 1){
                CheckersSpringApplication.actingFigure += 1;
            }
            else CheckersSpringApplication.actingFigure -= 1;
            Arbitrator arbitratorObject = new Arbitrator();
            arbitratorObject.arbitrator();
        }
        else if ((move == (i - 1) * 10 + (j + 1) || move == (i + 1) * 10 + (j + 1)) &&
                CheckersSpringApplication.board[move / 10][move % 10] == 0 && !flag){
            CheckersSpringApplication.board[move / 10][move % 10] = CheckersSpringApplication.board[select / 10][select % 10];
            CheckersSpringApplication.board[select / 10][select % 10] = 0;
            if (CheckersSpringApplication.actingFigure == 1){
                CheckersSpringApplication.actingFigure += 1;
            }
            else {
                CheckersSpringApplication.actingFigure -= 1;
            }
            Arbitrator arbitratorObject = new Arbitrator();
            arbitratorObject.arbitrator();
        }
        else if((move == (i - 2) * 10 + (j + 2) || move == (i + 2) * 10 + (j + 2) ||
                move == (i - 2) * 10 + (j - 2) || move == (i + 2) * 10 + (j - 2)) &&
                (CheckersSpringApplication.board[move / 10][move % 10] == 0)){
            if (move - select == -18 && ((CheckersSpringApplication.board[(move - 9) / 10][(move - 9) % 10] != CheckersSpringApplication.actingFigure ||
                    CheckersSpringApplication.board[(move - 9) / 10][(move - 9) % 10] != CheckersSpringApplication.actingFigure + 2) &&
                    CheckersSpringApplication.board[(move - 9) / 10][(move - 9) % 10] != 0)){
                CheckersSpringApplication.board[(move - 9) / 10][(move - 9) % 10] = 0;
                CheckersSpringApplication.board[move / 10][move % 10] = CheckersSpringApplication.board[select / 10][select % 10];
                CheckersSpringApplication.board[select / 10][select % 10] = 0;
                NextMove nextMoveObject = new NextMove();
                nextMoveObject.nextMove(move, false);
            }
            else if (move - select == -22 && (CheckersSpringApplication.board[(move - 11) / 10][(move - 11) % 10] != CheckersSpringApplication.actingFigure ||
                    CheckersSpringApplication.board[(move - 11) / 10][(move - 11) % 10] != CheckersSpringApplication.actingFigure + 2) &&
                    CheckersSpringApplication.board[(move - 11) / 10][(move - 11) % 10] != 0){
                CheckersSpringApplication.board[(move - 11) / 10][(move - 11) % 10] = 0;
                CheckersSpringApplication.board[move / 10][move % 10] = CheckersSpringApplication.board[select / 10][select % 10];
                CheckersSpringApplication.board[select / 10][select % 10] = 0;
                NextMove nextMoveObject = new NextMove();
                nextMoveObject.nextMove(move, false);
            }
            else if (move - select == 22 && (CheckersSpringApplication.board[(move + 11) / 10][(move + 11) % 10] != CheckersSpringApplication.actingFigure ||
                    CheckersSpringApplication.board[(move + 11) / 10][(move + 11) % 10] != CheckersSpringApplication.actingFigure + 2) &&
                    CheckersSpringApplication.board[(move + 11) / 10][(move + 11) % 10] != 0){
                CheckersSpringApplication.board[(move + 11) / 10][(move + 11) % 10] = 0;
                CheckersSpringApplication.board[move / 10][move % 10] = CheckersSpringApplication.board[select / 10][select % 10];
                CheckersSpringApplication.board[select / 10][select % 10] = 0;
                NextMove nextMoveObject = new NextMove();
                nextMoveObject.nextMove(move, false);
            }
            else if (move - select == 18 && (CheckersSpringApplication.board[(move + 9) / 10][(move + 9) % 10] != CheckersSpringApplication.actingFigure ||
                    CheckersSpringApplication.board[(move + 9) / 10][(move + 9) % 10] != CheckersSpringApplication.actingFigure + 2) &&
                    CheckersSpringApplication.board[(move + 9) / 10][(move + 9) % 10] != 0){
                CheckersSpringApplication.board[(move + 9) / 10][(move + 9) % 10] = 0;
                CheckersSpringApplication.board[move / 10][move % 10] = CheckersSpringApplication.board[select / 10][select % 10];
                CheckersSpringApplication.board[select / 10][select % 10] = 0;
                NextMove nextMoveObject = new NextMove();
                nextMoveObject.nextMove(move, false);
            }
            else {
                System.out.println("FF");
            }
        }
        else {
            System.out.println(" Final Error ");
            ActionMove actionMoveObject = new ActionMove();
            actionMoveObject.actionMove(select, flag);
        }
    }
}

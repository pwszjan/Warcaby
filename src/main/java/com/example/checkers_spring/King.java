package com.example.checkers_spring;

public class King {

    public void king (int select, int move, boolean flag){
        if (((move - select) % 11 == 0 || (move - select) % 9 == 0) && CheckersSpringApplication.board[move / 10][move % 10] == 0){

            int targetBuff = 88;
            int buffSelect = select;
            int buffSM;
            int buffShitAgan = CheckersSpringApplication.board[select / 10][select % 10];
            boolean escalate = true;
            boolean target = false;

            if ((move - select) % 11 == 0 && move - select < 0){
                buffSM = -11;
            }
            else if ((move - select) % 11 == 0 && move - select > 0){
                buffSM = 11;
            }
            else if ((move - select) % 9 == 0 && move - select > 0){
                buffSM = 9;
            }
            else {
                buffSM = -9;
            }

            while (buffSelect != move && escalate){
                if (CheckersSpringApplication.board[(buffSelect + buffSM) / 10][(buffSelect + buffSM) % 10] == 0){
                    buffSelect = buffSelect + buffSM;
                }
                else if (CheckersSpringApplication.board[(buffSelect + buffSM) / 10][(buffSelect + buffSM) % 10] == CheckersSpringApplication.actingFigure ||
                        CheckersSpringApplication.board[(buffSelect + buffSM) / 10][(buffSelect + buffSM) % 10] == CheckersSpringApplication.actingFigure + 2){
                    escalate = false;
                }
                else if (CheckersSpringApplication.board[(buffSelect + buffSM) / 10][(buffSelect + buffSM) % 10] != CheckersSpringApplication.actingFigure ||
                        CheckersSpringApplication.board[(buffSelect + buffSM) / 10][(buffSelect + buffSM) % 10] != CheckersSpringApplication.actingFigure + 2){
                    buffSelect = buffSelect + (2 * buffSM);
                    if (CheckersSpringApplication.board[buffSelect / 10][buffSelect % 10] == 0){
                        CheckersSpringApplication.board[select / 10][select % 10] = 0;
                        target = true;
                    }
                    else {
                        escalate = false;
                    }
                }
            }
            if (flag && !target){
                escalate = false;
            }
            if (escalate){
                buffSelect = select;
                while (buffSelect != move){
                    if ((CheckersSpringApplication.board[(buffSelect + buffSM) / 10][(buffSelect + buffSM) % 10] != CheckersSpringApplication.actingFigure ||
                            CheckersSpringApplication.board[(buffSelect + buffSM) / 10][(buffSelect + buffSM) % 10] != CheckersSpringApplication.actingFigure + 2) &&
                            CheckersSpringApplication.board[(buffSelect + buffSM) / 10][(buffSelect + buffSM) % 10] != 0) {
                        buffSelect = buffSelect + (2 * buffSM);
                        if (CheckersSpringApplication.board[buffSelect / 10][buffSelect % 10] == 0) {
                            CheckersSpringApplication.board[(buffSelect - buffSM) / 10][(buffSelect - buffSM) % 10] = 0;
                            CheckersSpringApplication.board[buffSelect / 10][buffSelect % 10] = CheckersSpringApplication.board[select / 10][select % 10];
                            CheckersSpringApplication.board[select / 10][select % 10] = 0;
                            target = true;
                            targetBuff = buffSelect - buffSM;
                        }
                    }
                    else {
                        buffSelect = buffSelect + buffSM;
                    }
                }
                CheckersSpringApplication.board[move / 10][move % 10] = buffShitAgan;
                CheckersSpringApplication.board[select / 10][select % 10] = 0;
                if (target){
                    NextMoveKing nextMoveKingObject = new NextMoveKing();
                    nextMoveKingObject.nextMoveKing(move, false, targetBuff, false);
                }
                else if (CheckersSpringApplication.actingFigure == 1){
                    CheckersSpringApplication.actingFigure += 1;
                    Arbitrator arbitratorObject = new Arbitrator();
                    arbitratorObject.arbitrator();
                }
                else {
                    CheckersSpringApplication.actingFigure -= 1;
                    Arbitrator arbitratorObject = new Arbitrator();
                    arbitratorObject.arbitrator();
                }
            }
            else {
                System.out.println("Error in KF");
                Arbitrator arbitratorObject = new Arbitrator();
                arbitratorObject.arbitrator();
            }
        }
        else {
            System.out.println(" Error in SK or MK");
            Arbitrator arbitratorObject = new Arbitrator();
            arbitratorObject.arbitrator();
        }
    }
}

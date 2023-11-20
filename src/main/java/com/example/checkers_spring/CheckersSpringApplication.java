package com.example.checkers_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CheckersSpringApplication {

    public static int [][]  board = new int[8][8];
    public static int actingFigure = 1;

    public static void main(String[] args) {
        SpringApplication.run(CheckersSpringApplication.class, args);

        CheckersBoard checkersBoardObject = new CheckersBoard();
        checkersBoardObject.checkersBoard();

        Arbitrator arbitratorObject = new Arbitrator(); // из CheckersBoard
        arbitratorObject.arbitrator();

        /*Scanner scanner = new Scanner(System.in);
        String choise = scanner.nextLine();*/
    }

}

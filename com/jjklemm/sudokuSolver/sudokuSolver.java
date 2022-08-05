/*
 * sudokuSolver
 * 
 * solves sudoku puzzles
 * 
 * SEE LICENSE
 */

package com.jjklemm.sudokuSolver;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.JTextField;
import java.util.Map;
import java.awt.Point;
import java.util.HashMap;

public class sudokuSolver extends JFrame {
    // numeric constants
    private final int GRID_SIZE = 9;
    // UI elements
    JButton clearBoardButton = new JButton("Clear Board");
    JButton solveBoardButton = new JButton("Solve Puzzle");
    JTextField[][] board = new JTextField[GRID_SIZE][GRID_SIZE];

    public sudokuSolver() {
        super("Sudoku Solver");
        // initialize board
        for (int i=0; i<GRID_SIZE; i++){
            for (int j=0; j<GRID_SIZE; j++){
                board[i][j] = new JTextField(1);
            }
        }
        setSize(1200, 900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel controlPane = new JPanel();
        controlPane.add(solveBoardButton);
        controlPane.add(clearBoardButton);
        controlPane.add(board[0][0]);
        controlPane.add(board[0][1]);
        add(controlPane);
        // TODO change board back to visible
        setVisible(false);

        // create temp board contents for testing
        int puzzle[][] = new int[GRID_SIZE][GRID_SIZE];
        for (int i=0; i<GRID_SIZE; i++) {
            for (int j=0; j<GRID_SIZE; j++) {
                puzzle[i][j] = 0;
            }
        }
        // 165
        puzzle[0][0] = 7; puzzle[0][5] = 5; puzzle[0][6] = 2;
        puzzle[1][0] = 6; puzzle[1][4] = 3; puzzle[1][8] = 4;
        puzzle[2][0] = 9; puzzle[2][2] = 3; puzzle[2][3] = 7;
        puzzle[3][1] = 3; puzzle[3][4] = 4; puzzle[3][7] = 8;
        puzzle[5][1] = 5; puzzle[5][4] = 9; puzzle[5][7] = 4;
        puzzle[6][5] = 8; puzzle[6][6] = 4; puzzle[6][8] = 1;
        puzzle[7][0] = 1; puzzle[7][4] = 7; puzzle[7][8] = 5;
        puzzle[8][2] = 7; puzzle[8][3] = 5; puzzle[8][8] = 9;

        // print the starting board
        printBoard(puzzle);

    }

    private static void setLookAndFeel() {
        try {
            UIManager.setLookAndFeel(
                "javax.swing.plaf.nimbus.NimbusLookAndFeel"
            );
        } catch (Exception exc) {
            // ignore error
        }
    }

    void printBoard(int[][] puzzle) {
        // print the board to stdout
        for (int i=0; i<GRID_SIZE; i++) {
            for (int j=0; j<GRID_SIZE; j++) {
                if (i==0 && j==0) {
                    System.out.print("-------------\n");
                }
                if (j%3==0) {
                    System.out.print("|");
                }
                System.out.print(puzzle[i][j]);
            }
            System.out.print("|\n");
            if (i==2 || i==5) {
                System.out.print("-------------\n");
            }
        }
        System.out.print("-------------\n");
    }

    public static void main(String[] args) {
        setLookAndFeel();
        sudokuSolver solver = new sudokuSolver();
    }

}


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
        setVisible(true);

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

    public static void main(String[] args) {
        setLookAndFeel();
        sudokuSolver solver = new sudokuSolver();
    }

}

/*
 * sudokuSolver
 * 
 * solves sudoku puzzles
 * 
 * SEE LICENSE
 */

package com.jjklemm.sudokuSolver;

import javax.swing.*;

public class sudokuSolver extends JFrame {
    JButton newBoardButton = new JButton("New Board");
    //JButton solveBoardButton = new JButton("Solve Board")

    public sudokuSolver() {
        super("Sudoku Solver");
        setSize(1200, 900);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel pane = new JPanel();
        pane.add(newBoardButton);
        add(pane);
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

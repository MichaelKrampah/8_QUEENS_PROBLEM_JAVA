package queens;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                EightQueens solver = new EightQueens();
                if (solver.solveEightQueens()) {
                    ChessboardGUI gui = new ChessboardGUI();
                    gui.displaySolution(solver.board);
                } else {
                    System.out.println("No solution found.");
                }
            }
        });
    }
}

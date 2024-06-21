package queens;

import javax.swing.*;
import java.awt.*;
import java.io.Serializable;
import javax.swing.ImageIcon;
import java.awt.Image;

public class ChessboardGUI extends JFrame implements Serializable{
	private static final long serialVersionUID = 1L;
    private static final int BOARD_SIZE = 8;
    private static final int CELL_SIZE = 60;

    public ChessboardGUI() {
        setTitle("8 Queens Problem");
        setSize(BOARD_SIZE * CELL_SIZE + 16, BOARD_SIZE * CELL_SIZE + 39);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        

        // Load the queen icon image
        ImageIcon queenIcon = new ImageIcon("queen.png");
        Image image = queenIcon.getImage().getScaledInstance(CELL_SIZE, CELL_SIZE, Image.SCALE_SMOOTH);
        queenIcon = new ImageIcon(image);
        this.queenIcon = queenIcon;
    }
    private ImageIcon queenIcon;

    public void displaySolution(int[] solution) {
        JPanel board = new JPanel(new GridLayout(BOARD_SIZE, BOARD_SIZE));

        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                JPanel cell = new JPanel();
                cell.setPreferredSize(new Dimension(CELL_SIZE, CELL_SIZE));
                cell.setBackground((row + col) % 2 == 0 ? Color.WHITE : Color.LIGHT_GRAY);

                if (solution[col] == row) {
                    JLabel queen = new JLabel(queenIcon);
                    cell.add(queen);
                }

                board.add(cell);
            }
        }

        add(board, BorderLayout.CENTER);
        setVisible(true);
    }

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
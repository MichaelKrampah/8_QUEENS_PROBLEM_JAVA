# 8-Queens Solver

## Overview

This project provides an implementation of the 8-Queens problem using backtracking. The solution is displayed using a graphical user interface (GUI) built with Java Swing. The project includes three main components:

1. **Main Class**: Entry point of the application.
2. **EightQueens Class**: Core logic for solving the 8-Queens problem.
3. **ChessboardGUI Class**: GUI for displaying the chessboard and the solution.

## Contents

1. `Main.java`
2. `EightQueens.java`
3. `ChessboardGUI.java`

## How to Run

1. Ensure you have Java installed on your system.
2. Compile the Java files:
   ```sh
   javac queens/*.java
   ```
3. Run the main class:
   ```sh
   java queens.Main
   ```

## How It Works

### Main.java

- This is the entry point of the application.
- It initializes the `EightQueens` solver.
- If a solution is found, it is displayed using the `ChessboardGUI`.
- If no solution is found, a message is printed to the console.

### EightQueens.java

- Contains the core logic for solving the 8-Queens problem using backtracking.
- Checks if placing a queen on a specific position is safe.
- Solves the problem by placing queens column by column.

### ChessboardGUI.java

- Provides a graphical user interface to display the chessboard and the solution.
- Uses Java Swing to create the GUI components and layout.
- Displays the solution on an 8x8 chessboard with queens represented by icons.

## Additional Notes

- Ensure the `queen.png` image is available in the project's root directory or adjust the path accordingly.
- The GUI will display the solution if one is found. If no solution is found, a message is printed to the console.

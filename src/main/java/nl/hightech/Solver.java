package nl.hightech;

import io.swagger.client.model.MazeInfo;

/**
 * The solver's purpose is to solve a single maze
 */
public class Solver {
    private MazeInfo currentMaze;

    /**
     * Constructor for the solver
     * @param maze The maze to solve
     */
    private Solver(MazeInfo maze) {
        this.currentMaze = maze;
    }

    /**
     * Setter for a maze
     * @param maze The new maze to solve
     */
    public void setMaze(MazeInfo maze) {
        this.currentMaze = maze;
    }

    /**
     * Solves the current maze
     */
    private void solveMaze() {

    }

}
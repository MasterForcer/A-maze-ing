package nl.hightech;

import io.swagger.client.ApiException;
import io.swagger.client.api.MazeApi;
import io.swagger.client.model.MazeInfo;
import io.swagger.client.model.MoveAction;
import io.swagger.client.model.PossibleActionsAndCurrentScore;

import java.util.List;

/**
 * The solver's purpose is to solve a single maze
 */
public class MazeSolver {
    private MazeInfo currentMaze;

    /**
     * Constructor for the solver
     * @param maze The maze to solve
     */
    MazeSolver(MazeInfo maze) {
        this.currentMaze = maze;
    }

    MazeSolver() {
        this.currentMaze = null;
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
    public void solveMaze() throws ApiException {
        PossibleActionsAndCurrentScore actionsAndCurrentScore;
        MazeApi mazeAPI = new MazeApi();

        // Enter the maze and get the actions
        System.out.println(currentMaze.getName());
        actionsAndCurrentScore = mazeAPI.enter(currentMaze.getName());

        List<MoveAction> moveActions = actionsAndCurrentScore.getPossibleMoveActions();

        // Move into the first direction that shows up
        MoveAction firstMove = moveActions.get(0);
        switch (firstMove.getDirection()) {
            case LEFT:
                actionsAndCurrentScore = mazeAPI.moveLeft();
                break;
            case RIGHT:
                actionsAndCurrentScore = mazeAPI.moveRight();
                break;
            case UP:
                actionsAndCurrentScore = mazeAPI.moveUp();
                break;
            case DOWN:
                actionsAndCurrentScore = mazeAPI.moveDown();
                break;
            default:
                throw new ApiException("No direction to move in!");
        }

        System.out.println(actionsAndCurrentScore.toString());
    }
}
package nl.hightech;

import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.Configuration;
import io.swagger.client.api.MazesApi;
import io.swagger.client.api.PlayerApi;
import io.swagger.client.model.MazeInfo;

import java.util.List;
import java.util.Scanner;

public class App {

    public static void main( String[] args ) throws ApiException {
        ApiClient defaultApiClient = Configuration.getDefaultApiClient();
        defaultApiClient.setBasePath("https://maze.hightechict.nl/");
        defaultApiClient.addDefaultHeader("Authorization", "HTI Thanks You [7c45]");

        PlayerApi playerApi = new PlayerApi();
        System.out.println("Forgetting player...");
        playerApi.forget();

        System.out.println("About to register...");
        playerApi.register("Roido");

        MazesApi mazesApi = new MazesApi();
        System.out.println("About to obtain all mazes...");
        List<MazeInfo> allMazes = mazesApi.all();

        // Prints all the mazes
        printMazes(allMazes);

        new Scanner(System.in).nextLine();
    }

    private static void printMazes(List<MazeInfo> mazes) {
        for (MazeInfo mazeInfo : mazes) {
            System.out.println(
                    String.format("%s has a potential reward of %d and contains %d tiles;", mazeInfo.getName(), mazeInfo.getPotentialReward(), mazeInfo.getTotalTiles())
            );
        }
    }
}

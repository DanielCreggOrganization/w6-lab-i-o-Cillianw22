package ie.atu.iolab;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Java I/O!");

        // Placeholder for initializing the VideoGame Manager
        VideoGameManager videoGameManager = new VideoGameManager();
        
        // Example: Add a video game (to test the setup)
        videoGameManager.addVideoGame(
                new VideoGame("Minecraft", "Sandbox", 2011, 9.0, "Mojang")
        );

        // Example: List all video games
        System.out.println("List of Video Games:");
        videoGameManager.listAllGames();
    }
}

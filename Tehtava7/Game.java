package Tehtava7;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you Name player: ");
        String playerName = scanner.nextLine();
        GameUser gameUser = new GameUser (playerName);

        while (!(gameUser.getCurrentLevel() instanceof Master)) {
            showStatus(gameUser);
            System.out.println("Choose an action: train, meditate, fight");
            String action = scanner.nextLine().toLowerCase();

            switch (action) {
                case "train": gameUser.train(); break;
                case "meditate": gameUser.meditate(); break;
                case "fight": gameUser.fight(); break;
                default: System.out.println("Invalid action.");
            }
        }

        System.out.println(" Congratulations, " + gameUser.getUsername() + "! You've reached Master level.");
    }
    private static void showStatus(GameUser c) {
        System.out.println("Status:");
        System.out.println("Name: " + c.getUsername());
        System.out.println("Level: " + c.getCurrentLevel().getClass().getSimpleName());
        System.out.println("XP: " + c.getExperience() + " | Health: " + c.getHealth());
    }
}

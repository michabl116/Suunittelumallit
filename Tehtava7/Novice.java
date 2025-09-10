package Tehtava7;
public class Novice implements State {
    private GameUser gameUser;

    public Novice(GameUser gameUser) {
        this.gameUser = gameUser;
    }

    public void train() {
        gameUser.setExperience(gameUser.getExperience() + 10);
        System.out.println("Training... +10 XP");
        if (gameUser.getExperience() >= 30) {
            gameUser.setCurrentLevel(new Intermediate(gameUser));
            System.out.println("You've reached Intermediate level!");
        }
    }

    public void meditate() {
        System.out.println("You can't meditate at the Novice level.");
    }

    public void fight() {
        System.out.println("You can't fight at the Novice level.");
    }
}


package Tehtava7;

public class Intermediate implements State {
    private GameUser gameUser;
    public Intermediate(GameUser gameUser) {
        this.gameUser = gameUser;
    }
    public void train() {
        gameUser.setExperience(gameUser.getExperience() +10);
        System.out.println("Training +10 px");
        checkLevelUp();
    }
    public void meditate() {
        gameUser.setHealth(gameUser.getHealth() +5);
        System.out.println("Meditating +5 px");
        checkLevelUp();
    }
    public void fight() {
        System.out.println("ou can't fight at the Intermediate level.");

    }
    private void checkLevelUp() {
        if (gameUser.getExperience() >= 60){
            gameUser.setCurrentLevel(new Expert(gameUser));
            System.out.println("You've reached Expert level!");
        }

    }
}

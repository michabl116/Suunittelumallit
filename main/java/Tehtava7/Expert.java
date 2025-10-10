package Tehtava7;

public class Expert implements State{
    private GameUser gameUser;
    public Expert(GameUser gameUser) {
        this.gameUser = gameUser;
    }
    public void train() {
        gameUser.setExperience(gameUser.getExperience()+10);
        System.out.println("training  +10 XP" );
        checkLevelUp();

    }
    public void meditate() {
        gameUser.setHealth(gameUser.getHealth()+5);
        System.out.println("mediating  +5 XP" );
        checkLevelUp();
    }
    public void fight() {
        gameUser.setHealth(gameUser.getHealth()-15);
        gameUser.setExperience(gameUser.getExperience()+20);
        System.out.println("fighting  -15health XP" );
        checkLevelUp();
    }
    private void checkLevelUp() {
        if (gameUser.getExperience()>=100) {
            gameUser.setCurrentLevel(new Master(gameUser));
            System.out.println("you've reached Master level");
        }
    }


}

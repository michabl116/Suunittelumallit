package Tehtava7;

public class Master implements State{
    private GameUser gameUser;
    public Master(GameUser gameUser) {
        this.gameUser = gameUser;
    }
    public void train() {
        System.out.println("You are a Master. No need to train anymore.");
    }

    public void meditate() {
        System.out.println("You are a Master. Meditation is optional.");
    }

    public void fight() {
        System.out.println("You are a Master. Battles are behind you.");
    }



}

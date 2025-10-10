package Tehtava7;

public class GameUser {
    private String username; //nombre del jugador
    private int experience; //es los puntos para suvir de nivel
    private int health;//
    private State currentLevel ;

    public GameUser(String username) {
        this.username = username;
        this.experience = 0;
        this.health = 100;
        this.currentLevel = new Novice(this);
    }
    public  void train(){
        currentLevel.train();
    }
    public  void meditate(){
        currentLevel.meditate();

    }
    public  void fight(){
        currentLevel.fight();
    }
    public String getUsername() {
        return username;
    }

    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;

    }
    public int getHealth() {
        return health;

    }
    public void setHealth(int health) {
        this.health = health;
    }
    public State getCurrentLevel() {
        return currentLevel;

    }
    public void setCurrentLevel(State currentLevel) {
        this.currentLevel = currentLevel;
    }

}

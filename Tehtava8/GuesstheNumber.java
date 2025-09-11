package Tehtava8;

import java.util.Random;
import java.util.Scanner;

public class GuesstheNumber extends Game{

    private int secretNumber;
    private int[] guesses;
    private  int winner = -1;
    private Scanner scanner = new Scanner(System.in);



    public void initializeGame(int numberOfPlayers){
        secretNumber=new Random().nextInt(10) + 1;
        System.out.println("Game started! Guess the secret number between 1 and 10. " );
    }
    public boolean endOfGame(){
        return winner != -1;
    }
    public void playSingleTurn(int player){
        System.out.print("Player " + player + ", enter your guess (1–10): ");
        int guess = scanner.nextInt();

        if (guess == secretNumber) {
            winner = player;
        } else {
            System.out.println("Incorrect number!");
        }



    }
    public void displayWinner(){
        System.out.println("player" + winner + " guessed the secret number (" + secretNumber + ") and wins!"
        );
    }
}

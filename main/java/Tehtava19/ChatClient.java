package Tehtava19;


public interface ChatClient {
    void receiveMessage(String sender, String message);
    String getUsername();
}

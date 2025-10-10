package Tehtava19;


public interface ChatMediator {
    void registerClient(ChatClient client);
    void sendMessage(String sender, String recipient, String message);
}

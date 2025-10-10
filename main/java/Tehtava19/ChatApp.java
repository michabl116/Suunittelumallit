package Tehtava19;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.List;

public class ChatApp extends Application {
    private ChatMediator mediator = new ChatMediatorImpl();
    private List<String> usernames = List.of("Alice", "Bob", "Charlie");

    @Override
    public void start(Stage primaryStage) {
        for (String username : usernames) {
            createClientWindow(username);
        }
    }

    private void createClientWindow(String username) {
        TextArea chatArea = new TextArea();
        chatArea.setEditable(false);

        TextField messageField = new TextField();
        messageField.setPromptText("Type your message...");

        TextField recipientField = new TextField();
        recipientField.setPromptText("Recipient username");

        Button sendButton = new Button("Send");

        ChatClient client = new ChatClient() {
            @Override
            public void receiveMessage(String sender, String message) {
                chatArea.appendText("From " + sender + ": " + message + "\n");
            }

            @Override
            public String getUsername() {
                return username;
            }
        };

        mediator.registerClient(client);

        sendButton.setOnAction(e -> {
            String msg = messageField.getText();
            String recipient = recipientField.getText();
            mediator.sendMessage(username, recipient, msg);
            chatArea.appendText("To " + recipient + ": " + msg + "\n");
            messageField.clear();
        });

        VBox layout = new VBox(10, chatArea, messageField, recipientField, sendButton);
        layout.setPadding(new Insets(10));

        Stage stage = new Stage();
        stage.setTitle("Chat - " + username);
        stage.setScene(new Scene(layout, 400, 300));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

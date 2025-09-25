package Tehtava10;


public class Main {
    public static void main(String[] args) {

        Handler chain = new CompensationHandler();
        chain.setNext(new ContactRequestHandler())
                .setNext(new SuggestionHandler())
                .setNext(new GeneralFeedbackHandler());

        Message[] messages = {
                new Message(MessageType.COMPENSATION, "Requesting refund for failed service", "client1@example.com"),
                new Message(MessageType.CONTACT_REQUEST, "Need to speak with a representative", "client2@example.com"),
                new Message(MessageType.DEVELOPMENT_SUGGESTION, "Add mobile app support", "client3@example.com"),
                new Message(MessageType.GENERAL_FEEDBACK, "Great service, thank you!", "client4@example.com")
        };


        for (Message msg : messages) {
            String result = chain.handle(msg);
            System.out.println(result);
        }
    }
}


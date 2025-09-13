package Tehtava10;

public class SuggestionHandler extends Handler {
    @Override
    public String handle(Message message) {
        if (message.getType() == MessageType.DEVELOPMENT_SUGGESTION) {
            return "[Suggestion] Logged and prioritized: '" + message.getContent() + "' from " + message.getSenderEmail();
        } else if (next != null) {
            return next.handle(message);
        }
        return "Unhandled message type.";
    }
}




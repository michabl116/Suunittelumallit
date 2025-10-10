package Tehtava10;

public class GeneralFeedbackHandler extends Handler {
    @Override
    public String handle(Message message) {
        if (message.getType() == MessageType.GENERAL_FEEDBACK) {
            return "[Feedback] Analyzed and responded: '" + message.getContent() + "' from " + message.getSenderEmail();
        } else if (next != null) {
            return next.handle(message);
        }
        return "Unhandled message type.";
    }
}



package Tehtava10;

public class CompensationHandler extends Handler {

    public String handle(Message message) {
        if (message.getType() == MessageType.COMPENSATION) {
            return "[Compensation] Received clain" + message.getContent() + "from" + message.getSenderEmail();
        } else if (next != null) {
            return message.getContent();
        }
        return "Unhandled message type";
    }

}

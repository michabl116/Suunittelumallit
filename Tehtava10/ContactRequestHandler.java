package Tehtava10;

public class ContactRequestHandler extends Handler {
    public String handle(Message message) {
        if (message.getType() == MessageType.CONTACT_REQUEST) {
            return "[Contact] Forwarded to support team: '" + message.getContent() + "' from " + message.getSenderEmail();
        } else if (next != null) {
            return next.handle(message);
        }
        return "Unhandled message type.";
    }



}

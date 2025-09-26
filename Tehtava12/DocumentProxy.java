package Tehtava12;

import java.io.Serializable;

public class DocumentProxy implements DocumentInt {
    private Document realDoc;
    private boolean isProtected;

    public DocumentProxy(Document doc, boolean isProtected) {
        this.realDoc = doc;
        this.isProtected = isProtected;
    }

    @Override
    public String getContent(User user) {
        if (!isProtected) {
            return realDoc.getContent(user);
        }

        AccessControlService service = AccessControlService.getInstance();
        if (service.isAllowed(realDoc.getId(), user.username)) {
            return realDoc.getContent(user);
        } else {
            return "Access denied for user: " + user.username;
        }
    }

    @Override
    public String getCreationDate() {
        return realDoc.getCreationDate();
    }


}

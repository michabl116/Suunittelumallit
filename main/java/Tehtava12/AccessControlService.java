package Tehtava12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccessControlService {
    private static AccessControlService instance = new AccessControlService();
    private Map<String, List<String>> permissions = new HashMap<>();

    private AccessControlService() {}

    public static AccessControlService getInstance() {
        return instance;
    }

    public void allow(String docId, String username) {
        permissions.computeIfAbsent(docId, k -> new ArrayList<>()).add(username);
    }

    public boolean isAllowed(String docId, String username) {
        return permissions.containsKey(docId) && permissions.get(docId).contains(username);
    }


}

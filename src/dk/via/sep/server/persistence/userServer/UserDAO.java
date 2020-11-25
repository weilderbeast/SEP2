package dk.via.sep.server.persistence.userServer;

import dk.via.sep.shared.transfer.User;

public interface UserDAO {
    void addUser(User user);

    User getUser(String username, String password);
}
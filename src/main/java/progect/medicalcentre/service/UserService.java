package progect.medicalcentre.service;

import progect.medicalcentre.model.User;

import java.util.List;

public interface UserService {
    List<User> allUsers();
    void add(User user);
    void delete(User user);
    void edit(User user);
    User getById(int id);
    List<User> allUsers(int page);

    List<User> roleDoctor();
    List<User> roleUser();
}

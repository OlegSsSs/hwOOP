package hwSeminar5.controllers;

import hwSeminar5.model.Repository;
import hwSeminar5.model.User;

import java.util.List;

public class UserController {
    private final Repository repository;

    public UserController(Repository repository) {
        this.repository = repository;
    }

    public void saveUser(User user) {
        repository.CreateUser(user);
    }

    public User readUser(String userId) throws Exception {
        List<User> users = repository.getAllUsers();
        for (User user : users) {
            if (user.getId().equals(userId)) {
                return user;
            }
        }

        throw new Exception("User not found");
    }

    public List<User> getUsers() {
        return repository.getAllUsers();
    }

    public void updateUser(User updateUser) {
        repository.updateUser(updateUser);

    }

    public void deleteUser(String userID) throws Exception {
//        repository.deleteUser(deleteUser);
        List<User> users = repository.getAllUsers();
        User userFind = null;
        for (User user : users) {
            if (user.getId().equals(userID)) {
                userFind = user;
                break;
            }
        }
        if (userFind == null) {
            throw new Exception("Пользователь не найден");
        }

        repository.deleteUser(userFind);
    }
}

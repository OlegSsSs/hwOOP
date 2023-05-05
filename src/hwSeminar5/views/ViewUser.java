package hwSeminar5.views;

import hwSeminar5.controllers.UserController;
import hwSeminar5.model.User;

import java.util.List;
import java.util.Scanner;

public class ViewUser {

    private UserController userController;
    private ValidateInput validate = new ValidateInput();

    public ViewUser(UserController userController) {
        this.userController = userController;
    }

    public void run(){
        Commands com = Commands.NONE;

        while (true) {
            try {
                String command = prompt("Введите команду: ");
                com = Commands.valueOf(command.toUpperCase());
                if (com == Commands.EXIT) return;
                switch (com) {
                    case CREATE:
                        createUser();
                        break;
                    case READ:
                        readUser();
                        break;
                    case LIST:
                        printAllUsers();
                        break;
                    case UPDATE:
                        updateUser();
                        break;
                    case DELETE:
                        deleteUser();
                        break;
                }
            } catch (Exception o) {
                System.out.println(o.getMessage());
            }
        }
    }

    private void createUser() {
        userController.saveUser(inputUser());
    }

    private User inputUser() {
        String firstName;
        do {
            firstName = prompt("Имя: ");
        } while (validate.chekFirstName(firstName));
        String lastName;
        do {
            lastName = prompt("Фамилия: ");
        } while (validate.chekLastName(lastName));
        String phone;
        do {
            phone = prompt("Номер телефона: ");
        } while (validate.chekPhone(phone));
//        String phone = prompt("Номер телефона: ");
        return new User(firstName, lastName, phone);
    }

    private String readUser() {
        String id = prompt("Идентификатор пользователя: ");
        try {
            User user = userController.readUser(id);
            System.out.println(user);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return id;
    }

    private void updateUser() {
        String id = readUser();
        User updateUser = inputUser();
        updateUser.setId(id);
        userController.updateUser(updateUser);
    }

    public void deleteUser() throws Exception {
        String userid = prompt("Идентификатор пользователя: ");
        userController.deleteUser(userid);
    }

    private void printAllUsers() {
        List<User> users = userController.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
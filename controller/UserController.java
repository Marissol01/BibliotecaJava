package controller;

import models.UserCustomer;
import models.UserEmployee;

public class UserController {

    public boolean verifyPIN(UserEmployee user, String pin) {
        return user.getPin().equals(pin);
    }

    public boolean verifyPassword(UserCustomer user, String password) {
        return user.verifyPassword(password);
    }

    public void inicializarUsuarios() {
        UserCustomer.add(new UserCustomer("Ana", "3456", "senha123", "89224002"));
        UserEmployee.add(new UserEmployee("Maria", "789123456", "senha123", "40028922", "1011"));
    }

}

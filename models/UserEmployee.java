package models;

import java.util.ArrayList;
import java.util.List;

public class UserEmployee extends User {
    private String pin;

    private static List<UserEmployee> employees = new ArrayList<>();

    public UserEmployee(String fullName, String cpf, String password, String phoneNumber, String pin) {
        super(fullName, cpf, password, phoneNumber);
        this.pin = pin;
    }

    public String getPin() { return pin; }
    public void setPin(String pin) { this.pin = pin; }

    public static void add(UserEmployee userEmployee) {
        employees.add(userEmployee);
    }

    public static List<UserEmployee> getAll() {
        return employees;
    }
}


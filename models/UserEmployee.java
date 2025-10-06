package models;

public class UserEmployee extends User {
    private String pin;

    public UserEmployee(String fullName, String cpf, String password, String phoneNumber, String pin) {
        super(fullName, cpf, password, phoneNumber);
        this.pin = pin;
    }

    public String getPin() { return pin; }
    public void setPin(String pin) { this.pin = pin; }

    public static void add(UserEmployee userEmployee) {
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

}


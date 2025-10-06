package models;

public class User {

    String fullName;
    String cpf;
    String password;
    String phoneNumber;
    
    public User(String fullName, String cpf, String password, String phoneNumber) {
        this.fullName = fullName;
        this.cpf = cpf;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public boolean verifyPassword(String password) {
        return this.password.equals(password);
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}



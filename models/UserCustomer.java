package models;

import java.util.ArrayList;

import java.util.List;

public class UserCustomer extends User{

    private static List<UserCustomer> UserCustomers = new ArrayList<>();

    public UserCustomer(String fullName, String cpf, String password, String phoneNumber) {
        super(fullName, cpf, password, phoneNumber);
    }

    public static List<UserCustomer> getAll() {
    return UserCustomers;
}

    
}

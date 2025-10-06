package view;

import java.util.Scanner;
import controller.UserController;
import models.UserCustomer;
import models.UserEmployee;
import view.CustomerMenu;

public class Menu {

    Scanner sc = new Scanner(System.in);

    public void displayMainMenu() {

        System.out.println("Bem vindo a Biblioteca Java!");
        System.out.println("Escolha uma das opções: ");
        System.out.println("1. Login Membro");
        System.out.println("2. Não sou cadastrado");
        System.out.println("3. Login Funcionário");
        System.out.println("4. Sair");
        System.err.println("------------------------------------");
        System.out.println("Opção selecionada: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                loginCustomer();
                break;
            case 2:
                registerCustomer();
                break;
            case 3:
                loginEmployee();
                break;
            case 4:
                System.out.println("\nAdeus...");
                break;

            default:
                System.out.println("Escolha uma opção válida!");
                displayMainMenu();
                break;
        }
    }

    public void loginCustomer() {
        UserController userController = new UserController();

        System.out.println("Login Membro");
        System.out.println("Digite seu CPF: ");
        String cpf = sc.nextLine();
        System.out.println("Digite sua senha: ");
        String password = sc.nextLine();

        for (UserCustomer userCustomer : UserCustomer.getAll()) {
            if (userCustomer.getCpf().equals(cpf) && userCustomer.verifyPassword(password)) {
                System.out.println("Login bem-sucedido! Bem-vindo, " + userCustomer.getFullName());
                new CustomerMenu(this).displayCustomerMenu(); // passa o menu principal
                return;
            }
        }

        System.out.println("CPF ou senha incorretos! Tente novamente.\n");

    }

    public void registerCustomer() {
        System.out.println("Cadastro de Membro");
        System.out.print("Nome completo: ");
        String name = sc.nextLine();
        System.out.print("CPF: ");
        String cpf = sc.nextLine();
        System.out.print("Senha: ");
        String password = sc.nextLine();
        System.out.print("Telefone: ");
        String phone = sc.nextLine();

        UserCustomer.add(new UserCustomer(name, cpf, password, phone));
        System.out.println("Cadastro concluído!");
        displayMainMenu();
    }

    public void loginEmployee() {
        System.out.println("Login Funcionário");
        System.out.println("Digite seu PIN: ");
        String pin = sc.nextLine();
        System.out.println("Digite sua senha: ");
        String password = sc.nextLine();

        for (UserEmployee userEmployee : UserEmployee.getAll()) {
            if (userEmployee.getPin().equals(pin) && userEmployee.verifyPassword(password)) {
                System.out.println("Login bem-sucedido! Bem-vindo, " + userEmployee.getFullName());
                new EmployeeMenu(this).displayEmployeeMenu(); 
                return;
            }
        }

        System.out.println("CPF ou senha incorretos! Tente novamente.\n");
    }

}

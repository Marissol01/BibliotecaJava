package view;

import java.util.Scanner;
import controller.UserController;
import models.UserCustomer;
import view.CustomerMenu;

public class Menu {

    public void displayMainMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo a Biblioteca Java!");
        System.out.println("Escolha uma das opções: ");
        System.out.println("1. Login Membro");
        System.out.println("2. Login Funcionário");
        System.out.println("3. Não sou cadastrado");
        System.out.println("4. Sair");
        System.err.println("------------------------------------");
        System.out.println("Opção selecionada: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                CustomerMenu.loginCustomer();
                break;
            case 2:
                loginEmployee();
                break;
            case 3:
                registerCustomer();
                break;
            case 4:
                System.out.println("\nAdeus...");
                break;

            default:
                System.out.println("Escolha uma opção válida!");
                displayMainMenu();
                break;
        }
        sc.close();
    }

    public void loginCustomer() {
        Scanner sc = new Scanner(System.in);
        UserController userController = new UserController();

        System.out.println("Login Membro");
        System.out.println("Digite seu CPF: ");
        String cpf = sc.nextLine();
        System.out.println("Digite sua senha: ");
        String password = sc.nextLine();

        for (UserCustomer userCustomer : UserCustomer.getAll()) {
            if (userCustomer.getCpf().equals(cpf) && userCustomer.verifyPassword(password)) {
                System.out.println("Login bem-sucedido! Bem-vindo, " + userCustomer.getFullName());
                displayCustomerMenu();
                return;
            }
        }
        System.out.println("CPF ou senha incorretos! Tente novamente.");
        loginCustomer();

        sc.close();
    }

    public void registerCustomer() {
        System.out.println("Cadastro de Membro");
        System.out.println("Digite seu nome completo: ");
        System.out.println("Digite seu CPF: ");
        System.out.println("Digite sua senha: ");
        System.out.println("Digite seu número de telefone: ");
    }

    public void loginEmployee() {
        System.out.println("Login Funcionário");
        System.out.println("Digite seu CPF: ");
        System.out.println("Digite sua senha: ");
        System.out.println("Digite seu PIN: ");
    }

}

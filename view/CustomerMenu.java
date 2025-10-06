package view;

import java.util.Scanner;
import view.Menu;
import java.util.Scanner;
import controller.UserController;
import models.UserCustomer;

public class CustomerMenu {

    public class EmployeeMenu {

        public void displayCustomerMenu() {
            Scanner sc = new Scanner(System.in);

            System.out.println("Menu do Membro");
            System.out.println("Escolha uma das opções: ");
            System.out.println("1. Ver livros disponíveis");
            System.out.println("2. Ver meus empréstimos");
            System.out.println("3. Fazer empréstimo");
            System.out.println("4. Devolver livro");
            System.out.println("5. Sair");
            System.err.println("------------------------------------");
            System.out.println("Opção selecionada: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:

            }
        }
    }
}
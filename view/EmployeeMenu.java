package view;

import java.util.Scanner;
import view.Menu;
import controller.UserController;
import models.UserEmployee;

public class EmployeeMenu {

    Scanner sc = new Scanner(System.in);
    private Menu mainMenu;

    public EmployeeMenu(Menu menu) {
        this.mainMenu = menu;
    }

    public void displayEmployeeMenu() {
        while (true) {
            System.out.println("\nMenu do Funcionário");
            System.out.println("1. Ver livros disponíveis");
            System.out.println("2. Ver empréstimos");
            System.out.println("3. Editar livros");
            System.out.println("4. Excluir livros");
            System.out.println("5. Sair");
            System.out.println("------------------------------------");
            System.out.print("Opção selecionada: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Mostrando livros disponíveis...");
                    break;
                case 2:
                    System.out.println("Mostrando emprestimos...");
                    break;
                case 3:
                    System.out.println("Editando livro...");
                    break;
                case 4:
                    System.out.println("Excluindo livro...");
                    break;
                case 5:
                    System.out.println("Saindo do menu do funcionário...");
                    mainMenu.displayMainMenu();
                    return;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}

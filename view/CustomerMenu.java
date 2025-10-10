package view;

import java.util.Scanner;
import controller.CollectionController;

public class CustomerMenu {

    private Scanner sc = new Scanner(System.in);
    private Menu mainMenu;
    private CollectionController collectionController;
    private String loggedUserName;

    public CustomerMenu(Menu menu, CollectionController collectionController, String loggedUserName) {
        this.mainMenu = menu;
        this.collectionController = collectionController;
        this.loggedUserName = loggedUserName;
    }

    public void displayCustomerMenu() {
        while (true) {
            System.out.println(
                "\n+-------------------------------------------------------------------------------------+");
            System.out.println("Menu do Membro");
            System.out.println("1. Ver livros disponíveis");
            System.out.println("2. Fazer empréstimo");
            System.out.println("3. Devolver livro");
            System.out.println("4. Sair");
            System.out.println(
                "+-------------------------------------------------------------------------------------+");
            System.out.print("Opção selecionada: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    collectionController.listBooksCustomer();
                    break;
                case 2:
                    System.out.println(
                            "+-------------------------------------------------------------------------------------+");
                    System.out.print("Digite o título do livro para empréstimo: ");
                    String borrowTitle = sc.nextLine();
                    collectionController.borrowBook(borrowTitle, loggedUserName);
                    break;
                case 3:
                    System.out.print("Digite o nome do livro para devolver: ");
                    String returnTitle = sc.nextLine();
                    collectionController.returnBook(returnTitle);
                    break;
                case 4:
                    mainMenu.displayMainMenu();
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}

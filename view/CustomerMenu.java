package view;

import java.util.Scanner;


public class CustomerMenu {

    Scanner sc = new Scanner(System.in);
    private Menu mainMenu;

    public CustomerMenu(Menu menu) {
        this.mainMenu = menu;
    }

    public void displayCustomerMenu() {
        while (true) {
            System.out.println("\nMenu do Membro");
            System.out.println("1. Ver livros disponíveis");
            System.out.println("2. Ver meus empréstimos");
            System.out.println("3. Fazer empréstimo");
            System.out.println("4. Devolver livro");
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
                    System.out.println("Mostrando seus empréstimos...");
                    break;
                case 3:
                    System.out.println("Fazendo novo empréstimo...");
                    break;
                case 4:
                    System.out.println("Devolvendo livro...");
                    break;
                case 5:
                    System.out.println("Saindo do menu do membro...");
                    mainMenu.displayMainMenu();
                    return;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}

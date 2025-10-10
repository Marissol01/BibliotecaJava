import view.Menu;

import controller.CollectionController;
import controller.UserController;

public class Program {

    public static void main(String[] args) {

        UserController userController = new UserController();
        userController.inicializarUsuarios();

        CollectionController collectionController = new CollectionController();
        collectionController.initializeBooks();

        Menu menu = new Menu();
        menu.displayMainMenu();

    }
}
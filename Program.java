import view.Menu;
import controller.UserController;

public class Program {

    public static void main(String[] args) {

        UserController userController = new UserController();
        userController.inicializarUsuarios();

        Menu menu = new Menu();
        menu.displayMainMenu();

    }
}
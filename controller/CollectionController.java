package controller;

import java.util.ArrayList;
import java.util.List;
import models.Book;

public class CollectionController {

    private List<Book> books = new ArrayList<>();

    public CollectionController() {
        initializeBooks();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void initializeBooks() {
        books.add(new Book(1, "Quarto de Despejo", "Carolina Maria De Jesus", "111-1", "Romance", 1960, true, null));
        books.add(new Book(2, "A Hora da Estrela", "Clarice Lispector", "222-3", "Romance", 1977, false, "Ana"));
        books.add(new Book(3, "Crime e Castigo", "Fiodor Dostoievski", "333-3", "Romance", 1866, true, null));
    }

    public void addBook(Book b) {
        books.add(b);
    }

    public void removeBook(int id) {
        books.removeIf(b -> b.getId() == id);
    }

    public void listBooksCustomer() {
        System.out.println("\n+-------------------------------------------------------------------------------------+");
        System.out.printf("%-25s %-30s %-10s %-12s%n",
                "Título", "Autor", "ISBN", "Disponível");
        System.out.println("+-------------------------------------------------------------------------------------+");

        for (Book book : books) {
            String disponivel = (book.getBorrowerFullName() == null) ? "Sim" : "Não";

            System.out.printf("%-25s %-30s %-10s %-12s%n",
                    book.getTitle(), book.getAuthor(), book.getIsbn(), disponivel);
        }

        System.out.println("+-------------------------------------------------------------------------------------+");
    }

    public void listBooksEmployee() {
        System.out.println(
                "\n+-------------------------------------------------------------------------------------+");
        System.out.printf("%-25s %-30s %-10s %-12s %-20s%n",
                "Título", "Autor", "ISBN", "Disponível", "Emprestado para");
        System.out.println(
                "+-------------------------------------------------------------------------------------+");

        for (Book book : books) {
            String disponivel = (book.getBorrowerFullName() == null) ? "Sim" : "Não";
            String emprestadoPara = (book.getBorrowerFullName() == null) ? "-" : book.getBorrowerFullName();

            System.out.printf("%-25s %-30s %-10s %-12s %-20s%n",
                    book.getTitle(), book.getAuthor(), book.getIsbn(), disponivel, emprestadoPara);
        }

        System.out.println(
                "+-------------------------------------------------------------------------------------+");
    }

    public boolean borrowBook(String title, String borrowerName) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                if (b.isAvailable()) {
                    b.setAvailable(false);
                    b.setBorrowerFullName(borrowerName);
                    System.out.println("Empréstimo realizado com sucesso. Devolva em 7 dias! ");
                    System.out.println(
                            "+-------------------------------------------------------------------------------------+");
                    return true;
                } else {
                    System.out.println("" + b.getTitle() + " não esta disponivel para empréstimo no momento.");

                    return false;
                }
            }
        }
        System.out.println("Livro com título \"" + title + "\" não encontrado.");
        System.out.println(
                "+-------------------------------------------------------------------------------------+");
        return false;
    }

    public boolean returnBook(String title) {
        String trimmedTitle = title.trim().toLowerCase();
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title) && !b.isAvailable()) {
                b.setAvailable(true);
                b.setBorrowerFullName(null);
                System.out.println("Livro \"" + b.getTitle() + "\" devolvido com sucesso!");
                return true;
            }
        }
        System.out.println("Livro \"" + title + "\" não encontrado ou não está emprestado.");
        return false;
    }

}

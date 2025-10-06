package controller;

import java.util.ArrayList;
import java.util.List;
import models.Book;

public class CollectionController {

    private List<Book> books = new ArrayList<>();

    public List<Book> getBooks() {
        return books;
    }

    public void initializeBooks() {
        books.add(new Book(1, "Quarto de Despejo", "Carolina Maria De Jesus", "111-1", "Romance", 1960, true, null));
        books.add(new Book(2, "A Hora da Estrela", "Clarice Lispector", "222-3", "Romance", 1977, false, "Ana"));
        books.add(new Book(3, "Crime e Castigo", "Fiódor Dostoiévski", "333-3", "Romance", 1866, true, null));
    }

    public void addBook(Book b) {
        books.add(b);
    }

    public void removeBook(int id) {
        books.removeIf(b -> b.getId() == id);
    }

    public void listBooks() {
        System.out.println("———————————————————————————————————————");
        System.out.println("Lista de livros");
        System.out.printf("%-30s %-20s %-15s %-12s %-20s%n", "Título", "Autor", "ISBN", "Disponível",
                "Emprestado para");
        for (Book b : books) {
            System.out.printf("%-30s %-20s %-15s %-12s %-20s%n",
                    b.getTitle(),
                    b.getAuthor(),
                    b.getIsbn(),
                    b.isAvailable() ? "Sim" : "Não",
                    b.isAvailable() ? "-" : b.getBorrowerFullName());
        }
    }

    public boolean borrowBook(int id, String borrowerName) {
        for (Book b : books) {
            if (b.getId() == id && b.isAvailable()) {
                b.setAvailable(false);
                b.setBorrowerFullName(borrowerName);
                return true;
            }
        }
        System.out.println("Livro indisponível para empréstimo :(");
        return false;
    }

    public boolean returnBook(int id) {
        for (Book b : books) {
            if (b.getId() == id && !b.isAvailable()) {
                b.setAvailable(true);
                b.setBorrowerFullName(null);
                return true;
            }
        }
        return false;
    }

}

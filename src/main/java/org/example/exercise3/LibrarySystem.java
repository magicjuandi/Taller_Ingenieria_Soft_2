package org.example.exercise3;

import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {
    private List<Book> books;
    public LibrarySystem(){
        this.books = new ArrayList<>();
    }
    public void addBook(int id, String name){
        books.add(new Book(id, name));
    }
    public void lendBook(int id) {
        Book book = books.stream()
                .filter(b -> b.getId() == id)
                .findFirst()
                .orElse(null);
        if (book != null && book.isAvailable()) {
            book.setUnavailable();
        } else {
            System.out.println("Id inválido o libro no disponible");
        }
    }
    public void returnBook(int id) {
        Book book = books.stream()
                .filter(b -> b.getId() == id)
                .findFirst()
                .orElse(null);
        if (book != null && !book.isAvailable()) {
            book.setAvailable();
        } else {
            System.out.println("Id inválido o libro no prestado");
        }
    }
    public List<Book> getBooks(){
        return books;
    }
}

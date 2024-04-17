package org.example;

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
    public void lendBook(int id){
        if(books.contains(id) && books.get(id).isAvailable() == true){
            books.get(id).setUnavailable();
        }else{
            System.out.println("Id invalido");
        }
    }
    public void returnBook(int id){
        if(books.contains(id) && books.get(id).isAvailable() == false){
            books.get(id).setAvailable();
        }else{
            System.out.println("Id invalido");
        }
    }
    public List<Book> getBooks(){
        return books;
    }
}

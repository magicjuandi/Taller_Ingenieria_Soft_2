package org.example;

public class Book {
    private int id;
    private String name;
    private boolean available;

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
        this.available = true;
    }

    public String getName() {
        return name;
    }

    public boolean isAvailable() {
        return available;
    }
    public void setUnavailable(){
        this.available = false;
    }
    public void setAvailable(){
        this.available = true;
    }



    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", available=" + available +
                '}';
    }
}

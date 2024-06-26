package org.example.exercise3;

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

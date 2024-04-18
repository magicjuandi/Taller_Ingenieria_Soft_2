package org.example.exercise4;

public class Package {
    private int id;
    private Status status;
    private String location;
    public Package(int id) {
        this.id = id;
        this.status = Status.BODEGA;
        this.location = "Centro de Despachos";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Package{" +
                "id=" + id +
                ", status=" + status +
                ", location='" + location + '\'' +
                '}';
    }
}

package org.example.exercise4;

import java.util.ArrayList;
import java.util.List;

public class PackageSystem {
    private List<Package> packages;
    public PackageSystem() {
        this.packages = new ArrayList<>();
    }
    public void addPackage(int id){
        packages.add(new Package(id));
    }
    public Package byId(int id){
        return packages.get(id);
    }
    public void lookStatus(int id) {
        Package pkg = packages.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
        if (pkg != null) {
            System.out.println(pkg.getStatus());
        } else {
            System.out.println("Id inválido");
        }
    }
    public void lookLocation(int id) {
        Package pkg = packages.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
        if (pkg != null) {
            System.out.println(pkg.getLocation());
        } else {
            System.out.println("Id inválido");
        }
    }
    public List<Package> getPackages(){
        return packages;
    }
    public void sleeper(int millis){
        try{
            Thread.sleep(millis);
        }catch(InterruptedException e){
          e.printStackTrace();
        }
    }
    public void simulation(int id){
        sleeper(4000);
        System.out.println("Paquete con Id: "+id+" esta en estado: "+byId(id).getStatus()+" y esta ubicado en "+byId(id).getLocation());
        sleeper(6000);
        byId(id).setStatus(Status.TRANSIT);
        byId(id).setLocation("En la Avenidad Inventada");
        System.out.println("El paquete con el Id: "+id+" ha cambiado de estado a: "+byId(id).getStatus()+" y ahora esta ubicado en "+byId(id).getLocation());
        sleeper(10000);
        byId(id).setStatus(Status.DELIVERED);
        byId(id).setLocation("En tu casa");
        System.out.println("El paquete con el Id: " + id + " ha cambiado de estado a: " +byId(id).getStatus()+" y ahora esta ubicado en "+byId(id).getLocation());
    }
}

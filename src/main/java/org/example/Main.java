package org.example;

import org.example.exercise1.InventorySystem;
import org.example.exercise2.Task;
import org.example.exercise2.TaskSystem;
import org.example.exercise3.LibrarySystem;
import org.example.exercise4.PackageSystem;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;

public class Main {
    public static void main(String[] args) {
        String opt = "1";
        Scanner s = new Scanner(System.in);
        InventorySystem invSys = new InventorySystem();
        TaskSystem taskSys = new TaskSystem();
        LibrarySystem libSys = new LibrarySystem();
        PackageSystem packSys = new PackageSystem();
        int idCase2 = 0;
        int idCase3 = 0;
        int idCase4 = 0;


        do{
            System.out.println("Menu \n 1.Ejercicio 1 \n 2.Ejercicio 2 \n 3.Ejercicio 3 \n 4.Ejercicio 4 \n 5.Salir");
            opt = s.next();
            switch(opt) {
                case "1": {
                    String opt2 = "1";
                    do{
                        System.out.println("Menu \n 1.Lista Items \n 2.Añadir Item \n 3.Eliminar Item \n 4.Actualizar Cantidad \n 5.Salir");
                        opt2 = s.next();
                        switch(opt2) {
                            case "1": {
                                System.out.println("Lista de Items:");
                                System.out.println(invSys.listItems());
                                break;
                            } case "2":{
                                System.out.println("Añadir Item:");
                                System.out.println("Nombre del Item:");
                                String name = s.next();
                                System.out.println("Cantidad del Item:");
                                Integer quantity = s.nextInt();
                                invSys.addItem(name, quantity);
                                break;
                            } case "3":{
                                System.out.println("Eliminar Item:");
                                System.out.println("Nombre del Item:");
                                String name = s.next();
                                invSys.removeItem(name);
                                break;
                            } case "4":{
                                System.out.println("Actualizar Cantidad:");
                                System.out.println("Nombre del Item:");
                                String name = s.next();
                                System.out.println("Cantidad Nueva del Item:");
                                Integer quantity = s.nextInt();
                                invSys.updateQuantity(name, quantity);
                                break;
                            } case "5":{
                                opt2 = "5";
                                break;
                            }
                        }
                    }while(opt2 !="5" );
                    break;
                } case "2":{
                    String opt2 = "1";
                    do{
                        System.out.println("Menu \n 1.Lista Tareas \n 2.Añadir Tarea \n 3.Marcar Completada \n 4.Salir");
                        opt2 = s.next();
                        switch(opt2) {
                            case "1": {
                                String opt3 = "1";
                                System.out.println("Lista de Tareas:");
                                System.out.println(" 1.Todas las Tareas\n 2.Tareas Incompletas");
                                opt3 = s.next();
                                switch (opt3) {
                                    case "1":{
                                        List<Task> taskCompleted = taskSys.getCompletedTasks();
                                        taskCompleted.forEach(System.out::println);
                                    }case "2":{
                                        List<Task> taskNotCompleted = taskSys.getIncompleteTasks();
                                        taskNotCompleted.forEach(System.out::println);
                                    }
                                }
                                break;
                            } case "2":{
                                System.out.println("Añadir Tarea:");
                                System.out.println("Descripcion de la tarea:");
                                String name = s.next();
                                taskSys.addTask(idCase2,name);
                                idCase2++;
                                break;
                            } case "3":{
                                System.out.println("Marcar como Completada:");
                                System.out.println("Id Tarea:");
                                Integer id = s.nextInt();
                                taskSys.completeTask(id);
                                break;
                            } case "4":{
                                opt2 = "4";
                                break;
                            }
                        }
                    }while(opt2 !="4" );
                    break;
                } case "3":{
                    String opt2 = "1";
                    do{
                        System.out.println("Menu \n 1.Lista Libros \n 2.Añadir Libro \n 3.Pedir Libro \n 4.Devolver Libro \n 5.Salir");
                        opt2 = s.next();
                        switch(opt2) {
                            case "1": {
                                System.out.println("Lista de Libros:");
                                System.out.println(libSys.getBooks());
                                break;
                            } case "2":{
                                System.out.println("Añadir Libro");
                                System.out.println("Nombre del Libro:");
                                String name = s.next();
                                libSys.addBook(idCase3, name);
                                idCase3++;
                                break;
                            } case "3":{
                                System.out.println("Pedir Libro:");
                                System.out.println("Id Libro:");
                                Integer id = s.nextInt();
                                libSys.lendBook(id);
                                break;
                            } case "4":{
                                System.out.println("Devolver Libro:");
                                System.out.println("Id Libro:");
                                Integer id = s.nextInt();
                                libSys.returnBook(id);
                                break;
                            } case "5":{
                                opt2 = "5";
                                break;
                            }
                        }
                    }while(opt2 !="5" );
                    break;
                } case "4":{
                    String opt2 = "1";
                    do{
                        System.out.println("Menu \n 1.Lista Paquetes \n 2.Añadir Paquetes \n 3.Mirar Estado Paquete \n 4.Mirar Ubicacion Paquete \n 5.Salir");
                        opt2 = s.next();
                        switch(opt2) {
                            case "1": {
                                System.out.println("Lista de Paquetes:");
                                System.out.println(packSys.getPackages());
                                break;
                            } case "2":{

                                System.out.println("Añadir Paquete:");
                                packSys.addPackage(idCase4);
                                System.out.println("Paquete Añadido con Id: "+idCase4);
                                int finalIdCase = idCase4;
                                CompletableFuture.runAsync(()->{
                                    packSys.simulation(finalIdCase);
                                });
                                idCase4++;
                                break;
                            } case "3":{
                                System.out.println("Mirar Estado Paquete:");
                                System.out.println("Id Paquete:");
                                Integer id = s.nextInt();
                                packSys.lookStatus(id);
                                break;
                            } case "4":{
                                System.out.println("Mirar Ubicacion Paquete:");
                                System.out.println("Id Paquete:");
                                Integer id = s.nextInt();
                                packSys.lookLocation(id);
                                break;
                            } case "5":{
                                opt2 = "5";
                                break;
                            }
                        }
                    }while(opt2 !="5" );
                    break;
                } case "5":{
                    opt = "5";
                    break;
                }
            }
        }while(opt !="5" );
    }
}
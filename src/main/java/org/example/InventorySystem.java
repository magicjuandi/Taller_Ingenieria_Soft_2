package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InventorySystem {
    private Map<String, Integer> items;
    public InventorySystem() {
        this.items = new HashMap<>();
    }
    public void addItem(String name, Integer quantity) {
        if (items.containsKey(name)) {
            System.out.println("El item ya existe");
            return;
        }
        items.put(name, quantity);
    }
    public void removeItem(String name) {
        if (items.containsKey(name)) {
            items.remove(name);
            return;
        }
        System.out.println("El item no existe");
    }
    public void updateQuantity(String name, Integer quantity) {
        if (items.containsKey(name)) {
            items.put(name, quantity);
            return;
        }
        System.out.println("El item no existe");
    }
    public List<Map> listItems(){
        ArrayList<Map> inventory = new ArrayList<Map>();
        inventory.add(items);
        return inventory;
    }
}

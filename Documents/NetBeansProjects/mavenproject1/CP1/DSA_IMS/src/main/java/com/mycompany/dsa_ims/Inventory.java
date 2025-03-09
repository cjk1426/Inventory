package com.mycompany.dsa_ims;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Collections;

public class Inventory {
    private Map<String, Stock> inventory;

    public Inventory() {
        inventory = new HashMap<>();
    }

    // public class stock items
    private class Stock {
        String dateEntered;
        String stockLabel;
        String brand;
        String status;

        Stock(String dateEntered, String stockLabel, String brand, String status) {
            this.dateEntered = dateEntered;
            this.stockLabel = stockLabel;
            this.brand = brand;
            this.status = status;
        }
    }

    // Method to add new stock
    public void addStock(String dateEntered, String stockLabel, String brand, String engineNumber, String status) {
        if (!inventory.containsKey(engineNumber)) {
            inventory.put(engineNumber, new Stock(dateEntered, stockLabel, brand, status));
            System.out.println("Stock with engine number " + engineNumber + " added.");
        } else {
            System.out.println("Stock with engine number " + engineNumber + " already exists.");
        }
    }

    // Method to delete incorrect stock
    public void deleteStock(String engineNumber) {
        if (inventory.containsKey(engineNumber)) {
            inventory.remove(engineNumber);
            System.out.println("Stock with engine number " + engineNumber + " deleted.");
        } else {
            System.out.println("Stock with engine number " + engineNumber + " does not exist.");
        }
    }

    // Method to sort stocks by brand
    public void sortStocksByBrand() {
        ArrayList<Stock> sortedInventory = new ArrayList<>(inventory.values());
        Collections.sort(sortedInventory, (a, b) -> a.brand.compareTo(b.brand));

        System.out.println("Stocks sorted by brand:");
        for (Stock stock : sortedInventory) {
            System.out.println(stock.brand + " - " + stock.dateEntered + " - " + stock.stockLabel + " - " + stock.status);
        }
    }

    // Method to search for existing inventory using engine number
    public void searchStock(String engineNumber) {
        if (inventory.containsKey(engineNumber)) {
            Stock stock = inventory.get(engineNumber);
            System.out.println("Stock found: " + stock.brand + " - " + stock.dateEntered + " - " + stock.stockLabel + " - " + stock.status);
        } else {
            System.out.println("Stock with engine number " + engineNumber + " not found.");
        }
    }
}
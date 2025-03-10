package com.mycompany.dsa_ims;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;



public class JavaDSA_IMS {
    
    private static ArrayList<String> dataList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        
        
        
        
        do {
            System.out.println("Menu:");
            System.out.println("1. Add Data");
            System.out.println("2. Delete Data");
            System.out.println("3. Sort Data");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addData(scanner);
                    break;
                case 2:
                    deleteData(scanner);
                    break;
                case 3:
                    sortData();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
}


    private static void addData(Scanner scanner) {
        System.out.print("Enter data to add: ");
        String data = scanner.nextLine();
        dataList.add(data);
        System.out.println("Data added.");
    }

    private static void deleteData(Scanner scanner) {
        System.out.print("Enter data to delete: ");
        String data = scanner.nextLine();
        if (dataList.remove(data)) {
            System.out.println("Data deleted.");
        } else {
            System.out.println("Data not found.");
        }
    }

    private static void sortData() {
        Collections.sort(dataList);
        System.out.println("Data sorted.");
        System.out.println("Sorted Data: " + dataList);
    }
}
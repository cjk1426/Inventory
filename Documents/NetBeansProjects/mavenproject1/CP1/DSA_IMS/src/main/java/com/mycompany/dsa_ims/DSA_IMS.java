
package com.mycompany.dsa_ims;



public class DSA_IMS {

    public static void main(String[] args) {
        
             Inventory motorPHInventory = new Inventory();

           //sample to add new stocks to the hash table.
        motorPHInventory.addStock("2/1/2023", "Old", "Honda", "142QVTSIUR", "On-hand");
        motorPHInventory.addStock("3/1/2023", "New", "Suzuki", "NO8VW05PU9", "On-hand");

        //sample to delete incorrect stocks from the hash table.
        motorPHInventory.deleteStock("142QVTSIUR");

        // Sort stocks by brand using a secondary array/list and quicksort/mergesort
        motorPHInventory.sortStocksByBrand();

        // Search for stocks using hash keys (engine number).
        motorPHInventory.searchStock("NO8VW05PU9");
    }
}

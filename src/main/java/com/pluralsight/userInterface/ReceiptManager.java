package com.pluralsight.userInterface;

import com.pluralsight.Order;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptManager {

    public ReceiptManager() {
    }

    public void writeReceipt(Order order) {
        File folder = new File("Receipts");

        if(!folder.exists()) {
            folder.mkdir();
        }
        LocalDateTime timeOfReceipt = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");
        String receiptName = timeOfReceipt.format(formatter);

        try {
            FileWriter fileWriter = new FileWriter("Receipts/" + receiptName + ".txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(order.printReceipt());
            bufferedWriter.close();

        } catch (Exception e) {
            System.out.println("Can't find the file");;
        }



    }

}

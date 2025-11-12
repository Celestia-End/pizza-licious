package com.pluralsight.util;

import com.pluralsight.model.*;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.*;
import java.time.format.DateTimeFormatter;

public class Receipt {

    public static void saveToCSV(Order order) {
        try {
            Path folder = Path.of("receipts");
            if (!Files.exists(folder)) Files.createDirectories(folder);

            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss");
            String filename = "receipt_" + order.getOrderTime().format(fmt) + ".csv";
            Path file = folder.resolve(filename);

            try (FileWriter writer = new FileWriter(file.toFile())) {
                writer.write("Date,Customer,Item,Details,Price\n");

                String date = order.getOrderTime().toString();
                String customer = order.getCustomer().getName();

                for (MenuItem item : order.getExtras()) {
                    writer.write(String.format("%s,%s,%s,\"\",%.2f\n",
                            date, customer, item.getName(), item.getPrice()));
                }

                writer.write(String.format(",,TOTAL,,%.2f\n", order.calculateTotal()));
            }

            System.out.println("CSV receipt saved to " + file);
        } catch (IOException e) {
            System.out.println("Error saving CSV receipt: " + e.getMessage());
        }
    }
}

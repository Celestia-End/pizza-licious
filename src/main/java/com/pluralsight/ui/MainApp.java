package com.pluralsight.ui;

import com.pluralsight.model.*;
import com.pluralsight.util.Receipt;
import java.util.Scanner;

public class MainApp {
    public static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            int choice = safeInt();
            switch (choice) {
                case 1 -> startOrder();
                case 2 -> running = false;
                default -> System.out.println("Our ice cream machine is broken at the moment...");
            }
        }
    }

    private sta
}

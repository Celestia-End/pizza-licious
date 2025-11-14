package com.pluralsight.ui;

import com.pluralsight.model.*;
import java.util.Scanner;

public class MainApp {
    public static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        Order order = new Order();

        while (running) {
            System.out.println();
            System.out.println("Welcome to PIZZA-Licious!");
            System.out.println();
            System.out.println("Would you like to order a pizza today?");
            String answer = input.nextLine();

            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("What size would you like?");
                System.out.println("1) Small");
                System.out.println("2) Medium");
                System.out.println("3) Large");
                String pizzaSize = input.nextLine();

                System.out.println();

                System.out.println("What crust would you like?");
                System.out.println("1) Thin");
                System.out.println("2) Hand-Tossed");
                System.out.println("3) Deep Dish");
                String crustType = input.nextLine();

                System.out.println();

                System.out.println("Would you like stuffed crust?");
                boolean stuffedCrust = Boolean.parseBoolean(input.nextLine());

                System.out.println();

                System.out.println("Choose a meat");
                System.out.println("1) Pepperoni");
                System.out.println("2) Sausage");
                System.out.println("3) Ham");
                System.out.println("4) Bacon");
                System.out.println("5) Chicken");
                System.out.println("6) Meatballs");
                System.out.println();

                System.out.println("Would you like to add another meat?");


                System.out.println("");

                Pizza pizza = new Pizza(pizzaSize, crustType, stuffedCrust, meat, cheese);
                order.addPizza(pizza);
            }

            System.out.println("Want a drink? (yes/no)");
            answer = input.nextLine();

            if (answer.equalsIgnoreCase("yes")) {
                System.out.println("Enter drink flavor (Coke, Coke Zero, Sprite, Fanta): ");
                String flavor = input.nextLine();

                System.out.println("Enter drink size(Small, Medium, Large): ");
                String drinkSize = input.nextLine();

               Drink drink = new Drink(drinkSize, flavor);
               order.addDrink(drink);
            }

            System.out.println("Would you like an order of Garlic Knots? (yes/no)");
            answer = input.nextLine();

            if (answer.equalsIgnoreCase("yes")) {
                GarlicKnots garlicKnots = new GarlicKnots();
                order.addGarlicKnots(garlicKnots);
                System.out.println("Garlic Knots have been added to your order!");
            }


            //Pizza
            //if yes, ask for size, crust type, if they want stuffed crust (if yes add stuffed crust to order), meats, cheeses, toppings, sauces
            //if no. I need it to go to drinks

            //Garlic Knots
            //if yes, add to order
            //if no, go to checkout
        }
    }

}

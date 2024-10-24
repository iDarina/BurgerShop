package burgerShop;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Create a scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Set up customer and shopping cart
        Customer customer = new Customer();
        ShoppingCart cart = new ShoppingCart();
        customer.setShoppingCart(cart);

        // Ask for customer information
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        customer.setName(name);

        System.out.print("Please enter your state: ");
        String state = scanner.nextLine();
        customer.setState(state);

        System.out.println("\nWelcome " + customer.getName() + " from " + customer.getState() + "!");

        // Menu loop
        boolean running = true;

        while (running) {
            // Display menu options
            System.out.println("Please choose an option:");
            System.out.println("1. Add item to cart");
            System.out.println("2. Remove item from cart");
            System.out.println("3. Check item price");
            System.out.println("4. View cart");
            System.out.println("5. Checkout and print receipt");
            System.out.print("Enter your choice: ");


            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1: // Add item
                    System.out.println("Enter the item you want to add (burger, fries, soda, or other): ");
                    String addItem = scanner.nextLine().toLowerCase();

                    MenuItems itemToAdd;
                    switch (addItem) {
                        case "burger":
                            itemToAdd = new Burger();
                            break;
                        case "fries":
                            itemToAdd = new Fries();
                            break;
                        case "soda":
                            itemToAdd = new Soda();
                            break;
                        default:
                            System.out.println("Enter a name for your custom item:");
                            String customItemName = scanner.nextLine();
                            itemToAdd = new MenuItems(customItemName);
                    }

                    System.out.println("Enter quantity: ");
                    int quantity = scanner.nextInt();
                    itemToAdd.setQuanity(quantity);
                    cart.addItem(itemToAdd);
                    break;

                case 2: // Remove item
                    System.out.println("Enter the item you want to remove (burger, fries, soda, or other): ");
                    String removeItem = scanner.nextLine().toLowerCase();

                    System.out.println("How many do you want to remove?");
                    int quantityToRemove = scanner.nextInt();
                    scanner.nextLine();

                    MenuItems itemToRemove;
                    switch (removeItem) {
                        case "burger":
                            itemToRemove = new Burger();
                            break;
                        case "fries":
                            itemToRemove = new Fries();
                            break;
                        case "soda":
                            itemToRemove = new Soda();
                            break;
                        default:
                            System.out.println("Enter the name of the item to remove: ");
                            String customRemoveItem = scanner.nextLine();
                            itemToRemove = new MenuItems(customRemoveItem);
                    }

                    cart.removeItems(itemToRemove, quantityToRemove);
                    break;

                case 3: // Check item price
                    System.out.println("Enter the item name to check the price: ");
                    String itemName = scanner.nextLine().toLowerCase();
                    double price = cart.priceLookup(itemName);
                    System.out.printf("The price of %s is $%.2f%n", itemName, price);
                    break;

                case 4: // View cart
                    cart.printCart();
                    break;

                case 5: // Checkout and print receipt
                    cart.printReceipt(customer);
                    running = false; // Exit the program
                    break;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }

            System.out.println();
        }

        scanner.close();
        System.out.println("Thank you for shopping with us!");
    }
}




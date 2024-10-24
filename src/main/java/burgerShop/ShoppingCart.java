package burgerShop;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

public class ShoppingCart {
    private ArrayList<MenuItems> items;
    private double totalPrice;
    private int itemsInCart;


    public ShoppingCart() {
        this.items = new ArrayList<>();
        this.totalPrice = 0.0;
        this.itemsInCart = 0;
    }


    public ArrayList<MenuItems> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItems> items) {
        this.items = items;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getItemsInCart() {
        return itemsInCart;
    }

    public void setItemsInCart(int itemsInCart) {
        this.itemsInCart = itemsInCart;
    }

    public void addItem(MenuItems item) {
        items.add(item);
        totalPrice += item.getPrice() * item.getQuanity();
        itemsInCart += item.getQuanity();
        System.out.println("Total items in your cart: " + itemsInCart);
        printCart();
    }


    public void removeItems(MenuItems item, int quantityToRemove) {
       //Check to see if the cart is empty if it is then sout your cart is empty
        if (items.isEmpty()) {
            System.out.println("Your cart is empty.");
            return;
        }// Check to see if the cart is empty if it is then sout your cart is empty
        boolean itemRemoved = false;// using a flag to track whether or not the item needs to be remove
        Iterator<MenuItems> iterator = items.iterator(); //to check through the items in the cart

        while (iterator.hasNext()) {
            MenuItems i = iterator.next(); // looping though the items of the cart to see if we have items
            if (i.getItemName().equalsIgnoreCase(item.getItemName())) { //comparing and ignoring case so that Burger and burger are the same
                if (i.getQuanity() > quantityToRemove) { // as long as quanity is greater than quantityToRemove
                    i.setQuanity(i.getQuanity() - quantityToRemove);// that number reduces the item's quantity
                    itemsInCart = itemsInCart -quantityToRemove;// reduces the total number of items in the cart (itemsInCart) by that amount.
                    System.out.println(quantityToRemove + " " + i.getItemName() + "(s) removed from your cart."); // print how many items were removed
                //If the quantity is less than or equal to the amount to remove:
                } else {
                    itemsInCart = itemsInCart - i.getQuanity();
                    iterator.remove();
                    System.out.println(i.getQuanity() + " " + i.getItemName() + "(s) removed from your cart.");
                }
                itemRemoved = true;// mark the item as removed setting the flag true
                break;
            }
        }

        if (!itemRemoved) {
            System.out.println("Item not found in the cart.");// if the item wasn't found in the cart,example if you wanted to remove coco bread, but you only put soda in the cart :p
        }

        System.out.println("Total items in your cart: " + itemsInCart);// printing out the total of items in the cart
    }



    public double calculateTotal(){
     double total = 0.0;
     for(MenuItems item: items){
         total = total + item.getPrice() * item.getQuanity();
    }
    return total;
    }

    public void printCart(){
        boolean hasBurger = false;
        boolean hasSoda = false;
        boolean hasFries = false;

        if (items.isEmpty()) {
            System.out.println("Your cart is empty.");
            return;
        }

        for (MenuItems i : items) {
            if (i.getItemName().equals("Burger")) {
                hasBurger = true;
                System.out.println("You have " + i.getQuanity() + " order of Burger(s)");
            } else if (i.getItemName().equals("Soda")) {
                hasSoda = true;
                System.out.println("You have " + i.getQuanity() + " order of Soda(s)");
            } else if (i.getItemName().equals("Fries")) {
                hasFries = true;
                System.out.println("You have " + i.getQuanity() + " order of Fries");
            } else {
                // Print other generic items (nuggets, candy, etc.) - Treasure
                System.out.println("You have " + i.getQuanity() + " order of " + i.getItemName());
            }
        }
        System.out.println();

        if (!hasBurger) {
            System.out.println("No burger today?");
        }
        if (!hasSoda) {
            System.out.println("No soda today?");
        }
        if (!hasFries) {
            System.out.println("No fries today?");
        }
        System.out.println();
    }

    public void printReceipt(Customer customer) {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("MM-dd-yyyy"); // Date formatting
        SimpleDateFormat timeFormatter = new SimpleDateFormat("hh:mm:ss a"); // Time formatting

        Date date = new Date(); // Current date and time
        String currentDate = dateFormatter.format(date);
        String currentTime = timeFormatter.format(date);

        double taxRate = customer.getTaxRate(customer.getState()); // Get tax rate based on state
        double subtotal = calculateTotal(); // Calculate the subtotal
        double tax = subtotal * taxRate; // Calculate tax
        double totalWithTax = subtotal + tax; // Total with tax

        System.out.println("====================");
        System.out.println("DATE     " + currentDate);
        System.out.println("TIME     " + currentTime);
        System.out.println("====================");
        System.out.printf("AMT      $%.2f%n", subtotal);
        System.out.printf("TAX      $%.2f%n", tax);
        System.out.printf("SALE     $%.2f%n", totalWithTax);
        System.out.println("====================");
        System.out.println("Thank you for your purchase!");
    }

    public double priceLookup(String itemName) {
        switch (itemName.toLowerCase()) {
            case "burger":
                return new Burger().getPrice();
            case "fries":
                return new Fries().getPrice();
            case "soda":
                return new Soda().getPrice();
            default:
                return 4.0;
        }
    }


}


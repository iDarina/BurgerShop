package burgerShop;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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

    public void addItem(MenuItems item){
        items.add(item);
         totalPrice += item.getPrice() * item.getQuanity();
        itemsInCart += item.getQuanity();
        System.out.println("Total items in your cart: " + itemsInCart);
        for(MenuItems i : items){
            System.out.println(i.getItemName());
        }
    }

    public void removeItems(MenuItems item) {
        if (items != null && items.contains(item)) {
            items.remove(item);
            itemsInCart--;
            System.out.println("item removed");
            System.out.println("Total items in your cart: " + itemsInCart);
        }
    }
    public double calculateTotal(){
     double total = 0.0;
     for(MenuItems item: items){
         total = total + item.getPrice() * item.getQuanity();
    }
    return total;
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
}

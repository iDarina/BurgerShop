package burgerShop;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class ShoppingCart {
    private ArrayList<MenuItems> items;
    private double totalPrice;
    private int itemsInCart;


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

    public void removeItems(MenuItems item) {
        if (items != null && items.contains(item)) {
            items.remove(item);
            System.out.println("item removed");
        }
    }
    public double calculateTotal(){
     double total = 0.0;

     for(MenuItems item: items){
       total = total + item.getPrice() * item.getQuanity();

    }
    return total;
    }
    public void printReceipt() {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("MM-dd-yyyy"); //Date and time formatting
        SimpleDateFormat timeFormatter = new SimpleDateFormat("hh:mm:ss a");

        Date date = new Date();
        String currentDate = dateFormatter.format(date);
        String currentTime = timeFormatter.format(date);

        double tax = totalPrice * 0.10; // NEED TO BE REPLACED WITH TAX RATE
        double totalWithTax = totalPrice + tax;

        System.out.println("====================");
        System.out.println("DATE     " + currentDate);
        System.out.println("TIME     " + currentTime);
        System.out.println("====================");
        System.out.printf("AMT      $%.2f%n", totalPrice);
        System.out.printf("TAX      $%.2f%n", tax);
        System.out.printf("SALE     $%.2f%n", totalWithTax);
        System.out.println("====================");
        System.out.println("Thank you for your purchase!");
    }
}

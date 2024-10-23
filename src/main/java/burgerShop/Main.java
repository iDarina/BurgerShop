package burgerShop;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

                Customer customer = new Customer();
                customer.setName("John Doe");
                customer.setState("New Jersey");

                ShoppingCart cart = new ShoppingCart();
                customer.setShoppingCart(cart);

                MenuItems nuggets = new MenuItems("nuggets");
                nuggets.setQuanity(1);
                MenuItems candy = new MenuItems("candy");
                candy.setQuanity(1);
                Burger burger = new Burger();
                burger.setQuanity(1);
                Fries fries = new Fries();
                fries.setQuanity(1);
                Soda soda = new Soda();
                soda.setQuanity(1);

                cart.addItem(burger);
                cart.addItem(fries);
                cart.addItem(soda);
                cart.addItem(nuggets);
                cart.addItem(candy);

                cart.removeItems(burger);
                cart.removeItems(fries);

        System.out.println(cart.priceLookup("burger"));
        System.out.println(cart.priceLookup("nuggets"));


                cart.printReceipt(customer);
            }
        }



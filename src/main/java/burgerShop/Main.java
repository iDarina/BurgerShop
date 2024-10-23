package burgerShop;

public class Main {
    public static void main(String[] args) {

                Customer customer = new Customer();
                customer.setName("John Doe");
                customer.setState("New Jersey");

                ShoppingCart cart = new ShoppingCart();
                customer.setShoppingCart(cart);

                Burger burger = new Burger();
                burger.setQuanity(1);
                Fries fries = new Fries();
                fries.setQuanity(1);
                Soda soda = new Soda();
                soda.setQuanity(1);

                cart.addItem(burger);
                cart.addItem(fries);
                cart.addItem(soda);

                cart.removeItems(burger);

                cart.printReceipt(customer);
            }
        }



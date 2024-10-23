package burgerShop;

public class Burger extends MenuItems {

    public Burger() {
        super.setItemName("Burger");
        super.setPrice(5.00);
        MenuItems.stock = 20;
    }
}


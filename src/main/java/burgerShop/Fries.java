package burgerShop;

public class Fries extends MenuItems{
    public Fries() {
        super.setItemName("Fries");
        super.setPrice(1.00);
        MenuItems.stock = 20;
    }
}

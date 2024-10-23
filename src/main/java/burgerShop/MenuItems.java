package burgerShop;

public class MenuItems {

    private String itemName;
    private double price;
    private int quantity;
    public static int stock;

    public MenuItems() {
    }

    public MenuItems(String name) {
        this.itemName = name;
        setPrice(4.0);
    }

    public String getItemName() {
        return itemName;
    }


    public void setItemName(String itemName) {
        this.itemName = itemName;
    }


    public double getPrice() {
        return price;
    }


    public void setPrice(double price) {
        this.price = price;
    }


    public int getQuanity() {
        return quantity;
    }


    public void setQuanity(int quanity) {
        this.quantity = quanity;
    }
}
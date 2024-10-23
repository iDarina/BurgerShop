package burgerShop;

public class MenuItems {

    private String itemName;
    private double price;
    private int quanity;
    public static int stock;


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
        return quanity;
    }


    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }
}
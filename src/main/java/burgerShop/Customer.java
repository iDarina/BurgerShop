package burgerShop;

public class Customer implements Taxable {

    private String name;
    private String state;
    private ShoppingCart shoppingCart;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getState() {

        return state;
    }

    public void setState(String state) {

        this.state = state;
    }

    public ShoppingCart getShoppingCart() {

        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {

        this.shoppingCart = shoppingCart;
    }

    @Override
    public double getTaxRate(String state) {

        switch (state.toLowerCase()) {
            case "delaware":
                return 0;

            case "new jersey":
                return .06;

            case "pennsylvania":
                return .03;

            case "new york":
                return .04;

            default:
                return .05;
        }
    }

    }

package Interfaces;

public class McDonalds implements FoodProvider{
    public static final String NAME = "mcDonalds";
    private int quantity = 0;
//se implementeaza cod pt orice metoda din interfata
    @Override
    public String deliverFood() {
        quantity++;
        return "burger";
    }

    @Override
    public int getDeliveredQuantity() {
        return quantity;
    }

    @Override
    public String getName() {
        return NAME;
    }

}

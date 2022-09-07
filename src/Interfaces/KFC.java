package Interfaces;

public class KFC implements FoodProvider{
    public static final String NAME = "kfc";        //e unica; tine de clasa
    private int quantity = 0;       //tine de obiect

    @Override
    public String deliverFood() {
        quantity++;
        return "crispy";
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

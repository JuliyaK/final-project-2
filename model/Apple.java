package model;

public class Apple extends Food implements Discountable {
   //цвет яблок
    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price, true);
        this.colour = colour;
    }
    public double getDiscount() {
        return this.colour.equals("red") ? 60 : 0;
    }
}

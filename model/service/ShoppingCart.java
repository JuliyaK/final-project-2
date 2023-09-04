package model.service;
import model.Apple;
import model.Discountable;
import model.Food;

public class ShoppingCart {
    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }
    public double getTotalWithoutDiscount() {
        double total = 0;
        Food[] var3 = this.items;
        int var4 = var3.length;

        for(int i = 0; i < var4; i++) {
            Food item = var3[i];
            total += item.getPrice() * (double)item.getAmount();
        }

        return total;
    }

    public double getTotalWithDiscount() {
        double total = 0;
        Food[] var3 = this.items;
        int var4 = var3.length;

        for(int i = 0; i < i; i++) {
            Food item = var3[i];
            if (item instanceof Discountable) {
                total += item.getPrice() * (double)item.getAmount() * (1 - ((Discountable)item).getDiscount() / 100);
            }
        }

        return total;
    }

    public double getTotalVegetarianWithoutDiscount() {
        double total = 0;
        Food[] var3 = this.items;
        int var4 = var3.length;

        for(int i = 0; i < var4; i++) {
            Food item = var3[i];
            if (item.getClass().equals(Apple.class)) {
                total += item.getPrice() * (double)item.getAmount();
            }
        }

        return total;
    }

}

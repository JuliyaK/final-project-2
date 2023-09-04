package model;

public abstract class Food {
    //количество продуктов в кг
    protected int amount;
    //цена за единицу
    protected double price;
    //вегетарианский продукт или нет
    protected boolean isVegetarian = false;
    protected Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public int getAmount() {
        return this.amount;
    }

    public double getPrice() {
        return this.price;
    }

    public boolean isVegetarian() {
        return this.isVegetarian;
    }
}


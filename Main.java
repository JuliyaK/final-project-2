import model.Apple;
import model.Meat;
import model.Food;
import  model.service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Food meat = new Meat(5, 100.0);
        Food redApples = new Apple(10, 50.0, "red");
        Food greenApples = new Apple(8, 60.0, "green");
        Food[] items = new Food[]{meat, redApples, greenApples};
        ShoppingCart cart = new ShoppingCart(items);
        System.out.println("Общая сумма товаров без скидки: " + cart.getTotalWithoutDiscount());
        System.out.println("Общая сумма товаров со скидкой: " + cart.getTotalWithDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + cart.getTotalVegetarianWithoutDiscount());
    }
}

interface FoodItems{
    String getDescription();
    double getPrice();
}

class PizzaItem implements FoodItems{

    @Override
    public String getDescription() {
        return "Pizza";
    }

    @Override
    public double getPrice() {
        return 10;
    }
}

class BurgerItem implements FoodItems{

    @Override
    public String getDescription() {
        return "Burger";
    }

    @Override
    public double getPrice() {
        return 5;
    }
}

abstract class Decorator implements FoodItems{
    protected FoodItems foodItem;
    public Decorator(FoodItems foodItem){
        this.foodItem = foodItem;
    }
}

class ExtraCheeseDecorator extends Decorator{
    private double cheesePrice;

    public ExtraCheeseDecorator(FoodItems foodItem, double cheesePrice) {
        super(foodItem);
        this.cheesePrice = cheesePrice;
    }

    @Override
    public String getDescription() {
        return this.foodItem.getDescription() + " with Cheese";
    }

    @Override
    public double getPrice() {
        return this.foodItem.getPrice() + this.cheesePrice;
    }
}

class ExtraSauceDecorator extends Decorator{
    private double saucePrice;

    public ExtraSauceDecorator(FoodItems foodItem, double saucePrice) {
        super(foodItem);
        this.saucePrice = saucePrice;
    }

    @Override
    public String getDescription() {
        return this.foodItem.getDescription() + " with Sauce";
    }

    @Override
    public double getPrice() {
        return this.foodItem.getPrice() + this.saucePrice;
    }
}

public class Main {
    public static void main(String[] args) {
        FoodItems pizzaOrder = new PizzaItem();
        pizzaOrder = new ExtraCheeseDecorator(pizzaOrder, 2.5);
        pizzaOrder = new ExtraSauceDecorator(pizzaOrder, 1.5);

        System.out.println(pizzaOrder.getDescription());
        System.out.println(pizzaOrder.getPrice());

    }
}
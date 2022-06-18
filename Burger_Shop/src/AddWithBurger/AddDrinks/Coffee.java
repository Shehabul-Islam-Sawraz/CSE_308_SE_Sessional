package AddWithBurger.AddDrinks;

import AddWithBurger.AddDrinks.Drinks;
import BurgerTypes.Burger;

public class Coffee extends Drinks {
    public Coffee(Burger newBurger) {
        super(newBurger);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 80;
    }
}

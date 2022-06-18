package AddWithBurger.AddDrinks;

import AddWithBurger.BurgerDecorator;
import BurgerTypes.Burger;

public abstract class Drinks extends BurgerDecorator {
    public Drinks(Burger newBurger) {
        super(newBurger);
    }
}

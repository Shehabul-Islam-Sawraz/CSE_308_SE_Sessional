package AddWithBurger.AddDrinks;

import BurgerTypes.Burger;

public class Coke extends Drinks {
    public Coke(Burger newBurger) {
        super(newBurger);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 35;
    }
}

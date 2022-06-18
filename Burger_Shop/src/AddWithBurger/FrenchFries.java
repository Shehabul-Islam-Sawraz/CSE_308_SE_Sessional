package AddWithBurger;

import BurgerTypes.Burger;

public class FrenchFries extends BurgerDecorator {
    public FrenchFries(Burger newBurger) {
        super(newBurger);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 60;
    }
}

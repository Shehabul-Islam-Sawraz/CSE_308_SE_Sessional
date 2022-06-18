package AddWithBurger;

import BurgerTypes.Burger;

public class ExtraCheese extends BurgerDecorator {
    public ExtraCheese(Burger newBurger) {
        super(newBurger);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 20;
    }
}

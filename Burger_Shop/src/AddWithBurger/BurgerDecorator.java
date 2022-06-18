package AddWithBurger;

import BurgerTypes.Burger;

public abstract class BurgerDecorator implements Burger {
    private Burger newBurger;

    public BurgerDecorator(Burger newBurger) {
        this.newBurger = newBurger;
    }

    @Override
    public int getPrice() {
        return newBurger.getPrice();
    }
}

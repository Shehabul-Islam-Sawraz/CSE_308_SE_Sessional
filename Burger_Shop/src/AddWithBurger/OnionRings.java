package AddWithBurger;

import BurgerTypes.Burger;

public class OnionRings extends BurgerDecorator{
    public OnionRings(Burger newBurger) {
        super(newBurger);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 20;
    }
}

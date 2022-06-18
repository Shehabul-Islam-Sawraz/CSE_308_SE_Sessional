package AddWithBurger.AddDrinks;

import BurgerTypes.Burger;

public class Water extends Drinks {
    public Water(Burger newBurger) {
        super(newBurger);
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 15;
    }
}

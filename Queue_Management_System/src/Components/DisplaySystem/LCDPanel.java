package Components.DisplaySystem;

import Components.Part;

public class LCDPanel extends DisplaySystem {
    @Override
    public double getPrice() {
        return 50;
    }

    @Override
    public String partDescription() {
        return "A LCD Display Panel having price of "+ getPrice();
    }
}

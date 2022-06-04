package Components.ControlUnit;

import Components.Part;

public class ATMega32 implements Part {
    @Override
    public double getPrice() {
        return 100;
    }

    @Override
    public String partDescription() {
        return "An ATMega32 Controller Unit having price of "+ getPrice();
    }
}

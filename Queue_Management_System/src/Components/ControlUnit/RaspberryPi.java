package Components.ControlUnit;

import Components.Part;

public class RaspberryPi implements Part {
    @Override
    public double getPrice() {
        return 250;
    }

    @Override
    public String partDescription() {
        return "An Raspberry Pi Controller Unit having price of "+ getPrice();
    }
}

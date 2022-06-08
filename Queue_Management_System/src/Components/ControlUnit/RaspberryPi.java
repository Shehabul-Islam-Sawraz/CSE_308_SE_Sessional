package Components.ControlUnit;

import Components.Part;

public class RaspberryPi extends ControlUnit {
    @Override
    public double getPrice() {
        return 250;
    }

    @Override
    public String partDescription() {
        return "An Raspberry Pi Controller Unit for receiving and processing data\nfrom web-based control unit having price of "+ getPrice()+" tk. ";
    }
}

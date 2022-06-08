package Components.ControlUnit;

import Components.Part;

public class ATMega32 extends ControlUnit {
    @Override
    public double getPrice() {
        return 100;
    }

    @Override
    public String partDescription() {
        return "An ATMega32 Controller Unit for receiving and processing data\nfrom web-based control unit having price of "+ getPrice()+" tk. ";
    }
}

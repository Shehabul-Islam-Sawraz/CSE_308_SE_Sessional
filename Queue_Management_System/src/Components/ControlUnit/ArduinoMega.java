package Components.ControlUnit;

import Components.Part;

public class ArduinoMega extends ControlUnit {
    @Override
    public double getPrice() {
        return 200;
    }

    @Override
    public String partDescription() {
        return "An Arduino Mega Controller Unit for receiving and processing data\nfrom web-based control unit having price of "+ getPrice()+" tk. ";
    }
}

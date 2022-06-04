package Components.ControlUnit;

import Components.Part;

public class ArduinoMega implements Part {
    @Override
    public double getPrice() {
        return 200;
    }

    @Override
    public String partDescription() {
        return "An Arduino Mega Controller Unit having price of "+ getPrice();
    }
}

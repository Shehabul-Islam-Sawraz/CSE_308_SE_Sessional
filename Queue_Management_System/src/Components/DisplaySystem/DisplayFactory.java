package Components.DisplaySystem;

import Components.ControlUnit.ATMega32;
import Components.ControlUnit.ArduinoMega;
import Components.ControlUnit.RaspberryPi;
import Components.Part;

public class DisplayFactory {
    public Part getDisplay(String name){
        if(name==null){
            return null;
        }
        if(name.equalsIgnoreCase("LCD")){
            return new LCDPanel();
        }
        else if(name.equalsIgnoreCase("LED")) {
            return new LEDPanel();
        }
        return null;
    }
}

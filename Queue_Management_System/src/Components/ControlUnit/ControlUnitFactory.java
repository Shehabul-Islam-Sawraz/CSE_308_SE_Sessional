package Components.ControlUnit;

import Components.Part;

public class ControlUnitFactory {
    public Part getControlUnit(String name){
        if(name==null){
            return null;
        }
        if(name.equalsIgnoreCase("ATMega32")){
            return new ATMega32();
        }
        else if(name.equalsIgnoreCase("ArduinoMega")){
            return new ArduinoMega();
        }
        else if(name.equalsIgnoreCase("RaspberryPi")){
            return new RaspberryPi();
        }
        return null;
    }
}

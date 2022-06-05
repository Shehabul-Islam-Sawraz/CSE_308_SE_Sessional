package Components.CommModule;

import Components.Part;

public class ModuleFactory {
    public Part getCommModule(String name){
        if(name==null){
            return null;
        }
        if(name.equalsIgnoreCase("WiFi")){
            return new WiFiModule();
        }
        else if(name.equalsIgnoreCase("SIM")){
            return new SIMCard();
        }
        return null;
    }
}

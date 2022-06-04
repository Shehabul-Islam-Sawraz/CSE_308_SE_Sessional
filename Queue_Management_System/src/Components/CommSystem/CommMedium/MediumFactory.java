package Components.CommSystem.CommMedium;

import Components.Part;

public class MediumFactory {
    public Part getCommMedium(String name){
        if(name==null){
            return null;
        }
        if(name.equalsIgnoreCase("Broadband")){
            return new Broadband();
        }
        else if(name.equalsIgnoreCase("Data")){
            return new MobileData();
        }
        return null;
    }
}

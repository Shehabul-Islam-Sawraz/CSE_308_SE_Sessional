package Factory;

import Interface.ISystemBuilder;
import ProductsName.Deluxe;
import ProductsName.Optimal;
import ProductsName.Poor;

public class SystemFactory extends AbstractFactory{

    @Override
    public ISystemBuilder getSystem(String name) {
        if(name==null){
            return null;
        }
        if(name.equalsIgnoreCase("Deluxe")){
            return new Deluxe();
        }
        else if(name.equalsIgnoreCase("Optimal")){
            return new Optimal();
        }
        else if(name.equalsIgnoreCase("Poor")){
            return new Poor();
        }
        return null;
    }
}

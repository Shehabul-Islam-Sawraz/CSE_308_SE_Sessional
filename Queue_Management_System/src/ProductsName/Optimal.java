package ProductsName;

import Components.ApplicationSoft.Application;
import Components.CommMedium.MediumFactory;
import Components.CommModule.ModuleFactory;
import Components.ControlUnit.ControlUnitFactory;
import Components.DisplaySystem.DisplayFactory;
import Interface.ISystemBuilder;
import Model.Product;

public class Optimal implements ISystemBuilder {
    private Product product = new Product();
    private ControlUnitFactory controlUnitFactory = new ControlUnitFactory();
    private DisplayFactory displayFactory = new DisplayFactory();
    private ModuleFactory moduleFactory = new ModuleFactory();
    private MediumFactory mediumFactory = new MediumFactory();

    @Override
    public void addCommChannel(String commChannel) {
        if(commChannel.toLowerCase().contains("wifi") || commChannel.toLowerCase().contains("broadband")){
            product.add(moduleFactory.getCommModule("WiFi"));
            product.add(mediumFactory.getCommMedium("Broadband"));
        }
        else if(commChannel.toLowerCase().contains("mobile") || commChannel.toLowerCase().contains("data") || commChannel.toLowerCase().contains("sim")){
            product.add(moduleFactory.getCommModule("SIM"));
            product.add(mediumFactory.getCommMedium("Data"));
        }
    }

    @Override
    public void addApplication() {
        product.add(new Application());
    }

    @Override
    public void addDisplayUnits(int noOfDisplayUnits) {
        product.add(controlUnitFactory.getControlUnit("ArduinoMega"));
        for(int i=0;i<noOfDisplayUnits;i++){
            product.add(displayFactory.getDisplay("LED"));
        }
    }

    @Override
    public Product getQueue() {
        return product;
    }
}

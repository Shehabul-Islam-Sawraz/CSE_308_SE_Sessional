package Components.CommModule;

import Components.Part;

public class WiFiModule implements Part {
    @Override
    public double getPrice() {
        return 4000;
    }

    @Override
    public String partDescription() {
        return "A Wifi Module Unit having price of "+ getPrice();
    }
}

package Components.CommSystem.CommMedium;

import Components.Part;

public class MobileData implements Part {
    @Override
    public double getPrice() {
        return 6000;
    }

    @Override
    public String partDescription() {
        return "Mobile Data Service!!";
    }
}

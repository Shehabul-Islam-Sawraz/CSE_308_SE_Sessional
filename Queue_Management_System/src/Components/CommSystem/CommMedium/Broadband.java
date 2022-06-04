package Components.CommSystem.CommMedium;

import Components.Part;

public class Broadband implements Part {
    @Override
    public double getPrice() {
        return 1200;
    }

    @Override
    public String partDescription() {
        return "Broadband connection!!";
    }
}

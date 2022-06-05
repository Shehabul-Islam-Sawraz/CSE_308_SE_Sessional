package Components.CommModule;

import Components.Part;

public class SIMCard implements Part {
    @Override
    public double getPrice() {
        return 200;
    }

    @Override
    public String partDescription() {
        return "A SIM Card having price of "+ getPrice();
    }
}

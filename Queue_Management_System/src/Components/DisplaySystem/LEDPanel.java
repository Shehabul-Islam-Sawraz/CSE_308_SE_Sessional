package Components.DisplaySystem;

import Components.Part;

public class LEDPanel implements Part {
    @Override
    public double getPrice() {
        return 40;
    }

    @Override
    public String partDescription() {
        return "A LED Display Panel having price of "+ getPrice();
    }
}

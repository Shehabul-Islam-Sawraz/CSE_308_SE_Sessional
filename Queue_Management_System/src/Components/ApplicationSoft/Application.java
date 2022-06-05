package Components.ApplicationSoft;

import Components.Part;

public class Application implements Part {
    @Override
    public double getPrice() {
        return 3000;
    }

    @Override
    public String partDescription() {
        return "Web-Based Controller Application having price of "+getPrice();
    }
}

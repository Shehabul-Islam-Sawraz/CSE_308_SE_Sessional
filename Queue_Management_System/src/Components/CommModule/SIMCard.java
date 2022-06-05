package Components.CommModule;

public class SIMCard extends CommunicationModule {
    @Override
    public double getPrice() {
        return 200;
    }

    @Override
    public String partDescription() {
        return "A SIM Card having price of "+ getPrice();
    }
}

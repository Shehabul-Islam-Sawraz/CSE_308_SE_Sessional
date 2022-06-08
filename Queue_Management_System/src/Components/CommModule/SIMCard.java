package Components.CommModule;

public class SIMCard extends CommunicationModule {
    @Override
    public double getPrice() {
        return 200;
    }

    @Override
    public String partDescription() {
        return "A SIM Card, for providing data service, having price of "+ getPrice()+" tk. ";
    }
}

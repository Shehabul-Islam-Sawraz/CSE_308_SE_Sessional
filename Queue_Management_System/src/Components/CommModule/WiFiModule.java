package Components.CommModule;

public class WiFiModule extends CommunicationModule {
    @Override
    public double getPrice() {
        return 4000;
    }

    @Override
    public String partDescription() {
        return "A Wifi Module Unit, for setting up wifi connection, having price of "+ getPrice()+" tk. ";
    }
}

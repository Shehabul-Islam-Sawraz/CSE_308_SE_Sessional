package Components.CommMedium;

public class Broadband extends CommunicationSystem {
    @Override
    public double getPrice() {
        return 1200;
    }

    @Override
    public String partDescription() {
        return "Broadband connection!!";
    }
}

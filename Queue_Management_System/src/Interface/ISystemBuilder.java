package Interface;

import Model.Product;

public interface ISystemBuilder {
    void addDisplayUnits(int noOfDisplayUnits);
    void addCommChannel(String commChannel);
    void addApplication();
    Product getQueue();
}

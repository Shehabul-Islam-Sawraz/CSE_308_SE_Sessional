package Interface;

import Model.Product;

public interface ISystemBuilder {
    void addCommChannel(String commChannel);
    void addApplication();
    void addDisplayUnits(int noOfDisplayUnits);
    Product getQueue();
}

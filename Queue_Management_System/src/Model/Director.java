package Model;

import Interface.ISystemBuilder;

public class Director {
    ISystemBuilder systemBuilder;

    public void construct(ISystemBuilder systemBuilder, String commChannel, int noOfDisplayUnits){
        try {
            this.systemBuilder = systemBuilder;
            systemBuilder.addCommChannel(commChannel);
            systemBuilder.addDisplayUnits(noOfDisplayUnits);
            systemBuilder.addApplication();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

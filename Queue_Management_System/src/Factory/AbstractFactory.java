package Factory;

import Interface.ISystemBuilder;

public abstract class AbstractFactory {
    public abstract ISystemBuilder getSystem(String name);
}

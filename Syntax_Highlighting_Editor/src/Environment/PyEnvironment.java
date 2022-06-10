package Environment;

import Fonts.PyFont;
import Interfaces.EnvironmentFactory;
import Parser.PyParser;

public class PyEnvironment implements EnvironmentFactory {

    @Override
    public CodeEnvironment getEnvironment() {
        return new CodeEnvironment(new PyFont(), new PyParser());
    }

    @Override
    public String getDescription() {
        return "Environment for handling .py files activated!!";
    }


}

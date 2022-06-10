package Environment;

import Fonts.CFont;
import Interfaces.EnvironmentFactory;
import Parser.CParser;

public class CEnvironment implements EnvironmentFactory {
    @Override
    public CodeEnvironment getEnvironment() {
        return new CodeEnvironment(new CFont(), new CParser());
    }

    @Override
    public String getDescription() {
        return "Environment for handling .c files activated!!";
    }
}

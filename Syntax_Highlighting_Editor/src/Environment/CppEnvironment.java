package Environment;

import Fonts.CppFont;
import Interfaces.EnvironmentFactory;
import Parser.CppParser;

public class CppEnvironment implements EnvironmentFactory {
    @Override
    public CodeEnvironment getEnvironment() {
        return new CodeEnvironment(new CppFont(), new CppParser());
    }

    @Override
    public String getDescription() {
        return "Environment for handling .cpp files activated!!";
    }
}

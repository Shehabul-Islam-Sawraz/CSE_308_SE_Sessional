package Environment;

import Interfaces.Fonts;
import Interfaces.Parser;

public class CodeEnvironment {
    private Fonts font;
    private Parser parser;

    public CodeEnvironment(Fonts font, Parser parser) {
        this.font = font;
        this.parser = parser;
    }

    public Fonts getFont() {
        return font;
    }

    public Parser getParser() {
        return parser;
    }
}

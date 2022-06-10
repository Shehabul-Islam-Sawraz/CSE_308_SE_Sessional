import Environment.CEnvironment;
import Environment.CodeEnvironment;
import Environment.CppEnvironment;
import Environment.PyEnvironment;
import Interfaces.EnvironmentFactory;

public class Editor {
    private static Editor editor = null;
    private CodeEnvironment codeEnvironment = null;
    private EnvironmentFactory environmentFactory = null;

    private Editor() {

    }

    public static Editor getEditor() {
        if(editor == null) {
            editor = new Editor();
            System.out.println("Editor instantiated for Syntax Highlighting!!");
        } else {
            System.out.println("Editor already exists");
        }
        return editor;
    }

    public void handleExtension(String extension){
        switch (extension){
            case "py":
                environmentFactory = new PyEnvironment();
                break;
            case "c":
                environmentFactory = new CEnvironment();
                break;
            case "cpp":
                environmentFactory = new CppEnvironment();
                break;
            default:
                environmentFactory = null;
                System.out.println("Invalid extension!!");
                break;
        }
        if(environmentFactory!=null){
            codeEnvironment = environmentFactory.getEnvironment();
            System.out.println(environmentFactory.getDescription());
            System.out.println(codeEnvironment.getFont().getFont());
            System.out.println(codeEnvironment.getParser().getParser());
        }
    }
}

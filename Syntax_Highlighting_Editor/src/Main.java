import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Editor editor = Editor.getEditor();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("Enter file name(Q for exit): ");
            if(sc.nextLine().equals("Q")){
                break;
            }
            String s = sc.nextLine();
            String [] words = s.split("\\.");
            String extension = words[words.length-1];
            editor.handleExtension(extension);
        }
    }
}
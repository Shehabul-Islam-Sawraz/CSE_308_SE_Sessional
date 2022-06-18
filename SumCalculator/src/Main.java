
public class Main {
    public static void main(String[] args) {
        FileController fileController = new FileController();
        int sum = fileController.calculateSum("input.txt");
        System.out.println("Sum is: "+sum);
    }
}
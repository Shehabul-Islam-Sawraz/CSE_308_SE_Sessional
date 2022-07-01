
public class Main {
    public static void main(String[] args) {
        SumAdapter sumAdapter = new SumAdapter();
        int sum = sumAdapter.calculateSum("input.txt");
        System.out.println("Sum is: "+sum);
    }
}

public class SumAdapter implements SumCounter {
    private SumFunction sumFunction;
    @Override
    public int calculateSum(String fileName) {
        sumFunction = new SumFunction();
        return sumFunction.calculateSum(fileName);
    }
}

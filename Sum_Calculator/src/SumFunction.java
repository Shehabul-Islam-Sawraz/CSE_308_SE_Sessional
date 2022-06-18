import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SumFunction {
    public int calculateSum(String fileName){
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            int sum = 0;
            String line;
            while((line=br.readLine())!=null) {
                String[] numbers = line.split(" ");
                for (String str : numbers) {
                    sum += Integer.parseInt(str);
                }
            }
            br.close();
            return sum;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

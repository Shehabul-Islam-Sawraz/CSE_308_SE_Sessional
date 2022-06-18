import java.io.*;

public class FileController {
    private SumAdapter sumAdapter;
    public int calculateSum(String fileName){
        try{
            sumAdapter = new SumAdapter();
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String intermediate = "spaceControl.txt";
            BufferedWriter bw = new BufferedWriter(new FileWriter(intermediate));
            String line;
            while ((line=br.readLine())!=null){
                String[] numbers = line.split("~");
                for(String str: numbers){
                    bw.write(str);
                    bw.write(" ");
                }
                bw.flush();
            }
            int sum = sumAdapter.calculateSum(intermediate);
            br.close();
            bw.close();

            File deleteFile = new File(intermediate);
            deleteFile.delete();
            return sum;
        } catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }
}

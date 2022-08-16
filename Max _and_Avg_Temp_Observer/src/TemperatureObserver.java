import java.util.Random;

public class TemperatureObserver {
    static Random rand = new Random();
    private static Double getRandomTemp() {
        return rand.nextDouble(50,122);
    }

    public static void main(String[] args) {
        TempSensor sensor = new TempSensor();
        AverageTempObserver averageTempObserver = new AverageTempObserver();
        MaxTempObserver maxTempObserver = new MaxTempObserver();
        sensor.addObserver(averageTempObserver);
        sensor.addObserver(maxTempObserver);
        for (int i=0;i<48;i++){
            getTime(i);
            Double d = getRandomTemp();
            System.out.println("Current temperature: " + d);
            sensor.setTemp(d);
        }
    }

    private static void getTime(int i) {
        if(i%2==0){
            int x = ((12)+(i/2))%12;
            if(x==0){
                x=12;
            }
            if(i>=24){
                System.out.println("At " + x + ":00 pm");
            }
            else{
                System.out.println("At " + x + ":00 am");
            }
        }
        else{
            int x = ((12)+(i/2))%12;
            if(x==0){
                x=12;
            }
            if(i>=24){
                System.out.println("At " + x + ":30 pm");
            }
            else{
                System.out.println("At " + x + ":30 am");
            }
        }
    }
}

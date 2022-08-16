public class AverageTempObserver extends Observer{
    @Override
    public void update(double temp) {
        double avgTemp = (this.temperature + temp)/2;
        System.out.println("Average temperature has changed from "+ String.valueOf(this.temperature) +
                " degree F to " + String.valueOf(avgTemp) + " degree F");
        this.temperature = avgTemp;
    }
}

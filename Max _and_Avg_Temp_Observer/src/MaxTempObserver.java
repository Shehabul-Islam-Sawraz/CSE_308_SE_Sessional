public class MaxTempObserver extends Observer{
    @Override
    public void update(double temp) {
        if(this.temperature<temp){
            System.out.println("Maximum temperature has changed from " + this.temperature +
                    " degree F to " + temp + " degree F\n\n");
            this.temperature = temp;
        }
        else {
            System.out.println("Maximum temperature hasn't changed in this meantime!!\n\n");
        }
    }
}

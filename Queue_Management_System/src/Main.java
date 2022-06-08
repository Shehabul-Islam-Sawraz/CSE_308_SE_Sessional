import Factory.AbstractFactory;
import Factory.SystemFactory;
import Interface.ISystemBuilder;
import Model.Director;
import Model.Product;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        AbstractFactory abstractFactory = new SystemFactory();
        Director director = new Director();
        BufferedReader br = null;
        ISystemBuilder systemBuilder = null;
        Product product = null;
        String st;
        String[] words;
        try {
            br = new BufferedReader(new FileReader("in.txt"));
            while ((st= br.readLine())!=null){
                words = st.split(" ");

                systemBuilder = abstractFactory.getSystem(words[0]);
                director.construct(systemBuilder, words[1], Integer.parseInt(words[2]));
                product = systemBuilder.getQueue();
                product.show();
                System.out.println("----------------------------------------------------");
            }
        } catch (Exception e) {
            //System.out.println("File not found");
            e.printStackTrace();
        }
    }
}
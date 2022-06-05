package Model;

import Components.CommMedium.Broadband;
import Components.CommMedium.MobileData;
import Components.Part;

import java.util.LinkedList;

public class Product {
    private LinkedList<Part> parts;

    public Product(){
        parts = new LinkedList<>();
    }

    public void add(Part part){
        parts.addLast(part);
    }

    public void show(){
        double totalCost = 0.0,yearlyCost = 0.0;
        System.out.println("The parts of the product are as follows: ");
        for(Part p:parts){
            if(p instanceof Broadband || p instanceof MobileData){
                yearlyCost+=12* p.getPrice();
            }
            else{
                totalCost+=p.getPrice();
            }
            System.out.println(p.partDescription());
        }
        System.out.println();
        System.out.print("Total cost for the components of the queue management system is: "+totalCost+" tk. ");
        System.out.println("Having additional communication cost of: "+yearlyCost/12.0+" tk/per month.");
        System.out.println("Total yearly communication cost is: "+yearlyCost+" tk.");
    }
}

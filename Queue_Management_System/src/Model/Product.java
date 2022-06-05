package Model;

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

    }
}

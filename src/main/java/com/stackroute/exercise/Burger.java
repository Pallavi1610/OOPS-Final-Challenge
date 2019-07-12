package main.java.com.stackroute.exercise;

import java.util.ArrayList;
import java.util.List;

public class Burger {
    private String name;
    private String breadRollType;
    private boolean meat;
    private double base_price;
    public double addedPrice = 10.00;
    private double final_price;

    public Burger(String name, String breadRollType) {
        this.name = name;
        this.breadRollType = breadRollType;
        this.meat = true;
        this.base_price = 20;
    }

    public List<String> additions = new ArrayList<String>();


    public void addAdditions(String lettuce, String tomato, String carrot, String cheese){
        System.out.println("Additional additions you added: ");
        if(lettuce =="add"){
            additions.add(lettuce);
            System.out.println("LETTUCE");
        }
        if(tomato == "add"){
            additions.add(tomato);
            System.out.println("TOMATO");
        }
        if(carrot == "add"){
            additions.add(carrot);
            System.out.println("CARROT");
        }
        if(cheese== "add"){
            additions.add(cheese);
            System.out.println("CHEESE");
        }
    }

    public String calculatePrice(){
        this.final_price = this.base_price + addedPrice * this.additions.size();
        return "(" + this.name + ", " +  this.breadRollType + "): " + this.final_price;
    }

    public void additionalPrice(){
        double additionalPrice = this.addedPrice * this.additions.size();
        System.out.println("Additional Price: " + additionalPrice);
    }

    public double getBase_price() {
        return base_price;
    }

    public void setBase_price(double base_price) {
        this.base_price = base_price;
    }

    public double getFinal_price() {
        return final_price;
    }

}

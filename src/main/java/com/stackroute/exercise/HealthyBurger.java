package main.java.com.stackroute.exercise;

public class HealthyBurger extends Burger {
    public HealthyBurger() {
        super("Health Burger", "Brown rye bread roll");
    }

    public void addAdditions(String lettuce, String tomato, String carrot,String cheese, String mustard, String ketchup) {
        super.addAdditions(lettuce, tomato, carrot, cheese);
        if(mustard == "add"){
            additions.add(mustard);
            System.out.println("MUSTARD");
        }
        if(ketchup == "add"){
            additions.add(ketchup);
            System.out.println("KETCHUP");
        }

    }

    @Override
    public void additionalPrice() {
        super.additionalPrice();
    }

    @Override
    public double getBase_price() {
        return super.getBase_price();
    }

    @Override
    public String calculatePrice() {
        return super.calculatePrice();
    }




}


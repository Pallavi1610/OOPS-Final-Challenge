package main.java.com.stackroute.exercise;

public class DeluxeBurger extends Burger {
    public DeluxeBurger() {
        super("Deluxe Burger", "Deluxe huge burger");

    }

    public void addAdditions(String chips, String drinks) {

        System.out.println("Additional additions you added: ");
        if(chips == "add"){
            additions.add(chips);
            System.out.println("CHIPS");
        }
        if(drinks == "add"){
            additions.add(drinks);
            System.out.println("DRINKS");
        }
    }

    @Override
    public String calculatePrice() {

        return super.calculatePrice();
    }

    @Override
    public void additionalPrice() {

        super.additionalPrice();
    }

    @Override
    public double getBase_price() {

        return super.getBase_price();
    }


}

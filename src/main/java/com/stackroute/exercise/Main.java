package main.java.com.stackroute.exercise;

public class Main {
    public static void main(String[] args) {


    Burger myBurger = new Burger("Chicken burger", "White seasame bread");
		myBurger.addAdditions("add", "add", "don't add", "don't add");
		System.out.println(myBurger.calculatePrice());
		myBurger.additionalPrice();
        System.out.println();

    HealthyBurger newBurger = new HealthyBurger();
		newBurger.addAdditions("add", "add", "don't add", "add", "don't add", "add");
		System.out.println(newBurger.calculatePrice());
		newBurger.additionalPrice();
        System.out.println();


    DeluxeBurger lastBurger = new DeluxeBurger();
		lastBurger.addAdditions("don't add", "add");
		System.out.println(lastBurger.calculatePrice());
		lastBurger.additionalPrice();
        System.out.println();
}

}



package day48_encapsulation.pizza;

public class Pizza {

    private String size;
    private int numberOfToppings;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {

        if (size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large")) {
            this.size = size;
        }
    }

    public int getNumberOfToppings() {
        return numberOfToppings;
    }

    public void setNumberOfToppings(int numberOfToppings) {
        if (numberOfToppings > 0) {
            this.numberOfToppings = numberOfToppings;
        }
    }

    public Pizza (String size, int numberOfToppings){
        setSize(size);
        setNumberOfToppings(numberOfToppings);
    }

    public double calculatePrice(){

        if (size == null){
            return -1;
        }
        if (size.equalsIgnoreCase("small")){
            return 4 + numberOfToppings * 0.75;
        } else if (size.equalsIgnoreCase("medium")){
            return 6 + numberOfToppings * 0.75;
        } else {
            return 8 + numberOfToppings * 0.75;
        }
    }

    public String toString (){
        return "Your " + size + " pizza has " + numberOfToppings + " toppings. The price of your pizza is $" + calculatePrice();
    }


}

/*
create a class called Pizza

        - data:

            size (String), number of toppings

        - constructor

            - create a constructor that creates a Pizza object with the length and the width

            	call setters here

        - encapsulate the Pizza class

        	- setter condition:
        		size can only be:
        			small, medium, or large

        		number of toppings must be a positive number

        - other methods methods:

            - calculatePrice()
            		calculate the price of the pizza based on:

            			small base: $4
            			medium base: $6
            			large base: $8

            			each topping adds $0.75 to the price

            			calculate the total price and return the cost

            - toString()
                print the size, number of toppings, and cost of the pizza

    Create a separate class to create and test the Pizza objects
 */
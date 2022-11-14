package class26;

/*Create a class Insurance that will have an attribute as insuranceName and unimplemented behaviour as getQuote and cancelInsurance.
Create 3 subclasses Car, Pet, Health.
Car class has it’s own attribute as carModel and Class Pet has petType attribute.
Create 3 objects of the sub classes and store them in ArrayList.
Using for loop/advanced for loop/ iterator access all methods of the class.
 */

import java.util.ArrayList;

public abstract class InsuranceHW {

    String insuranceName;

    abstract double getQuote();

    abstract void cancelInsurance();

}

class Car extends InsuranceHW {

    String carModel;

    @Override
    double getQuote() {
        return 0;
    }

    @Override
    void cancelInsurance() {

        System.out.println("Cancel car insurance");
    }
}

class Pet extends InsuranceHW {

    String petType;

    @Override
    double getQuote() {
        return 0;
    }

    @Override
    void cancelInsurance() {

        System.out.println("Cancel pet insurance");

    }
}

class Health extends InsuranceHW {
    @Override
    double getQuote() {
        return 0;
    }
    @Override
    void cancelInsurance() {
        System.out.println("Cancel health insurance");
    }
}

class Test {
    public static void main(String[] args) {

        ArrayList<InsuranceHW> arr = new ArrayList<>();
        arr.add(new Car());
        arr.add(new Health());
        arr.add(new Pet());

        for (var obj : arr) {

            obj.cancelInsurance();
            obj.getQuote();
        }
    }
}


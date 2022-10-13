package Class21HW;
/*Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest based on the given balance.
        Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
        Call the method by creating an object of each of the three classes.*/
public class CreditCard {
    double balance;
    double interest;
    double getInterest(double balance) {
        interest = balance*0.15;
        System.out.println(interest);
        return interest;
    }
}
class Visa extends CreditCard{
}
class AX extends CreditCard {
    double getInterest(double balance) {
        interest = balance*0.17;
        System.out.println(interest);
        return interest;
    }
}

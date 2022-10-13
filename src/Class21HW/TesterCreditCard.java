package Class21HW;

public class TesterCreditCard {

    public static void main(String[] args) {
        CreditCard cardObj = new CreditCard();
        CreditCard visaObj = new Visa();
        CreditCard amexObj = new AX();

        cardObj.getInterest(20000);
        visaObj.getInterest(3000);
        amexObj.getInterest(17000);

    }
}

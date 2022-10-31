package class25;

public class WrapperClasses {

    public static void main(String[] args) {
         int num =10;
         
         //manual conversion/boxing 
        
        Integer wrappedNum = Integer.valueOf(num);
        
        //Auto boxing 
        
        Integer wrappedNum1 = 10;

        System.out.println("wrappedNum1 = " + wrappedNum1);

        // manual conversion/ unboxing

        int num1 = wrappedNum.intValue();

        //auto unboxing

        int num2 = wrappedNum1;

        System.out.println("num2 = " + num2);
    }
}

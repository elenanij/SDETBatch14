package replit;

import java.util.Scanner;

public class Main223 {
     public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            int num = scan.nextInt();

            for(int i=0; i<num; i++) {

                for(int j=num-i-1; j>0; j--){

                    System.out.print(" ");
                }

                for(int k=1; k<=1+(i*2); k++) {


                    System.out.print(num);

                }

                System.out.println();
            }

        }

    }

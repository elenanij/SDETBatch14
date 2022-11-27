package replit;

public class Main226 {

        public static void main(String[] args) {
            System.out.println(reverse("I am a java Programmer"));
        }
        public static String reverse(String strToRev){

            String[] arr = strToRev.split(" ");

            String result = "";

            for(int i= arr.length-1; i>=0; i--) {

                String word = arr[i];

                result.concat(word+ " ");
            }

            return result.trim();

        }
    }


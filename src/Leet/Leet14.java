package Leet;

public class Leet14 {

    public  String longestCommonPrefix(String[] strs) {

        String common = "";


        String shortest = strs[0];

        for(String str:strs) {

            if (str.length() < shortest.length()) {

                shortest = str;
            }
        }

        boolean finish = false;

            for(int i= 0; i<shortest.length(); i++) {

                if (finish) {break;}

                for(int k =0; k<(strs.length-1); k++) {


                    if (strs[k].charAt(i)!=strs[k+1].charAt(i)) {
                        finish = true;
                        break;
                    }

                    if (k+2 == strs.length) {

                        common+= strs[0].charAt(i);
                    }
                }
            }

return common;
    }

    public static void main(String[] args) {

        Leet14 obj =new Leet14();

String[] arr = {"cir", "car"};
        System.out.println(obj.longestCommonPrefix(arr));

    }
}


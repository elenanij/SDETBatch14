package Leet;

public class Leet20Try2 {

    public boolean isValid(String s) {

        boolean solution = true;

        // case - if open bracket of one type is next to closed bracket of a different type


            if ((s.charAt(s.length()-1) == '(') || (s.charAt(s.length()-1) == '{') || (s.charAt(s.length()-1) == '[')) {

                solution = false;

            }

            //case - if open bracket is on the last position

            if (solution) {


                for (int i = 0; i < s.length() - 1; i++) {


                    if ((s.charAt(i) == '(' && (s.charAt(i + 1) == ']' || s.charAt(i + 1) == '}')) || (s.charAt(i) == '[' && (s.charAt(i + 1) == ')' || s.charAt(i + 1) == '}')) || (s.charAt(i) == '{' && (s.charAt(i + 1) == ']' || s.charAt(i + 1) == ')'))) {

                        solution = false;
                    }
                }
            }

// case - if open and closed bracket of different types surround a {} or [] or ()

        for (int i =1; i < s.length()-2; i++ ) {

            if((s.charAt(i)=='(' && s.charAt(i+1) == ')') || (s.charAt(i)=='[' && s.charAt(i+1) == ']') || (s.charAt(i)=='{' && s.charAt(i+1) == '}')) {

                if ((s.charAt(i-1) == '(') &&(s.charAt(i+2) == '}' || s.charAt(i+2) == ']') || (s.charAt(i-1) == '{') &&(s.charAt(i+2) == ')' || s.charAt(i+2) == ']') || (s.charAt(i-1) == '[') &&(s.charAt(i+2) == '}' || s.charAt(i+2) == ')')) {

                    solution = false;
                }

            }
        }

            //main solution

        if (solution) {

            StringBuilder sb = new StringBuilder(s);

            int length = s.length();

            for (int i = 0; i < length; ) {

                if (sb.charAt(i) == '(') {

                    for (int k = i + 1; k < length; k++) {

                        if (sb.charAt(k) == ')') {

                                sb.deleteCharAt(i);
                                sb.deleteCharAt(k - 1);
                                break;
                            }

                        }
                    }

                else if (sb.charAt(i) == '[') {

                    for (int k = 1; k < length; k++) {

                        if (sb.charAt(k) == ']') {

                                sb.deleteCharAt(i);
                                sb.deleteCharAt(k - 1);
                                break;

                            }
                        }
                    }


                    else if (sb.charAt(i) == '{') {


                    for (int k = 1; k < length; k++) {

                        if (sb.charAt(k) == '}') {

                                    sb.deleteCharAt(i);
                                    sb.deleteCharAt(k - 1);
                                    break;
                                }

                        }
                    }


                length -= 2;

                if (sb.toString().isEmpty()) {

                    break;
                }
            }

            solution = sb.toString().isEmpty();

        }
        return solution;

    }


        public static void main (String[]args){

            Leet20Try2 obj = new Leet20Try2();

            System.out.println(obj.isValid("[([]])"));

        }
    }



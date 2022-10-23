package Leet;

public class Leet20 {

    public boolean isValid(String s) {

        boolean solution = false;

        for (int i = 0; i < s.length() - 1; i += 2) {

            if ((s.charAt(i) == '(' && s.charAt(i + 1) == ')') || (s.charAt(i) == '[' && s.charAt(i + 1) == ']') || (s.charAt(i) == '{' && s.charAt(i + 1) == '}')) {

                if (i + 2 == s.length()) {

                    solution = true;
                }

            } else {

                break;
            }

        }

        if (!solution) {

            for (int i = 0; i < s.length() - 2; i++) {

                if ((s.charAt(i) == '(' && s.charAt(i + 1) == ')') || (s.charAt(i) == '[' && s.charAt(i + 1) == ']') || (s.charAt(i) == '{' && s.charAt(i + 1) == '}')) {

                    int j = i + 2;

                    for (int k = i - 1; k >= 0; k--) {

                        if ((s.charAt(k) == '(' && s.charAt(j) == ')') || (s.charAt(k) == '[' && s.charAt(j) == ']') || (s.charAt(k) == '{' && s.charAt(j) == '}')) {

                            if (k == 0 && j == s.length() - 1) {

                                solution = true;
                            }

                            j++;
                        } else if ((s.charAt(j) == '(' && s.charAt(j+1) == ')') || (s.charAt(j) == '[' && s.charAt(j+1) == ']') || (s.charAt(j) == '{' && s.charAt(j+1) == '}')){

                            continue;
                        }

                        else {

                            break;
                        }
                    }
                }
            }
        }

        return solution;

    }

    public static void main(String[] args) {
        Leet20 obj = new Leet20();

        System.out.println(obj.isValid("(([]){})"));
    }
}




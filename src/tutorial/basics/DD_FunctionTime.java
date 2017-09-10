package tutorial.basics;

import java.util.Scanner;

public class DD_FunctionTime {
    public static void main(String ... args) {
        int firstNum = getUserNum();
        char operator = getUserOperator();
        int secondNum = getUserNum();



        main();
    }

    static int getUserNum() {
        System.out.println("Gimme a number");
        return new Scanner(System.in).nextInt();
    }

    static char getUserOperator() {
        System.out.println("Gimme an operator!");
        boolean foundOperator = false;
        char op;
        do {
            op = getStringFromUser().charAt(0);
            foundOperator =
                    op == '+' ||
                    op == '-' ||
                    op == '*' ||
                    op == '/' ||
                    op == '^';

            if(!foundOperator) {
                System.out.println("GIMME A good op!");
            }
        } while(!foundOperator);
        return op;
    }

    private static String getStringFromUser() {
        return new Scanner(System.in).nextLine();
    }

    // ignore the private static bit for now
    static int doMath(int a, int b, char op) {
        switch (op) {
            case '+': return add(a,b);
            case '-': return sub(a,b);
            case '*': return mul(a,b);
            case '/': return div(a,b);
            case '^': return pow(a,b);
            default:
                System.out.println("Well I never expected this to happen");
        }
        throw new IllegalArgumentException("Unknown operator " + op);
    }

    static int add(int a, int b) { return a + b; }
    static int sub(int a, int b) { return a - b; }
    static int mul(int a, int b) { return a * b; }
    static int div(int a, int b) { return a / b; }
    static int pow(int a, int b) { return (int)Math.pow(a,b); }

}

package tutorial.basics;

import java.util.Scanner;

/** Basic Calculator */
public class DD_RefactoredFunctionTime_Mod2 {
    // /////////////////////////////////////////////////////////////////////////////////////////////////
    static int chooseNumber() {
        System.out.println("Type a number and hit enter.");
        int numberFromUser = new Scanner(System.in).nextInt();
        return numberFromUser;
    }
    // /////////////////////////////////////////////////////////////////////////////////////////////////
    static char chooseOperator() {
        System.out.println("Choose your function (+-*/^) and hit enter.");
        char operatorFromUser = new Scanner(System.in).next().charAt(0);
        if (operatorFromUser == '+' || operatorFromUser == '-' || operatorFromUser == '*' || operatorFromUser == '/'|| operatorFromUser == '^')
        {return operatorFromUser;}
        else
        {System.out.println("Sorry, that is not a valid operator, please try again.");}
        return chooseOperator();
    }
    // /////////////////////////////////////////////////////////////////////////////////////////////////
    static int solve(int firstNumber,char operator,int secondNumber) {
        int answer = 0;

        if (operator == '+')
        {
            answer = add(firstNumber, secondNumber);
        }
        else if (operator == '-')
        {
            answer = sub(firstNumber, secondNumber);
        }
        else if (operator == '*')
        {
            answer = mult(firstNumber, secondNumber);
        }
        else if (operator == '/')
        {
            answer = div(firstNumber, secondNumber);
        }
        else if (operator == '^')
        {
            answer = exp(firstNumber, secondNumber);
        }
        return answer;
    }
    // /////////////////////////////////////////////////////////////////////////////////////////////////
    static int add(int a, int b)
    {
        return a+b;
    }
    // /////////////////////////////////////////////////////////////////////////////////////////////////
    static int sub(int a, int b)
    {
        return a-b;
    }
    // /////////////////////////////////////////////////////////////////////////////////////////////////
    static int mult(int a, int b)
    {
        return a*b;
    }
    // /////////////////////////////////////////////////////////////////////////////////////////////////
    static int div(int a, int b)
    {
        return a/b;
    }
    // /////////////////////////////////////////////////////////////////////////////////////////////////








    static void fakeMaine() {
        int result = exp(2,2);
    }


    static int exp(int base, int power) {
        return (int)Math.pow(base,power);
        //int calc = 1;
        //for (int powerReached = 0; powerReached < power; powerReached++) {
        //    calc = calc * base;
        //}
        //return calc;
    }





    static void testExp(int base, int power, int expectedResult) {
        int result = exp(2,1);
        if(result != expectedResult) {
            System.out.printf("IT FAILED, %s^%s should equal %s but was %s\n",base,power,expectedResult,result);
        } else {
            System.out.println("Yay it passed");
        }
    }

    static void testExp() {
        testExp(5,3,125);
    }


    public static void main(String ... args) {
        /*
        int firstNumber = chooseNumber();
        char operator = chooseOperator();
        int secondNumber = chooseNumber();
        int answer = solve(firstNumber,operator,secondNumber);
        System.out.println(answer);
        main();
        /*/
        testExp();
        //*/
    }
}
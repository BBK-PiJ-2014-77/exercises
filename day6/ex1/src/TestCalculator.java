import java.lang.Integer;
import java.lang.String;
import java.lang.System;
import java.util.Scanner;

public class TestCalculator {
    public static void main(String[] args) {
        System.out.println("What is the first value");
        Scanner st1 = new Scanner(System.in);
        int nu1 = st1.nextInt();

        System.out.println("What is the second value");
        Scanner st2 = new Scanner(System.in);
        int nu2 = st2.nextInt();

        System.out.println("What do you want to do? +,-,/,*,%");
        Scanner st3 = new Scanner(System.in);
        char cha1 = st3.next().charAt(0);

        Calculator Calc = new Calculator(nu1, nu2);
        int answer;
        switch (cha1) {
            case '+':
                answer = Calc.Add();
                System.out.println(answer);
                break;

            case '-':
                answer = Calc.Subtract();
                System.out.println(answer);
                break;

            case '*':
                answer = Calc.Multiply();
                System.out.println(answer);
                break;

            case '/':
                answer = Calc.Divide();
                System.out.println(answer);
                break;

            case '%':
                answer = Calc.Modulus();
                System.out.println(answer);
                break;

            default:
                System.out.println("Incorrect input");

        }
    }
}
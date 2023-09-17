package com.isuru.calculator;
import java.util.Scanner;
public class Main {
    public static void main(String [] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers");
        double num1=sc.nextDouble();
        double num2=sc.nextDouble();

        System.out.println("Enter the operator,+,-,*,/");
        char opr=sc.next().charAt(0);

        double result=0;


        switch (opr){
            case '+':
                result=num1+num2;
                break;
            case '-':
                result=num1-num2;
                break;
            case '*':
                result=num1*num2;
                break;
            case '/':
                result=num1/num2;
                break;
            default:
                System.out.println("invalid input");
        }

        System.out.println(num1 +" "+opr+num2+" "+"= "+result);







    }
}

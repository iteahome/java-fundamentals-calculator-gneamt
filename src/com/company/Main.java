package com.company;

public class Main {

    public static void main(String[] args) {

        int x = 10;
        int y = 9;

        calculator(x, y,'+');
        calculator(x, y,'-');
        calculator(x, y,'*');
        calculator(x, y,'/');
        calculator(x, y,'%');

    }
    public static void calculator(int x, int y, char c){
        int result;
        switch (c){
            case '+':
                result = x + y;
                System.out.println(x + " + " + y + " = " + result);
                break;
            case '-':
                result = x - y;
                System.out.println(x + " - " + y + " = " + result);
                break;
            case '*':
                result = x * y;
                System.out.println(x + " * " + y + " = " + result);
                break;
            case '/':
                result = x / y;
                System.out.println(x + " / " + y + " = " + result);
                break;
            case '%':
                result = x % y;
                System.out.println(x + " % " + y + " = " + result);
                break;
            default:
                System.out.println("Please use the calculator with a valid operation: +  -  *  /  %");
                break;
        }
    }
}

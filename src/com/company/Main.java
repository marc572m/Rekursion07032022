package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(Pow(4, 4));
        System.out.println(Fak(3));
        System.out.println(Fak(5));
        System.out.println(Fib(12));

    }

    public static int Pow(int x, int n) {

        if (n == 0) {
            return 1;


        }

        int TimesValue = x;

        for (int i = 1; i < n; i++) {

            x *= TimesValue;
        }
        return x;
    }

    public static int Fak(int n){

        int sum = n;

        for (int i = n-1; i > 0; i--) {
            sum *= i;

        }
        return sum;

    }

    public static int Fib(int n){
        int first = 0;
        int second = 1;
        int returnVal = 0;

        if (n == 1) return 1;

        for (int i = 1; i < n; i++) {
            returnVal = first + second;
            first = second;
            second=returnVal;


        }
        return returnVal;


    }


}
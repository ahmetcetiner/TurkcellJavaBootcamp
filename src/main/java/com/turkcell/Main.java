package com.turkcell;

public class Main {
    public static void main(String[] args) {
        double listPrice = 30000;
        int number = 6;
        priceControl(listPrice);
        if (isPrime(number)){
           System.out.println("asal");
        }else {
           System.out.println("asal degil");
        }


        if (isSuperNumber(number)){
            System.out.println("Super Sayi");
        }else {
            System.out.println("Super Sayi degil");
        }
    }
    public static void priceControl(double listPrice){
        if(listPrice>=30000){
            System.out.println("Mudur Onayi.");
        }else if (listPrice==30000){
            System.out.println("Yonetici Onayi.");
        }else {
            System.out.println("Satildi.");
        }
    }

    public static boolean isPrime(int number){
        if (number <= 1) {
            return false;
        }
        for(int i=2; i<number; i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }

    public static boolean isSuperNumber(int number){
        int sum = 0;

        for(int i=1; i<number; i++){
            if(number % i == 0){
                sum+=i;
            }
        }
        return sum == number;
    }
}
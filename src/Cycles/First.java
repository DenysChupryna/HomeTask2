package Cycles;


import java.util.Scanner;

class First {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        String number = scanner.next();
        int numberInt = Integer.parseInt(number);
        int sum = 0;
        while (numberInt > 0){
            sum += numberInt % 10;
            numberInt /= 10;

        }
        System.out.println(sum);


    }
}

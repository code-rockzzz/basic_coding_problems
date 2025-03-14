package prime;

import java.util.Scanner;

public class EfficientPrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();

        System.out.println(isPrimeEfficient(n));
    }

    static boolean isPrimeEfficient(int num){
        if(2 == num || 3 == num){
            return true;
        }
        if(num < 2 || num % 2 == 0 || num % 3 == 0){
            return false;
        }

        int c = 5; // check from 5
        while(c*c <= num){
            System.out.println("Current check value is: "+c);
            if(num % c ==0 || (num % (c+2)) == 0){
                return false;
            }
            c+=6;
        }

        return true;
    }
}

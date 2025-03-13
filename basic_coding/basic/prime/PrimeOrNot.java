package prime;

import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n value: ");

        int n = sc.nextInt();
        System.out.println(isPrime(n));
    }

    public static boolean isPrime(int n){
        if(n<=1){
             return false;
        }

        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}

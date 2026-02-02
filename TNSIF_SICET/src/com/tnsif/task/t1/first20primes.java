package com.tnsif.task.t1;

public class first20primes {
    public static void main(String[] args) {
        int count = 0, num = 2;
        System.out.println("First 20 Prime Numbers:");
        
        while (count < 20) {
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
    }
}

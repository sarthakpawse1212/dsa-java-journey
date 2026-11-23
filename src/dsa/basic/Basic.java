package dsa.basic;

import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Largest Number from three numbers

        /*
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        int largest = checkLargest(num1, num2, num3);
        System.out.println(largest);
         */

        // Alphabet case check

        /*
        String in = input.next();

        caseCheck(in);

        System.out.println(in);
         */

        // Nth Fibbonaci number

        /*
        int num = input.nextInt();

        fibboNumber(num);
         */

        // Counting occurances of target

        /*
        int target = input.nextInt();

        int ans = checkOccurence(target);

        System.out.println(ans);
         */

        // Reverse number

        /*
        int num = input.nextInt();

        int reversed = reverseNum(num);

        System.out.println(reversed);
         */

        // Prime number

        /*
        int num = input.nextInt();

        boolean ans = isPrime(num);

        System.out.println(ans);
         */

        // Check if N is Armstrong or not

        /*
        int num = input.nextInt();

        boolean ans = checkArmstrongNumber(num);

        System.out.println(ans);
         */

        // print all 3 digit armstrong numbers

        printThreeDigitsArmstrongNumbers();

    }

    static void printThreeDigitsArmstrongNumbers() {
        int sum = 0;
        for(int i=100; i < 999; i++){
            int temp = i;
            while(temp > 0){
                int rem = temp % 10;
                rem = rem * rem * rem;
                sum = sum + rem;
                temp = temp / 10;
            }
            if(sum == i){
                System.out.println(i);
            }
            sum = 0;
        }
    }

    static boolean checkArmstrongNumber(int num) {
        int sum = 0;
        int temp = num;

        while(num > 0){
            int rem = num % 10;
            rem = rem * rem * rem;
            sum = sum + rem;
            num = num / 10;
        }
        return sum == temp;
    }

    static boolean isPrime(int num) {
        int count = 2;
        while(count * count <= num){
            if(num % count == 0){
                return false;
            }
            count++;
        }
        return count * count >= num;
    }

    static int reverseNum(int num) {
        int rev = 0;
        while(num > 0){
            int temp = num % 10;
            rev = rev * 10 + temp;
            num = num / 10;
        }
        return rev;
    }

    static int checkOccurence(int target) {
        int num = 1122561144;
        int count = 0;

        while(num > 0){
            int temp = num % 10;
            if(temp == target) {
                count++;
            }
            num = num / 10;
        }

        return count;
    }

    static void fibboNumber(int num) {
        int a = 0;
        int b = 1;

        int target = num;

        for (int i=2; i <= target; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println(b);
    }

    static void caseCheck(String in) {
        char value = in.trim().charAt(0);
        if (value >= 'A' && value <= 'Z'){
            System.out.println("Capital");
        } else {
            System.out.println("Small");
        }
    }

    static int checkLargest(int num1, int num2, int num3) {
        int ans = num3;
        if(num1 > num2) {
            ans = num1;
        }
        if (num2 > num3) {
            ans = num2;
        }
        return ans;
    }
}

package dsa.basic;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0;
        while(true){
            System.out.println("Press X or x to exit");
            System.out.println("Enter your operation");
            char operation = input.next().trim().charAt(0);
            if(operation == '+' || operation == '-' || operation == '*' || operation == '/' || operation == '%'){
                System.out.println("Enter Two numbers");
                int num1 = input.nextInt();
                int num2 = input.nextInt();

                if(operation == '+'){
                    ans = num1 + num2;
                }
                if(operation == '-'){
                    ans = num1 - num2;
                }
                if(operation == '*'){
                    ans = num1 * num2;
                }
                if(operation == '/'){
                    if(num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if(operation == '%'){
                    ans = num1 % num2;
                }
                System.out.println("Answer: " + ans);
            } else if (operation == 'X' || operation == 'x'){
                break;
            } else {
                System.out.println("Invalid opertaion");
            }
        }
    }
}

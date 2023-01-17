import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello, if you give me a number I can tell you if it's prime or not. Ready?");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Before we start, I will explain what a prime number is: \n" +
                "A prime number is a number that is divisible by only two numbers: 1 and itself. \n" +
                "So, if any number is divisible by any other number, it is not a prime number.");

        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.print("Please, give me a number: ");
        int number = sc.nextInt();

        boolean input = false;
        for (int i = 2; i <= number / 2; ++i){
            if (number % i == 0) {
                input = true;
                break;
            }
        }

        if (number < 2){
            System.out.println(number + " is not a prime number");
            return;
        }


        if (!input){
            System.out.println(number + " is a prime number");
        }
        else {
            System.out.println(number + " is not a prime number");
        }
    }
}
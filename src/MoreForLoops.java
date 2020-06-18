import java.util.Scanner;

public class MoreForLoops {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        //Print odd numbers from 1 - 20
        System.out.println("Odd numbers from 1 to 20:");
        for (int i = 1; i < 20; i = i + 2){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();

        //Print even numbers from 1 - 20
        System.out.println("Even numbers from 1 to 20");
        for (int i = 2; i <= 20; i = i + 2){
            System.out.print(i + " ");
        }


        System.out.println();
        System.out.println();


        //Reverse a string
        System.out.println("Enter a string:");
        String original = input.nextLine();
        System.out.println(original);
        for (int i = original.length()-1 ; i >=0; i--){
            System.out.print(original.charAt(i));
        }


        System.out.println();
        System.out.println();


//        Display all the factors of a number
        System.out.println("Enter a number:");
        int number = input.nextInt();
        System.out.print("Factors of " + number + " are: ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + ", ");
            }
        }


        System.out.println();
        System.out.println();


        //Computer the factorial of a number
        //5*4*3*2*1
        System.out.println("Enter another number:");
        int num2 = input.nextInt();
        int factorial = 1;

        for (int i = 0; i <  num2 ; i++){
            factorial = factorial * (i+1);
//            factor = factor * product;
        }
        System.out.println();
        System.out.println("Factorial is: ");
        System.out.println(factorial);


    }
}






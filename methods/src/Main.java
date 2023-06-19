import  java.util.Scanner;

public class Main {

    static void print_num(){   //this is a fun that takes to numbers prints there sum
        Scanner scanner = new Scanner(System.in);
        int num1,num2,num; 
        System.out.println("Enter a number 1 ");
        num1 = scanner.nextInt();

        System.out.println("Enter a number 2 ");
        num2 = scanner.nextInt();

        num = num1 + num2;
        System.out.println("The sum   is  "+num);
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        print_num();

    }

    //syntax of a method
    // access modifier return type name() {
    //body of the function
//}

    }
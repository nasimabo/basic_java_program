import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num,n;
        System.out.println("Enter the number: ");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        System.out.println("Enter second number: ");
        n = input.nextInt();

        int sum = num + n;

        System.out.println("This number result is: "+sum);
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i;
        System.out.println("Enter the number: ");
        Scanner input = new Scanner(System.in);
        i = input.nextInt();

        while (i>=1){
            System.out.println("This reverse number is: " + i);
            if (i == 1){
                break;
            }
            i --;
        }
    }
}
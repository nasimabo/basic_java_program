import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int n,res,div;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        n = scanner.nextInt();

        do{
            res = n%10;
            System.out.print(" "+res);
            div = n/10;
            n = div;
        }while (n!=0);

    }
}
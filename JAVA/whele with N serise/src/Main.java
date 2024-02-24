import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        n = scanner.nextInt();

        int n,sum,i;
        i = 0;
        sum = 0;

        while (i<=n){
            sum += 1;
            i += 2;
        }
        System.out.println("The sum of the serise:"+sum);
    }
}
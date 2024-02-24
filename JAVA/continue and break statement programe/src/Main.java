// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
       int x,y,z;
       String s1,s2;
       loop 1:
        for(;;){
            Bufferedreader BR = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter Two numbers: ");
            s1 = BR.readLine();
            s2 = BR.readLine();

            x = Integer.parsenInt(s1);
            y = Integer.parsenInt(s2);

            if (x<=0 || y <=0){
                System.out.print("Wrong Input(Enter Again)");
                continue loop 1;

            }
            else {
                z = x+y;
                System.out.println("The summation is :="+ z);
                break loop 1;
            }
        }
    }
}
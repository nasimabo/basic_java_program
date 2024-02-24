// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        int n = 0;
        String s;
        for (;;){
            BufferedReader BR = new BufferedReader (new InputStreamReader(System.in));
            System.out.println("enter a positive Number:");
            s = BR.readLine();
            n = Integer.parseInt(s);

            if(n<=0)
                continue;
            else
                break;
        }
        System.out.println("You have entered: "+n);
    }
}
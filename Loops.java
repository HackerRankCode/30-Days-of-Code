import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Loops{



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(n>=2 && n<=20)
        {
             for(int i=1;i<=10;i++)
        {
            int r=n*i;
            System.out.println(n+" x "+i+" = "+r);
        }
        }
        scanner.close();
    }
}

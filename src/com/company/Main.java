package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        if (n >= 0 ^ 0 < x ^ x<=2 ){
          double S = 0;
           double P1;
           double P2;
           double P3;
           for (int j=0; j <= n; j ++){
               P1 = (Math.pow(-1,n));
               P2 = (Math.pow(x-1,(n+1)));
               P3 = (P1 * P2)/(n+1);
               S = S + P3;
           }
            System.out.println(S);
        }
        else {
            System.out.println("Error");
        }
    }
}

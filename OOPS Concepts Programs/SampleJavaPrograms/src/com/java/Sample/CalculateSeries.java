package com.java.Sample;
import java.util.*;

public class CalculateSeries{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int result = 0;
            result = a+result;
            for(int j=0;j<n;j++){
                result =result + (int)Math.pow(2, j)*b; //Use Math.pow() to calculate power values
                System.out.print(result+" ");
            }
        }
        in.close();
    }
}

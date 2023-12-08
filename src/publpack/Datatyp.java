package publpack;

import java.io.Console;
import java.util.*;
import java.math.*;
public class Datatyp {
    
    public static void main(String[] args) {
        // look inside c:users
        int free¢hit;
        
        int [] sd = {5,23,78,9,34,55};
        int [] df =Arrays.copyOf(sd,8);
        System.out.println(Arrays.toString(df));
    				df.toString();
    				int r = (int)(Math.random()*50);
    				System.out.println(r);
    				
        double c=Math.E;
        System.out.printf("%.2f",c);
    				System.out.println();
        
        BigInteger y = BigInteger.valueOf(34);
        BigInteger x = BigInteger.valueOf(57);
        BigInteger I = x.multiply(y.add(BigInteger.valueOf(3)));
        System.out.println(I);
    				System.out.println();
    				
    				Date d2 = new Date();
    				System.out.println(d2);
    				
    }
}
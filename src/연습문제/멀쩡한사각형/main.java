package 연습문제.멀쩡한사각형;

import java.math.BigInteger;

public class main {
    public static void main(String[] args) {
        int w = 8;
        int h = 12;

        int gcd = BigInteger.valueOf(w).gcd(BigInteger.valueOf(h)).intValue();

        long answer = ((long) w * (long) h) - ((( (long) w/gcd ) + ((long) h/gcd) - 1) * gcd) ;
        System.out.println(answer);


    }


}

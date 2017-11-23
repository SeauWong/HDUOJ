package com.wongcu.p1042;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author WongCU
 * @date 2017/11/23
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        while(scanner.hasNext()){
            n = scanner.nextInt();
            BigInteger sum = BigInteger.ONE;
            for(int i=2;i<=n;i++){
                sum = sum.multiply(BigInteger.valueOf(i));
            }
            System.out.println(sum);
        }
    }
}

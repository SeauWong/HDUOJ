package com.wongcu.p1047;

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
        int n = scanner.nextInt();
        while(n-->0){
            BigInteger sum = BigInteger.ZERO;
            BigInteger next = BigInteger.ZERO;
            while(true){
                next = scanner.nextBigInteger();
                if(next.equals(BigInteger.ZERO)){
                    break;
                }
                sum = sum.add(next);
            }
            System.out.println(sum);
            if(n>0){
                System.out.println();
            }
        }
    }
}

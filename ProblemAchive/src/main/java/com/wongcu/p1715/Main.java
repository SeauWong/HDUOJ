package com.wongcu.p1715;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BigInteger []fan = new BigInteger[1000];
        fan[0] = fan[1] = BigInteger.ONE;
        for(int i=2;i<1000;i++){
            fan[i] = fan[i-1].add(fan[i-2]);
        }
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        while(i-->0){
            int index = scanner.nextInt();
            System.out.println(fan[index-1]);
        }
    }
}

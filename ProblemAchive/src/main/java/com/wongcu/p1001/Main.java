package com.wongcu.p1001;

import java.util.Scanner;

/**
 *
 * @author WongCU
 * @date 2017/11/23
 */
public class Main {
    public static void main(String[] args) {
        int n,sum;
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            n = scanner.nextInt();
            sum = (int) ((1+n)/2.0*n);
            System.out.println(sum);
            System.out.println();
        }
    }
}

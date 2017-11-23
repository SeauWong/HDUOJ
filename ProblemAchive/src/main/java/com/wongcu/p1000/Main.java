package com.wongcu.p1000;

import java.util.Scanner;

/**
 *
 * @author WongCU
 * @date 2017/11/23
 */
public class Main {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            a = scanner.nextInt();
            b = scanner.nextInt();
            System.out.println(a+b);
        }
    }
}

package com.wongcu.p1002;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 *
 * @author WongCU
 * @date 2017/11/23
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t;
        BigDecimal bi,bj;
        t = scanner.nextInt();
        for(int count=1;count<=t;count++){
            bi = scanner.nextBigDecimal();
            bj = scanner.nextBigDecimal();
            System.out.println("Case "+ count +":");
            System.out.println(bi +" + " + bj + " = " + bi.add(bj));
            if(count<t){
                System.out.println();
            }
        }
    }
}

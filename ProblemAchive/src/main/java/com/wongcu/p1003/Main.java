package com.wongcu.p1003;

import java.util.Scanner;

/**
 *
 * @author WongCU
 * @date 2017/11/23
 */
public class Main {
    public static void main(String[] args) {
        int T,N,n,max,sum,maxStart,maxEnd,curStart;
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();
        for(int i=1;i<=T;i++){
            N = scanner.nextInt();
            max = -1000;
            sum = 0;
            maxStart=maxEnd=curStart=0;
            for(int curEnd=0;curEnd<N;curEnd++){
                n = scanner.nextInt();
                sum+=n;
                if(sum>max){
                    max = sum;
                    maxStart = curStart;
                    maxEnd = curEnd;
                }
                if(sum<0){
                    sum = 0;
                    curStart = curEnd+1;
                }
            }
            System.out.println("Case "+ i +":");
            System.out.println(max + " " + ++maxStart + " " + ++maxEnd);
            if(i<T){
                System.out.println();
            }
        }
    }
}

package com.wongcu.p1004;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author WongCU
 * @date 2017/11/23
 */
public class Main {
    public static void main(String[] args) {
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        Map<String,Integer> map = new HashMap<String, Integer>(1000);
        while(0 != (i = scanner.nextInt())){
            map.clear();
            while(i-->0){
                String color = scanner.next();
                if(map.containsKey(color)){
                    Integer count = map.get(color);
                    count+=1;
                    map.put(color,count);
                }else {
                    map.put(color,1);
                }
            }
            int maxValue = 0;
            String popularColor = "";
            for(String color : map.keySet()){
                Integer count = map.get(color);
                if(count>maxValue){
                    maxValue = count;
                    popularColor = color;
                }
            }
            System.out.println(popularColor);
        }
    }
}

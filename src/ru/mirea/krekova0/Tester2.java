package ru.mirea.krekova0;

import java.util.Scanner;

public class Tester2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] brr = new int[5];
        int j=0;
        int sumb=0;
        while (j<5){
            brr[j] = sc.nextInt();
            sumb = sumb + brr[j];
            j++;
        }
        int max_=0;
        int min_=100000;
        int j1=0;
        while (j1<5){
            max_=Math.max(max_,brr[j1]);
            j1++;
        }
        int j2=0;
        while (j2<5){
            min_=Math.min(min_,brr[j2]);
            j2++;
        }
        System.out.println("sum_brr="+sumb);
        System.out.println("max_brr="+max_);
        System.out.println("min_arr="+min_);
    }
}

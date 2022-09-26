package ru.mirea.krekova0;
import java.util.Scanner;

public class Tester1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for(int i=0;i<10;i++){
            arr[i] = sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<10;i++){
            sum = sum + arr[i];
        }
        double rez=sum/10.0;
        System.out.println("sum_arr="+sum);
        System.out.println("rez_arr="+rez);
    }
}

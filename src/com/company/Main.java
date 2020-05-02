package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите сумму вклада ");
        Scanner x=new Scanner(System.in);
        int s=x.nextInt();
        System.out.println("Введите количество лет, на которое кладется вклад ");
        Scanner y=new Scanner(System.in);
        int n=y.nextInt();
        for (int i=1; i<=n; i++)
            System.out.println("Сумма вклада через "+i+" лет равна "+(s+=s*0.03));
    }
}

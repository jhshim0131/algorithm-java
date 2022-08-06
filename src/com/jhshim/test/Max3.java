package com.jhshim.test;

import java.util.Scanner;

public class Max3 {

    public void solve() {
        final String message = "세 정수의 최댓값을 구합니다.";
        Scanner stdIn = new Scanner(System.in);

        System.out.println(message);

        System.out.print("a의 값 : ");
        int a = stdIn.nextInt();

        System.out.print("b의 값 : ");
        int b = stdIn.nextInt();

        System.out.print("c의 값 : ");
        int c = stdIn.nextInt();

        int max = a;

        if(b > max) max = b;
        if(c > max) max = c;

        System.out.println("max = " + max);
    }

}

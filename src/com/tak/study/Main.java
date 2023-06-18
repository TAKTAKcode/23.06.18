package com.tak.study;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < num; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            // 최소 공배수 구하기
            int d = gcd(a, b);

            sb.append(a * b / d).append('\n');

        }

        System.out.println(sb);

    }


    // 최대공약수 반복문 방식 -> 유클리드 호제법
    public static int gcd(int a, int b) {

        while (b != 0) {
            int r = a % b; // 나머지를 구해준다.

            // GCD(a, b) = GCD(b, r)이므로 변환한다.
            a = b;
            b = r;
        }

        return a;

    }

}
package org.example.ch04;

import java.util.Scanner;

/**
 * ch04. if-else문
 */
public class Ex4_4 {
    public static void main(String[] args) {
        int score = 0;
        char grade = 'D';

        System.out.print("점수를 입력하세요.>");
        Scanner sc = new Scanner(System.in);
        score = sc.nextInt();

        if (score >= 90) {
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        } else if (score >= 70) {
            grade = 'C';
        }
//        else { 리펙토링 ! 굳이 else 문을 작성하지 않아도 된다!
//            grade = 'D';
//        }

        System.out.println("당신의 학점은 " + grade + " 입니다.");
    }
}

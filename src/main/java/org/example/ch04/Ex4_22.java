package org.example.ch04;

import java.util.Map;
import java.util.Scanner;

/**
 * ch04. 이름붙은 반복문, continue, break 예제
 * 반복문에 이름을 붙여서 하나 이상의 반복문을 벗어날 수 있다.
 */
public class Ex4_22 {
    public static void main(String[] args) {
        int menu = 0, num = 0;

        Scanner scanner = new Scanner(System.in);

       outer: while (true) {
            System.out.println("(1) square ");
            System.out.println("(2) square root ");
            System.out.println("(3) log");
            System.out.print(" 원하는 메뉴 (1~3) 을 선택하세요, (종료 : 0) >");

            menu = scanner.nextInt();

            if (menu == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (!(1 <= menu && menu <= 3) ){
                System.out.println("메뉴를 잘못선택하셨습니다.");
                continue;
            }

            for (; ; ) {
                System.out.print("계산할 값을 입력하세요. (계산 종료 : 0, 전체 종료: 99) >");
                num = scanner.nextInt();

                if (num == 0) {
                    break;
                }

                if (num == 99) {
                    break outer;
                }

                switch (menu) {
                    case 1 :
                        System.out.println("result = " + num * num);
                        break;
                    case 2 :
                        System.out.println("result = " + Math.sqrt(num));
                        break;
                    case 3:
                        System.out.println("result = " + Math.log(num));
                        break;
                }
            }


        }
    }
}

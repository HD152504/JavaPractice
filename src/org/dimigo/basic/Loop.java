package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 *  org.dimigo.basic
 *     |_ Loop
 * 1. 개요 :
 * 2. 작성일 : 2017-03-16
 * <pre>
 * @author : lg
 * @version : 1.0
 */
public class Loop {
    public static void main(String[] args) {
        int sel, attack = 100;
        Scanner scanner = new Scanner(System.in);
        String[] job = {"마법사", "영주", "기사", "농민"};
        do {
            System.out.println("----------------");
            System.out.println("<< 게임 메뉴 >>");
            System.out.println("1. 공격력 증가");
            System.out.println("2. 공격력 감소");
            System.out.println("3. 캐릭터 설정");
            System.out.println("9. 종료");
            System.out.println("----------------");
            System.out.print("메뉴 입력 = > ");
            sel = scanner.nextInt();

            switch (sel) {
                case 1:
                    attack += 10;
                    System.out.println("공격력이 증가되었습니다. 현재 공격력 : " + attack);
                    break;
                case 2:
                    attack -= 10;
                    System.out.println("공격력이 감소되었습니다. 현재 공격력 : " + attack);
                    break;
                case 3:
                    int num = new Random().nextInt(4);
                    System.out.println(job[num] + "(으)로 설정되었습니다.");
                    break;
                case 9:
                    System.out.println("공부하러 가자");
                    break;
                default:
                    System.out.println("없는 메뉴입니다.");
            }
        } while(sel != 9);
    }
}

package org.dimigo.oop;

/**
 * <pre>
 *  org.dimigo.oop
 *     |_ IdolGroup
 * 1. 개요 :
 * 2. 작성일 : 2017-04-07
 * <pre>
 * @author : lg
 * @version : 1.0
 */
public class IdolGroup {
    public void printIdol(String[] nameArr, String[][] memArr) {
        for (int i = 0; i < nameArr.length; i++) {
            System.out.println("<< " + nameArr[i] + " >>");
            printIdolName(memArr, i);
            System.out.println();
        }
    }
    public void printIdolName(String[][] memArr, int index) {
        for (int i = 0; i < memArr[index].length; i++) {
            System.out.println(memArr[index][i]);
        }

    }
    public static void main(String[] args) {
        String[] groupName = {"빅뱅", "2EN1", "걸스데이"};
        String[][] memberName = {
                {"GD", "태양", "대성", "탑", "승리"},
                {"CL", "산다라박", "박봄", "민지"},
                {"유라", "혜리", "소진", "민아"}
        };

        IdolGroup idol = new IdolGroup();
        idol.printIdol(groupName, memberName);

    }
}

package org.dimigo.basic;

/**
 * <pre>
 *  org.dimigo.basic
 *     |_ Operator
 * 1. 개요 :
 * 2. 작성일 : 2017-03-14
 * <pre>
 * @author : lg
 * @version : 1.0
 */
public class Operator {
    public static void main(String[] args) {
        int month_salary = 1700000;
        int employees = 3;
        int agents = 1500;
        long result = (long)month_salary * employees * agents * 12;

        System.out.println("<< 디미베네 연간 인건비 >>");
        System.out.println("월 평균 급여 : " + String.format("%,d", month_salary) + "원");
        System.out.println("점포 내 직원 수 : " + String.format("%,d", employees) + "명");
        System.out.println("점포 수 : " + String.format("%,d", agents) + "개");
        System.out.println("연간 인건비 : " + String.format("%,d원", result));


    }
}

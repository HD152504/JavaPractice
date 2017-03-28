package org.dimigo.oop;

/**
 * <pre>
 *  org.dimigo.oop
 *     |_ CarTest
 * 1. 개요 :
 * 2. 작성일 : 2017-03-23
 * <pre>
 * @author : lg
 * @version : 1.0
 */
public class CarTest3 {
    public static void main(String[] args) {

        // create new ref var & set field
        Car3 genesis = new Car3("현대자동차", "제네시스", "검정색", 225, 50000000);
        Car3 k7 = new Car3("기아자동차", "K7", "흰색", 246);
        Car3 sm7 = new Car3("삼성자동차", "SM7", "회색");

        // print value
        System.out.println("<< 자동차 목록 >>");
        System.out.println("제조사명 : " + genesis.getCompany());
        System.out.println("모델명 : " + genesis.getModel());
        System.out.println("색상 : " + genesis.getColor());
        System.out.println("최대속도 : " + genesis.getMaxSpeed() + "km");
        System.out.println("가격 : " + String.format("%,d" ,genesis.getPrice()) + "원");
        System.out.println();
        System.out.println("제조사명 : " + k7.getCompany());
        System.out.println("모델명 : " + k7.getModel());
        System.out.println("색상 : " + k7.getColor());
        System.out.println("최대속도 : " + k7.getMaxSpeed() + "km");
        System.out.println("가격 : " + String.format("%,d", k7.getPrice()) + "원");
        System.out.println();
        System.out.println("제조사명 : " + sm7.getCompany());
        System.out.println("모델명 : " + sm7.getModel());
        System.out.println("색상 : " + sm7.getColor());
        System.out.println("최대속도 : " + sm7.getMaxSpeed() + "km");
        System.out.println("가격 : " + String.format("%,d", sm7.getPrice()) + "원");
    }
}

package org.dimigo.inheritance;

/**
 * <pre>
 *  org.dimigo.inheritance
 *     |_ SmartPhoneTest
 * 1. 개요 :
 * 2. 작성일 : 2017-05-12
 * <pre>
 * @author : lg
 * @version : 1.0
 */
public class SmartPhoneTest {
    public static void main(String[] args) {
        SmartPhone[] phone = {
                new IPhone("iPhone 7", "애플", 900000),
                new Galaxy("Galaxy 8", "삼성", 800000),
        };

        for (SmartPhone p: phone ) {
            System.out.println(p);
            p.turnOn();
            p.pay();
            p.useSpecialFunction(p);
            p.turnOff();
            System.out.println();
        }


    }
}

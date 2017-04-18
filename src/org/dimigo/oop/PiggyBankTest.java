package org.dimigo.oop;

/**
 * <pre>
 *  org.dimigo.oop
 *     |_ PiggyBankTest
 * 1. 개요 :
 * 2. 작성일 : 2017-04-18
 * <pre>
 * @author : lg
 * @version : 1.0
 */
public class PiggyBankTest {
    public static void main(String[] args) {
        FamilyMember[] familyMember = {
                new FamilyMember("아빠"),
                new FamilyMember("엄마"),
                new FamilyMember("남동생"),
                new FamilyMember("나"),
        };
        FamilyMember.printMemberCnt();
        PiggyBank.putMoney(familyMember[0], 10000);
        PiggyBank.putMoney(familyMember[1], 5000);
        PiggyBank.putMoney(familyMember[3], 2000);
        PiggyBank.putMoney(familyMember[2], 1000);
        PiggyBank.printBalance();
        PiggyBank.putMoney(familyMember[3], 1000);
        PiggyBank.printBalance();
    }
}

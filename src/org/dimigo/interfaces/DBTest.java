package org.dimigo.interfaces;

/**
 * <pre>
 *  org.dimigo.interfaces
 *     |_ DBTest
 * 1. 개요 :
 * 2. 작성일 : 2017-05-24
 * <pre>
 * @author : lg
 * @version : 1.0
 */
public class DBTest {
    public static void main(String[] args) {
        IDBManager[] idbManager = {
                IDBManager.getDBObject(IDBManager.SYBASE_DATABASE),
                IDBManager.getDBObject(IDBManager.ORACLE_DATABASE),
        };
        System.out.println("<< 변경 전 >>");
        crud(idbManager[0]);
        System.out.println();
        System.out.println("<< 변경 후 >>");
        crud(idbManager[1]);

    }

    private static void crud(IDBManager db) {
        db.insert();
        db.search();
        db.update();
        db.delete();
    }

}

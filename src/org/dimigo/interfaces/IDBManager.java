package org.dimigo.interfaces;

/**
 * <pre>
 *  org.dimigo.interfaces
 *     |_ IDBManager
 * 1. 개요 :
 * 2. 작성일 : 2017-05-24
 * <pre>
 * @author : lg
 * @version : 1.0
 */
public interface IDBManager {
    public static final String ORACLE_DATABASE = "ORACLE";
    public static final String SYBASE_DATABASE = "SYBASE";

    void insert();
    void search();
    void update();
    void delete();

    public static IDBManager getDBObject(String database) {
        IDBManager dbManager = null;
        if (ORACLE_DATABASE.equalsIgnoreCase(database)) {
            dbManager = new OracleDB();
        }
        else if(SYBASE_DATABASE.equalsIgnoreCase(database)) {
            dbManager = new SybaseDB();
        }
            return dbManager;
    }




}

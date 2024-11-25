package org.example.dbcp;


public class DBCPUse {
    public static void main(String[] args) {
        // 없으면 만들어서 반환, 있으면 이미 있는것으로 반환
        DBCP dbcp1 = DBCP.getInstance();
        System.out.println(dbcp1);
    }
}

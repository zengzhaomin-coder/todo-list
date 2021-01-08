package com.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBHelper {
    // 连接数据库的方法
    public static Connection getConnection() throws Exception {
        String user = "sa";
        String password = "123456789";
        String dataBase = "xxx";
        String host = "localhost:1433";
        String url = "jdbc:sqlserver://" + host + ";databaseName=" + dataBase
                + ";user=" + user + ";password=" + password;
        
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        return DriverManager.getConnection(url);
    }
}

package com.czl.classloader;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * ClassName:MyTest18
 * Package:com.czl.classloader
 * Description:
 *
 * @date:2020-2-24 20:28
 * @autor:18855032359
 */
public class MyTest18 {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println(DriverManager.class.getClassLoader());
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mytest","root","");
        System.out.println(conn);
    }
}

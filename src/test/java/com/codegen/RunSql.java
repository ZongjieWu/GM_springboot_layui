package com.codegen;

import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.jdbc.datasource.init.ScriptUtils;

import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;

public class RunSql {
    public static void main(String[] args) {
        File newfile = new File("D:\\dbtest\\hdrc.sql");
        Resource resource = new FileSystemResource(newfile);
        EncodedResource resourceDelegate = new EncodedResource(resource);
        Connection conn=DBConn.openDB();
        ScriptUtils.executeSqlScript(conn, resource);
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

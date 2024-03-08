package org.devemanuel;


import org.devemanuel.util.DataBaseUtil;
import org.devemanuel.util.DataSource;

public class Main {
    public static void main(String[] args) {
        System.out.println(DataBaseUtil.getconnection());
        System.out.println(DataSource.getConnection());

    }
}
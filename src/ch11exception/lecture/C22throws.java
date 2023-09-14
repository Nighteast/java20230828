package ch11exception.lecture;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;

public class C22throws {
    public static void main(String[] args) throws Exception {   //잘 몰라서 그냥 대충 복붙하다가 이렇게 던지는 경우가 많다 함.

        Connection con = DriverManager.getConnection("", "", "");
        var input = new FileInputStream("");
        Class.forName("");

    }
}

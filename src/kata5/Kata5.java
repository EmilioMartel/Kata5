package kata5;

import java.sql.*;

public class Kata5 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
       SqlitePeopleLoader sqlitePeopleLoader = new SqlitePeopleLoader();
       sqlitePeopleLoader.load();
    }
}

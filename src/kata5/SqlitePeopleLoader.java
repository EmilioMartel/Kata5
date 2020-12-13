package kata5;

import Interface.PeopleLoader;
import model.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SqlitePeopleLoader implements PeopleLoader {
    @Override
    public List<Person> load() throws ClassNotFoundException, SQLException {
        List<Person> personList = new ArrayList<>();

        Class.forName("org.sqlite.JDBC");
        Connection connection = DriverManager.getConnection("jdbc:sqlite:data/people.db");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT * FROM people");


        while (resultSet.next()){
            Person person = new Person();
            person.setName(resultSet.getString("first_name"));
            person.setSurname(resultSet.getString("last_name"));
            person.setCompany_name(resultSet.getString("company_name"));
            person.setAddress(resultSet.getString("addres"));
            person.setCity(resultSet.getString("city"));
            person.setCounty(resultSet.getString("county"));
            person.setState(resultSet.getString("state"));
            person.setEmail(resultSet.getString("email"));
            person.setZip(resultSet.getInt("zip"));
            person.setPhone1(resultSet.getString("phone1"));
            person.setPhone2(resultSet.getString("phone2"));
            person.setWeb(resultSet.getString("web"));

            personList.add(person);
        }

        statement.close();

        return personList;
    }
}

package Interface;

import model.Person;

import java.sql.SQLException;
import java.util.List;

public interface PeopleLoader {
    public List<Person> load() throws ClassNotFoundException, SQLException;
}

package hu.nive.ujratervezes.zarovizsga.dogtypes;
/*
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

class DogTypesTest {
    DogTypes dogTypes;

    @BeforeEach
    void init() throws SQLException {
        MariaDbDataSource dataSource;
        dataSource = new MariaDbDataSource();
        dataSource.setUrl("jdbc:mariadb://localhost:3306/employees?useUnicode=true");
        dataSource.setUser("employees");
        dataSource.setPassword("employees");

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();

        flyway.clean();
        flyway.migrate();

        dogTypes = new DogTypes(dataSource);

    }

    @Test
    void testGetDogsByCountry() {
        List<String> types = dogTypes.getDogsByCountry("Hungary");
        assertEquals(9, types.size());
        assertTrue(types.contains("komondor"));
        assertTrue(types.contains("kuvasz"));
    }
}*/
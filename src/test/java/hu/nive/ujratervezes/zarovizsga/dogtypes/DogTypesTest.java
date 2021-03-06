package hu.nive.ujratervezes.zarovizsga.dogtypes;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.util.List;

class DogTypesTest {
    DogTypes dogTypes;

    @BeforeEach
    void init() throws SQLException {
        MariaDbDataSource dataSource;
        dataSource = new MariaDbDataSource();
        dataSource.setUrl("jdbc:mariadb://localhost:3306/aktivity?useUnicode=true");
        dataSource.setUser("gergo");
        dataSource.setPassword("gergo");

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();

        flyway.clean();
        flyway.migrate();

        dogTypes = new DogTypes(dataSource);

    }

    @Test
    void testGetDogsByCountry() {
        List<String> types = dogTypes.getDogsByCountry("HUNGARY");
        assertEquals(9, types.size());
        assertTrue(types.contains("KOMONDOR"));
        assertTrue(types.contains("KUVASZ"));
    }
}
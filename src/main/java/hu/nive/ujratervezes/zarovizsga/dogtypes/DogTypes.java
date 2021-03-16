package hu.nive.ujratervezes.zarovizsga.dogtypes;

import org.flywaydb.core.Flyway;
import org.mariadb.jdbc.MariaDbDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DogTypes {

    DataSource dataSource;
    public DogTypes(DataSource dataSource) {
        this.dataSource=dataSource;
    }


    public List<String> getDogsByCountry(String hungary) {
        List<String> stringList=new ArrayList<>();
        try(Connection conn = dataSource.getConnection();
            PreparedStatement stmt = conn.prepareStatement("select name from dog_types where country = ?")) {
            stmt.setString(1,hungary);
            stringList = selectActivityByPreparedStatement(stmt);

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return stringList;
    }

    private List<String> selectActivityByPreparedStatement(PreparedStatement stmt){
        List<String> types = new ArrayList<>();

        try(ResultSet rs = stmt.executeQuery()){
            while (rs.next()){
                String name = rs.getString("name");
                types.add(name);
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return types;
    }
}

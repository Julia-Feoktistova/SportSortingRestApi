package sportTeam.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

@Component
public class DBconnection {

    public static final String DATABASE_URL = "jdbc:postgresql://localhost:5432/postgres";
    public static Connection connection;

   private static final Logger log = LoggerFactory.getLogger(DBconnection.class);

    static {
        try {
            connection = DriverManager.getConnection(DATABASE_URL, getConnection());
        } catch (SQLException e) {
            log.info("Incorrect database URL '{}' or connection props '{}'");
        }
    }
    public static Properties getConnection(){
        Properties properties = new Properties();
        properties.setProperty("user", "postgres");
        properties.setProperty("password", "root");
        return properties;
    }
}

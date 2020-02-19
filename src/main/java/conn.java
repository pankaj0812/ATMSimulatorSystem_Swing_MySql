import java.sql.*;

public class conn {
    Connection connection;
    Statement statement;
    public conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql:///atm_simulator_db", "root","");
            statement = connection.createStatement();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

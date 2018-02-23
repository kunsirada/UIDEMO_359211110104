package sample;

import java.sql.Connection;
import java.sql.SQLException;

public class loginModel {

    Connection.connection;

    public  loginModel(){
        try {
            this.connection = dbConnection.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }

          if (this)
        }
    }
}

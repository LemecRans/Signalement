package classmapping;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connexion {
	public static Connection con() {
        java.sql.Connection conn = null;
        try{
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/projetmobile","postgres","root");          
        } catch(Exception e){
            e.printStackTrace();
        }
        return conn;
    }
}


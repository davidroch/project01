package almacenmarialadelbarrio;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    Connection conectar=null;
    public Connection conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conectar=DriverManager.getConnection(""
                    + "jdbc:mysql://localhost:3306/almacen","root","");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return conectar;
    }
    //prueba
    public void alto(){
        
    }
}

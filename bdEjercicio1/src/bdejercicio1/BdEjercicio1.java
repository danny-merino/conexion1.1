
package bdejercicio1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class BdEjercicio1 {

    
 public static void main(String[] args){
        
     class conexion {
       
         private Connection con;
    //declaramos los datos de conexion
    private static final String driver="com.mysql.jdbc.Driver";
    private static final String user="root";
    private static final String password="dannymerino1234";
    private static final String url="jdbc:mysql://localhost:3306/bdejercicio1? useUnicode=true&use"
            +"JDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            
    
    public Connection conector(){
    //reseteamos a null la conexion
        con=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            //nos conectamos
            con=(Connection)DriverManager.getConnection(url,user,password);
            //comprobar la conexion
            if(con!=null){
            JOptionPane.showMessageDialog(null,"Conexion Exitosa");
            }
        }
                
        catch(ClassNotFoundException| SQLException e){
         JOptionPane.showMessageDialog(null,"Error en la conexion"+e);
        }
        return con;
    }

   
   
    }
    
    
}
 }

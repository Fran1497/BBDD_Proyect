import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAOImpl implements DAO{
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String usuario = "postgres";
    private static final String password = "root";

    public Connection getConexion() {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(URL,usuario,password);
        } catch (SQLException ex) {
            Logger.getLogger(DAOImpl.class.getName()).log(Level.SEVERE , null, ex);
        }
        return conexion;
    }

    @Override
    public List<Departamento> read() {
        List<Departamento> lista = new ArrayList<>();
        Departamento dep =null;
            try {
                Connection conexion = getConexion();
                Statement sentencia = conexion.createStatement();
                ResultSet rs = sentencia.executeQuery("select iddep,nombre from departamentos;");
                while (rs.next()){
                    dep = new Departamento(rs.getString(1),rs.getString(2));
                    lista.add(dep);
                }
                rs.close();
                sentencia.close();
                conexion.close();
            } catch (SQLException ex) {
                Logger.getLogger(DAOImpl.class.getName()).log(Level.SEVERE, null,ex);
            }
            return lista;
    }
}

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAOImpl implements DAO{
    private static final String URL = "jdbc:postgresql://localhost:5432/empresa";
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
    @Override
    public List<Empleado> empleadodep(String depart) {
        List<Empleado> lista = new ArrayList<>();
        Empleado emp =null;

        try{
            Connection conexion = getConexion();
            Statement sentencia = conexion.createStatement();
            ResultSet rs = sentencia.executeQuery("select idemp,nombre,apellidos,fechaalta,salario,iddep,idjefe from empleados WHERE iddep='"+depart +"'");
            while (rs.next()){
                emp = new Empleado(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDouble(5),rs.getString(6),rs.getInt(7));
                lista.add(emp);
            }

        } catch (SQLException ex) {
            Logger.getLogger(DAOImpl.class.getName()).log(Level.SEVERE, null,ex);
        }
        return lista;
    }

    @Override
    public List<Curso> cursodep(String depart) {
        List<Curso> lista = new ArrayList<>();
        Curso cur =null;

        try {
            Connection conexion = getConexion();
            Statement sentencia = conexion.createStatement();
            ResultSet rs = sentencia.executeQuery("select idcurso,nombre,nivelcurso,preciocurso,iddep from cursos WHERE iddep='"+depart +"'");
            while (rs.next()){
                cur = new Curso(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDouble(4),rs.getString(5));
                lista.add(cur);
            }
        }catch (SQLException ex) {
            Logger.getLogger(DAOImpl.class.getName()).log(Level.SEVERE, null,ex);
        }


        return lista;
    }
}

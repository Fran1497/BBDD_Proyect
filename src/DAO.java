import java.util.List;

public interface DAO {
    public List<Departamento> read();

    List<Empleado> empleadodep();

    List<Empleado> empleadodep(String depart);
}

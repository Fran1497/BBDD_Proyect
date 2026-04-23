import java.util.List;

public interface DAO {
    public List<Departamento> read();

    List<Empleado> empleadodep(String depart);

    List<Curso> cursodep(String depart);
}

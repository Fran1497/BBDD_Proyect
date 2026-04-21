public class Empleado {
    private int idemp;
    private String nombre;
    private String apellidos;
    private String fechaalta;
    private Double salario;
    private String iddep;
    private int idjefe;

    public Empleado(int idemp, String nombre, String apellidos, String fechaalta, Double salario, String iddep, int idjefe) {
        this.idemp = idemp;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaalta = fechaalta;
        this.salario = salario;
        this.iddep = iddep;
        this.idjefe = idjefe;
    }

    public Empleado() {

    }

    public int getIdemp() {
        return idemp;
    }

    public void setIdemp(int idemp) {
        this.idemp = idemp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaalta() {
        return fechaalta;
    }

    public void setFechaalta(String fechaalta) {
        this.fechaalta = fechaalta;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getIddep() {
        return iddep;
    }

    public void setIddep(String iddep) {
        this.iddep = iddep;
    }

    public int getIdjefe() {
        return idjefe;
    }

    public void setIdjefe(int idjefe) {
        this.idjefe = idjefe;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "idemp=" + idemp +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaalta='" + fechaalta + '\'' +
                ", salario=" + salario +
                ", iddep='" + iddep + '\'' +
                ", idjefe=" + idjefe +
                '}';
    }
}


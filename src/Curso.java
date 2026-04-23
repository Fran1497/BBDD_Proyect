public class Curso {
    private int idcurso;
    private String nombre;
    private String nivelcurso;
    private Double preciocurso;
    private String iddep;

    public Curso(int idcurso, String nombre, String nivelcurso, Double preciocurso, String iddep) {
        this.idcurso = idcurso;
        this.nombre = nombre;
        this.nivelcurso = nivelcurso;
        this.preciocurso = preciocurso;
        this.iddep = iddep;
    }

    public int getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(int idcurso) {
        this.idcurso = idcurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNivelcurso() {
        return nivelcurso;
    }

    public void setNivelcurso(String nivelcurso) {
        this.nivelcurso = nivelcurso;
    }

    public Double getPreciocurso() {
        return preciocurso;
    }

    public void setPreciocurso(Double preciocurso) {
        this.preciocurso = preciocurso;
    }

    public String getIddep() {
        return iddep;
    }

    public void setIddep(String iddep) {
        this.iddep = iddep;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "idcurso=" + idcurso +
                ", nombre='" + nombre + '\'' +
                ", nivelcurso='" + nivelcurso + '\'' +
                ", preciocurso=" + preciocurso +
                ", iddep='" + iddep + '\'' +
                '}';
    }
}

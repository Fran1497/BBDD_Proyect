public class Departamento {
    private String IdDep;
    private String Nombre;

    public Departamento(){

    }

    public Departamento(String idDep, String nombre) {
        IdDep = idDep;
        Nombre = nombre;
    }

    public String getIdDep() {
        return IdDep;
    }

    public void setIdDep(String idDep) {
        IdDep = idDep;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }


    @Override
    public String toString() {
        return "Departamento{" +
                "IdDep='" + IdDep + '\'' +
                ", Nombre='" + Nombre + '\'' +
                '}';
    }
}

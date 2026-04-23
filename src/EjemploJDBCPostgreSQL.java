import java.util.List;
import java.util.Scanner;

public class EjemploJDBCPostgreSQL {

    public static void main(String[] args) {
        DAOImpl depDaoImpl = new DAOImpl();
        Scanner sc = new Scanner(System.in);
        int op;
        Departamento dep;
        String iddep;
        Empleado emp;
        do {
            System.out.println("****************MENÚ**********************");
            System.out.println("* 1. Crear Departamento(NO)              *");
            System.out.println("* 2. Modificar Departamento(NO)          *");
            System.out.println("* 3. Borrar Departamento(NO)             *");
            System.out.println("* 4. Mostrar departamento(NO)            *");
            System.out.println("* 5. Mostrar todos los Departamentos     *");
            System.out.println("* 6. Mostrar empleados de un departamento*");
            System.out.println("* 7. Mostrar cursos de un departamento   *");
            System.out.println("* 8. Mostrar empleado con más salario    *");
            System.out.println("* 9. Departamento -> empleados           *");
            System.out.println("* 20. Salir                              *");
            System.out.println("******************************************");
            System.out.println("Introduce una opción");
            op = Integer.parseInt(sc.nextLine());
            switch (op){
                //case 1:
                    //break;
                //case 2:
                    //break;
                //case 3:
                    //break;
                //case 4:
                    //break;
                case 5:
                    List<Departamento> lista = depDaoImpl.read();
                    for (Departamento actual : lista){
                        System.out.println(actual.toString());
                    }
                    break;
                case 6:
                    System.out.println("Dime el Departamento de los empleados");
                    List<Empleado> lista_emp = depDaoImpl.empleadodep(sc.nextLine());
                    for (Empleado actual : lista_emp){
                        System.out.println(actual.toString());
                    }
                    break;
                case 7:
                    System.out.println("Dime el Departamento del Curso");
                    List<Curso> list_Curso = depDaoImpl.cursodep(sc.nextLine());
                    for ( Curso actual: list_Curso){
                        System.out.println(actual.toString());
                    }
                    break;
                case 8:
                    List<Empleado> lista_EmpleadoMAX = depDaoImpl.empleadomax();
                    for (Empleado actual : lista_EmpleadoMAX){
                        System.out.println(actual.toString());
                    }
                case 9:
                    List<Departamento> lista_DEP = depDaoImpl.read();
                    for (Departamento actual : lista_DEP){
                        System.out.println(actual.toString());
                    }
                    System.out.println("Elige departamento");
                    iddep = sc.nextLine();
                    List<Empleado> lista_empYdep = depDaoImpl.empleadodep(iddep);
                    for (Empleado actual : lista_empYdep){
                        System.out.println(actual.toString());
                    }
                case 20:
                    System.out.println("Cerrando aplicación...");
                    break;
                default:
                    System.out.println("Opción incorrecta!!!");
            }
        } while (op !=20);
    }
}

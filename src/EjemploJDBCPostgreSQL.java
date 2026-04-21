import java.util.List;
import java.util.Scanner;

public class EjemploJDBCPostgreSQL {

    public static void main(String[] args) {
        DAOImpl depDaoImpl = new DAOImpl();
        Scanner sc = new Scanner(System.in);
        int op;
        Departamento dep;
        String iddep;
        do {
            System.out.println("****************MENÚ*********************");
            System.out.println("* 1. Crear Departamento                 *");
            System.out.println("* 2. Modificar Departamento             *");
            System.out.println("* 3. Borrar Departamento                *");
            System.out.println("* 4. Mostrar departamento               *");
            System.out.println("* 5. Mostrar todos los Departamentos    *");
            System.out.println("* 6. Salir                              *");
            System.out.println("*****************************************");
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
                    System.out.println("Cerrando aplicación...");
                    break;
                default:
                    System.out.println("Opción incorrecta!!!");
            }
        } while (op !=6);
    }
}

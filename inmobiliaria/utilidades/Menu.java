package inmobiliaria.utilidades;

/**
 * Clase que imprime menues
 * 
 * @author Daniel Lima
 */
public class Menu {

    /**
     * Metodo que imprime el menu principal
     * 
     * @author Daniel Lima
     */
    public static void principal() {
        System.out.println("+--------MENU PRINCIPAL-------+\n" +
                "| 1. Carga de Datos           |\n" +
                "| 2. Crear Contrato           |\n" +
                "| 3. Buscar Datos             |\n" +
                "| 4. Herramientas             |\n" +
                "| 5. Salir                    |\n" +
                "+-----------------------------+");
    }

    /**
     * Metodo que imprime el menu de carga
     * 
     * @author Daniel Lima
     */
    public static void carga() {
        System.out.println("+--------MENU DE CARGA--------+\n" +
                "| 1. Cargar Propietarios      |\n" +
                "| 2. Cargar Inquilinos        |\n" +
                "| 3. Cargar Departamentos     |\n" +
                "| 4. Cargar Edificios         |\n" +
                "| 5. Volver al menú principal |\n" +
                "+-----------------------------+");
    }

    /**
     * Metodo que imprime el menu de muestra de datos
     * 
     * @author Daniel Lima
     */
    public static void buscar() {
        System.out.println("+-------MENU DE BUSQUEDA------+\n" +
                "| 1. Buscar Propietario       |\n" +
                "| 2. Buscar Inquilino         |\n" +
                "| 3. Buscar Departamento      |\n" +
                "| 4. Buscar Edificio          |\n" +
                "| 5. Buscar Contrato          |\n" +
                "| 6. Volver al menú principal |\n" +
                "+-----------------------------+");
    }

    /**
     * Metodo que imprime el menu de herramientas
     * 
     * @author Daniel Lima
     */
    public static void herramientas() {
        System.out.println("+--------HERRAMIENTAS---------+\n" +
                "| 1. Ver la Cantidad de       |\n" +
                "|    Departamentos de un      |\n" +
                "|    Propietario              |\n" +
                "| 2. Ver la direccion donde   |\n" +
                "|    alquila un Inquilino     |\n" +
                "| 3. Ver la cantidad de       |\n" +
                "|    Departamentos alquilados |\n" +
                "|    de un Edificio           |\n" +
                "| 4. Ver el Inquilino de un   |\n" +
                "|    Departamento             |\n" +
                "| 5. Finalizar un Contrato    |\n" +
                "| 6. Volver al menú principal |\n" +
                "+-----------------------------+");
    }
}

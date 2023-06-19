package inmobiliaria.utilidades;

import java.util.Scanner;

import inmobiliaria.contratos.Contrato;
import inmobiliaria.inmuebles.*;
import inmobiliaria.personas.*;

/**
 * Clase para buscar objetos a partir de atributos clave
 * 
 * @author Daniel Lima
 */
public class Buscar {
    static Scanner entrada = new Scanner(System.in);

    /**
     * Busca un inquilino por su DNI en el arreglo de Propietarios
     * 
     * @param propietarios es un arreglo de objetos de la clase Propietario
     * @return El método devuelve un objeto Propietario
     * @author Daniel Lima
     */
    public static Propietario documento(Propietario[] propietarios) {
        Propietario salida = new Propietario();
        int dni, i;
        boolean encontrado = false;
        do {
            i = 0;
            System.out.print("Ingrese DNI: ");
            dni = entrada.nextInt();
            entrada.nextLine();
            while (!encontrado && i < propietarios.length) {
                if (propietarios[i].getDni() == dni) {
                    salida = propietarios[i];
                    encontrado = true;
                }
                i++;
            }
            if (!encontrado) {
                System.out.println("+--Error!---------------------+\n" +
                        "| DNI no encontrado           |\n" +
                        "| Ingrese un nuevo DNI        |\n" +
                        "+-----------------------------+");
            }
        } while (!encontrado);
        return salida;
    }

    /**
     * Busca un inquilino por su DNI en el arreglo de Inquilinos
     * 
     * @param inquilinos es un arreglo de objetos de la clase Inquilino
     * @return El método devuelve un objeto Inquilino.
     * @author Daniel Lima
     */
    public static Inquilino documento(Inquilino[] inquilinos) {
        Inquilino salida = new Inquilino();
        int dni, i;
        boolean encontrado = false;
        do {
            i = 0;
            System.out.print("Ingrese DNI: ");
            dni = entrada.nextInt();
            entrada.nextLine();
            while (!encontrado && i < inquilinos.length) {
                if (inquilinos[i].getDni() == dni) {
                    salida = inquilinos[i];
                    encontrado = true;
                }
                i++;
            }
            if (!encontrado) {
                System.out.println("+--Error!---------------------+\n" +
                        "| DNI no encontrado           |\n" +
                        "| Ingrese un nuevo DNI        |\n" +
                        "+-----------------------------+");
            }
        } while (!encontrado);
        return salida;
    }

    /**
     * Busca un edificio por su ID en el arreglo de Edificios
     * 
     * @param edificios es un arreglo de objetos de la clase Edificio
     * @return El método devuelve un objeto Edificio.
     * @author Daniel Lima
     */
    public static Edificio codigo(Edificio[] edificios) {
        Edificio salida = new Edificio();
        int id, i;
        boolean encontrado = false;
        do {
            i = 0;
            System.out.print("Ingrese ID: ");
            id = entrada.nextInt();
            entrada.nextLine();
            while (!encontrado && i < edificios.length) {
                if (edificios[i].getNumId() == id) {
                    salida = edificios[i];
                    encontrado = true;
                }
                i++;
            }
            if (!encontrado) {
                System.out.println("+--Error!---------------------+\n" +
                        "| ID no encontrado            |\n" +
                        "| Ingrese un nuevo ID         |\n" +
                        "+-----------------------------+");
            }
        } while (!encontrado);
        return salida;
    }

    /**
     * Busca un departamento por su código en el arreglo de Departamentos
     * 
     * @param departamentos es un arreglo de objetos de la clase Departamento
     * @return El método devuelve un objeto Departamento
     * @author Daniel Lima
     */
    public static Departamento codigo(Departamento[] departamentos) {
        Departamento salida = new Departamento();
        int i;
        String codigo;
        boolean encontrado = false;
        do {
            i = 0;
            System.out.print("Ingrese Codigo: ");
            codigo = entrada.nextLine();
            while (!encontrado && i < departamentos.length) {
                if (departamentos[i].getCodigo().equals(codigo)) {
                    salida = departamentos[i];
                    encontrado = true;
                }
                i++;
            }
            if (!encontrado) {
                System.out.println("+--Error!---------------------+\n" +
                        "| Codigo no encontrado        |\n" +
                        "| Ingrese un nuevo codigo     |\n" +
                        "+-----------------------------+");
            }
        } while (!encontrado);
        return salida;
    }

    /**
     * Busca un contrato por su ID y lo devuelve
     * 
     * @param contratos es un arreglo de objetos
     * @return El método devuelve un objeto del tipo Contrato
     * @author Daniel Lima
     */
    public static Contrato codigo(Contrato[] contratos) {
        Contrato salida = new Contrato();
        int id, i;
        boolean encontrado = false;
        do {
            i = 0;
            System.out.print("Ingrese ID: ");
            id = entrada.nextInt();
            entrada.nextLine();
            while (!encontrado && i < contratos.length) {
                if (contratos[i].getId() == id) {
                    salida = contratos[i];
                    encontrado = true;
                }
                i++;
            }
            if (!encontrado) {
                System.out.println("+--Error!---------------------+\n" +
                        "| ID no encontrado            |\n" +
                        "| Ingrese un nuevo ID         |\n" +
                        "+-----------------------------+");
            }
        } while (!encontrado);
        return salida;
    }
}

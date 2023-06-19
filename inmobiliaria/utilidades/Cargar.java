package inmobiliaria.utilidades;

import java.util.Scanner;

import inmobiliaria.contratos.Contrato;
import inmobiliaria.inmuebles.*;
import inmobiliaria.personas.*;

/**
 * Clase para crear objetos de otras clases.
 * Tambien verifica si un valor ingresado es entero o decimal
 * 
 * @author Daniel Lima
 */
public class Cargar {
    static Scanner entrada = new Scanner(System.in);

    /**
     * Crea un nuevo objeto Propietario y lo retorna
     * 
     * @return El método devuelve un objeto Propietario
     * @author Daniel Lima
     */
    public static Propietario propietario() {
        // Metodo para cargar un objeto de la clase Propietario

        // Asignacion de variables necesarias
        Propietario duenio;
        String direccion;
        String nombre, apellido;
        int documento, telefono;

        // Se cargan los datos solicitando al usuario
        System.out.print("Ingrese el DNI: ");
        documento = entero();
        System.out.print("Ingrese el nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Ingrese el apellido: ");
        apellido = entrada.nextLine();
        System.out.print("Ingrese el numero de telefono: ");
        telefono = entero();
        System.out.print("Ingrese la direccion: ");
        direccion = entrada.nextLine();

        // Se crea el objeto
        duenio = new Propietario(documento, apellido, nombre, telefono, direccion);

        // Se devuelve el objeto
        return duenio;
    }

    /**
     * Crea un nuevo objeto Inquilino y lo retorna
     * 
     * @return El método devuelve un objeto Inquilino.
     * @author Daniel Lima
     */
    public static Inquilino inquilino() {
        // Metodo para cargar un objeto de la clase Inquilino

        // Asignacion de variables necesarias
        String trabajo;
        double sueldo;
        boolean debe, correcto;
        int auxiliar;
        Inquilino cliente;
        String nombre, apellido;
        int documento, telefono;

        // Se predeterminan algunos valores necesarios
        correcto = false;
        debe = false;

        // Se cargan los datos solicitando al usuario
        System.out.print("Ingrese el DNI: ");
        documento = entero();
        System.out.print("Ingrese el nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Ingrese el apellido: ");
        apellido = entrada.nextLine();
        System.out.print("Ingrese el numero de telefono: ");
        telefono = entero();
        System.out.print("Ingrese el lugar donde trabaja: ");
        trabajo = entrada.nextLine();
        System.out.print("Ingrese el sueldo: $");
        sueldo = decimal();

        /*
         * Se carga un valor del tipo logico, lo que hace es verificar que se
         * ingrese una opcion correcta, y le da su valor necesario
         */
        while (!correcto) {
            System.out.println("El inquilino es deudor? (1. Si / 2. No)");
            auxiliar = entero();
            if (auxiliar == 1) {
                debe = true;
                correcto = true;
            } else if (auxiliar == 2) {
                debe = false;
                correcto = true;
            } else {
                System.out.println("+--Error!---------------------+\n" +
                        "| Ingrese una opción válida   |\n" +
                        "+-----------------------------+");
            }
        }

        // Se crea el objeto
        cliente = new Inquilino(documento, apellido, nombre, telefono, trabajo, sueldo,
                debe);

        // Se devuelve el objeto
        return cliente;
    }

    /**
     * Crea un nuevo objeto Departamento y lo retorna
     * 
     * @param propietario es un objeto de la clase Propietario
     * @return El método devuelve un objeto Departamento.
     * @author Daniel Lima
     */
    public static Departamento departamento(Propietario propietario) {
        // Metodo para cargar un objeto de la clase Departamento

        // Asignacion de variables necesarias
        Departamento salida;
        String codigo;
        double dimensiones, valorAlquiler;
        int cantAmbientes, auxiliar;
        boolean disponibilidad, correcto;

        // Se predeterminan algunos valores necesarios
        disponibilidad = false;
        correcto = false;

        // Se cargan los datos solicitando al usuario
        System.out.print("Ingrese el codigo: ");
        codigo = entrada.nextLine();
        System.out.print("Ingrese las dimensiones: ");
        dimensiones = decimal();
        System.out.print("Ingrese la cantidad de ambientes: ");
        cantAmbientes = entero();

        /*
         * Se carga un valor del tipo logico, lo que hace es verificar que se
         * ingrese una opcion correcta, y le da su valor necesario
         */
        while (!correcto) {
            System.out.println("Se encuentra disponible? (1. Si / 2. No)");
            auxiliar = entero();
            if (auxiliar == 1) {
                disponibilidad = true;
                correcto = true;
            } else if (auxiliar == 2) {
                disponibilidad = false;
                correcto = true;
            } else {
                System.out.println("+--Error!---------------------+\n" +
                        "| Ingrese una opción válida   |\n" +
                        "+-----------------------------+");
            }
        }
        System.out.print("Ingrese el valor del alquiler: $");
        valorAlquiler = decimal();

        // Se crea el objeto
        salida = new Departamento(codigo, dimensiones, cantAmbientes, disponibilidad, valorAlquiler, propietario);

        // Se devuelve el objeto
        return salida;
    }

    /**
     * Crea un nuevo objeto Edificio y lo retorna
     * 
     * @return El método devuelve un objeto Edificio.
     * @author Daniel Lima
     */
    public static Edificio edificio() {
        // Metodo para cargar un objeto de la clase Edificio

        // Asignacion de variables necesariasScanner entrada = new Scanner(System.in);
        Edificio salida;
        int id, pisos;
        String direccion;
        double sup;

        // Se cargan los datos solicitando al usuario
        System.out.print("Ingrese el codigo de identificacion, es solo numeros: ");
        id = entero();
        System.out.print("Ingrese la direccion: ");
        direccion = entrada.nextLine();
        System.out.print("Ingrese la superficie total del edificio: ");
        sup = decimal();
        System.out.print("Ingrese la cantidad de pisos que tiene: ");
        pisos = entero();

        // Se crea el objeto
        salida = new Edificio(id, direccion, sup, pisos);

        // Se devuelve el objeto
        return salida;
    }

    /**
     * Crea un nuevo objeto Contrato y lo retorna
     * 
     * @param depto    Departamento
     * @param prop     Propietario
     * @param cliente  Inquilino
     * @param edificio Edificio
     * @return Un nuevo objeto de la clase Contrato
     * @author Daniel Lima
     */
    public static Contrato contrato(Departamento depto, Propietario prop, Inquilino cliente, Edificio edificio) {
        // Metodo para cargar un objeto de la clase Contrato

        // Asignacion de variables necesarias
        int id, fechaInicio, duracion, tasaIncremento;
        double montoAlquiler, deposito;
        Contrato salida;

        // Se predeterminan algunos valores necesarios
        montoAlquiler = depto.getValorAlquiler();
        deposito = depto.getValorAlquiler() / 2;

        // Se cargan los datos solicitando al usuario
        System.out.print("Ingrese el codigo de identificacion del contrato: ");
        id = entero();
        System.out.print("Ingrese la fecha de inicio en formato aaaammdd, sin separaciones: ");
        fechaInicio = entero();
        System.out.print("Ingrese la duracion del contrato en años: ");
        duracion = entero();
        System.out.print("Ingrese la tasa de incremento anual: ");
        tasaIncremento = entero();

        // Se crea el objeto
        salida = new Contrato(id, fechaInicio, edificio, depto, prop, cliente, montoAlquiler, deposito, duracion,
                tasaIncremento);
        salida.iniciarContrato();

        // Se devuelve el objeto
        return salida;
    }

    /**
     * Toma un valor de entrada del usuario, verifica si es un entero, si lo es lo
     * devuelve.
     * Si no lo es imprime un mensaje de error y pide otro valor
     * 
     * @return Devuelve un valor entero.
     * @author Daniel Lima
     */
    public static int entero() {
        int salida = 0;
        boolean comprobacion = false;
        while (!comprobacion) {
            try {
                salida = entrada.nextInt();
                entrada.nextLine();
                comprobacion = true;
            } catch (Exception e) {
                entrada.nextLine();
                System.out.println("+--Error!---------------------+\n" +
                        "| Solo puede ingresar números |\n" +
                        "+-----------------------------+");
            }
        }
        return salida;
    }

    /**
     * Toma un valor de entrada del usuario, verifica si es un decimal, si lo es lo
     * devuelve.
     * Si no lo es imprime un mensaje de error y pide otro valor
     * 
     * @return Devuelve un valor decimal.
     * @author Daniel Lima
     */
    public static double decimal() {
        double salida = 0;
        boolean comprobacion = false;
        while (!comprobacion) {
            try {
                salida = entrada.nextDouble();
                entrada.nextLine();
                comprobacion = true;
            } catch (Exception e) {
                entrada.nextLine();
                System.out.println("+--Error!---------------------+\n" +
                        "| Solo puede ingresar números |\n" +
                        "+-----------------------------+");
            }
        }
        return salida;
    }

    /**
     * Metodo que llena un arreglo de contratos con objetos vacios
     * 
     * @param contratos es un arreglo de la clase Contrato
     * @author Daniel Lima
     */
    public static void vacio(Contrato[] contratos) {
        int i;
        for (i = 0; i < contratos.length; i++) {
            contratos[i] = new Contrato();
        }
    }

    /**
     * Metodo que llena un arreglo de departamentos con objetos vacios
     * 
     * @param departamentos es un arreglo de la clase Departamento
     * @author Daniel Lima
     */
    public static void vacio(Departamento[] departamentos) {
        int i;
        for (i = 0; i < departamentos.length; i++) {
            departamentos[i] = new Departamento();
        }
    }

    /**
     * Metodo que llena un arreglo de edificios con objetos vacios
     * 
     * @param edificios es un arreglo de la clase Edificio
     * @author Daniel Lima
     */
    public static void vacio(Edificio[] edificios) {
        int i;
        for (i = 0; i < edificios.length; i++) {
            edificios[i] = new Edificio();
        }
    }

    /**
     * Metodo que llena un arreglo de inquilinos con objetos vacios
     * 
     * @param inquilinos es un arreglo de la clase Inquilino
     * @author Daniel Lima
     */
    public static void vacio(Inquilino[] inquilinos) {
        int i;
        for (i = 0; i < inquilinos.length; i++) {
            inquilinos[i] = new Inquilino();
        }
    }

    /**
     * Metodo que llena un arreglo de propietarios con objetos vacios
     * 
     * @param propietarios es un arreglo de la clase Propietario
     * @author Daniel Lima
     */
    public static void vacio(Propietario[] propietarios) {
        int i;
        for (i = 0; i < propietarios.length; i++) {
            propietarios[i] = new Propietario();
        }
    }
}

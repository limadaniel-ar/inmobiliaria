package inmobiliaria;

import java.util.Scanner;

import inmobiliaria.contratos.Contrato;
import inmobiliaria.inmuebles.*;
import inmobiliaria.personas.*;
import inmobiliaria.utilidades.*;

public class JPOOBrokers {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        // Asignacion de variables necesarias
        Contrato[] acuerdo = new Contrato[100];
        Departamento[] depto = new Departamento[100];
        Edificio[] torre = new Edificio[100];
        Inquilino[] cliente = new Inquilino[100];
        Propietario[] duenio = new Propietario[100];

        Propietario propAux;
        Inquilino inqAux;
        Edificio edifAux;
        Departamento deptoAux;
        int posC = 0, posD = 0, posE = 0, posI = 0, posP = 0, opcion;
        boolean finPrograma = false;
        boolean finMenuContrato, finCargaEdificio, finMenuCarga, finCargaPropietario, correcto, finCargaInquilino,
                finCargaDepartamento, finMenuMuestra, finMenuHerramientas;

        // Cargamos todos los arreglos con objetos vacios
        Cargar.vacio(acuerdo);
        Cargar.vacio(depto);
        Cargar.vacio(torre);
        Cargar.vacio(cliente);
        Cargar.vacio(duenio);
        
        // Un menu principal sobre el alquiler de departamentos
        do {
            finMenuCarga = false;
            finMenuContrato = false;
            finMenuMuestra = false;
            finMenuHerramientas = false;
            Menu.principal();
            opcion = Cargar.entero();
            switch (opcion) {
                case 1:
                    // Menu para ingresar datos
                    do {
                        Menu.carga();
                        opcion = Cargar.entero();
                        switch (opcion) {
                            // Seccion para cargar Propietarios
                            case 1:
                                System.out.println("+-----------------------------+\n" +
                                        "|    Carga de Propietarios    |\n" +
                                        "+-----------------------------+");
                                finCargaPropietario = false;
                                do {
                                    duenio[posP] = Cargar.propietario();
                                    correcto = false;
                                    while (!correcto) {
                                        System.out.println("+-----------------------------+\n" +
                                                "| Desea cargar otro Prop.     |\n" +
                                                "| 1. Si                       |\n" +
                                                "| 2. No                       |\n" +
                                                "+-----------------------------+");
                                        opcion = Cargar.entero();
                                        if (opcion == 1) {
                                            correcto = true;
                                        } else if (opcion == 2) {
                                            correcto = true;
                                            finCargaPropietario = true;
                                        } else {
                                            System.out.println("+--Error!---------------------+\n" +
                                                    "| Ingrese una opción válida   |\n" +
                                                    "+-----------------------------+");
                                        }
                                    }
                                    posP++;
                                } while (!finCargaPropietario && posP < duenio.length);
                                break;
                            // Seccion para cargar Inquilinos
                            case 2:
                                System.out.println("+-----------------------------+\n" +
                                        "|     Carga de Inquilinos     |\n" +
                                        "+-----------------------------+");
                                finCargaInquilino = false;
                                do {
                                    cliente[posI] = Cargar.inquilino();
                                    correcto = false;
                                    while (!correcto) {
                                        System.out.println("+-----------------------------+\n" +
                                                "| Desea cargar otro inq.      |\n" +
                                                "| 1. Si                       |\n" +
                                                "| 2. No                       |\n" +
                                                "+-----------------------------+");
                                        opcion = Cargar.entero();
                                        if (opcion == 1) {
                                            correcto = true;
                                        } else if (opcion == 2) {
                                            correcto = true;
                                            finCargaInquilino = true;
                                        } else {
                                            System.out.println("+--Error!---------------------+\n" +
                                                    "| Ingrese una opción válida   |\n" +
                                                    "+-----------------------------+");
                                        }
                                    }
                                    posI++;
                                } while (!finCargaInquilino && posI < cliente.length);
                                break;
                            // Seccion para cargar Departamentos
                            case 3:
                                System.out.println("+-----------------------------+\n" +
                                        "|    Carga de Departamentos   |\n" +
                                        "+-----------------------------+");
                                System.out.println("+-----------------------------+\n" +
                                        "|    Ingrese un Propietario   |\n" +
                                        "+-----------------------------+");
                                finCargaDepartamento = false;
                                do {
                                    propAux = Buscar.documento(duenio);
                                    depto[posD] = Cargar.departamento(propAux);
                                    correcto = false;
                                    while (!correcto) {
                                        System.out.println("+-----------------------------+\n" +
                                                "| Desea cargar otro depto.    |\n" +
                                                "| 1. Si                       |\n" +
                                                "| 2. No                       |\n" +
                                                "+-----------------------------+");
                                        opcion = Cargar.entero();
                                        if (opcion == 1) {
                                            correcto = true;
                                        } else if (opcion == 2) {
                                            correcto = true;
                                            finCargaDepartamento = true;
                                        } else {
                                            System.out.println("+--Error!---------------------+\n" +
                                                    "| Ingrese una opción válida   |\n" +
                                                    "+-----------------------------+");
                                        }
                                    }
                                    posD++;
                                } while (!finCargaDepartamento && posD < depto.length);
                                break;
                            // Seccion para cargar Edificios
                            case 4:
                                System.out.println("+-----------------------------+\n" +
                                        "|     Carga de Edificios      |\n" +
                                        "+-----------------------------+");
                                finCargaEdificio = false;
                                do {
                                    torre[posE] = Cargar.edificio();
                                    correcto = false;
                                    while (!correcto) {
                                        System.out.println("+-----------------------------+\n" +
                                                "| Desea cargar otro edificio  |\n" +
                                                "| 1. Si                       |\n" +
                                                "| 2. No                       |\n" +
                                                "+-----------------------------+");
                                        opcion = Cargar.entero();
                                        if (opcion == 1) {
                                            correcto = true;
                                        } else if (opcion == 2) {
                                            correcto = true;
                                            finCargaEdificio = true;
                                        } else {
                                            System.out.println("+--Error!---------------------+\n" +
                                                    "|  Ingrese una opción válida  |\n" +
                                                    "+-----------------------------+");
                                        }
                                    }
                                    posE++;
                                } while (!finCargaEdificio && posE < torre.length);
                                break;
                            // Seccion para salir del menu de cargas
                            case 5:
                                finMenuCarga = true;
                                break;
                            default:
                                System.out.println("+--Error!---------------------+\n" +
                                        "| Ingrese una opción válida   |\n" +
                                        "+-----------------------------+");
                                break;
                        }
                    } while (!finMenuCarga);
                    break;
                // Seccion para crear Contratos
                case 2:
                    System.out.println("+-----------------------------+\n" +
                            "|       Crear Contratos       |\n" +
                            "+-----------------------------+");
                    do {
                        System.out.println("+-----------------------------+\n" +
                                "|    Ingrese un Propietario   |\n" +
                                "+-----------------------------+");
                        propAux = Buscar.documento(duenio);
                        System.out.println("+-----------------------------+\n" +
                                "|    Ingrese un Inquilino     |\n" +
                                "+-----------------------------+");
                        inqAux = Buscar.documento(cliente);
                        System.out.println("+-----------------------------+\n" +
                                "|    Ingrese un Edificio      |\n" +
                                "+-----------------------------+");
                        edifAux = Buscar.codigo(torre);
                        System.out.println("+-----------------------------+\n" +
                                "|   Ingrese un Departamento   |\n" +
                                "+-----------------------------+");
                        deptoAux = Buscar.codigo(depto);
                        acuerdo[posC] = Cargar.contrato(deptoAux, propAux, inqAux, edifAux);
                        correcto = false;
                        while (!correcto) {
                            System.out.println("+-----------------------------+\n" +
                                    "| Desea cargar otro contrato  |\n" +
                                    "| 1. Si                       |\n" +
                                    "| 2. No                       |\n" +
                                    "+-----------------------------+");
                            opcion = Cargar.entero();
                            if (opcion == 1) {
                                correcto = true;
                            } else if (opcion == 2) {
                                correcto = true;
                                finMenuContrato = true;
                            } else {
                                System.out.println("+--Error!---------------------+\n" +
                                        "| Ingrese una opción válida   |\n" +
                                        "+-----------------------------+");
                            }
                        }
                        posC++;
                    } while (!finMenuContrato && posC < acuerdo.length);
                    break;
                // Menu para buscar los datos cargados
                case 3:
                    Menu.buscar();
                    opcion = Cargar.entero();
                    while (!finMenuMuestra) {
                        switch (opcion) {
                            // Seccion para buscar Propietarios
                            case 1:
                                System.out.println("+-----------------------------+\n" +
                                        "|     Buscar Propietario      |\n" +
                                        "+-----------------------------+");
                                System.out.println(Buscar.documento(duenio).toString());
                                finMenuMuestra = true;
                                break;
                            // Seccion para buscar Inquilinos
                            case 2:
                                System.out.println("+-----------------------------+\n" +
                                        "|      Buscar Inquilino       |\n" +
                                        "+-----------------------------+");
                                System.out.println(Buscar.documento(cliente).toString());
                                finMenuMuestra = true;
                                break;
                            // Seccion para buscar Departamentos
                            case 3:
                                System.out.println("+-----------------------------+\n" +
                                        "|     Buscar Departamento     |\n" +
                                        "+-----------------------------+");
                                System.out.println(Buscar.codigo(depto).toString());
                                finMenuMuestra = true;
                                break;
                            // Seccion para buscar Edificios
                            case 4:
                                System.out.println("+-----------------------------+\n" +
                                        "|      Buscar Edificio        |\n" +
                                        "+-----------------------------+");
                                System.out.println(Buscar.codigo(torre).toString());
                                finMenuMuestra = true;
                                break;
                            // Seccion para buscar Contratos
                            case 5:
                                System.out.println("+-----------------------------+\n" +
                                        "|      Buscar Contrato        |\n" +
                                        "+-----------------------------+");
                                System.out.println(Buscar.codigo(acuerdo).toString());
                                finMenuMuestra = true;
                                break;
                            // Seccion para salir del menu de muestra de datos
                            case 6:
                                finMenuMuestra = true;
                                break;
                            default:
                                System.out.println("+--Error!---------------------+\n" +
                                        "| Ingrese una opción válida   |\n" +
                                        "+-----------------------------+");
                                break;
                        }
                    }
                    break;
                case 4:
                    Menu.herramientas();
                    opcion = Cargar.entero();
                    while (!finMenuHerramientas) {
                        switch (opcion) {
                            case 1:
                                System.out.println("+-----------------------------+\n" +
                                        "|    Ingrese un Propietario   |\n" +
                                        "+-----------------------------+");
                                propAux = Buscar.documento(duenio);
                                System.out.println("Tiene " + propAux.cantDeptos(depto) + " Departamentos");
                                break;
                            case 2:
                                System.out.println("+-----------------------------+\n" +
                                        "|    Ingrese un Inquilino     |\n" +
                                        "+-----------------------------+");
                                inqAux = Buscar.documento(cliente);
                                System.out.println("La Dirección es " + inqAux.averiguarDireccion(acuerdo));
                                break;
                            case 3:
                                System.out.println("+-----------------------------+\n" +
                                        "|    Ingrese un Edificio      |\n" +
                                        "+-----------------------------+");
                                edifAux = Buscar.codigo(torre);
                                System.out.println("Tiene " + edifAux.cantDeptosAlquilados(acuerdo) + " Departamentos");
                                break;
                            case 4:
                                System.out.println("+-----------------------------+\n" +
                                        "|   Ingrese un Departamento   |\n" +
                                        "+-----------------------------+");
                                deptoAux = Buscar.codigo(depto);
                                System.out.println(deptoAux.consultarInquilino(acuerdo).toString());
                                break;
                            case 5:
                                System.out.println("+-----------------------------+\n" +
                                        "|     Ingrese un Contrato     |\n" +
                                        "+-----------------------------+");
                                Buscar.codigo(acuerdo).finalizarContrato();
                                System.out.println("+-----------------------------+\n" +
                                        "|     Contrato Finalizado     |\n" +
                                        "+-----------------------------+");
                                break;
                            case 6:
                                finMenuHerramientas = true;
                                break;
                            default:
                                System.out.println("+--Error!---------------------+\n" +
                                        "| Ingrese una opción válida   |\n" +
                                        "+-----------------------------+");
                                break;
                        }
                    }
                    break;
                case 5:
                    finPrograma = true;
                    System.out.println("+-----------------------------+\n" +
                            "|     Ahora puede apagar      |\n" +
                            "|          el equipo          |\n" +
                            "+-----------------------------+");
                    break;
                default:
                    System.out.println("+--Error!---------------------+\n" +
                            "| Ingrese una opción válida   |\n" +
                            "+-----------------------------+");
                    break;
            }
        } while (!finPrograma);
    }
}

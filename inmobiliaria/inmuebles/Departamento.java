package inmobiliaria.inmuebles;

import inmobiliaria.contratos.Contrato;
import inmobiliaria.personas.*;
import inmobiliaria.utilidades.Obligatorio;

public class Departamento implements Obligatorio {
    // Asignacion de atributos
    private String codigo;
    private double dimensiones;
    private int cantAmbientes;
    private boolean disponibilidad;
    private double valorAlquiler;
    private Propietario propietario;

    // Constructores
    public Departamento(String codigo, double dimensiones, int cantAmbientes, boolean disponibilidad,
            double valorAlquiler, Propietario propietario) {
        this.codigo = codigo;
        this.dimensiones = dimensiones;
        this.cantAmbientes = cantAmbientes;
        this.disponibilidad = disponibilidad;
        this.valorAlquiler = valorAlquiler;
        this.propietario = propietario;
    }

    public Departamento() {
        this.codigo = null;
        this.dimensiones = 0;
        this.cantAmbientes = 0;
        this.disponibilidad = false;
        this.valorAlquiler = 0;
        this.propietario = new Propietario();
    }

    // Observadores
    public String getCodigo() {
        return this.codigo;
    }

    public double getDimensiones() {
        return this.dimensiones;
    }

    public int getCantAmbientes() {
        return this.cantAmbientes;
    }

    public boolean isDisponibilidad() {
        return this.disponibilidad;
    }

    public double getValorAlquiler() {
        return this.valorAlquiler;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public String toString() {
        return "Departamento\n" +
                "   + Codigo: " + codigo + "\n" +
                "   + Dimensiones: " + dimensiones + "\n" +
                "   + Cantidad de Ambientes: " + cantAmbientes + "\n" +
                "   + Disponible: " + (disponibilidad ? "Si" : "No") + "\n" +
                "   + Valor del Alquiler: " + valorAlquiler + "\n" +
                "   + " + propietario.toString();
    }

    // Modificadores
    public void setDimensiones(double dimensiones) {
        this.dimensiones = dimensiones;
    }

    public void setCantAmbientes(int cantAmbientes) {
        this.cantAmbientes = cantAmbientes;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public void setValorAlquiler(double valorAlquiler) {
        this.valorAlquiler = valorAlquiler;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    // Metodos propios del tipo
    /**
     * Metodo que sirve para comparar si dos departamentos son idénticos
     * 
     * @param otro Departamento
     * @return un valor logico
     * @author Daniel Lima
     */
    public boolean equals(Departamento otro) {
        return this.codigo.equals(otro.codigo)
                && this.dimensiones == otro.dimensiones
                && this.cantAmbientes == otro.cantAmbientes
                && this.disponibilidad == otro.disponibilidad
                && this.valorAlquiler == otro.valorAlquiler
                && this.propietario.equals(otro.propietario);
    }

    /**
     * Metodo que sirve para consultar el inquilino que esta viviendo en el
     * departamento
     * 
     * @param acuerdo es un arreglo de Contrato
     * @return El metodo devuelve un Inquilino.
     * @author Daniel Lima
     */
    public Inquilino consultarInquilino(Contrato[] acuerdo) {
        Inquilino salida = new Inquilino(0, "", "", 0, "", 0, false);
        int i = 0;
        boolean listo = false;
        while (!listo && i < acuerdo.length) {
            if (this.equals(acuerdo[i].getDepartamento())) {
                salida = acuerdo[i].getInquilino();
                listo = true;
            }
        }
        return salida;
    }
}

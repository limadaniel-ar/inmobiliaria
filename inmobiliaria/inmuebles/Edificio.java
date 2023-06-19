package inmobiliaria.inmuebles;

import inmobiliaria.contratos.Contrato;
import inmobiliaria.utilidades.Obligatorio;

public class Edificio implements Obligatorio {
    // Asignacion de atributos
    private int numId;
    private String direccion;
    private double superficie;
    private int cantPisos;

    // Constructores
    public Edificio(int numId, String direccion, double superficie, int cantPisos) {
        this.numId = numId;
        this.direccion = direccion;
        this.superficie = superficie;
        this.cantPisos = cantPisos;
    }

    public Edificio() {
        this.numId = 0;
        this.direccion = null;
        this.superficie = 0;
        this.cantPisos = 0;
    }

    // Observadores
    public int getNumId() {
        return numId;
    }

    public String getDireccion() {
        return direccion;
    }

    public double getSuperficie() {
        return superficie;
    }

    public int getCantPisos() {
        return cantPisos;
    }

    public String toString() {
        return "Edificio\n" +
                "   + id: " + numId + "\n" +
                "   + Direccion: " + direccion + "\n" +
                "   + Superficie: " + superficie + "\n" +
                "   + Cantidad de Pisos: " + cantPisos;
    }

    // Modificadores
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public void setCantPisos(int cantPisos) {
        this.cantPisos = cantPisos;
    }

    // Metodos propios del tipo

    /**
     * Metodo que sirve para comparar si dos edificios son idénticos
     * 
     * @param otro Edificio
     * @return un valor logico
     * @author Daniel Lima
     */
    public boolean equals(Edificio otro) {
        return this.numId == otro.numId
                && this.direccion.equals(otro.direccion)
                && this.superficie == otro.superficie
                && this.cantPisos == otro.cantPisos;
    }

    /**
     * Metodo que nos devuelve la cantidad de departamentos alquilados que tiene el
     * edificio
     * 
     * @param acuerdo es un arreglo de Contrato
     * @return El numero de departamentos alquilados en el edificio
     * @author Daniel Lima
     */
    public int cantDeptosAlquilados(Contrato[] acuerdo) {
        int i, salida = 0;
        for (i = 0; i < acuerdo.length; i++) {
            if (this.equals(acuerdo[i].getEdificio())) {
                salida++;
            }
        }
        return salida;
    }
}

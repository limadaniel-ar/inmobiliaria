package inmobiliaria.personas;

import inmobiliaria.contratos.Contrato;
import inmobiliaria.utilidades.Obligatorio;

public class Inquilino extends Persona implements Obligatorio {
    // Asignacion de atributos
    private String empleo;
    private double ingresos;
    private boolean deudor;

    // Constructores
    public Inquilino(int dni, String apellido, String nombre, int telefono, String empleo, double ingresos,
            boolean deudor) {
        super(dni, apellido, nombre, telefono);
        this.empleo = empleo;
        this.ingresos = ingresos;
        this.deudor = deudor;
    }

    public Inquilino() {
        super();
        this.empleo = null;
        this.ingresos = 0;
        this.deudor = false;
    }

    // Observadores
    public String getEmpleo() {
        return this.empleo;
    }

    public double getIngresos() {
        return this.ingresos;
    }

    public boolean isDeudor() {
        return this.deudor;
    }

    @Override
    public String toString() {
        return "Inquilino\n" +
                "   # DNI: " + dni + "\n" +
                "   # Apellido: " + apellido + "\n" +
                "   # Nombre: " + nombre + "\n" +
                "   # Telefono: " + telefono + "\n" +
                "   # Trabaja en: " + this.empleo + "\n" +
                "   # Sueldo: $" + this.ingresos + "\n" +
                "   # Deudor: " + (this.deudor ? "Si" : "No");
    }

    // Modificadores
    public void setEmpleo(String empleo) {
        this.empleo = empleo;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public void setDeudor(boolean deudor) {
        this.deudor = deudor;
    }

    // Metodos propios del tipo
    /**
     * Metodo que sirve para comparar si dos inquilinos son idénticos
     * 
     * @param otro Inquilino
     * @return un valor logico
     * @author Daniel Lima
     */
    public boolean equals(Inquilino otro) {
        return this.dni == otro.dni
                && this.apellido.equals(otro.apellido)
                && this.nombre.equals(otro.nombre)
                && this.telefono == otro.telefono
                && this.empleo.equals(otro.empleo)
                && this.ingresos == otro.ingresos
                && this.deudor == otro.deudor;
    }

    /**
     * Metodo que nos devuelve la direccion donde se encuentra alquilando el
     * inquilino
     * 
     * @param acuerdo es un arreglo de Contrato
     * @return La direccion del edificio donde vive
     * @author Daniel Lima
     */
    public String averiguarDireccion(Contrato[] acuerdo) {
        int i = 0;
        boolean listo = false;
        String salida = new String();
        while (!listo && i < acuerdo.length) {
            if (this.equals(acuerdo[i].getInquilino())) {
                salida = acuerdo[i].getEdificio().getDireccion();
                listo = true;
            }
            i++;
        }
        return salida;
    }
}

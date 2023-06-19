package inmobiliaria.personas;

import inmobiliaria.inmuebles.Departamento;
import inmobiliaria.utilidades.Obligatorio;

public class Propietario extends Persona implements Obligatorio {
    // Asignacion de atributos
    private String direccion;

    // Constructores
    public Propietario(int dni, String apellido, String nombre, int telefono, String direccion) {
        super(dni, apellido, nombre, telefono);
        this.direccion = direccion;
    }

    public Propietario() {
        super();
        this.direccion = null;
    }

    // Observadores
    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Propietario\n" +
                "   # DNI: " + dni + "\n" +
                "   # Apellido: " + apellido + "\n" +
                "   # Nombre: " + nombre + "\n" +
                "   # Telefono: " + telefono + "\n" +
                "   # Dirección: " + this.direccion;
    }

    // Modificadores
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Metodos propios del tipo
    /**
     * Metodo que sirve para comparar si dos propietarios son idénticos
     * 
     * @param otroPropietario Propietario
     * @return un valor logico
     * @author Daniel Lima
     */
    public boolean equals(Propietario otroPropietario) {
        return this.dni == otroPropietario.dni
                && this.apellido.equals(otroPropietario.apellido)
                && this.nombre.equals(otroPropietario.nombre)
                && this.telefono == otroPropietario.telefono
                && this.direccion.equals(otroPropietario.direccion);
    }

    /**
     * Metodo que determina la cantidad de departamentos que posee un propietario
     * 
     * @param deptos es un arreglo de Departamento
     * @return El numero de departamentos que posee un propietario
     * @author Daniel Lima
     */
    public int cantDeptos(Departamento[] deptos) {
        int salida = 0;
        int i;
        for (i = 0; i < deptos.length; i++) {
            if (this.getDni() == deptos[i].getPropietario().getDni()) {
                salida++;
            }
        }
        return salida;
    }
}
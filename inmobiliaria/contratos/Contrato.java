package inmobiliaria.contratos;

import inmobiliaria.inmuebles.*;
import inmobiliaria.personas.*;
import inmobiliaria.utilidades.Obligatorio;

public class Contrato implements Obligatorio {
    // Asignacion de atributos
    private int id;
    private int fechaInicio;
    private Edificio edificio;
    private Departamento departamento;
    private Propietario propietario;
    private Inquilino inquilino;
    private double montoAlquiler;
    private double deposito;
    private int duracion;
    private int tasaIncremento;

    // Constructores
    public Contrato(int id, int fechaInicio, Edificio edificio, Departamento departamento, Propietario propietario,
            Inquilino inquilino,
            double montoAlquiler, double deposito, int duracion, int tasaIncremento) {
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.edificio = edificio;
        this.departamento = departamento;
        this.propietario = propietario;
        this.inquilino = inquilino;
        this.montoAlquiler = montoAlquiler;
        this.deposito = deposito;
        this.duracion = duracion;
        this.tasaIncremento = tasaIncremento;
    }

    public Contrato() {
        this.id = 0;
        this.fechaInicio = 0;
        this.edificio = new Edificio();
        this.departamento = new Departamento();
        this.propietario = new Propietario();
        this.inquilino = new Inquilino();
        this.montoAlquiler = 0;
        this.deposito = 0;
        this.duracion = 0;
        this.tasaIncremento = 0;
    }

    // Observadores
    public int getId() {
        return id;
    }

    public int getFechaInicio() {
        return fechaInicio;
    }

    public Edificio getEdificio() {
        return edificio;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public Inquilino getInquilino() {
        return inquilino;
    }

    public double getMontoAlquiler() {
        return montoAlquiler;
    }

    public double getDeposito() {
        return deposito;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getTasaIncremento() {
        return tasaIncremento;
    }

    public String toString() {
        return "Contrato:\n" +
                "   - id: " + id + "\n" +
                "   - Fecha de Inicio: " + fechaInicio + "\n" +
                "   - " + propietario.toString() + "\n" +
                "   - " + inquilino.toString() + "\n" +
                "   - " + departamento.toString() + "\n" +
                "   - " + edificio.toString() + "\n" +
                "   - Monto del Alquiler: $" + montoAlquiler + "\n" +
                "   - Deposito: $" + deposito + "\n" +
                "   - Duracion: " + duracion + " años" + "\n" +
                "   - Tasa de Incremento: " + tasaIncremento + "%";
    }

    // Modificadores
    public void setFechaInicio(int fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setEdificio(Edificio edificio) {
        this.edificio = edificio;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public void setInquilino(Inquilino inquilino) {
        this.inquilino = inquilino;
    }

    public void setMontoAlquiler(double montoAlquiler) {
        this.montoAlquiler = montoAlquiler;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setTasaIncremento(int tasaIncremento) {
        this.tasaIncremento = tasaIncremento;
    }

    // Metodos propios del tipo
    /**
     * Metodo que sirve para comparar si dos contratos son idénticos
     * 
     * @param otro Contrato
     * @return un valor logico
     * @author Daniel Lima
     */
    public boolean equals(Contrato otro) {
        return this.id == otro.id
                && this.fechaInicio == otro.fechaInicio
                && this.edificio.equals(otro.edificio)
                && this.departamento.equals(otro.departamento)
                && this.propietario.equals(otro.propietario)
                && this.inquilino.equals(otro.inquilino)
                && this.montoAlquiler == otro.montoAlquiler
                && this.deposito == otro.deposito
                && this.duracion == otro.duracion
                && this.tasaIncremento == otro.tasaIncremento;
    }

    /**
     * Al iniciar el contrato el departamento deja de estar disponible
     * 
     * @author Daniel Lima
     */
    public void iniciarContrato() {
        this.departamento.setDisponibilidad(false);
    }

    /**
     * Al finalizar el contrato el departamento vuelve a estar disponible y el
     * inquilino deja de ser un deudor
     * 
     * @author Daniel Lima
     */
    public void finalizarContrato() {
        this.departamento.setDisponibilidad(true);
        this.inquilino.setDeudor(false);
    }
}

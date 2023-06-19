package inmobiliaria.personas;

public abstract class Persona {
    // Asignacion de atributos
    protected int dni;
    protected String apellido;
    protected String nombre;
    protected int telefono;

    // Constructores
    public Persona(int dni, String apellido, String nombre, int telefono) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public Persona() {
        this.dni = 0;
        this.apellido = null;
        this.nombre = null;
        this.telefono = 0;
    }

    // Observadores
    public int getDni() {
        return this.dni;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public String toString() {
        return "DNI: " + dni +
                ", Apellido: " + apellido +
                ", Nombre: " + nombre +
                ", Telefono: " + telefono;
    }

    // Modificadores
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
}

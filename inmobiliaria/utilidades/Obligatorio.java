package inmobiliaria.utilidades;

/**
 * Interface que determina que metodos debe contener toda clase
 * para que sea considerada un objeto
 * 
 * @author Daniel Lima
 */
public interface Obligatorio {

    /**
     * Metodo que sirve para comparar si dos objetos son idénticos
     * 
     * @param otro Objeto
     * @return un valor logico
     * @author Daniel Lima
     */
    boolean equals(Object otro);

    /**
     * Metodo que devuelve una cadena de caracteres conteniendo
     * todos los atributos del Objeto
     * 
     * @return una cadena de caracteres
     * @author Daniel Lima
     */
    String toString();
}
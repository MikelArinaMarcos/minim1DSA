import java.util.LinkedList;
import java.util.List;

public class User {

    /**
     * Creación de las variable que vamos a utilizar para definir un usuario:
     * nif (como identificador), nombre, puntos y partidaList (como la lista
     * de todas las partidas que ha realizado ese usuario).
     */
    private final String nif;
    private final String nombre;
    private final int puntos;
    List<Partida> partidaList;

    /**
     * Creación de un nuevo usuario con sus datos.
     */
    public User(String nif, String nombre, int puntos){
        this.nif = nif;
        this.nombre = nombre;
        this.puntos = puntos;
    }

    /**
     * Añadimos una nueva partida a ese usuario.
     */
    public void addPartida(Partida p){
        this.partidaList.add(p);
    }
}

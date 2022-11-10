import java.util.HashMap;
import java.util.List;
import java.util.Queue;

public class GestorImpl implements Gestor {

    public GestorImpl(){
        this.informacion = new HashMap<String, Info>();
    }

    List<User> usuarios;
    Queue<Partida> partidas;
    HashMap<String, Info> informacion;

    /**
     * Creación de una nueva partida en la que se indica el identificador,
     * la descripción de la partida y el número de niveles.
     */
    @Override
    public void addPartida(String idPartida, String descripcion, String numNiveles) {
        this.partidas.add(new Partida(idPartida, descripcion, numNiveles));
    }

    /**
     * Creación de un nuevo usuario en el que se indica su identificador,
     * su nombre y el número de puntos que tiene.
     */
    public void addUser(String idUser, String name, int points){
        this.usuarios.put(idUser, new User(idUser, name, points));
    }

    /**
     * Listado de los usuarios que han participado en una partida
     * ordenados (descendientemente) por puntuación.
     */
    @Override
    public List<User> usersByPoints() {
        return this.usuarios;
    }

    /**
     * Listado de las partidas que ha jugado un usuario.
     */
    @Override
    public List<Partida> partidasByUser(String idUser) {
        return null;
    }

    @Override
    public List<User> usersInformation() {
        return null;
    }

    @Override
    public Partida getPartida() {

        Partida p = this.partidas.peek();
        procces(p);

        User user = p.getUser();

        user.addPartida(p);

        return p;
    }

    private void procces(Partida p) {
        int q;
        for (Item i: p.items()){
            q = i.q;

        }
    }
}

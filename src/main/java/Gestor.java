import java.util.List;

public interface Gestor {

    public void addPartida(Partida p);

    void addPartida(String idPartida, String descripcion, String numNiveles);

    public List<User> usersByPoints();
    public List<Partida> partidasByUser(String idUser);
    public List<User> usersInformation();
    public Partida getPartida();
}

import java.util.List;

public interface Gestor {

    public void addPartida(Partida p);
    public List<User> usersByPoints();
    public List<Partida> partidasByUser(String idUser);
    public List<User> usersInformation();
}

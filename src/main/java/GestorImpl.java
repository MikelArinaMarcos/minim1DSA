import java.util.*;

public class GestorImpl implements Gestor {

    List<Juego> juegos;
    Queue<Partida> partidas;
    HashMap<String, Usuario> usuarios;

    public GestorImpl(){
        this.juegos = new ArrayList<Juego>();
        this.partidas = new LinkedList<>();
        this.usuarios = new HashMap<String, Usuario>();
    }


    @Override
    public void addJuego(String idJuego, String descripcion, String nivel) {
        this.juegos.add(new Juego(idJuego, descripcion, nivel));
    }

    @Override
    public void addPartida(String idJuego, String idUsuario) {
        this.partidas.add(new Partida(idJuego, idUsuario));
    }

    @Override
    public Usuario getNivel(String idUsuario) {
        return null;
    }

    @Override
    public Partida getPuntuacion(String idUsuario) {
        return null;
    }

    @Override
    public Juego subirNivel(String idUsuario, Integer puntosConseguidos, String fecha) {
        return null;
    }

    @Override
    public Partida finPartida(String idUsuario) {
        return null;
    }

    @Override
    public List<Usuario> usuariosPorPuntos() {
        return null;
    }

    @Override
    public List<Partida> partidasPorUsuario(String idUsuario) {
        return null;
    }

    @Override
    public List<Usuario> informacionUsuario() {
        return null;
    }
}

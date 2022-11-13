import java.util.List;

public interface Gestor {

    public void addJuego(String idJuego, String descripcion, String nivel);
    // Creación de un juego dado un identificador, una descripción y un número de niveles.

    public void addPartida(String idJuego, String idUsuario);
    // Creación de una partida dado el identificador del juego y el identificador del usuario.

    public Usuario getNivel(String idUsuario);
    // Obtenemos el nivel actual y la partida de un usuario dado su identificador

    public Partida getPuntuacion(String idUsuario);
    // Obtenemos la puntuación actual de la partida en curso dado un identificador de usuario.

    public Juego subirNivel(String idUsuario, Integer puntosConseguidos, String fecha);
    // Cambio del nivel de un juego manteniendo el número de puntos del jugador.

    public Partida finPartida(String idUsuario);
    // Finalización de una partida por parte de un usuario.

    public List<Usuario> usuariosPorPuntos();
    // Consulta de usuarios que han participado en un juego ordenado por puntuación (descendente)

    public List<Partida> partidasPorUsuario(String idUsuario);
    // Consulta de las partidas en las que ha participado un usuario.

    public List<Usuario> informacionUsuario();
    // Listado de información asociada a la actividad del usuario en el juego.
}

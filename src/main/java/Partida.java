import java.util.List;

public class Partida {
    private final String identificacion;
    private final String descripcion;
    private final String numeroNiveles;

    List<Partida> usuarios;

    public Partida(String identificacion, String descripcion, String numeroNiveles){
        this.identificacion = identificacion;
        this.descripcion = descripcion;
        this.numeroNiveles = numeroNiveles;
    }

    public void addPartida(Partida p){
        this.usuarios.add(p);
    }

    public User getUser() {
        return null;
    }

    public Item items() {
        return null;
    }
}

import java.util.LinkedList;
import java.util.List;

public class Usuario {

    List<Partida> listaPartida;

    private final String identificador;

    public Usuario(String identificador){
        this.identificador = identificador;
        this.listaPartida = new LinkedList<Partida>();
    }

    public void addPartida(Partida p){
        this.listaPartida.add(p);
    }

    public List<Partida> getListaPartida(){
        return listaPartida;
    }

    public String setIdentificador(){
        return identificador;
    }
}

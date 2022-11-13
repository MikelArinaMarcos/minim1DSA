public class Juego {

    private final String identificador;
    private final String descripcion;
    private final String nivel;

    public Juego(String identificador, String descripcion, String nivel){
        this.identificador = identificador;
        this.descripcion = descripcion;
        this.nivel = nivel;
    }

    public String getIdentificador(){
        return identificador;
    }

    public String nivel(){
        return nivel;
    }
}

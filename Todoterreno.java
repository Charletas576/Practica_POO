public class Todoterreno extends TipoRueda {
    public Todoterreno(String id, int ancho, int diametro, int indiceCarga, int codVelocidad) {
        super(id, ancho, diametro, indiceCarga, codVelocidad);
    }

    @Override
    public String instruccionesLimpieza() {
        return "";
    }

}
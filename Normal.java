public class Normal extends TipoRueda {
    public Normal(String id, int ancho, int diametro, int indiceCarga, int codVelocidad) {
        super(id, ancho, diametro, indiceCarga, codVelocidad);
    }

    @Override
    public String instruccionesLimpieza() {
        return "";
    }

}
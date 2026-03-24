public class Deportivo extends TipoRueda {
    public Deportivo(String id, int ancho, int diametro, int indiceCarga, int codVelocidad) {
        super(id, ancho, diametro, indiceCarga, codVelocidad);
    }

    @Override
    public String instruccionesLimpieza() {
        return "";
    }

}
public class Cuero extends TipoTapiceria {
    public Cuero(String id, String color, int metrosCuadrados) {
        super(id, color, metrosCuadrados);
    }

    @Override
    public String instruccionesAlmacen() {
        return "";
    }
}
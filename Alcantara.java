public class Alcantara extends TipoTapiceria {
    public Alcantara(String id, String color, int metrosCuadrados) {
        super(id, color, metrosCuadrados);
    }

    @Override
    public String instruccionesAlmacen() {
        return "";
    }
}
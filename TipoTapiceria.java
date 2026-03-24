public abstract class TipoTapiceria
{
    private String id;

    private String color;
    private int metrosCuadrados;

    public TipoTapiceria(String id, String color, int metrosCuadrados) {
        setID(id);
        setColor(color);
        setMetrosCuadrados(metrosCuadrados);
    }

    public void setColor(String color) {
        if (color != null && !color.trim().isEmpty()) {
            this.color = color;
        } else {
            System.out.println("El color introducido no es válido");
        }
    }

    public String getColor() {
        return color;
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        if (metrosCuadrados > 0 && metrosCuadrados < 25) {
            this.metrosCuadrados = metrosCuadrados;
        } else {
            System.out.println("Los metros cuadrados introducidos no es válido");
        }
    }
    
    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setID(String id) {
        if(id != null && !id.trim().isEmpty()) {
            this.id = id;
        } else {
            System.out.println("El ID introducido no es válido");
        }
    }

    public String getID() {
        return id;
    }

    public abstract String instruccionesAlmacen();
}
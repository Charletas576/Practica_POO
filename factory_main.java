
import java.util.Date;

public class factory_main {

    public static void main(String[] args) {
        Almacen AlmacenReal = new Almacen();
        GestionFabrica GestionFabricaReal = new GestionFabrica(AlmacenReal);

        GestionFabricaReal.altaAdmin("Paco", "Perez", "12345678A", "Calle A", 11111111L, 1200, new Date());

        System.out.println(AlmacenReal.buscarTrabajador("12345678A"));
    }
}

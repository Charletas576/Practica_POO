
import java.util.Date;

public class factory_main {

    public static void main(String[] args) {
        Almacen AlmacenReal = new Almacen();
        GestionFabrica GestionFabricaReal = new GestionFabrica(AlmacenReal);

        GestionFabricaReal.altaAdmin("Paco", "Perez", "12345678A", "Calle A", 11111111L, 1200, new Date());

        System.out.println(AlmacenReal.buscarTrabajador("12345678A"));

        GestionFabricaReal.anadirGasolina("M-GAS-01", 1.6, 110, 4);
        System.out.println(AlmacenReal.buscarMotor("M-GAS-01"));

        
        GestionFabricaReal.anadirTela("T-AZUL-01", "Azul", 5);
        System.out.println(AlmacenReal.buscarTapiceria("T-AZUL-01"));
        
        GestionFabricaReal.anadirNormal("R-STD-01", 205, 16, 500, 210);
        System.out.println(AlmacenReal.buscarRueda("R-STD-01"));
    }
}

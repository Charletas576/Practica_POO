
import java.util.ArrayList;

public class Planificador {

    private Almacen miAlmacen;
    private ArrayList<Operario> operarios = new ArrayList<>();

    public Planificador(Almacen miAlmacen, TipoMontaje miMontaje) {
        this.miAlmacen = miAlmacen;
    }

    public void simulacion(Vehiculo miVehiculo) {
        setOperarios(miAlmacen.listarTrabajadores());
        miMontaje.setVActual(miVehiculo);
        miMontaje.asignarOperarios(operarios);
        int segundosTotales = 0;
        while (miMontaje.getFActual() < 4) {
            miMontaje.avanzarCinta();
            segundosTotales++;
        }

        System.out.println("Simulación finalizada. Tiempo total de montaje: " + segundosTotales + " segundos.");

        miAlmacen.nuevoVehiculo(miVehiculo);
    }

    public void setOperarios(ArrayList<Trabajador> lTrabajadores) {
        while (operarios.size() < 4) {
            // Saco la posición aleatoria entre los trabajadores operarios
            Math.random();
            // Reviso si la posición está ya en el array de operarios
            // Si no lo está, lo añado
        }
    }
}

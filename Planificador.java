
import java.util.ArrayList;
import java.util.Date;

public class Planificador {

    private Almacen miAlmacen;
    private MonTurismo miMontaje;
    private ArrayList<Operario> operarios = new ArrayList<>();

    public Planificador(Vehiculo vActual, TipoMotor mActual, TipoTapiceria taActual, ArrayList<TipoRueda> rActuales) {
        miAlmacen = new Almacen();
        miMontaje = new MonTurismo(vActual, mActual, taActual, rActuales);
    }

    public void simulacion(String color, int nPlazas, float tara, int pma, String id) {
        Turismo miTurismo = new Turismo(color, nPlazas, tara, pma, id);
        setOperarios();
        miMontaje.setVActual(miTurismo);
        miMontaje.asignarOperarios(operarios);
        int segundosTotales = 0;
        while (miMontaje.getFActual() < 4) {
            miMontaje.avanzarCinta();
            segundosTotales++;
        }

        System.out.println("Simulación finalizada. Tiempo total de montaje: " + segundosTotales + " segundos.");

        miAlmacen.nuevoVehiculo(miTurismo);
    }

    public void setOperarios() {
        for (int i = 0; i < 4; i++) {
            int montajesAleatorios = (int)(Math.random() * 20); 
            Operario op = new Operario("Op" + i, "Apellido", "DNI"+i, "Dir", 123, "Operario", 1000, new Date(), montajesAleatorios);
            operarios.add(op);
        }
    }
}

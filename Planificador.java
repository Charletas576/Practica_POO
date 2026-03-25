
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
        Operario op1 = new Operario("Juan", "García", "12345678A", "Calle A, 1", 100000001L, "Operario", 1200, new Date(), (int) (Math.random() * 21));
        Operario op2 = new Operario("Ana", "López", "87654321B", "Calle B, 2", 200000002L, "Operario", 1200, new Date(), (int) (Math.random() * 21));
        Operario op3 = new Operario("Pedro", "Pérez", "11223344C", "Calle C, 3", 300000003L, "Operario", 1200, new Date(), (int) (Math.random() * 21));
        Operario op4 = new Operario("Lucía", "Sanz", "44332211D", "Calle D, 4", 400000004L, "Operario", 1200, new Date(), (int) (Math.random() * 21));

        operarios.add(op1);
        operarios.add(op2);
        operarios.add(op3);
        operarios.add(op4);
    }
}

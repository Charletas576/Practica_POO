import java.util.ArrayList;

public interface IAlmacen {
    void nuevoVehiculo(Vehiculo nuevoVehiculo);
    void anadirMotor(TipoMotor nuevoMotor);
    void anadirRueda(TipoRueda nuevoRueda);
    void anadirTapiceria(TipoTapiceria nuevoTapiceria);

    void nuevoTrabajador(Trabajador nuevoTrabajador);

    Vehiculo buscarVehiculo(String id);
    Trabajador buscarTrabajador(String dni);
    TipoMotor buscarMotor(String id);
    TipoRueda buscarRueda(String id);
    TipoTapiceria buscarTapiceria(String id);

    ArrayList<Vehiculo> listarVehiculos();
}
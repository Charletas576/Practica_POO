
import java.util.ArrayList;
import java.util.Date;


public class GestionFabrica {

    private IAlmacen almacen;

    public GestionFabrica(IAlmacen almacenExterno) {
        this.almacen = almacenExterno;
    }

    public void altaOperario(String nombre, String apellidos, String dni, String direccion, long numss, String puesto, int salario, Date fechaIngreso, int numMontajes) {
        Trabajador op = new Operario(nombre, apellidos, dni, direccion, numss, puesto, salario, fechaIngreso, numMontajes);
        almacen.nuevoTrabajador(op);
    }

    public void altaMecanico(String nombre, String apellidos, String dni, String direccion, long numss, String puesto, int salario, Date fechaIngreso, int numReparaciones) {
        Trabajador me = new Mecanico(nombre, apellidos, dni, direccion, numss, puesto, salario, fechaIngreso, numReparaciones);
        almacen.nuevoTrabajador(me);
    }

    public void altaGestor(String nombre, String apellidos, String dni, String direccion, long numss, String puesto, int salario, Date fechaIngreso) {
        Trabajador ge = new GestorPlanta(nombre, apellidos, dni, direccion, numss, salario, fechaIngreso);
        almacen.nuevoTrabajador(ge);
    }

    public void altaAdmin(String nombre, String apellidos, String dni, String direccion, long numss, int salario, Date fechaIngreso) {
        Trabajador ad = new Administrador(nombre, apellidos, dni, direccion, numss, salario, fechaIngreso);
        almacen.nuevoTrabajador(ad);
    }

    public void anadirGasolina(String id, double cilindrada, int potencia, int nCilindros) {
        TipoMotor ga = new Gasolina(id, cilindrada, potencia, nCilindros);
        almacen.anadirMotor(ga);
    }

    public void anadirHibrido(String id, double cilindrada, int potencia, int nCilindros, double porcentajeElectrico) {
        TipoMotor hi = new Hibrido(id, cilindrada, potencia, nCilindros, porcentajeElectrico);
        almacen.anadirMotor(hi);
    }

    public void anadirElectrico(String id, int potencia) {
        TipoMotor el = new Electrico(id, potencia);
        almacen.anadirMotor(el);
    }

    public void anadirNormal(String id, int ancho, int diametro, int indiceCarga, int codVelocidad) {
        TipoRueda ru = new Normal(id, ancho, diametro, indiceCarga, codVelocidad);
        almacen.anadirRueda(ru);
    }

    public void anadirTodoterreno(String id, int ancho, int diametro, int indiceCarga, int codVelocidad) {
        TipoRueda to = new Todoterreno(id, ancho, diametro, indiceCarga, codVelocidad);
        almacen.anadirRueda(to);
    }

    public void anadirDeportivo(String id, int ancho, int diametro, int indiceCarga, int codVelocidad) {
        TipoRueda de = new Deportivo(id, ancho, diametro, indiceCarga, codVelocidad);
        almacen.anadirRueda(de);
    }

    public void anadirTela(String id, String color, int metrosCuadrados) {
        TipoTapiceria te = new Tela(id, color, metrosCuadrados);
        almacen.anadirTapiceria(te);
    }

    public void anadirAlcantara(String id, String color, int metrosCuadrados) {
        TipoTapiceria al = new Alcantara(id, color, metrosCuadrados);
        almacen.anadirTapiceria(al);
    }

    public void anadirCuero(String id, String color, int metrosCuadrados) {
        TipoTapiceria cu = new Cuero(id, color, metrosCuadrados);
        almacen.anadirTapiceria(cu);
    }

    public void anadirBipDeportivo(String color, int nPlazas, float tara, int pma, String id) {
        Vehiculo bd = new BiplazaDeportivo(color, nPlazas, tara, pma, id);
        almacen.nuevoVehiculo(bd);
    }

    public void anadirTurismo(String color, int nPlazas, float tara, int pma, String id) {
        Vehiculo tu = new Turismo(color, nPlazas, tara, pma, id);
        almacen.nuevoVehiculo(tu);
    }

    public void anadirFurgoneta(String color, int nPlazas, float tara, int pma, String id) {
        Vehiculo fu = new Furgoneta(color, nPlazas, tara, pma, id);
        almacen.nuevoVehiculo(fu);
    }

    public void actualizarMotorVehiculo(String id, TipoMotor nuevoMotor) {
        Vehiculo vehiculo = almacen.buscarVehiculo(id);

        if (vehiculo != null) {
            vehiculo.setMotor(nuevoMotor);
            System.out.println("Motor actualizado con éxito");
        } else {
            System.out.println("Error: no se encontró el vehículo");
        }
    }

    public void actualizarRuedasVehiculo(String id, ArrayList<TipoRueda> ruedas) {
        Vehiculo vehiculo = almacen.buscarVehiculo(id);

        if (vehiculo != null) {
            vehiculo.setRuedas(ruedas);
            System.out.println("Motor actualizado con éxito");
        } else {
            System.out.println("Error: no se encontró el vehículo");
        }
    }

    public void actualizarTapiceriaVehiculo(String id, TipoTapiceria tapiceria) {
        Vehiculo vehiculo = almacen.buscarVehiculo(id);

        if (vehiculo != null) {
            vehiculo.setTapiceria(tapiceria);
            System.out.println("Motor actualizado con éxito");
        } else {
            System.out.println("Error: no se encontró el vehículo");
        }
    }

    public void actualizarComponentesVehiculo(String id, String color, int nPlazas, float tara, int pma) {
        Vehiculo vehiculo = almacen.buscarVehiculo(id);

        if (vehiculo != null) {
            vehiculo.setColor(color);
            vehiculo.setPlazas(nPlazas);
            vehiculo.setTara(tara);
            vehiculo.setPma(pma);
        } else {
            System.out.println("No se encontró vehiculo");
        }
    }

    public void actualizarComponentesMotor(String id, double cilindrada, int potencia, int nCilindros) {
        TipoMotor motor = almacen.buscarMotor(id);

        if (motor != null) {
            motor.setCilindrada(cilindrada);
            motor.setPotencia(potencia);
            motor.setNCilindros(nCilindros);
        } else {
            System.out.println("No se encontró vehiculo");
        }
    }

    public void actualizarComponentesRueda(String id, int ancho, int diametro, int indiceCarga, int codVelocidad) {
        TipoRueda ruedas = almacen.buscarRueda(id);

        if (ruedas != null) {
            ruedas.setAncho(ancho);
            ruedas.setDiametro(diametro);
            ruedas.setIndiceCarga(indiceCarga);
            ruedas.setCodVelocidad(codVelocidad);
        } else {
            System.out.println("No se encontró vehiculo");
        }
    }

    public void actualizarComponentesTapiceria(String id, String color, int metrosCuadrados) {
        TipoTapiceria tapiceria = almacen.buscarTapiceria(id);

        if (tapiceria != null) {
            tapiceria.setColor(color);
            tapiceria.setMetrosCuadrados(metrosCuadrados);
        } else {
            System.out.println("No se encontró vehiculo");
        }
    }

    public void actualizarDatosTrabajador(String nombre, String apellidos, String dni, String direccion, long numss, String puesto, int salario, Date fechaIngreso) {
        Trabajador trabajador = almacen.buscarTrabajador(dni);

        if (trabajador != null) {
            trabajador.setNombre(nombre);
            trabajador.setApellidos(apellidos);
            trabajador.setDni(dni);
            trabajador.setDireccion(direccion);
            trabajador.setNumss(numss);
            trabajador.setPuesto(puesto);
            trabajador.setSalario(salario);
            trabajador.setFechaIngreso(fechaIngreso);
        }
    }
}

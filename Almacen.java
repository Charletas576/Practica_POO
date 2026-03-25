import java.util.ArrayList;

public class Almacen implements IAlmacen {
    private ArrayList<Vehiculo> lVehiculos = new ArrayList<>();
    private ArrayList<TipoMotor> iMotores = new ArrayList<>();
    private ArrayList<TipoRueda> iRuedas = new ArrayList<>();
    private ArrayList<TipoTapiceria> iTapicerias = new ArrayList<>();
    private ArrayList<Trabajador> lTrabajadores = new ArrayList<>();


    @Override
    public void nuevoVehiculo(Vehiculo nuevoVehiculo) {
        lVehiculos.add(nuevoVehiculo);
    }

    @Override
    public void anadirMotor(TipoMotor nuevoMotor) {
        iMotores.add(nuevoMotor);
    }

    @Override
    public void anadirRueda(TipoRueda nuevoRueda) {
        iRuedas.add(nuevoRueda);
    }

    @Override
    public void anadirTapiceria(TipoTapiceria nuevoTapiceria) {
        iTapicerias.add(nuevoTapiceria);
    }

    @Override
    public void nuevoTrabajador(Trabajador nuevoTrabajador) {
        lTrabajadores.add(nuevoTrabajador);
    }

    @Override
    public Vehiculo buscarVehiculo(String id) {
        for (Vehiculo v : lVehiculos) {
            if (v.getID().equals(id)) {
                return v;
            }
        }

        return null;
    }

    @Override
    public Trabajador buscarTrabajador(String dni) {
        for (Trabajador t : lTrabajadores) {
            if (t.getDni().equals(dni)) {
                return t;
            }
        }

        return null;
    }

    @Override
    public TipoMotor buscarMotor(String id) {
        for (TipoMotor m : iMotores) {
            if (m.getID().equals(id)) {
                return m;
            }
        }

        return null;
    }

    @Override
    public TipoRueda buscarRueda(String id) {
        for (TipoRueda r : iRuedas) {
            if (r.getID().equals(id)) {
                return r;
            }
        }

        return null;
    }

    @Override
    public TipoTapiceria buscarTapiceria(String id) {
        for(TipoTapiceria t : iTapicerias) {
            if (t.getID().equals(id)) {
                return t;
            }
        }

        return null;
    }
    
    @Override
    public ArrayList<Vehiculo> listarVehiculos() {
        return lVehiculos;
    }

    @Override
    public ArrayList<TipoRueda> listarStockRuedas() {
        return iRuedas;
    }

    @Override
    public ArrayList<Trabajador> listarTrabajadores() {
        return lTrabajadores;
    }
}
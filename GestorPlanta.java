import java.util.Date;

public class GestorPlanta extends Trabajador {
    public GestorPlanta(String nombre, String apellidos, String dni, String direccion, long numss, int salario, Date fechaIngreso) {
        super(nombre, apellidos, dni, direccion, numss, "Gestor Planta", salario, fechaIngreso);
    }

    @Override
    public String infoTrabajador() {
        return "El trabajador " + getNombre() + " " + getApellidos() + " entró el " + getFechaIngreso() + " y vive en " + getDireccion();
    }
}
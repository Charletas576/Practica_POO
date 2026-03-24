import java.util.Date;

public class Administrador extends Trabajador {
    public Administrador(String nombre, String apellidos, String dni, String direccion, long numss, int salario, Date fechaIngreso) {
        super(nombre, apellidos, dni, direccion, numss, "Administrador", salario, fechaIngreso);
    }

    @Override
    public String infoTrabajador() {
        return "El trabajador " + getNombre() + " " + getApellidos() + " entró el " + getFechaIngreso() + " y su salario es " + getSalario();
    }
}
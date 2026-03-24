import java.util.Date;

public class Mecanico extends Trabajador {
    private int numReparaciones;

    public Mecanico(String nombre, String apellidos, String dni, String direccion, long numss, String puesto, int salario, Date fechaIngreso, int numReparaciones) {
        super(nombre, apellidos, dni, direccion, numss, puesto, salario, fechaIngreso);
        setNumReparaciones(numReparaciones);
    }

    public void setNumReparaciones(int numReparaciones) {
        if (numReparaciones > 0) {
            this.numReparaciones = numReparaciones;
            if (numReparaciones > 20) {
                setPuesto("Mecánico Eficiente");
            } else {
                setPuesto("Mecánico Estándar");
            }
        } else {
            System.out.println("El número de reparaciones no es válido");
        }  
    }

    public int getTiempoReparacion() {
        if (this.numReparaciones > 20) {
            return 1;
        } else {
            return (int)(Math.random() * (5 - 2 + 1) + 2);
        }
    }

    @Override
    public String infoTrabajador() {
        return "El trabajador " + getNombre() + " " + getApellidos() + " entró el " + getFechaIngreso() + " y es un mecanico que realiza " + getTiempoReparacion() + ", por lo que tarda " + getTiempoReparacion() + "s en hacer una reparación";
    }
}
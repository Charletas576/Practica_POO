import java.util.Date;

public class Operario extends Trabajador {
    private int numMontajes;

    public Operario(String nombre, String apellidos, String dni, String direccion, long numss, String puesto, int salario, Date fechaIngreso, int numMontajes) {
        super(nombre, apellidos, dni, direccion, numss, puesto, salario, fechaIngreso);
        setNumMontajes(numMontajes);
    }

    public void setNumMontajes(int numMontajes) {
        if (numMontajes > 0) {
            this.numMontajes = numMontajes;
            if (numMontajes > 10) {
                setPuesto("Operario Eficiente");
            } else {
                setPuesto("Operario Estándar");
            }
        }  else {
            System.out.println("El número de montajes no es válido");
        }       
    }

    public int getNumMontajes() {
        return numMontajes;
    }

    public int getTiempoMontaje() {
        if (this.numMontajes > 10) {
            return 1;
        } else {
            return 3;
        }
    }

    @Override
    public String infoTrabajador() {
        return "El trabajador " + getNombre() + " " + getApellidos() + " entró el " + getFechaIngreso() + " y es un operario que realiza " + getNumMontajes() + ", por lo que tarda " + getTiempoMontaje() + "s en hacer un montaje";
    }
}
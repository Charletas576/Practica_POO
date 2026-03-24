import java.util.Date;

public abstract class Trabajador {

    private String nombre;
    private String apellidos;
    private String dni;
    private String direccion;
    private long numss;
    private String puesto;
    private int salario;
    private Date fechaIngreso;

    public Trabajador(String nombre, String apellidos, String dni, String direccion, long numss, String puesto, int salario, Date fechaIngreso) {
        setNombre(nombre);
        setApellidos(apellidos);
        setDni(dni);
        setDireccion(direccion);
        setNumss(numss);
        setPuesto(puesto);
        setSalario(salario);
        setFechaIngreso(fechaIngreso);
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("El nombre introducido no es válido");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setApellidos(String apellidos) {
        if (apellidos != null && !apellidos.trim().isEmpty()) {
            this.apellidos = apellidos;
        } else {
            System.out.println("El apellido introducido no es válido");
        }
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setDni(String dni) {
        if (dni != null && dni.trim().length() == 9) {
            this.dni = dni;
        } else {
            System.out.println("El DNI introducido no es válido");
        }
    }

    public String getDni() {
        return dni;
    }

    public void setDireccion(String direccion) {
        if (direccion != null && !direccion.trim().isEmpty()) {
            this.direccion = direccion;
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNumss(long numss) {
        if (numss >= 100000000000L && numss <= 999999999999L) {
            this.numss = numss;
        } else {
            System.out.println("El NSS introducido no es válido");
        }
    }

    public long getNumss() {
        return numss;
    }

    public void setPuesto(String puesto) {
        if (puesto != null && !puesto.trim().isEmpty()) {
            this.puesto = puesto;
        } else {
            System.out.println("El puesto introducido no es válido");
        }
    }

    public String getPuesto() {
        return puesto;
    }

    public void setSalario(int salario) {
        if (salario > 0) {
            this.salario = salario;
        } else {
            System.out.println("El salario introducido no es válido");
        }
    }

    public int getSalario() {
        return salario;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        if (fechaIngreso != null) {
            this.fechaIngreso = fechaIngreso;
        } else {
            System.out.println("La fecha de ingreso no es válida");
        }
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public abstract String infoTrabajador();
}

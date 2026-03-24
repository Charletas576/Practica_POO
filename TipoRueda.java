public abstract class TipoRueda
{
    private String id;

    private int ancho;
    private int diametro;
    private int indiceCarga;
    private int codVelocidad;

    public TipoRueda(String id, int ancho, int diametro, int indiceCarga, int codVelocidad) {
        setID(id);
        setAncho(ancho);
        setDiametro(diametro);
        setIndiceCarga(indiceCarga);
        setCodVelocidad(codVelocidad);
    }

    public void setAncho(int ancho) {
        if(ancho >= 180 && ancho <= 300) {
            this.ancho = ancho;
        } else {
            System.out.println("El acncho introducido no es válido");
        }
    }

    public int getAncho() {
        return ancho;
    }

    public void setDiametro(int diametro) {
        if(diametro >= 14 && diametro <= 20) {
            this.diametro = diametro;
        } else {
            System.out.println("El diametro introducido no es válid");
        }
    }

    public int getDiametro() {
        return diametro;
    }

    public void setIndiceCarga(int indiceCarga) {
        if(indiceCarga >= 350 && indiceCarga <= 1350) {
            this.indiceCarga = indiceCarga;
        }
    }

    public int getIndiceCarga() {
        return indiceCarga;
    }

    public void setCodVelocidad(int codVelocidad) {
        if(codVelocidad >= 170 && codVelocidad <= 300) {
            this.codVelocidad = codVelocidad;
        }
    }

    public int getCodVelocidad() {
        return codVelocidad;
    }

    public void setID(String id) {
        if(id != null && !id.trim().isEmpty()) {
            this.id = id;
        } else {
            System.out.println("El ID introducido no es válido");
        }
    }

    public String getID() {
        return id;
    }

    public abstract String instruccionesLimpieza();
}
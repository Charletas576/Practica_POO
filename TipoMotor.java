public abstract class TipoMotor
{
    private String id;

    private double cilindrada;
    private int potencia;
    private int nCilindros;

    public TipoMotor(String id, double cilindrada, int potencia, int nCilindros) {
        setID(id);
        setCilindrada(cilindrada);
        setPotencia(potencia);
        setNCilindros(nCilindros);
    }

    public void setCilindrada(double cilindrada) {
        if (cilindrada >= 0) {
            this.cilindrada = cilindrada;
        } else {
            System.out.println("El valor de la cilindrada no es válido");
        }
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setPotencia(int potencia) {
        if (potencia > 0) {
            this.potencia = potencia;
        } else {
            System.out.println("El valor de la potencia no es válido");
        }
    }

    public int getPotencia() {
        return potencia;
    }

    public void setNCilindros(int nCilindros) {
        if (nCilindros >= 0) {
            this.nCilindros = nCilindros;
        } else {
            System.out.println("El número de cilindros no es válido");
        }
    }

    public int getNCilindros() {
        return nCilindros;
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

    public abstract String calcularConsumo();
}
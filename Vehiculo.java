
import java.util.ArrayList;


public abstract class Vehiculo {
    private String id;
    private String estado;

    private String color;
    private int nPlazas;
    private float tara;
    private int pma;

    private TipoMotor miMotor;
    private TipoTapiceria miTapiceria;
    private ArrayList<TipoRueda> misRuedas;

    public Vehiculo(String color, int nPlazas, float tara, int pma, String id) {
        setColor(color);
        setPlazas(nPlazas);
        setTara(tara);
        setPma(pma);
        setID(id);

        estado = "Chasis";

        miMotor = null;
        miTapiceria = null;
        misRuedas = new ArrayList<TipoRueda>(4);
    }

    /*
    - COLOR
     */
    public void setColor(String color) {
        if (color != null && !color.trim().isEmpty()) {
            this.color = color;
        } else {
            System.out.println("Error: el color introducido no es válido");
        }
    }

    public String getColor() {
        return color;
    }

    /*
    - NPLAZAS
     */
    public void setPlazas(int plazas) {
        if (plazas > 0) {
            nPlazas = plazas;
        } else {
            System.out.println("Error: el número de plazas introducido no es válido");
        }
    }

    public int getPlazas() {
        return nPlazas;
    }

    /*
    - TARA
     */
    public void setTara(float tara) {
        if (tara > 0 && tara < this.pma) {
            this.tara = tara;
        } else {
            System.out.println("Error: la tara introducida no es válido");
        }
    }

    public float getTara() {
        return tara;
    }

    /*
    - PMA
     */
    public void setPma(int pma) {
        if (pma > 0 && pma > this.tara) {
            this.pma = pma;
        } else {
            System.out.println("Error: el peso máximo autorizado no es válido");
        }
    }

    public int getPma() {
        return pma;
    }

    /*
    - Estado
    */
    public String getEstado() {
        return estado;
    }

    /*
    - ID
    */
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

    /*
    - Poliformismo: calcular seguro según PMA
     */
    public abstract String calcularSeguro();

    public void setMotor(TipoMotor miMotor) {
        if (miMotor != null) {
            this.miMotor = miMotor;
            this.estado = "Motor";
        }
    }

    public void setTapiceria(TipoTapiceria miTapiceria) {
        if (miTapiceria != null) {
            this.miTapiceria = miTapiceria;
            this.estado = "Tapiceria";
        }
    }

    public void setRuedas(ArrayList<TipoRueda> misRuedas) {
        if (misRuedas != null && misRuedas.size() == 4) {
            this.misRuedas = misRuedas;
            this.estado = "Ruedas";
        }
    }

}

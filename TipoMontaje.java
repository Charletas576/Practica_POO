import java.util.ArrayList;

public abstract class TipoMontaje {

    private Vehiculo vActual;
    private TipoMotor mActual;
    private TipoTapiceria taActual;
    private ArrayList<TipoRueda> rActuales = new ArrayList<>();
    private ArrayList<Operario> operarios = new ArrayList<>();
    private int fActual = 0;
    private int tiActual = 0;

    public TipoMontaje(Vehiculo vActual, TipoMotor mActual, TipoTapiceria taActual, ArrayList<TipoRueda> rActuales) {
        setVActual(vActual);
        setMActual(mActual);
        setTActual(taActual);
        setRActuales(rActuales);
    }

    public void asignarOperarios(ArrayList<Operario> operarios) {
        if (operarios.size() == 4) {
            for (Operario o : operarios) {
                this.operarios.add(o);
            }
        }
    }

    public void setVActual(Vehiculo vehiculo) {
        fActual = 0;
        tiActual = 0;
        this.vActual = vehiculo;
    }

    public void setMActual(TipoMotor mActual) {
        this.mActual = mActual;
    }

    public void setTActual(TipoTapiceria taActual) {
        this.taActual = taActual;
    }

    public void setRActuales (ArrayList<TipoRueda> ruedas) {
        if (ruedas.size() == 4) {
            for (TipoRueda r : ruedas) {
                this.rActuales.add(r);
            }
        }
    }

    public int getFActual() {
        return fActual;
    }

    public void avanzarCinta() {
        if (vActual != null && operarios.size() == 4 && fActual < 4) {
            tiActual++;
            int tOperario = operarios.get(fActual).getTiempoMontaje();
            if (tiActual == tOperario) {
                tiActual = 0;
                if (fActual == 0) {
                    //
                } else if (fActual == 1) {
                    vActual.setMotor(mActual);
                } else if (fActual == 2) {
                    vActual.setTapiceria(taActual);
                } else {
                    vActual.setRuedas(rActuales);
                }
                fActual++;
            }
        }
    }
}

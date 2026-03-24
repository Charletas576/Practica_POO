public class Hibrido extends TipoMotor {
    private double porcentajeElectrico;

    public Hibrido(String id, double cilindrada, int potencia, int nCilindros, double porcentajeElectrico) {
        super(id, cilindrada, potencia, nCilindros);

        setPorcentajeElectrico(porcentajeElectrico);
    }

    public void setPorcentajeElectrico(double porcentajeElectrico) {
        if (porcentajeElectrico > 0) {
            this.porcentajeElectrico = porcentajeElectrico;
        }
    }

    @Override
    public String calcularConsumo() {
        double consumoElectrico = getPotencia()*(1-porcentajeElectrico);
        double consumoGasolina = (getCilindrada()/getNCilindros()*0.05)*porcentajeElectrico;

        return "El consumo del motor híbrido es: " + (consumoElectrico + consumoGasolina);
    }
}
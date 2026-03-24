public class Gasolina extends TipoMotor {
    public Gasolina (String id, double cilindrada, int potencia, int nCilindros) {
        super(id, cilindrada, potencia, nCilindros);
    }

    @Override
    public String calcularConsumo() {
        return "El consumo del motor gasolina es: " + getCilindrada()/getNCilindros()*0.05;
    }
}
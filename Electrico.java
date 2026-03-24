public class Electrico extends TipoMotor {
    public Electrico(String id, int potencia) {
        super(id, 0, potencia, 0);
    }

    @Override
    public String calcularConsumo() {
        return "El consumo del motor eléctrico es: " + getPotencia();
    }
}
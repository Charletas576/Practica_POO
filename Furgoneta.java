public class Furgoneta extends Vehiculo
{
    public Furgoneta(String color, int nPlazas, float tara, int pma, String id)
    {
        super(color, nPlazas, tara, pma, id);

    }

    @Override
    public String calcularSeguro() {
        // Cuanto más peso pueda albergar mayor será la distancia de frenado, lo que aumenta el riesgo y por tanto el coste
        return "El Seguro de perfil Furgoneta es:" + (500 + (getPma()-getTara())*0.5);
    }
}
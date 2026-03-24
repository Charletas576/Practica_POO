public class BiplazaDeportivo extends Vehiculo
{
    public BiplazaDeportivo(String color, int nPlazas, float tara, int pma, String id) {
        super(color, 2, tara, pma, id);

    }

    @Override
    public String calcularSeguro() {
        // Cuanto más ligero sea el vehículo más velocidad alcanzará, por lo que aumenta el riesgo y por tanto el coste
        return "El Seguro de perfil Deportivo es:" + (500 + (getTara() * 0.1)) + "€";
    }
}
public class Turismo extends Vehiculo
{
    public Turismo(String color, int nPlazas, float tara, int pma, String id)
    {
        super(color, nPlazas, tara, pma, id);
    }

    @Override
    public String calcularSeguro() {
        // Tarifa plana
        return "El Seguro de perfil Turismo es: 500€";
    }
}
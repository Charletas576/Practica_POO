public class factory_main {
    IAlmacen elAlmacenReal = new Almacen();

    GestionFabrica elGestor = new GestionFabrica(elAlmacenReal);
}
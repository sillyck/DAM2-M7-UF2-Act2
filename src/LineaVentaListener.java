public interface LineaVentaListener {

    void onLineaVentaAgregada(LineaVentaEvent evento) throws Exception;
    void agregarLineaVenta(LineaVenta lineaVenta) throws Exception;
}

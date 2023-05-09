import java.util.ArrayList;
import java.util.Date;

public class Venta {
    private String nombreCliente;
    private String fecha;
    private ArrayList<LineaVenta> lineasVenta;



    public Venta(String nombreCliente, String fecha, ArrayList<LineaVenta> lineasVenta) {
		super();
		this.nombreCliente = nombreCliente;
		this.fecha = fecha;
		this.lineasVenta = lineasVenta;
	}

	public void agregarLineaVenta(LineaVenta lineaVenta) {
        lineasVenta.add(lineaVenta);
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public ArrayList<LineaVenta> getLineasVenta() {
        return lineasVenta;
    }

    public double getTotal() throws Exception {
        double total = 0;
        for (LineaVenta lineaVenta : lineasVenta) {
            total += lineaVenta.getTotal();
        }
        return total;
    }
}

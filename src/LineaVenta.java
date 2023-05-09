import llibreriapkg.*;
import llibreriapkg.Libro;

public class LineaVenta {
    private int isbLlibre;
    private int cantidad;
    
    

    public LineaVenta(int nombreLibro, int cantidad) {
        this.isbLlibre = nombreLibro;
        this.cantidad = cantidad;
    }

    public int getIsbLlibre() {
		return isbLlibre;
	}

	public int getQuantitat() {
        return cantidad;
    }

    public double getTotal() throws Exception {
    	int isbn = this.getIsbLlibre();
    	
    	Libro libro = new Libro();
    	Llibreria llibreria = new Llibreria();
    	
    	libro = llibreria.retornarLlibre(isbn).getFirst();
    	
    	Double total = 0.0;
    	
    	total = libro.getPreu() * this.getQuantitat();
    	
    	
    	
    	
        return total;
    }
}

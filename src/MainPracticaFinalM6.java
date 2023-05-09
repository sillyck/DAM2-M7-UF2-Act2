import llibreriapkg.*;
public class MainPracticaFinalM6 {

	public static void main(String[] args) throws Exception {
		MenuInicial menuInicial = new MenuInicial();
		
		menuInicial.setVisible(true);
		
//		Libro libro1 = new Libro(951475321, 10, 2002, "20/04/2023", "asd", "autor", "editorial", "tematica", "Alcover", 12.50);
//		Libro libro2 = new Libro(222222222, 10, 1987, "20/04/2023", "Harry Potter", "Hector vallve", "Penguin", "Fantasia", "Alcover", 5.30);
		Libro libro3 = new Libro(111111987, 10, 1987, "20/04/2023", "Harry Potter", "Hector vallve", "Penguin", "Fantasia", "Alcover", 5.30);
		
		Clients client1 = new Clients("12345678A", "Jordi", "Ribellas", "Av. Sant Pau, 1A");
		Clients client2 = new Clients("98765432E", "Hector", "Vallve", "Puigpelat");
		Clients client3 = new Clients("15935724R", "Eloy", "Altozano", "Serradalt");
		
		Llibreria neodatis = new Llibreria();
		
//		neodatis.afegirLlibre(libro3);
		
//		neodatis.afegirClient(client1);
//		neodatis.afegirClient(client2);45652135D	Hector	Vallve	Rambla de la pau
//		neodatis.afegirClient(client3);
		

	}

}

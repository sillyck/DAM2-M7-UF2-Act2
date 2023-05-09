import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.neodatis.odb.Objects;
import llibreriapkg.Libro;
import llibreriapkg.Llibreria;

public class ConsultaLlibres extends JFrame {

	private JButton botoInici, botoSeguent, botoAnterior, botoUltim, botoEnrere;
	private DefaultTableModel taulaConsulta;
	private JTable taulaConsultaPanell;
	
	private int posicioLlista = 0;
	Llibreria llibreria = new Llibreria();
	
	ArrayList<Libro> arrayLlibres = new ArrayList<>();
	Objects<Libro> libroObject;

	public ConsultaLlibres() {
		setSize(400, 500);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Panell de les dades dels llibres
		JPanel panelDades = new JPanel();
		botoInici = new JButton("Inici");
		botoSeguent = new JButton("Següent");
		botoAnterior = new JButton("Anterior");
		botoUltim = new JButton("Ultim");
		botoEnrere = new JButton("Enrere");

		panelDades.add(botoInici);
		panelDades.add(botoSeguent);
		panelDades.add(botoAnterior);
		panelDades.add(botoUltim);
		panelDades.add(botoEnrere);
		add(panelDades, "South");

		// Taula per veure les dades dels llibres
		taulaConsulta = new DefaultTableModel();
		taulaConsulta.addColumn("Nom valors");
		taulaConsulta.addColumn("Informació recuperada");
		taulaConsultaPanell = new JTable(taulaConsulta);
		JScrollPane scroll = new JScrollPane(taulaConsultaPanell);
		add(scroll, "Center");

		try {
			afegirLlibresLlista();
			afegirLineaATaula();
		} catch (Exception e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		botoEnrere.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tornarAnterior();
			}
		});
		
		botoInici.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				posicioLlista = 0;
				try {
					afegirLineaATaula();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		botoSeguent.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if ((posicioLlista + 1) < arrayLlibres.size()) {
				posicioLlista++;
				try {
					afegirLineaATaula();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				}else {
					PopupOmplirCamps popupOmplirCamps = new PopupOmplirCamps(
							"El llibre que es mostra es l'ultim");
					popupOmplirCamps.setVisible(true);
				}
			}
		});

		botoAnterior.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				if ((posicioLlista - 1) > 0) {
					posicioLlista--;
					try {
						afegirLineaATaula();
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else {
					PopupOmplirCamps popupOmplirCamps = new PopupOmplirCamps(
							"El llibre que es mostra es el primer");
					popupOmplirCamps.setVisible(true);
				}
			}
		});

		botoUltim.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				posicioLlista = (arrayLlibres.size() - 1);
				try {
					afegirLineaATaula();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

	}

	/**
	 * Fer consulta a BBDD i guardar-ho en una llista de la classe, despres
	 * consultar la llista per poder anar canviant els llibres de la taula
	 */
	public void afegirLineaATaula() throws Exception {

		taulaConsulta.setRowCount(0);
		
		
		taulaConsulta.addRow(new Object[] { "ISBN: ", arrayLlibres.get(posicioLlista).getIsbn() });
		taulaConsulta.addRow(new Object[] { "Titol: ", arrayLlibres.get(posicioLlista).getTitol() });
		taulaConsulta.addRow(new Object[] { "Autor: ", arrayLlibres.get(posicioLlista).getAutor() });
		taulaConsulta.addRow(new Object[] { "Stock: ", arrayLlibres.get(posicioLlista).getStock() });
		taulaConsulta.addRow(new Object[] { "Any publicació: ", arrayLlibres.get(posicioLlista).getAny() });
		taulaConsulta.addRow(new Object[] { "Data alta: ", arrayLlibres.get(posicioLlista).getDataAlta() });
		taulaConsulta.addRow(new Object[] { "Editorial: ", arrayLlibres.get(posicioLlista).getEditorial() });
		taulaConsulta.addRow(new Object[] { "Preu: ", arrayLlibres.get(posicioLlista).getPreu() });
		taulaConsulta.addRow(new Object[] { "Tematica: ", arrayLlibres.get(posicioLlista).getTematica() });
		taulaConsulta.addRow(new Object[] { "Ubicació: ", arrayLlibres.get(posicioLlista).getUbicacio() });

	}

	private void tornarAnterior() {
		MenuConsulta menuConsulta = new MenuConsulta();
		menuConsulta.setVisible(true);
		this.dispose();
	}
	
	private void afegirLlibresLlista() throws Exception {
		Libro libro = new Libro();

		libroObject = llibreria.retornarLlibres();

		while (libroObject.hasNext()) {
			libro = libroObject.next();
			arrayLlibres.add(libro);
		}

	}

}

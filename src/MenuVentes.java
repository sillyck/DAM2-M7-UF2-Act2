import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import llibreriapkg.*;

public class MenuVentes extends JFrame implements LineaVentaListener {

	private ArrayList<LineaVenta> listaLineasVenta = new ArrayList<LineaVenta>();
	private ArrayList<Linea> arrayLinea = new ArrayList<Linea>();;
	private Llibreria llibreria = new Llibreria();
	private Linea linea = new Linea();
	private Libro libro = new Libro();
	private JTable tablaVentas;
	private DefaultTableModel modeloTablaVentas;
	private JLabel etiquetaCliente;
	private JLabel etiquetaFecha;
	private JLabel etiquetaTotal;
	private JTextField campoCliente;
	private JTextField campoFecha;
	private JButton afegir;
	private JButton enviar;
	private JButton enrere;
	private MenuLineaVenta menuLineaVenta;
	private double total = 0;

	public MenuVentes() {
		listaLineasVenta = new ArrayList<LineaVenta>();

		setTitle("Menu de Ventas");
		setSize(600, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// Panel para los datos de la venta
		JPanel panelDatosVenta = new JPanel();
		etiquetaCliente = new JLabel("Cliente:");
		etiquetaFecha = new JLabel("Fecha:");
		campoCliente = new JTextField(10);
		campoFecha = new JTextField(10);
		campoFecha.setEditable(false); // El campo fecha no es editable por el usuario
		Date fechaActual = new Date();
		SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
		String fechaActualString = formatoFecha.format(fechaActual);
		campoFecha.setText(fechaActualString); // Mostrar la fecha actual en el campo fecha
		panelDatosVenta.add(etiquetaCliente);
		panelDatosVenta.add(campoCliente);
		panelDatosVenta.add(etiquetaFecha);
		panelDatosVenta.add(campoFecha);
		add(panelDatosVenta, "North");

		// Panel para la tabla de ventas
		modeloTablaVentas = new DefaultTableModel();
		modeloTablaVentas.addColumn("Libro");
		modeloTablaVentas.addColumn("Cantidad");
		modeloTablaVentas.addColumn("Precio");
		tablaVentas = new JTable(modeloTablaVentas);
		JScrollPane scrollTablaVentas = new JScrollPane(tablaVentas);
		add(scrollTablaVentas, "Center");

		// Panel para el total
		etiquetaTotal = new JLabel("Total: 0€");
		add(etiquetaTotal, "South");

		// Botón para añadir una línea de venta
		afegir = new JButton("Afegir llibre");
		afegir.addActionListener(e -> {
			menuLineaVenta = new MenuLineaVenta();
			menuLineaVenta.setLineaVentaListener(this);
		});

		// Panel para los botones de enviar y volver
		JPanel panelBotones = new JPanel();
		enviar = new JButton("Enviar");
		enviar.addActionListener(e -> {

			Llibreria llibreria = new Llibreria();
			try {
				if (!campoCliente.getText().isEmpty() && !arrayLinea.isEmpty()) {
					if (!llibreria.retornarClient(campoCliente.getText()).isEmpty()) {
						Vendes venda = new Vendes(fechaActualString, campoCliente.getText().toString(), arrayLinea,
								total);
						llibreria.afegirVenta(venda);
						MenuInicial inici = new MenuInicial();
						inici.setVisible(true);
						dispose();
					} else {
						PopupOmplirCamps popupOmplirCamps = new PopupOmplirCamps("El client introduit no existeix");
						popupOmplirCamps.setVisible(true);
					}
				} else {
					PopupOmplirCamps popupOmplirCamps = new PopupOmplirCamps(
							"S'han d'omplir tots els camps per poder fer la venta");
					popupOmplirCamps.setVisible(true);
				}
			} catch (Exception e1) {
				PopupOmplirCamps popupOmplirCamps = new PopupOmplirCamps(
						"Error en la venta " + e1.getMessage());
				popupOmplirCamps.setVisible(true);
				
			}

			// Cerrar la ventana después de enviar la venta
		});
		enrere = new JButton("Enrere");
		enrere.addActionListener(e -> {
			enrere();
			dispose(); // Cerrar la ventana sin enviar la venta
		});
		panelBotones.add(afegir);
		panelBotones.add(enviar);
		panelBotones.add(enrere);
		add(panelBotones, "East");

		setVisible(true);

	}

	// Método para agregar una línea de venta a la lista y actualizar la tabla y el
	// total
	public void agregarLineaVenta(LineaVenta lineaVenta) throws Exception {
		if (!llibreria.retornarLlibre(lineaVenta.getIsbLlibre()).isEmpty()) {
			libro = llibreria.retornarLlibre(lineaVenta.getIsbLlibre()).getFirst();
			linea.setLibro(libro);
			linea.setCantidad(lineaVenta.getQuantitat());
			linea.setTotal(lineaVenta.getTotal());
			arrayLinea.add(linea);
			listaLineasVenta.add(lineaVenta);
			modeloTablaVentas.addRow(
					new Object[] { lineaVenta.getIsbLlibre(), lineaVenta.getQuantitat(), lineaVenta.getTotal() });

			for (LineaVenta lv : listaLineasVenta) {
				total += lv.getTotal();
			}
			etiquetaTotal.setText(String.format("Total: $%.2f", total));
		}else {
			PopupOmplirCamps popupOmplirCamps = new PopupOmplirCamps(
					"No s'ha pogut trobar el llibre indicat");
			popupOmplirCamps.setVisible(true);
		}
	}

	// Método del listener para agregar la línea de venta a la lista y actualizar la
	// tabla y el total
	@Override
	public void onLineaVentaAgregada(LineaVentaEvent evento) throws Exception {
		agregarLineaVenta(evento.getLineaVenta());
	}

	private void enrere() {
		MenuInicial inici = new MenuInicial();
		inici.setVisible(true);
		this.dispose();
	}

}

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import llibreriapkg.*;

public class AltaLlibre extends JFrame {

	private JLabel etiquetaTitol;
	private JLabel etiquetaAutor;
	private JLabel etiquetaISBN;
	private JLabel etiquetaStock;
	private JLabel etiquetaPVP;
	private JLabel etiquetaDataPublicacio;
	private JLabel etiquetaEditorial;
	private JLabel etiquetaTematica;
	private JLabel etiquetaUbicacio;
	private JLabel etiquetaDataAlta;
	private JTextField campTitol;
	private JTextField campAutor;
	private JTextField campISBN;
	private JTextField campStock;
	private JTextField campPVP;
	private JTextField campDataPublicacio;
	private JTextField campEditorial;
	private JTextField campTematica;
	private JTextField campUbicacio;
	private JTextField campDataAlta;
	private JButton botoEnviar;
	private JButton botoTornar;

	public AltaLlibre() {
		super("Alta de un llibre");
		setTitle("Alta de un llibre");
		setSize(800, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridBagLayout());

		etiquetaISBN = new JLabel("ISBN:");
		GridBagConstraints constraintsISBN = new GridBagConstraints();
		constraintsISBN.gridx = 0;
		constraintsISBN.gridy = 0;
		constraintsISBN.insets = new Insets(10, 10, 10, 10);
		add(etiquetaISBN, constraintsISBN);

		campISBN = new JTextField(10);
		GridBagConstraints constraintsCampISBN = new GridBagConstraints();
		constraintsCampISBN.gridx = 1;
		constraintsCampISBN.gridy = 0;
		constraintsCampISBN.insets = new Insets(10, 10, 10, 0);
		add(campISBN, constraintsCampISBN);

		etiquetaTitol = new JLabel("Titol:");
		GridBagConstraints constraintsTitol = new GridBagConstraints();
		constraintsTitol.gridx = 0;
		constraintsTitol.gridy = 1;
		constraintsTitol.insets = new Insets(10, 10, 10, 10);
		add(etiquetaTitol, constraintsTitol);

		campTitol = new JTextField(10);
		GridBagConstraints constraintsCampTitol = new GridBagConstraints();
		constraintsCampTitol.gridx = 1;
		constraintsCampTitol.gridy = 1;
		constraintsCampTitol.insets = new Insets(10, 10, 10, 10);
		add(campTitol, constraintsCampTitol);

		etiquetaAutor = new JLabel("Autor:");
		GridBagConstraints constraintsCognom = new GridBagConstraints();
		constraintsCognom.gridx = 0;
		constraintsCognom.gridy = 2;
		constraintsCognom.insets = new Insets(10, 10, 10, 10);
		add(etiquetaAutor, constraintsCognom);

		campAutor = new JTextField(10);
		GridBagConstraints constraintsCampCognom = new GridBagConstraints();
		constraintsCampCognom.gridx = 1;
		constraintsCampCognom.gridy = 2;
		constraintsCampCognom.insets = new Insets(10, 10, 10, 10);
		add(campAutor, constraintsCampCognom);

		etiquetaStock = new JLabel("Stock:");
		GridBagConstraints constraintsDireccio = new GridBagConstraints();
		constraintsDireccio.gridx = 0;
		constraintsDireccio.gridy = 3;
		constraintsDireccio.insets = new Insets(10, 10, 10, 10);
		add(etiquetaStock, constraintsDireccio);

		campStock = new JTextField(10);
		GridBagConstraints constraintsCampDireccio = new GridBagConstraints();
		constraintsCampDireccio.gridx = 1;
		constraintsCampDireccio.gridy = 3;
		constraintsCampDireccio.insets = new Insets(10, 10, 10, 10);
		add(campStock, constraintsCampDireccio);

		etiquetaPVP = new JLabel("PVP:");
		GridBagConstraints constraintsPVP = new GridBagConstraints();
		constraintsPVP.gridx = 0;
		constraintsPVP.gridy = 4;
		constraintsPVP.insets = new Insets(10, 10, 10, 10);
		add(etiquetaPVP, constraintsPVP);

		campPVP = new JTextField(10);
		GridBagConstraints constraintsCampPVP = new GridBagConstraints();
		constraintsCampPVP.gridx = 1;
		constraintsCampPVP.gridy = 4;
		constraintsCampPVP.insets = new Insets(10, 10, 10, 10);
		add(campPVP, constraintsCampPVP);

		etiquetaDataPublicacio = new JLabel("Data publicació:");
		GridBagConstraints constraintsDataPublicacio = new GridBagConstraints();
		constraintsDataPublicacio.gridx = 0;
		constraintsDataPublicacio.gridy = 5;
		constraintsDataPublicacio.insets = new Insets(10, 10, 10, 10);
		add(etiquetaDataPublicacio, constraintsDataPublicacio);

		campDataPublicacio = new JTextField(10);
		GridBagConstraints constraintsCampDataPublicacio = new GridBagConstraints();
		constraintsCampDataPublicacio.gridx = 1;
		constraintsCampDataPublicacio.gridy = 5;
		constraintsCampDataPublicacio.insets = new Insets(10, 10, 10, 10);
		add(campDataPublicacio, constraintsCampDataPublicacio);

		etiquetaEditorial = new JLabel("Editorial:");
		GridBagConstraints constraintsEditorial = new GridBagConstraints();
		constraintsEditorial.gridx = 0;
		constraintsEditorial.gridy = 6;
		constraintsEditorial.insets = new Insets(10, 10, 10, 10);
		add(etiquetaEditorial, constraintsEditorial);

		campEditorial = new JTextField(10);
		GridBagConstraints constraintsCampEditorial = new GridBagConstraints();
		constraintsCampEditorial.gridx = 1;
		constraintsCampEditorial.gridy = 6;
		constraintsCampEditorial.insets = new Insets(10, 10, 10, 10);
		add(campEditorial, constraintsCampEditorial);

		etiquetaTematica = new JLabel("Tematica:");
		GridBagConstraints constraintsTematica = new GridBagConstraints();
		constraintsTematica.gridx = 0;
		constraintsTematica.gridy = 7;
		constraintsTematica.insets = new Insets(10, 10, 10, 10);
		add(etiquetaTematica, constraintsTematica);

		campTematica = new JTextField(10);
		GridBagConstraints constraintsCampTematica = new GridBagConstraints();
		constraintsCampTematica.gridx = 1;
		constraintsCampTematica.gridy = 7;
		constraintsCampTematica.insets = new Insets(10, 10, 10, 10);
		add(campTematica, constraintsCampTematica);

		etiquetaUbicacio = new JLabel("Ubicació:");
		GridBagConstraints constraintsUbicacio = new GridBagConstraints();
		constraintsUbicacio.gridx = 0;
		constraintsUbicacio.gridy = 8;
		constraintsUbicacio.insets = new Insets(10, 10, 10, 10);
		add(etiquetaUbicacio, constraintsUbicacio);

		campUbicacio = new JTextField(10);
		GridBagConstraints constraintsCampUbicacio = new GridBagConstraints();
		constraintsCampUbicacio.gridx = 1;
		constraintsCampUbicacio.gridy = 8;
		constraintsCampUbicacio.insets = new Insets(10, 10, 10, 10);
		add(campUbicacio, constraintsCampUbicacio);

		etiquetaDataAlta = new JLabel("Data alta:");
		GridBagConstraints constraintsDataAlta = new GridBagConstraints();
		constraintsDataAlta.gridx = 0;
		constraintsDataAlta.gridy = 9;
		constraintsDataAlta.insets = new Insets(10, 10, 10, 10);
		add(etiquetaDataAlta, constraintsDataAlta);

		campDataAlta = new JTextField(10);
		GridBagConstraints constraintsCampDataAlta = new GridBagConstraints();
		constraintsCampDataAlta.gridx = 1;
		constraintsCampDataAlta.gridy = 9;
		constraintsCampDataAlta.insets = new Insets(10, 10, 10, 10);
		add(campDataAlta, constraintsCampDataAlta);

		botoEnviar = new JButton("Enviar");
		GridBagConstraints constraintsBotoEnviar = new GridBagConstraints();
		constraintsBotoEnviar.gridx = 0;
		constraintsBotoEnviar.gridy = 10;
		constraintsBotoEnviar.insets = new Insets(10, 10, 10, 10);
		add(botoEnviar, constraintsBotoEnviar);

		botoTornar = new JButton("Tornar");
		GridBagConstraints constraintsBotoTornar = new GridBagConstraints();
		constraintsBotoTornar.gridx = 1;
		constraintsBotoTornar.gridy = 10;
		constraintsBotoTornar.insets = new Insets(10, 10, 10, 10);
		add(botoTornar, constraintsBotoTornar);

		setVisible(true);

		botoTornar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tornar();
			}
		});
		botoEnviar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				enviar();
			}
		});

	}

	private void tornar() {
		MenuLlibres menuLlibres = new MenuLlibres();
		menuLlibres.setVisible(true);
		this.dispose();
	}

	private void enviar() {
		Llibreria llibreria = new Llibreria();
		Libro libro = new Libro();
		try {
			if (!campAutor.getText().isEmpty() && !campDataAlta.getText().isEmpty()
					&& !campDataPublicacio.getText().isEmpty() && !campEditorial.getText().isEmpty()
					&& !campISBN.getText().isEmpty() && !campPVP.getText().isEmpty()
					&& !campStock.getText().isEmpty() && !campTematica.getText().isEmpty()
					&& !campTitol.getText().isEmpty() && !campUbicacio.getText().isEmpty()) {
				if (llibreria.retornarLlibre(Integer.parseInt(campISBN.getText())).isEmpty()) {
					libro.setAny(Integer.parseInt(campDataPublicacio.getText()));
					libro.setAutor(campAutor.getText());
					libro.setDataAlta(campDataAlta.getText());
					libro.setEditorial(campEditorial.getText());
					libro.setIsbn(Integer.parseInt(campISBN.getText()));
					libro.setPreu(Double.parseDouble(campPVP.getText()));
					libro.setStock(Integer.parseInt(campStock.getText()));
					libro.setTematica(campTematica.getText());
					libro.setTitol(campTitol.getText());
					libro.setUbicacio(campUbicacio.getText());
					llibreria.afegirLlibre(libro);
					tornar();
				} else {
					PopupOmplirCamps popupOmplirCamps = new PopupOmplirCamps(
							"El llibre indicat ja esta donat d'alta");
					popupOmplirCamps.setVisible(true);
				}
			}else {
				PopupOmplirCamps popupOmplirCamps = new PopupOmplirCamps(
						"S'han d'omplir tots els camps per donar l'alta");
				popupOmplirCamps.setVisible(true);
			}

		} catch (Exception e) {
			e.printStackTrace();
//			PopupOmplirCamps popupOmplirCamps = new PopupOmplirCamps(
//					"El llibre indicat ja esta donat d'alta");111111987	4	1987	Harry Potter	Hector vallve	Penguin	Fantasia	Alcover	20/04/2023	5.3
//			popupOmplirCamps.setVisible(true);
		}

	}

}

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

public class ModificarLlibre extends JFrame {

	private JLabel etiquetaTitol;
	private JLabel etiquetaAutor;
	private JLabel etiquetaISBNAntic;
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
	private JTextField campISBNAntic;
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

	public ModificarLlibre() {
		super("Alta de un llibre");
		setTitle("Alta de un llibre");
		setSize(800, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridBagLayout());
		
		etiquetaISBNAntic = new JLabel("ISBN antic:");
		GridBagConstraints constraintsISBNAntic = new GridBagConstraints();
		constraintsISBNAntic.gridx = 0;
		constraintsISBNAntic.gridy = 0;
		constraintsISBNAntic.insets = new Insets(10, 10, 10, 10);
		add(etiquetaISBNAntic, constraintsISBNAntic);

		campISBNAntic = new JTextField(10);
		GridBagConstraints constraintsCampISBNAntic = new GridBagConstraints();
		constraintsCampISBNAntic.gridx = 1;
		constraintsCampISBNAntic.gridy = 0;
		constraintsCampISBNAntic.insets = new Insets(10, 10, 10, 0);
		add(campISBNAntic, constraintsCampISBNAntic);
		
		etiquetaISBN = new JLabel("ISBN:");
		GridBagConstraints constraintsISBN = new GridBagConstraints();
		constraintsISBN.gridx = 0;
		constraintsISBN.gridy = 1;
		constraintsISBN.insets = new Insets(10, 10, 10, 10);
		add(etiquetaISBN, constraintsISBN);

		campISBN = new JTextField(10);
		GridBagConstraints constraintsCampISBN = new GridBagConstraints();
		constraintsCampISBN.gridx = 1;
		constraintsCampISBN.gridy = 1;
		constraintsCampISBN.insets = new Insets(10, 10, 10, 0);
		add(campISBN, constraintsCampISBN);

		etiquetaTitol = new JLabel("Titol:");
		GridBagConstraints constraintsTitol = new GridBagConstraints();
		constraintsTitol.gridx = 0;
		constraintsTitol.gridy = 2;
		constraintsTitol.insets = new Insets(10, 10, 10, 10);
		add(etiquetaTitol, constraintsTitol);

		campTitol = new JTextField(10);
		GridBagConstraints constraintsCampTitol = new GridBagConstraints();
		constraintsCampTitol.gridx = 1;
		constraintsCampTitol.gridy = 2;
		constraintsCampTitol.insets = new Insets(10, 10, 10, 10);
		add(campTitol, constraintsCampTitol);

		etiquetaAutor = new JLabel("Autor:");
		GridBagConstraints constraintsAutor = new GridBagConstraints();
		constraintsAutor.gridx = 0;
		constraintsAutor.gridy = 3;
		constraintsAutor.insets = new Insets(10, 10, 10, 10);
		add(etiquetaAutor, constraintsAutor);

		campAutor = new JTextField(10);
		GridBagConstraints constraintsCampAutor = new GridBagConstraints();
		constraintsCampAutor.gridx = 1;
		constraintsCampAutor.gridy = 3;
		constraintsCampAutor.insets = new Insets(10, 10, 10, 10);
		add(campAutor, constraintsCampAutor);
		
		etiquetaStock = new JLabel("Stock:");
		GridBagConstraints constraintsStock = new GridBagConstraints();
		constraintsStock.gridx = 0;
		constraintsStock.gridy = 4;
		constraintsStock.insets = new Insets(10, 10, 10, 10);
		add(etiquetaStock, constraintsStock);

		campStock = new JTextField(10);
		GridBagConstraints constraintsCampStock = new GridBagConstraints();
		constraintsCampStock.gridx = 1;
		constraintsCampStock.gridy = 4;
		constraintsCampStock.insets = new Insets(10, 10, 10, 10);
		add(campStock, constraintsCampStock);
		
		etiquetaPVP = new JLabel("PVP:");
		GridBagConstraints constraintsPVP = new GridBagConstraints();
		constraintsPVP.gridx = 0;
		constraintsPVP.gridy = 5;
		constraintsPVP.insets = new Insets(10, 10, 10, 10);
		add(etiquetaPVP, constraintsPVP);

		campPVP = new JTextField(10);
		GridBagConstraints constraintsCampPVP = new GridBagConstraints();
		constraintsCampPVP.gridx = 1;
		constraintsCampPVP.gridy = 5;
		constraintsCampPVP.insets = new Insets(10, 10, 10, 10);
		add(campPVP, constraintsCampPVP);
		
		etiquetaDataPublicacio = new JLabel("Data publicació:");
		GridBagConstraints constraintsDataPublicacio = new GridBagConstraints();
		constraintsDataPublicacio.gridx = 0;
		constraintsDataPublicacio.gridy = 6;
		constraintsDataPublicacio.insets = new Insets(10, 10, 10, 10);
		add(etiquetaDataPublicacio, constraintsDataPublicacio);

		campDataPublicacio = new JTextField(10);
		GridBagConstraints constraintsCampDataPublicacio = new GridBagConstraints();
		constraintsCampDataPublicacio.gridx = 1;
		constraintsCampDataPublicacio.gridy = 6;
		constraintsCampDataPublicacio.insets = new Insets(10, 10, 10, 10);
		add(campDataPublicacio, constraintsCampDataPublicacio);

		etiquetaEditorial = new JLabel("Editorial:");
		GridBagConstraints constraintsEditorial = new GridBagConstraints();
		constraintsEditorial.gridx = 0;
		constraintsEditorial.gridy = 7;
		constraintsEditorial.insets = new Insets(10, 10, 10, 10);
		add(etiquetaEditorial, constraintsEditorial);

		campEditorial = new JTextField(10);
		GridBagConstraints constraintsCampEditorial = new GridBagConstraints();
		constraintsCampEditorial.gridx = 1;
		constraintsCampEditorial.gridy = 7;
		constraintsCampEditorial.insets = new Insets(10, 10, 10, 10);
		add(campEditorial, constraintsCampEditorial);
		
		etiquetaTematica = new JLabel("Tematica:");
		GridBagConstraints constraintsTematica = new GridBagConstraints();
		constraintsTematica.gridx = 0;
		constraintsTematica.gridy = 8;
		constraintsTematica.insets = new Insets(10, 10, 10, 10);
		add(etiquetaTematica, constraintsTematica);

		campTematica = new JTextField(10);
		GridBagConstraints constraintsCampTematica = new GridBagConstraints();
		constraintsCampTematica.gridx = 1;
		constraintsCampTematica.gridy = 8;
		constraintsCampTematica.insets = new Insets(10, 10, 10, 10);
		add(campTematica, constraintsCampTematica);
		
		etiquetaUbicacio = new JLabel("Ubicació:");
		GridBagConstraints constraintsUbicacio = new GridBagConstraints();
		constraintsUbicacio.gridx = 0;
		constraintsUbicacio.gridy = 9;
		constraintsUbicacio.insets = new Insets(10, 10, 10, 10);
		add(etiquetaUbicacio, constraintsUbicacio);

		campUbicacio = new JTextField(10);
		GridBagConstraints constraintsCampUbicacio = new GridBagConstraints();
		constraintsCampUbicacio.gridx = 1;
		constraintsCampUbicacio.gridy = 9;
		constraintsCampUbicacio.insets = new Insets(10, 10, 10, 10);
		add(campUbicacio, constraintsCampUbicacio);
		
		etiquetaDataAlta = new JLabel("Data alta:");
		GridBagConstraints constraintsDataAlta = new GridBagConstraints();
		constraintsDataAlta.gridx = 0;
		constraintsDataAlta.gridy = 10;
		constraintsDataAlta.insets = new Insets(10, 10, 10, 10);
		add(etiquetaDataAlta, constraintsDataAlta);

		campDataAlta = new JTextField(10);
		GridBagConstraints constraintsCampDataAlta = new GridBagConstraints();
		constraintsCampDataAlta.gridx = 1;
		constraintsCampDataAlta.gridy = 10;
		constraintsCampDataAlta.insets = new Insets(10, 10, 10, 10);
		add(campDataAlta, constraintsCampDataAlta);
		
		botoEnviar = new JButton("Enviar");
		GridBagConstraints constraintsBotoEnviar = new GridBagConstraints();
		constraintsBotoEnviar.gridx = 0;
		constraintsBotoEnviar.gridy = 11;
		constraintsBotoEnviar.insets = new Insets(10, 10, 10, 10);
		add(botoEnviar, constraintsBotoEnviar);

		botoTornar = new JButton("Tornar");
		GridBagConstraints constraintsBotoTornar = new GridBagConstraints();
		constraintsBotoTornar.gridx = 1;
		constraintsBotoTornar.gridy = 11;
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
				try {
					enviar();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}				
			}
		});
		
	}
	
	private void tornar() {
		MenuLlibres menuLlibres = new MenuLlibres();
		menuLlibres.setVisible(true);
		this.dispose();
	}
	
	private void enviar() throws NumberFormatException, Exception {
		Llibreria llibreria = new Llibreria();
		if(!campAutor.getText().isEmpty() && !campDataAlta.getText().isEmpty()
				&& !campDataPublicacio.getText().isEmpty() && !campEditorial.getText().isEmpty()
				&& !campISBN.getText().isEmpty() && !campPVP.getText().isEmpty()
				&& !campStock.getText().isEmpty() && !campTematica.getText().isEmpty()
				&& !campTitol.getText().isEmpty() && !campUbicacio.getText().isEmpty()) {
			if(!llibreria.retornarLlibre(Integer.parseInt(campISBNAntic.getText())).isEmpty()) {
		llibreria.actualitzarLlibre(Integer.parseInt(campISBNAntic.getText()), Integer.parseInt(campISBN.getText()), Integer.parseInt(campStock.getText()),
				Integer.parseInt(campDataPublicacio.getText()), campDataAlta.getText(), campTitol.getText(), campAutor.getText(), campEditorial.getText(),
				campTematica.getText(), campUbicacio.getText(), Double.parseDouble(campPVP.getText()));
		
		tornar();
			}else {
				PopupOmplirCamps popupOmplirCamps = new PopupOmplirCamps(
						"No s'ha pogut trobar el llibre indicat");
				popupOmplirCamps.setVisible(true);
			}
		}else {
			PopupOmplirCamps popupOmplirCamps = new PopupOmplirCamps("S'han d'omplir tots els camps per modificar el llibre");
			popupOmplirCamps.setVisible(true);
		}
		
	}
	
	

}

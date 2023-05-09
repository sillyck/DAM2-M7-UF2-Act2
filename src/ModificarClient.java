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

public class ModificarClient extends JFrame {

	private JLabel etiquetaNom;
	private JLabel etiquetaCognom;
	private JLabel etiquetaDNI;
	private JLabel etiquetaDNIAntic;
	private JLabel etiquetaDireccio;
	private JTextField campNom;
	private JTextField campCognom;
	private JTextField campDNI;
	private JTextField campDNIAntic;
	private JTextField campDireccio;
	private JButton botoEnviar;
	private JButton botoTornar;

	public ModificarClient() {
		super("Modificar un client");
		setTitle("Nou Menu");
		setSize(800, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridBagLayout());
		
		etiquetaDNIAntic = new JLabel("DNI antic:");
		GridBagConstraints constraintsDniAntic = new GridBagConstraints();
		constraintsDniAntic.gridx = 0;
		constraintsDniAntic.gridy = 0;
		constraintsDniAntic.insets = new Insets(10, 10, 10, 10);
		add(etiquetaDNIAntic, constraintsDniAntic);

		campDNIAntic = new JTextField(10);
		GridBagConstraints constraintsCampDNIAntic = new GridBagConstraints();
		constraintsCampDNIAntic.gridx = 1;
		constraintsCampDNIAntic.gridy = 0;
		constraintsCampDNIAntic.insets = new Insets(10, 10, 10, 0);
		add(campDNIAntic, constraintsCampDNIAntic);
		
		etiquetaDNI = new JLabel("DNI:");
		GridBagConstraints constraintsDni = new GridBagConstraints();
		constraintsDni.gridx =0;
		constraintsDni.gridy = 1;
		constraintsDni.insets = new Insets(10, 10, 10, 10);
		add(etiquetaDNI, constraintsDni);
		
		campDNI = new JTextField(10);
		GridBagConstraints constraintsCampDNI = new GridBagConstraints();
		constraintsCampDNI.gridx = 1;
		constraintsCampDNI.gridy = 1;
		constraintsCampDNI.insets = new Insets(10, 10, 10, 0);
		add(campDNI, constraintsCampDNI);

		etiquetaNom = new JLabel("Nom:");
		GridBagConstraints constraintsNom = new GridBagConstraints();
		constraintsNom.gridx = 0;
		constraintsNom.gridy = 2;
		constraintsNom.insets = new Insets(10, 10, 10, 10);
		add(etiquetaNom, constraintsNom);

		campNom = new JTextField(10);
		GridBagConstraints constraintsCampNom = new GridBagConstraints();
		constraintsCampNom.gridx = 1;
		constraintsCampNom.gridy = 2;
		constraintsCampNom.insets = new Insets(10, 10, 10, 10);
		add(campNom, constraintsCampNom);

		etiquetaCognom = new JLabel("Cognom:");
		GridBagConstraints constraintsCognom = new GridBagConstraints();
		constraintsCognom.gridx = 0;
		constraintsCognom.gridy = 3;
		constraintsCognom.insets = new Insets(10, 10, 10, 10);
		add(etiquetaCognom, constraintsCognom);

		campCognom = new JTextField(10);
		GridBagConstraints constraintsCampCognom = new GridBagConstraints();
		constraintsCampCognom.gridx = 1;
		constraintsCampCognom.gridy = 3;
		constraintsCampCognom.insets = new Insets(10, 10, 10, 10);
		add(campCognom, constraintsCampCognom);
		
		etiquetaDireccio = new JLabel("Direcció:");
		GridBagConstraints constraintsDireccio = new GridBagConstraints();
		constraintsDireccio.gridx = 0;
		constraintsDireccio.gridy = 4;
		constraintsDireccio.insets = new Insets(10, 10, 10, 10);
		add(etiquetaDireccio, constraintsDireccio);

		campDireccio = new JTextField(10);
		GridBagConstraints constraintsCampDireccio = new GridBagConstraints();
		constraintsCampDireccio.gridx = 1;
		constraintsCampDireccio.gridy = 4;
		constraintsCampDireccio.insets = new Insets(10, 10, 10, 10);
		add(campDireccio, constraintsCampDireccio);

		botoEnviar = new JButton("Enviar");
		GridBagConstraints constraintsBotoEnviar = new GridBagConstraints();
		constraintsBotoEnviar.gridx = 0;
		constraintsBotoEnviar.gridy = 5;
		constraintsBotoEnviar.insets = new Insets(10, 10, 10, 10);
		add(botoEnviar, constraintsBotoEnviar);

		botoTornar = new JButton("Tornar");
		GridBagConstraints constraintsBotoTornar = new GridBagConstraints();
		constraintsBotoTornar.gridx = 1;
		constraintsBotoTornar.gridy = 5;
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
		MenuClients menuClients = new MenuClients();
		menuClients.setVisible(true);
		this.dispose();
	}
	
	private void enviar() {
		Llibreria llibreria = new Llibreria();
		
		try {
			if(!campDNIAntic.getText().isEmpty() && !campDNI.getText().isEmpty()
					&& !campNom.getText().isEmpty() && !campCognom.getText().isEmpty()
					&& !campDireccio.getText().isEmpty()) {
				if (llibreria.retornarClient(campDNI.getText()).isEmpty()) {
			llibreria.actualitzarClient(campDNIAntic.getText(), campDNI.getText(), campNom.getText()
					, campCognom.getText(), campDireccio.getText());
			tornar();
				}else {
					PopupOmplirCamps popupOmplirCamps = new PopupOmplirCamps(
							"No s'ha pogut trobar el client");
					popupOmplirCamps.setVisible(true);
				}
			}else {
				PopupOmplirCamps popupOmplirCamps = new PopupOmplirCamps("S'han d'omplir tots els camps per modificar el client");
				popupOmplirCamps.setVisible(true);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}

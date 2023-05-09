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

public class BaixaClient extends JFrame {

	private JLabel etiquetaDNI;
	private JTextField campDNI;
	private JButton botoEnviar;
	private JButton botoTornar;

	public BaixaClient() {
		super("Baixa de un client");
		setTitle("Nou Menu");
		setSize(800, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridBagLayout());

		etiquetaDNI = new JLabel("DNI:");
		GridBagConstraints constraintsDni = new GridBagConstraints();
		constraintsDni.gridx = 0;
		constraintsDni.gridy = 0;
		constraintsDni.insets = new Insets(10, 10, 10, 10);
		add(etiquetaDNI, constraintsDni);

		campDNI = new JTextField(10);
		GridBagConstraints constraintsCampDNI = new GridBagConstraints();
		constraintsCampDNI.gridx = 1;
		constraintsCampDNI.gridy = 0;
		constraintsCampDNI.insets = new Insets(10, 10, 10, 0);
		add(campDNI, constraintsCampDNI);

		botoEnviar = new JButton("Enviar");
		GridBagConstraints constraintsBotoEnviar = new GridBagConstraints();
		constraintsBotoEnviar.gridx = 0;
		constraintsBotoEnviar.gridy = 4;
		constraintsBotoEnviar.insets = new Insets(10, 10, 10, 10);
		add(botoEnviar, constraintsBotoEnviar);

		botoTornar = new JButton("Tornar");
		GridBagConstraints constraintsBotoTornar = new GridBagConstraints();
		constraintsBotoTornar.gridx = 1;
		constraintsBotoTornar.gridy = 4;
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

	// 333333333L
	private void enviar() {
		Llibreria llibreria = new Llibreria();

		try {
			if (!campDNI.getText().isEmpty()) {
				if (!llibreria.retornarClient(campDNI.getText()).isEmpty()) {
					llibreria.eliminarClient(campDNI.getText());
					tornar();
				} else {
					PopupOmplirCamps popupOmplirCamps = new PopupOmplirCamps(
							"No s'ha pogut trobar el client");
					popupOmplirCamps.setVisible(true);
				}
			}else {
				PopupOmplirCamps popupOmplirCamps = new PopupOmplirCamps(
						"Has d'indicar el DNI del client que vols donar de baixa");
				popupOmplirCamps.setVisible(true);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

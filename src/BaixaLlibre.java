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

public class BaixaLlibre extends JFrame {

	private JLabel etiquetaISBN;
	private JTextField campISBN;
	private JButton botoEnviar;
	private JButton botoTornar;

	public BaixaLlibre() {
		super("Baixa de un llibre");
		setTitle("Baixa de un llibre");
		setSize(800, 200);
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
		GridBagConstraints constraintsCampDNI = new GridBagConstraints();
		constraintsCampDNI.gridx = 1;
		constraintsCampDNI.gridy = 0;
		constraintsCampDNI.insets = new Insets(10, 10, 10, 0);
		add(campISBN, constraintsCampDNI);

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
				try {
					enviar();
				} catch (Exception e1) {
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
		if (!campISBN.getText().isEmpty()) {
			if (!llibreria.retornarLlibre(Integer.parseInt(campISBN.getText())).isEmpty()) {
				llibreria.eliminarLlibre(Integer.parseInt(campISBN.getText()));
				tornar();
			} else {
				PopupOmplirCamps popupOmplirCamps = new PopupOmplirCamps(
						"No s'ha pogut trobar el llibre indicat");
				popupOmplirCamps.setVisible(true);
			}
		}else {
			PopupOmplirCamps popupOmplirCamps = new PopupOmplirCamps(
					"Has d'indicar el ISBN del llibre que vols donar de baixa");
			popupOmplirCamps.setVisible(true);
		}
	}

}

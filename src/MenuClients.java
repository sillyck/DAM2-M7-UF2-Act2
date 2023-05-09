import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MenuClients extends JFrame{
	
	public MenuClients() {
		setSize(1200, 380);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton alta = new JButton("Alta");
		JButton baixa = new JButton("Baixa");
		JButton modificar = new JButton("Modificació");
		JButton enrere = new JButton("Enrere");
		
		Container cp = getContentPane();
		cp.setLayout(new GridBagLayout());
		
		GridBagConstraints posicioBotoAlta = new GridBagConstraints();
		posicioBotoAlta.gridx = 0;
		posicioBotoAlta.gridy = 0;
		posicioBotoAlta.insets = new Insets(0, 0, 100, 0);

		GridBagConstraints posicioBotoBaixa = new GridBagConstraints();
		posicioBotoBaixa.gridx = 0;
		posicioBotoBaixa.gridy = 0;
		posicioBotoBaixa.insets = new Insets(0, 0, 50, 0);

		GridBagConstraints posicioBotoModificar = new GridBagConstraints();
		posicioBotoModificar.gridx = 0;
		posicioBotoModificar.gridy = 0;
		posicioBotoModificar.insets = new Insets(50, 0, 0, 0);

		GridBagConstraints posicioBotoEnrere = new GridBagConstraints();
		posicioBotoEnrere.gridx = 0;
		posicioBotoEnrere.gridy = 0;
		posicioBotoEnrere.insets = new Insets(100, 0, 0, 0);

		cp.add(alta, posicioBotoAlta);
		cp.add(baixa, posicioBotoBaixa);
		cp.add(modificar, posicioBotoModificar);
		cp.add(enrere, posicioBotoEnrere);
		
		alta.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				crearAltaClient();				
			}
		});
		
		baixa.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				crearBaixaClient();				
			}
		});
		
		modificar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				modificarClient();				
			}
		});
		
		enrere.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tornar();				
			}
		});
		
	}
	
	private void crearAltaClient() {
		AltaClient alta = new AltaClient();
		alta.setVisible(true);
		this.dispose();
	}
	
	private void crearBaixaClient() {
		BaixaClient baixa = new BaixaClient();
		baixa.setVisible(true);
		this.dispose();
	}
	
	private void modificarClient() {
		ModificarClient modificar = new ModificarClient();
		modificar.setVisible(true);
		this.dispose();
	}
	
	private void tornar() {
		MenuInicial inici = new MenuInicial();
		inici.setVisible(true);
		this.dispose();
	}
	
	
	

}

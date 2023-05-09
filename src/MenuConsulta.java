import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MenuConsulta extends JFrame {

	public MenuConsulta() {
		setSize(1200, 380);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton llibres = new JButton("Llibres");
		JButton clients = new JButton("Clients");
		JButton ventes = new JButton("Ventes");
		JButton enrere = new JButton("Enrere");

		Container cp = getContentPane();
		cp.setLayout(new GridBagLayout());

		GridBagConstraints posicioBotoLlibres = new GridBagConstraints();
		posicioBotoLlibres.gridx = 0;
		posicioBotoLlibres.gridy = 0;
		posicioBotoLlibres.insets = new Insets(0, 0, 100, 0);

		GridBagConstraints posicioBotoClients = new GridBagConstraints();
		posicioBotoClients.gridx = 0;
		posicioBotoClients.gridy = 0;
		posicioBotoClients.insets = new Insets(0, 0, 50, 0);

		GridBagConstraints posicioBotoVentes = new GridBagConstraints();
		posicioBotoVentes.gridx = 0;
		posicioBotoVentes.gridy = 0;
		posicioBotoVentes.insets = new Insets(50, 0, 0, 0);

		GridBagConstraints posicioBotoEnrere = new GridBagConstraints();
		posicioBotoEnrere.gridx = 0;
		posicioBotoEnrere.gridy = 0;
		posicioBotoEnrere.insets = new Insets(100, 0, 0, 0);

		cp.add(llibres, posicioBotoLlibres);
		cp.add(clients, posicioBotoClients);
		cp.add(ventes, posicioBotoVentes);
		cp.add(enrere, posicioBotoEnrere);

		llibres.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				obrirConsultaLlibres();
			}
		});

		clients.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				obrirConsultaClients();
			}
		});
		
		ventes.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				obrirConsultaVentes();				
			}
		});
		
		enrere.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				enrere();				
			}
		});

	}

	private void obrirConsultaLlibres() {
		ConsultaLlibres consultaLlibres = new ConsultaLlibres();
		consultaLlibres.setVisible(true);
		this.dispose();
	}

	private void obrirConsultaClients() {
		ConsultaClients consultaClients = new ConsultaClients();
		consultaClients.setVisible(true);
		this.dispose();
	}
	
	private void obrirConsultaVentes() {
		ConsultaVentes consultaVentes = new ConsultaVentes();
		consultaVentes.setVisible(true);
		this.dispose();
	}
	
	private void enrere() {
		MenuInicial inici = new MenuInicial();
		inici.setVisible(true);
		this.dispose();
	}

}

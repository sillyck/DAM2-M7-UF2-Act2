import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MenuInicial extends JFrame{
	
	public MenuInicial() {
		setSize(1200, 380);
		setLocationRelativeTo(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton clients = new JButton("Clients");
		JButton llibres = new JButton("Llibres");
		JButton ventes = new JButton("Ventes");
		JButton consultar = new JButton("Consultar");
		JButton sortir = new JButton("Sortir");
		
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

		GridBagConstraints posicioBotoConsulta = new GridBagConstraints();
		posicioBotoConsulta.gridx = 0;
		posicioBotoConsulta.gridy = 0;
		posicioBotoConsulta.insets = new Insets(100, 0, 0, 0);

		GridBagConstraints posicioBotoSortir = new GridBagConstraints();
		posicioBotoSortir.gridx = 0;
		posicioBotoSortir.gridy = 0;
		posicioBotoSortir.insets = new Insets(100, 500, 0, 0);
		
		
		cp.add(clients, posicioBotoClients);
		cp.add(llibres, posicioBotoLlibres);
		cp.add(ventes, posicioBotoVentes);
		cp.add(consultar, posicioBotoConsulta);
		cp.add(sortir, posicioBotoSortir);
		
	
		clients.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				obrirPantallaClients();				
			}
		});
		
		llibres.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				obrirPantallaLlibres();				
			}
		});
		
		ventes.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				obrirPantallaVentes();
			}
		});
		
		consultar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				obrirPantallaConsultar();
			}
		});
		
		sortir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				sortir();
			}
		});
		
	}
	
	public void obrirPantallaClients() {
		MenuClients menuClients = new MenuClients();
		menuClients.setVisible(true);
		this.dispose();
	}
	
	public void obrirPantallaLlibres() {
		MenuLlibres menuLlibres = new MenuLlibres();
		menuLlibres.setVisible(true);
		this.dispose();
	}
	
	public void obrirPantallaVentes() {
		MenuVentes menuVentes = new MenuVentes();
		menuVentes.setVisible(true);
		this.dispose();
	}
	
	public void obrirPantallaConsultar(){
		MenuConsulta menuConsulta = new MenuConsulta();
		menuConsulta.setVisible(true);
		this.dispose();
		
	}
	
	public void sortir() {
		this.dispose();
	}
	
	
	

}

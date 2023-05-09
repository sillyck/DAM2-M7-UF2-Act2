import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MenuLineaVenta extends JFrame {
    private JTextField nomLlibre;
    private JTextField quantitat;
    private JButton enviarButton;

    private LineaVentaListener lineaVentaListener;

    public MenuLineaVenta() {
        setSize(200, 150);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setTitle("Añadir libro");

        nomLlibre = new JTextField(10);
        quantitat = new JTextField(10);
        enviarButton = new JButton("Enviar");

        enviarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int nom = Integer.parseInt(nomLlibre.getText());
                int quant = Integer.parseInt(quantitat.getText());

                LineaVenta lv = new LineaVenta(nom, quant);
                if (lineaVentaListener != null) {
                    try {
						lineaVentaListener.agregarLineaVenta(lv);
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
                }

                dispose();
            }
        });

        setLayout(new GridLayout(3, 2));
        add(new JLabel("Nom llibre:"));
        add(nomLlibre);
        add(new JLabel("Quantitat:"));
        add(quantitat);
        add(new JLabel(""));
        add(enviarButton);

        setVisible(true);
    }

    public void setLineaVentaListener(LineaVentaListener listener) {
        this.lineaVentaListener = listener;
    }

    public JButton getEnviarButton() {
        return enviarButton;
    }

    public JTextField getNomLlibre() {
        return nomLlibre;
    }

    public JTextField getQuantitat() {
        return quantitat;
    }
}

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
//import javax.swing.border.Border;

public class Calculadora implements ActionListener {
	JFrame ventana;
	JLabel lCont;
	String sval = "";
	String operacion = "";
	Double val, val2;

	public Calculadora() {
		ventana = new JFrame("Calcu");
		ventana.setSize(300, 300);
		ventana.setLocation(500, 100);
		ventana.setContentPane(crearPanelPrincipal());
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	private JPanel crearPanelPrincipal() {
		JPanel panel = new JPanel(new BorderLayout());
		panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

		panel.add(crearPanelCentral(), BorderLayout.NORTH);
		panel.add(crearPanelOeste(), BorderLayout.CENTER);
		panel.add(crearPanelEste(), BorderLayout.EAST);

		return panel;
	}

	private Component crearPanelCentral() {
		lCont = new JLabel("");
		lCont.setFont(new Font("Console", Font.BOLD, 25));
		lCont.setHorizontalAlignment(JLabel.RIGHT);
		lCont.setBorder(BorderFactory.createLineBorder(Color.BLUE, 2));
		lCont.setPreferredSize(new Dimension(300, 40));
		return lCont;
	}

	private Component crearPanelOeste() {
		JPanel panel = new JPanel(new GridLayout(4, 3, 5, 5));

		for (int i = 1; i <= 9; i++) {
			panel.add(crearBoton(i));
		}
		panel.add(new JLabel());
		panel.add(crearBoton(0));

		return panel;
	}

	private JButton crearBoton(int i) {
		JButton boton;
		boton = new JButton(String.valueOf(i));
		boton.addActionListener(this);

		return boton;
	}

	private JButton crearBoton(String i) {
		JButton boton;
		boton = new JButton(i);
		boton.addActionListener(this);

		return boton;
	}

	private Component crearPanelEste() {
		JPanel panel = new JPanel(new GridLayout(5, 1, 0, 0));
		panel.add(crearBoton("-"));
		panel.add(crearBoton("+"));
		panel.add(crearBoton("*"));
		panel.add(crearBoton("/"));
		panel.add(crearBoton("="));
		return panel;
	}

	public static void main(String[] args) {
		Calculadora p = new Calculadora();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			sval = sval + e.getActionCommand();
			if (operacion.equals(""))
				val = Double.parseDouble(sval);
			else
				val2 = Double.parseDouble(sval);
			lCont.setText(sval);
		} catch (NumberFormatException err) {
			if (e.getActionCommand().equals("=")) {
				switch (operacion) {
				case "-":
					val = val - val2;
					break;
				case "+":
					val = val + val2;
					break;
				case "*":
					val = val * val2;
					break;
				case "/":
					val = val / val2;
					break;
				default:
					break;
				}
				lCont.setText(String.valueOf(val));
				operacion = "";
				val = 0.0;
				val2= 0.0;
				sval = "";
			} else {
				operacion = e.getActionCommand();
				lCont.setText(operacion);
				sval = "";
			}
		}
	}
	// System.out.println(e.getSource());

}

package cuantaClicks;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PantallaPrincipal implements ActionListener {
	JLabel lValor;
	long contador;
	
	public PantallaPrincipal() {
		JFrame pantalla = new JFrame("Cuenta Cliks");
		contador = 1;
		pantalla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pantalla.setSize(400, 600);
		pantalla.setLocation(500,70);
		pantalla.setContentPane(crearPanelVentana());
		
		pantalla.setVisible(true);
	}
	private Container crearPanelVentana() {
		JPanel panel = new JPanel(new BorderLayout());	
		lValor = new JLabel();
		JButton boton = new JButton();
		lValor.setText(String.valueOf(contador));
		lValor.setFont(new Font("Arial", Font.BOLD, 45));
		lValor.setForeground(Color.RED);lValor.setHorizontalAlignment(JLabel.CENTER);
		boton.setText("Clickame");
		boton.addActionListener(this);
		panel.add(lValor,BorderLayout.CENTER);
		panel.add(boton,BorderLayout.SOUTH);
		return panel;
	}
	public static void main(String[] args) {
		PantallaPrincipal programa = new PantallaPrincipal();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		contador+=contador;
		lValor.setText(String.valueOf(contador));
		
	}

}

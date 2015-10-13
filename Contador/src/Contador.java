import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Contador implements ActionListener {
	JFrame ventana;
	int iContador,cantidad;
	JLabel contador;
	
	public Contador() {
		iContador=0;
		cantidad = 0;
		ventana = new JFrame();
		ventana.setSize(300, 300);
		ventana.setLocation(500,100);
		ventana.setContentPane(panelPrincipal());
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	}
	private Container panelPrincipal() {
		JPanel panel = new JPanel (new BorderLayout());
		panel.add(panelCentral(),BorderLayout.CENTER);
		panel.add(panelSur(),BorderLayout.SOUTH);
		panel.add(panelEste(),BorderLayout.EAST);
		return panel;
	}
	private Component panelEste() {
		JPanel panel = new JPanel(new GridLayout(3,1));
		JButton b1,b3,b5;
		b1 = new JButton("1");
		b1.addActionListener(this);
		b1.setActionCommand("b1");
		b3 = new JButton("3");
		b3.addActionListener(this);
		b3.setActionCommand("b3");
		b5 = new JButton("5");
		b5.addActionListener(this);
		b5.setActionCommand("b5");
		panel.add(b1);
		panel.add(b3);
		panel.add(b5);
		return panel;
	}
	private Component panelCentral() {
		
		contador = new JLabel(String.valueOf(iContador));
		contador.setHorizontalAlignment(SwingConstants.CENTER);
		return contador;
	}
	private Component panelSur() {
		JPanel panel = new JPanel(new GridLayout(1,3));
		JButton incrementar,decrementar,salir;
		incrementar = new JButton("incrementar");
		incrementar.addActionListener(this);
		incrementar.setActionCommand("incrementar");
		decrementar = new JButton("decrementar");
		decrementar.addActionListener(this);
		decrementar.setActionCommand("decrementar");
		salir = new JButton("salir");
		salir.addActionListener(this);
		salir.setActionCommand("salir");
		panel.add(incrementar);
		panel.add(decrementar);
		panel.add(salir);
		return panel;
	}


	public static void main(String[] args) {
		Contador p = new Contador();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		switch(e.getActionCommand()){
		case "b1":
			cantidad = 1;
			break;
		case "b3":
			cantidad = 3;
			break;
		case "b5":
			cantidad = 5;
			break;
		case "incrementar":
			iContador +=cantidad;
			contador.setText(String.valueOf(iContador));
			break;
		case "decrementar":
			iContador -=cantidad;
			contador.setText(String.valueOf(iContador));
			break;
		case "salir":
			ventana.dispose();
			break;
		}
		
	}

}

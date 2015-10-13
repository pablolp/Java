package peloRebota;



import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;


public class Pantalla extends JFrame implements Observer{
	
	Dibujable pelota;
	
	@Override
	public void paint(java.awt.Graphics arg0) {
		arg0.setColor(Color.WHITE);
		pelota.paint(arg0);
		
	}
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}

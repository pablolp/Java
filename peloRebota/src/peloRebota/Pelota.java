package peloRebota;

import java.awt.Color;
import java.awt.Graphics;

public class Pelota implements Dibujable{
	int x,y;
	double radio;
	
	public Pelota(int x,int y, double radio) {
		this.x=x;
		this.y= y;
		this.radio = radio;
	}
	@Override
	public void paint(Graphics arg0) {
		arg0.drawOval(x, y, (int)Math.round(radio), (int)Math.round(radio));
		arg0.setColor(new Color(255,0,0));
	}

}

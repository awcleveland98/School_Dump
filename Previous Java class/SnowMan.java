
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class SnowMan extends JFrame {
	
	
	public SnowMan() {
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		g.drawOval(120, 60, 60, 60);
		g.setColor(Color.RED);
		//HAT
		g.fillRect(125, 20, 50, 50);
		
		g.drawOval(100, 120, 100, 100);
		
		g.setColor(Color.BLUE);
		g.fillOval(130, 80, 10, 5);
		g.fillOval(160, 80, 10, 5);
		
		g.setColor(Color.black);
		g.drawLine(150, 90, 145, 100);
		g.drawLine(145, 100, 150, 100);
		
		g.fillOval(145, 140, 10, 10);
		g.fillOval(145, 170, 10, 10);
		g.fillOval(145, 200, 10, 10);
		//HANDS
		g.drawLine(105,150,50,50);
		g.drawLine(195,150,250,50);
		//LFingers
		g.drawLine(50,50,20,40);
		g.drawLine(50,50,20,80);
		g.drawLine(50,50,20,20);
		//RFingers
		g.drawLine(250,50,260,20);
		g.drawLine(250,50,260,40);
		g.drawLine(250,50,260,80);
	}
	
	public static void main(String[] args) {
		SnowMan snow = new SnowMan();
	}

}

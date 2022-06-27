package client.java;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class carPanel extends JPanel { 
	private final int WIDTH = 500, HEIGHT = 100;
	private final int DELAY = 20, IMAGE_SIZE = 90;

	 
	private Timer timer;
	private int x, y, moveX;
	
	
	public carPanel() { 
		timer = new Timer(DELAY, new carListener());
	 
		x=0;
		y=80;
	
	
	moveX = 7;
	
	setPreferredSize(new Dimension(WIDTH, HEIGHT));
	setBackground(Color.white);
	timer.start();
	
	}
	
	public void paintComponent(Graphics page) { 
		super.paintComponent(page); 
		page.setColor(Color.yellow);
		page.fillRect(x, y, 100, 10);
        page.setColor(Color.BLACK); // body
        page.fillOval(x + 15, y + 1, 15, 15); // wheel
        page.fillOval(x + 60, y +1, 15, 15); // wheel
        page.fillRect(x + 15, y-20, 60, 20); // top
    }

	
	private class carListener implements ActionListener { 

		public void actionPerformed(ActionEvent event) { 
			x += moveX; 
			
		
			if (x <= 0 || x >= WIDTH-IMAGE_SIZE) moveX = moveX * -1;
		

		
		repaint();
		}		
	}
}



package client.java;

import java.awt.*;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;



public class CircleRubberbandPanel extends JPanel{

	
	private Point point1=null, point2=null;
	private int Radius;
	 
	//----------------------------------------------------------------//  Constructor: Sets up this panel to listen for mouse events. //----------------------------------------------------------------
	public CircleRubberbandPanel() { 
		CircleDraw listener = new CircleDraw(); 
		addMouseListener(listener); 
		addMouseMotionListener(listener);
		setBackground(Color.black); 
	
	setPreferredSize(new Dimension(400, 200));
	}
	//----------------------------------------------------------------//  Draws the current line from the intial mouse-pressed point to //  the current position of the mouse. //----------------------------------------------------------------
	public void paintComponent(Graphics page) { 
		super.paintComponent(page);
		page.setColor (Color.yellow);
		
		if (point1 != null && point2 != null) {
		Radius= (int) Math.sqrt((point2.x-point1.x)*(point2.x-point1.x)+(point2.y-point1.y)*(point2.y-point1.y));
			page.drawOval(point1.x-Radius,point1.y-Radius,2*Radius,2*Radius);
	}
	}
	

	private class CircleDraw implements MouseListener, MouseMotionListener {
	public void mousePressed(MouseEvent event) { 
		point1 = event.getPoint();
		
		}

	//-------------------------------------------------------------//  Gets the current position of the mouse as it is dragged and //  redraws the line to create the rubberband effect. //-------------------------------------------------------------
	public void mouseDragged(MouseEvent event) { 
		point2 = event.getPoint(); 
		
		repaint(); }



	//-------------------------------------------------------------//  Provide empty definitions for unused event methods. //-------------------------------------------------------------
	public void mouseClicked(MouseEvent event) {} 
	public void mouseReleased(MouseEvent event) {}
	public void mouseEntered(MouseEvent event) {} 
	public void mouseExited(MouseEvent event) {}
	public void mouseMoved(MouseEvent event) {}

}
}

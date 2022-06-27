package client.java;

import javax.swing.JFrame;

public class CircleRubberband {
	public static void main(String[] args) {
		
	      JFrame frame = new JFrame("Draw Circle");
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	      CircleRubberbandPanel panel = new CircleRubberbandPanel();
	      frame.getContentPane().add(panel);

	      frame.pack();
	      frame.setVisible(true);
	   }
}

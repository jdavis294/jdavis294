package client.java;
import javax.swing.JFrame;

public class car{
   //-----------------------------------------------------------------
   //  Creates and displays the main program frame.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Moving Car");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      carPanel panel = new carPanel();
      frame.getContentPane().add(panel);

      frame.pack();
      frame.setVisible(true);
   }
}

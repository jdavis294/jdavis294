package client.java;

import javax.swing.JFrame;

public class TemperatureConverter{
   //-----------------------------------------------------------------
   //  Creates and displays the main program frame.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Temperature Converter");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      TemperatureConverterPanel panel = new TemperatureConverterPanel();
      frame.getContentPane().add(panel);

      frame.pack();
      frame.setVisible(true);
   }
}



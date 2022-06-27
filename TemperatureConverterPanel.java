package client.java;


	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;

	public class TemperatureConverterPanel extends JPanel
	{
		private JLabel inputLabel, resultLabel; 
		private JTextField number;
		private JButton Fahrenhiet;
		private JButton Celsius;

	  

	   //-----------------------------------------------------------------
	   //  Constructor: Sets up the GUI.
	   //-----------------------------------------------------------------
	   public TemperatureConverterPanel()
	   {
		   
		   inputLabel = new JLabel("Enter  a Fahrenheit or Celsius temperature to convert:");  
		   resultLabel = new JLabel();
		   number = new JTextField(5); 
		   number.addActionListener(new TempListener());
		   Celsius= new JButton("Change to Celsius");
		   Celsius.addActionListener(new TempListener()); 
		   Fahrenhiet= new JButton("Change to Fahrenheit");
		   Fahrenhiet.addActionListener(new TempListener2()); 
		   
		   add(inputLabel); 
		   add(number); 
		   add(Celsius);
		   add(Fahrenhiet);
		   add(resultLabel);


	      setBackground(Color.cyan);
	      setPreferredSize(new Dimension(400, 200));
	   }

	   //*****************************************************************
	   //  Represents a listener for button push (action) events.
	   //*****************************************************************
		private class TempListener implements ActionListener{
		public void actionPerformed(ActionEvent event){
			int fahrenheitTemp, celsiusTemp;
			String text = number.getText();
			fahrenheitTemp = Integer.parseInt(text); 
			celsiusTemp = (fahrenheitTemp-32) * 5/9;
			resultLabel.setText("New Temperature: "+ Integer.toString(celsiusTemp));
	  	}
	 }
		
		private class TempListener2 implements ActionListener{
			public void actionPerformed(ActionEvent event){
				int fahrenheitTemp;
				int celsiusTemp;
				String text = number.getText();
				celsiusTemp = Integer.parseInt(text); 
				fahrenheitTemp =  (celsiusTemp *9/5 )+32;
				resultLabel.setText("New Temperature: "+ Integer.toString (fahrenheitTemp));
		  	}
		 }
	}


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class MyFrame extends JFrame implements ActionListener {
	
	//Globally defined buttons for method access
	JButton patientsButton;
	JButton visitsButton;
	JButton analyticsButton;
	JButton otherButton;
	
	JFrame frame = new JFrame();
	
	public MyFrame() {
		/*
		//Label
		JLabel label = new JLabel();        //Create label
		label.setHorizontalTextPosition(JLabel.CENTER);    //Set text LEFT, CENTER, or RIGHT
		label.setVerticalTextPosition(JLabel.TOP);        //set TOP, CENTER, or BOTTOM 
		label.setForeground(new Color(0xD7DCE6));        //Color of text
		label.setFont(new Font("Monospace", Font.PLAIN, 15));
		label.setBackground(new Color(0x23272A));         //Label background color
		label.setOpaque(true);
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);      //Set vertical position of text within label.
		label.setHorizontalAlignment(JLabel.CENTER);    //Set horizontal position of text within label
		label.setBounds(50, 50, 150, 75);                //Set (x,y) position within frame as well as dimensions
		*/
		
		//Sets label for header panel
		JLabel headerLabel = new JLabel();
		headerLabel.setText("Welcome to the Hearing Clinic!");
		headerLabel.setBounds(30, 10, 375, 40);
		headerLabel.setForeground(new Color(200, 200, 200));
		headerLabel.setFont(new Font("Monospace", Font.BOLD, 22));
		headerLabel.setHorizontalAlignment(JLabel.CENTER);
		
		
		//Sets Panel for header
		JPanel headerPanel = new JPanel();
		headerPanel.setBackground(new Color(0x23272A));
		headerPanel.setBounds(30, 10, 375, 40);
		
		
		//Sets the panel for the buttons
		JPanel optionPanel = new JPanel();
		optionPanel.setBackground(new Color(0x23272A));
		optionPanel.setBounds(30, 65, 375, 195);
		
		//Patient button
		patientsButton = new JButton();
		patientsButton.setBounds(60, 100, 135, 60);
		patientsButton.addActionListener(this);
		patientsButton.setText("Patient");
		patientsButton.setFont(new Font("Monospace", Font.BOLD, 18));
		patientsButton.setFocusable(false);
		patientsButton.setBorder(BorderFactory.createEtchedBorder());
		
		
		//Visits button
		visitsButton = new JButton();
		visitsButton.setBounds(240, 100, 135, 60);
		visitsButton.addActionListener(this);
		visitsButton.setText("Visits");
		visitsButton.setFont(new Font("Monospace", Font.BOLD, 18));
		visitsButton.setFocusable(false);
		visitsButton.setBorder(BorderFactory.createEtchedBorder());
		
		//Analytics button
		analyticsButton = new JButton();
		analyticsButton.setBounds(60, 175, 135, 60);
		analyticsButton.addActionListener(this);
		analyticsButton.setText("Analytics");
		analyticsButton.setFont(new Font("Monospace", Font.BOLD, 18));
		analyticsButton.setFocusable(false);
		analyticsButton.setBorder(BorderFactory.createEtchedBorder());
		
		//Other button
		otherButton = new JButton();
		otherButton.setBounds(240, 175, 135, 60);
		otherButton.addActionListener(this);
		otherButton.setText("Other");
		otherButton.setFont(new Font("Monospace", Font.BOLD, 18));
		otherButton.setFocusable(false);
		otherButton.setBorder(BorderFactory.createEtchedBorder());
		
		//Window
		frame.setTitle("eTRT");       //Set title of this
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // exit out of application
		frame.setResizable(false); 				// prevent frame from being resized
		frame.setLayout(null);
		frame.setSize(450, 300);					// sets dimensions of window(x,y)
		frame.setVisible(true);  				// make frame visible
		//frame.add(label);
		
		frame.add(patientsButton);
		frame.add(visitsButton);
		frame.add(analyticsButton);
		frame.add(otherButton);
		frame.add(headerLabel);
		frame.add(headerPanel);
		frame.add(optionPanel);
		
		ImageIcon image = new ImageIcon("HearingClinicIcon.jpg");  //Create an Icon for window
		frame.setIconImage(image.getImage());                      //Change icon of window
		frame.getContentPane().setBackground(new Color(0x606266));   //Change color of background
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == patientsButton) {
			frame.dispose();
			Patients patientsPage = new Patients();
		}
		
		if (e.getSource() == visitsButton) {
//			frame.dispose();
//			Visits visitsPage = new Visits();
			JOptionPane.showMessageDialog(null, "Still Under Construction", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		
		if (e.getSource() == analyticsButton) {
			//frame.dispose();
			//Analytics analyticsPage = new Analytics();
			JOptionPane.showMessageDialog(null, "Still Under Construction", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		
		if (e.getSource() == otherButton) {
			JOptionPane.showMessageDialog(null, "Still Under Construction", "ERROR", JOptionPane.ERROR_MESSAGE);
		}
		
		
	}

}

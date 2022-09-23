import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Visits implements ActionListener{
	
	JFrame frame = new JFrame();
	JButton newVisitButton;
	JButton viewEditVisitButton;
	JButton backButton;
	
	
	public Visits() {
		//Window
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0x23272A));
		panel.setBounds(25, 25, 380, 200);
		
		//New patient button
		newVisitButton = new JButton();
		newVisitButton.setBounds(60, 100, 135, 60);
		newVisitButton.addActionListener(this);
		newVisitButton.setText("Add New Visit");
		newVisitButton.setFont(new Font("Monospace", Font.BOLD, 12));
		newVisitButton.setFocusable(false);
		newVisitButton.setBorder(BorderFactory.createEtchedBorder());
		
		//View/Edit Patient button
		viewEditVisitButton = new JButton();
		viewEditVisitButton.setBounds(230, 100, 135, 60);
		viewEditVisitButton.addActionListener(this);
		viewEditVisitButton.setText("View/Edit Visits");
		viewEditVisitButton.setFont(new Font("Monospace", Font.BOLD, 12));
		viewEditVisitButton.setFocusable(false);
		viewEditVisitButton.setBorder(BorderFactory.createEtchedBorder());
		
		//Back Button
		backButton = new JButton();
		backButton.setBounds(363, 225, 75, 40);
		backButton.addActionListener(this);
		backButton.setText("Go Back");
		backButton.setFont(new Font("Monospace", Font.BOLD, 12));
		backButton.setFocusable(false);
		backButton.setBorder(BorderFactory.createEtchedBorder());
		backButton.setForeground(new Color(0, 0, 0));
		backButton.setBackground(new Color(225, 50, 50));
		

		// Create the new frame
		frame.setTitle("Visits");       //Set title of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // exit out of application
		frame.setResizable(false); 				// prevent frame from being resized
		frame.setLayout(null);
		frame.setSize(450, 300);					// sets dimensions of window(x,y)
		frame.setVisible(true);  				// make frame visible
		
		//Add components to frame
		frame.add(newVisitButton);
		frame.add(viewEditVisitButton);
		frame.add(backButton);
		frame.add(panel);
		
		//Add image icon for frame
		ImageIcon image = new ImageIcon("HearingClinicIcon.jpg");  //Create an Icon for window
		frame.setIconImage(image.getImage());                      //Change icon of window
		frame.getContentPane().setBackground(new Color(0x606266));   //Change color of background
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == newVisitButton) {
			JOptionPane.showMessageDialog(null, "Still Under Construction", "ERROR", JOptionPane.ERROR_MESSAGE);
			//frame.dispose();
			//NewVisits newVisitsPage = new NewVisits();
		}
		if (e.getSource() == viewEditVisitButton) {
			JOptionPane.showMessageDialog(null, "Still Under Construction", "ERROR", JOptionPane.ERROR_MESSAGE);
			//frame.dispose();
			//ViewEditVisit viewEditVisitPage = new ViewEditVisit();
		}
		if (e.getSource() == backButton) {
			frame.dispose();
			MyFrame myFrame = new MyFrame();
		}

	}
}

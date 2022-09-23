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

public class Patients implements ActionListener{
	
	JFrame frame = new JFrame();
	JButton newPatientButton;
	JButton viewEditPatientButton;
	JButton backButton;
	
	
	public Patients() {
		//Window
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0x23272A));
		panel.setBounds(25, 25, 380, 200);
		
		//New patient button
		newPatientButton = new JButton();
		newPatientButton.setBounds(60, 100, 135, 60);
		newPatientButton.addActionListener(this);
		newPatientButton.setText("Add New Patient");
		newPatientButton.setFont(new Font("Monospace", Font.BOLD, 12));
		newPatientButton.setFocusable(false);
		newPatientButton.setBorder(BorderFactory.createEtchedBorder());
		
		//View/Edit Patient button
		viewEditPatientButton = new JButton();
		viewEditPatientButton.setBounds(230, 100, 135, 60);
		viewEditPatientButton.addActionListener(this);
		viewEditPatientButton.setText("View/Edit Patients");
		viewEditPatientButton.setFont(new Font("Monospace", Font.BOLD, 12));
		viewEditPatientButton.setFocusable(false);
		viewEditPatientButton.setBorder(BorderFactory.createEtchedBorder());
		
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
		frame.setTitle("Patients");       //Set title of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // exit out of application
		frame.setResizable(false); 				// prevent frame from being resized
		frame.setLayout(null);
		frame.setSize(450, 300);					// sets dimensions of window(x,y)
		frame.setVisible(true);  				// make frame visible
		
		//Add components to frame
		frame.add(newPatientButton);
		frame.add(viewEditPatientButton);
		frame.add(backButton);
		frame.add(panel);
		
		//Add image icon for frame
		ImageIcon image = new ImageIcon("HearingClinicIcon.jpg");  //Create an Icon for window
		frame.setIconImage(image.getImage());                      //Change icon of window
		frame.getContentPane().setBackground(new Color(0x606266));   //Change color of background
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == newPatientButton) {
			frame.dispose();
			NewPatients newPatientsPage = new NewPatients();
		}
		if (e.getSource() == viewEditPatientButton) {
			//JOptionPane.showMessageDialog(null, "Still Under Construction", "ERROR", JOptionPane.ERROR_MESSAGE);
			frame.dispose();
			ViewEditPatient viewEditPatientPage = new ViewEditPatient();
		}
		if (e.getSource() == backButton) {
			frame.dispose();
			MyFrame myFrame = new MyFrame();
		}
		
		
	}

}

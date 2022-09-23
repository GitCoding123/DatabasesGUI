import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

//import Hearing_Clinic.EditPatient;

public class ViewEditPatient implements ActionListener {

	JFrame frame = new JFrame();
	JButton viewPatientButton;
	JButton editPatientButton;
	JButton backButton;
	
	//JDBC jdbc = new JDBC();
	
	public ViewEditPatient() {
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0x23272A));
		panel.setBounds(25, 25, 500, 500);
		
		//New patient button
				viewPatientButton = new JButton();
				viewPatientButton.setBounds(60, 100, 135, 60);
				viewPatientButton.addActionListener(this);
				viewPatientButton.setText("View Patient");
				viewPatientButton.setFont(new Font("Monospace", Font.BOLD, 12));
				viewPatientButton.setFocusable(false);
				viewPatientButton.setBorder(BorderFactory.createEtchedBorder());
				
				//View/Edit Patient button
				editPatientButton = new JButton();
				editPatientButton.setBounds(230, 100, 135, 60);
				editPatientButton.addActionListener(this);
				editPatientButton.setText("Edit Patient");
				editPatientButton.setFont(new Font("Monospace", Font.BOLD, 12));
				editPatientButton.setFocusable(false);
				editPatientButton.setBorder(BorderFactory.createEtchedBorder());
				
				//Back Button
				backButton = new JButton();
				backButton.setBounds(510, 625, 75, 40);
				backButton.addActionListener(this);
				backButton.setText("Go Back");
				backButton.setFont(new Font("Monospace", Font.BOLD, 12));
				backButton.setFocusable(false);
				backButton.setBorder(BorderFactory.createEtchedBorder());
				backButton.setForeground(new Color(0, 0, 0));
				backButton.setBackground(new Color(225, 50, 50));
		
				
				frame.setSize(600, 700);					// sets dimensions of window(x,y)
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // exit out of application
				frame.setResizable(false); 				// prevent frame from being resized
				frame.setLayout(null);
				frame.setVisible(true);						// make frame visible
				
				frame.add(viewPatientButton);
				frame.add(editPatientButton);
				frame.add(backButton);
				frame.add(panel);
				
				ImageIcon image = new ImageIcon("HearingClinicIcon.jpg");  //Create an Icon for window
				frame.setIconImage(image.getImage());                      //Change icon of window
				frame.getContentPane().setBackground(new Color(0x606266));   //Change color of background
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == viewPatientButton) {
			Connection conn = null;
			try {
				DriverManager.registerDriver(new Hearing_Clinic.Driver());
			} catch (SQLException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
			}
			
			 try {
				 	
			    	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hearing_Clinic", "root", "Bmgerkens102094!");
			    	System.out.println("Connected to database successfully.");
			    		Statement stmt = conn.createStatement();
			    	//	String input = "INSERT INTO Patient (First_Name, Last_Name, Street_Address, DOB, Gender) VALUES ('"
						//		 + getfName() + "', '" + getlName() + "', '" + getStreet() + "', '" + getDob() + "', " + getGen() + ");";
			    		//stmt.executeUpdate(input);
			    		ResultSet rset = stmt.executeQuery("SELECT * FROM patient");
			    		while (rset.next ()){
			    			System.out.println(rset.getString("First_Name") + " " + rset.getString("Last_Name"));
			    			System.out.println("");
			    		}
//			    		JOptionPane.showMessageDialog(null, "Patient created. Save successful!", "Save", JOptionPane.INFORMATION_MESSAGE);
					
//			    		conn.close();
//			    		NewPatients.npFrame.dispose();
//						frame.dispose();
//						Patients patientsPage = new Patients();
			    	//}
			    	}
			 catch(SQLException e1) {
			    	System.out.println("Oops, ERROR!!!");
			    	e1.printStackTrace();
			    }
			 }
		if(e.getSource() == editPatientButton) {
			frame.dispose();
			EditPatient editPatientPage = new EditPatient();
		}
		if(e.getSource() == backButton) {
			frame.dispose();
			Patients patientsPage = new Patients();
		}		
	}

}

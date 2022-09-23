import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NewPatients implements ActionListener{
	
	static JFrame npFrame = new JFrame();
	JButton nextButton;
	JButton backButton;
	static JTextField fnTextField;
	static JTextField lnTextField;
	static JTextField dobTextField;
	static JTextField phoneTextField;
	static JTextField emailTextField;
	static JTextField streetTextField;
	static JTextField cityTextField;
	static JTextField zipTextField;
	
	static JComboBox genBox;
	static JComboBox stateBox;
	
	
	public NewPatients() {
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0x23272A));
		panel.setBounds(25, 25, 385, 500);
		
		
		//Next button
		nextButton = new JButton();
		nextButton.setBounds(363, 525, 75, 40);
		nextButton.addActionListener(this);
		nextButton.setText("Next");
		nextButton.setFont(new Font("Monospace", Font.BOLD, 12));
		nextButton.setFocusable(false);
		nextButton.setBorder(BorderFactory.createEtchedBorder());
//		nextButton.setForeground(new Color(0, 0, 0));
//		nextButton.setBackground(new Color(50, 50, 225));
		
		//Back Button
		backButton = new JButton();
		backButton.setBounds(292, 525, 75, 40);
		backButton.addActionListener(this);
		backButton.setText("Go Back");
		backButton.setFont(new Font("Monospace", Font.BOLD, 12));
		backButton.setFocusable(false);
		backButton.setBorder(BorderFactory.createEtchedBorder());
		backButton.setForeground(new Color(0, 0, 0));
		backButton.setBackground(new Color(225, 50, 50));
		
		
		
		npFrame.setTitle("Add New Patient-Information");       //Set title of this
		npFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // exit out of application
		npFrame.setResizable(false); 				// prevent npFrame from being resized
		npFrame.setLayout(null);
		
		//Label for first name text box
		JLabel fnLabel = new JLabel();
		fnLabel.setText("*First Name:");
		fnLabel.setBounds(50, 50, 130, 20);
		fnLabel.setForeground(new Color(200, 200, 200));
		fnLabel.setFont(new Font("Monospace", Font.BOLD, 12));
		fnLabel.setHorizontalAlignment(JLabel.CENTER);
		
		//first name Text box
		fnTextField = new JTextField();
		fnTextField.setPreferredSize(new Dimension(150, 35));
		fnTextField.setBounds(180, 50, 150, 20);
		fnTextField.setFont(new Font("Monospace", Font.BOLD, 12));
		fnTextField.setForeground(new Color(0, 0, 0));
		fnTextField.setBackground(new Color(200, 200, 200));
		//fnTextField.setText("First Name");
		
		//Label for last name text box
		JLabel lnLabel = new JLabel();
		lnLabel.setText("*Last Name:");
		lnLabel.setBounds(50, 80, 130, 20);
		lnLabel.setForeground(new Color(200, 200, 200));
		lnLabel.setFont(new Font("Monospace", Font.BOLD, 12));
		lnLabel.setHorizontalAlignment(JLabel.CENTER);
		
		//Last name text box
		lnTextField = new JTextField();
		lnTextField.setPreferredSize(new Dimension(150, 35));
		lnTextField.setBounds(180, 80, 150, 20);
		lnTextField.setFont(new Font("Monospace", Font.BOLD, 12));
		lnTextField.setForeground(new Color(0, 0, 0));
		lnTextField.setBackground(new Color(200, 200, 200));
		/*
		lnTextField.setText("Last Name");
		*/
		
		//Date of Birth label for text box
		JLabel dobLabel = new JLabel();
		dobLabel.setText("*D.O.B. (yyyy-mm-dd):");
		dobLabel.setBounds(40, 110, 130, 20);
		dobLabel.setForeground(new Color(200, 200, 200));
		dobLabel.setFont(new Font("Monospace", Font.BOLD, 12));
		dobLabel.setHorizontalAlignment(JLabel.CENTER);
		
		//Text field for Date of Birth
		dobTextField = new JTextField();
		dobTextField.setPreferredSize(new Dimension(150, 35));
		dobTextField.setBounds(180, 110, 150, 20);
		dobTextField.setFont(new Font("Monospace", Font.BOLD, 12));
		dobTextField.setForeground(new Color(0, 0, 0));
		dobTextField.setBackground(new Color(200, 200, 200));
		dobTextField.setText("0000-00-00");
		
		//Label for gender textbox
		JLabel genLabel = new JLabel();
		genLabel.setText("*Gender:");
		genLabel.setBounds(50, 140, 130, 20);
		genLabel.setForeground(new Color(200, 200, 200));
		genLabel.setFont(new Font("Monospace", Font.BOLD, 12));
		genLabel.setHorizontalAlignment(JLabel.CENTER);
		
		//Dropdown menu (combo box) for gender(M/F)
		String[] genders = {"M", "F"};
		genBox = new JComboBox(genders);
		genBox.setBounds(180, 140, 45, 20);
		
		//Phone number label for text box
		JLabel phoneLabel = new JLabel();
		phoneLabel.setText("Phone Number:");
		phoneLabel.setBounds(50, 180, 130, 20);
		phoneLabel.setForeground(new Color(200, 200, 200));
		phoneLabel.setFont(new Font("Monospace", Font.BOLD, 12));
		phoneLabel.setHorizontalAlignment(JLabel.CENTER);
				
		//Text field for Phone number
		phoneTextField = new JTextField();
		phoneTextField.setPreferredSize(new Dimension(150, 35));
		phoneTextField.setBounds(180, 180, 150, 20);
		phoneTextField.setFont(new Font("Monospace", Font.BOLD, 12));
		phoneTextField.setForeground(new Color(0, 0, 0));
		phoneTextField.setBackground(new Color(200, 200, 200));
		//phoneTextField.setText("000-000-0000");
		
		//Email label for text box
		JLabel emailLabel = new JLabel();
		emailLabel.setText("E-mail:");
		emailLabel.setBounds(50, 210, 130, 20);
		emailLabel.setForeground(new Color(200, 200, 200));
		emailLabel.setFont(new Font("Monospace", Font.BOLD, 12));
		emailLabel.setHorizontalAlignment(JLabel.CENTER);
						
		//Text field for email
		emailTextField = new JTextField();
		emailTextField.setPreferredSize(new Dimension(150, 35));
		emailTextField.setBounds(180, 210, 150, 20);
		emailTextField.setFont(new Font("Monospace", Font.BOLD, 12));
		emailTextField.setForeground(new Color(0, 0, 0));
		emailTextField.setBackground(new Color(200, 200, 200));
				
		
		//street label for text box
		JLabel streetLabel = new JLabel();
		streetLabel.setText("*Street Address: ");
		streetLabel.setBounds(50, 240, 130, 20);
		streetLabel.setForeground(new Color(200, 200, 200));
		streetLabel.setFont(new Font("Monospace", Font.BOLD, 12));
		streetLabel.setHorizontalAlignment(JLabel.CENTER);
								
		//Text field for street
		streetTextField = new JTextField();
		streetTextField.setPreferredSize(new Dimension(150, 35));
		streetTextField.setBounds(180, 240, 220, 20);
		streetTextField.setFont(new Font("Monospace", Font.BOLD, 12));
		streetTextField.setForeground(new Color(0, 0, 0));
		streetTextField.setBackground(new Color(200, 200, 200));
		
		//Label for gender textbox
		JLabel stateLabel = new JLabel();
		stateLabel.setText("State: ");
		stateLabel.setBounds(50, 270, 130, 20);
		stateLabel.setForeground(new Color(200, 200, 200));
		stateLabel.setFont(new Font("Monospace", Font.BOLD, 12));
		stateLabel.setHorizontalAlignment(JLabel.CENTER);
				
		//Dropdown menu (combo box) for gender(M/F)
		String[] states = {"", "AL", "AK", "AZ", "AK", "CA", "CO", "CT", "DE", "FL", "GA", "HI",
                			"ID", "IL", "IN", "IA", "KS", "KY", "LA",  "MA", "MD", "ME", "MI", "MN", "MO", "MS",
                			"MT", "NC","ND", "NE", "NH",  "NJ", "NM", "NV", "NY", "OH", "OK", "OR", "PA", "RI", 
                			"SC", "SD", "TN", "TX", "UT", "VA", "VI", "VT", "WA", "WI", "WV", "WY"};
		stateBox = new JComboBox(states);
		stateBox.setBounds(180, 270, 55, 20);
		
		//Label for city text box
		JLabel cityLabel = new JLabel();
		cityLabel.setText("City:");
		cityLabel.setBounds(50, 300, 130, 20);
		cityLabel.setForeground(new Color(200, 200, 200));
		cityLabel.setFont(new Font("Monospace", Font.BOLD, 12));
		cityLabel.setHorizontalAlignment(JLabel.CENTER);
						
		//city text box
		cityTextField = new JTextField();
		cityTextField.setPreferredSize(new Dimension(150, 35));
		cityTextField.setBounds(180, 300, 100, 20);
		cityTextField.setFont(new Font("Monospace", Font.BOLD, 12));
		cityTextField.setForeground(new Color(0, 0, 0));
		cityTextField.setBackground(new Color(200, 200, 200));
		
		//Label for zip text box
		JLabel zipLabel = new JLabel();
		zipLabel.setText("Zip:");
		zipLabel.setBounds(50, 330, 130, 20);
		zipLabel.setForeground(new Color(200, 200, 200));
		zipLabel.setFont(new Font("Monospace", Font.BOLD, 12));
		zipLabel.setHorizontalAlignment(JLabel.CENTER);
				
		//Zip text box
		zipTextField = new JTextField();
		zipTextField.setPreferredSize(new Dimension(150, 35));
		zipTextField.setBounds(180, 330, 100, 20);
		zipTextField.setFont(new Font("Monospace", Font.BOLD, 12));
		zipTextField.setForeground(new Color(0, 0, 0));
		zipTextField.setBackground(new Color(200, 200, 200));
		
		
		
		npFrame.setSize(450, 600);					// sets dimensions of window(x,y)
		npFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // exit out of application
		npFrame.setVisible(true);  				// make npFrame visible
		npFrame.setResizable(false); 				// prevent frame from being resized
		
		npFrame.add(fnLabel);
		npFrame.add(fnTextField);
		npFrame.add(lnLabel);
		npFrame.add(lnTextField);
		npFrame.add(dobLabel);
		npFrame.add(dobTextField);
		npFrame.add(genLabel);
		npFrame.add(genBox);
		npFrame.add(phoneLabel);
		npFrame.add(phoneTextField);
		npFrame.add(emailLabel);
		npFrame.add(emailTextField);
		npFrame.add(streetLabel);
		npFrame.add(streetTextField);
		npFrame.add(stateLabel);
		npFrame.add(stateBox);
		npFrame.add(cityLabel);
		npFrame.add(cityTextField);
		npFrame.add(zipLabel);
		npFrame.add(zipTextField);
		
		npFrame.add(nextButton);
		npFrame.add(backButton);
		npFrame.add(panel);
		
		ImageIcon image = new ImageIcon("HearingClinicIcon.jpg");  //Create an Icon for window
		npFrame.setIconImage(image.getImage());                      //Change icon of window
		npFrame.getContentPane().setBackground(new Color(0x606266));   //Change color of background
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == nextButton) {
			//npFrame.dispose();
			Questionnaire questionnairePage = new Questionnaire();
			//Patients patientsPage = new Patients();
		}
		if(e.getSource() == backButton) {
			npFrame.dispose();
			Patients patientsPage = new Patients(); 
		}
		
	}

}

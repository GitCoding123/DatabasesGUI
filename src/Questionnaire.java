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
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Questionnaire implements ActionListener {
	
	JFrame frame = new JFrame();
	JButton saveButton;
	JButton backButton;
	//Globally define all combo boxes
	JComboBox q1Box;
	JComboBox q2Box;
	JComboBox q3Box;
	JComboBox q4Box;
	JComboBox q5Box;
	JComboBox q6Box;
	JComboBox q7Box;
	JComboBox q8Box;
	JComboBox q9Box;
	JComboBox q10Box;
	JComboBox q11Box;
	JComboBox q12Box;
	JComboBox q13Box;
	JComboBox q14Box;
	JComboBox q15Box;
	JComboBox q16Box;
	JComboBox q17Box;
	JComboBox q18Box;
	JComboBox q19Box;
	JComboBox q20Box;
	JComboBox q21Box;
	JComboBox q22Box;
	JComboBox q23Box;
	JComboBox q24Box;
	JComboBox q25Box;
	//Globally define all answer variables
	int q1A;
	int q2A;
	int q3A;
	int q4A;
	int q5A;
	int q6A;
	int q7A;
	int q8A;
	int q9A;
	int q10A;
	int q11A;
	int q12A;
	int q13A;
	int q14A;
	int q15A;
	int q16A;
	int q17A;
	int q18A;
	int q19A;
	int q20A;
	int q21A;
	int q22A;
	int q23A;
	int q24A;
	int q25A;
	//Globally define our 3 arrays for each type of question
	//int[] funcArray = {q1A, q2A, q4A, q7A, q9A, q12A, q13A, q15A, q18A, q20A, q24A};
	//int[] emoArray = {q3A, q6A, q10A, q14A, q16A, q17A, q21A, q22A, q25A};
	//int[] catArray = {q5A, q8A, q11A, q19A, q23A};
	
	//JDBC jdbc = new JDBC();
	
	//NewPatients np = new NewPatients();
	
	public Questionnaire() {
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0x23272A));
		panel.setBounds(25, 25, 540, 600);
		
		
		//save button
		saveButton = new JButton();
		saveButton.setBounds(512, 625, 75, 40);
		saveButton.addActionListener(this);
		saveButton.setText("Save");
		saveButton.setFont(new Font("Monospace", Font.BOLD, 12));
		saveButton.setFocusable(false);
		saveButton.setBorder(BorderFactory.createEtchedBorder());
		saveButton.setForeground(new Color(0, 0, 0));
		saveButton.setBackground(new Color(50, 225, 50));
				
		//Back Button
		backButton = new JButton();
		backButton.setBounds(437, 625, 75, 40);
		backButton.addActionListener(this);
		backButton.setText("Go Back");
		backButton.setFont(new Font("Monospace", Font.BOLD, 12));
		backButton.setFocusable(false);
		backButton.setBorder(BorderFactory.createEtchedBorder());
		backButton.setForeground(new Color(0, 0, 0));
		backButton.setBackground(new Color(225, 50, 50));
		
		
		frame.setTitle("Add New Patient-THI Questionnaire");       //Set title of this
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // exit out of application
		frame.setResizable(false); 				// prevent frame from being resized
		frame.setLayout(null);
		
		
		//Label for Title
		JLabel titleLabel = new JLabel();
		titleLabel.setText("Please answer the following questions about Tinnitus:");
		titleLabel.setBounds(20, 20, 550, 50);
		titleLabel.setForeground(new Color(200, 200, 200));
		titleLabel.setFont(new Font("Monospace", Font.BOLD, 18));
		titleLabel.setHorizontalAlignment(JLabel.CENTER);
		
		//Label for q1
		JLabel q1Label = new JLabel();
		q1Label.setText("1.) Do you find it difficult to concentrate?");
		q1Label.setBounds(15, 65, 300, 20);
		q1Label.setForeground(new Color(200, 200, 200));
		q1Label.setFont(new Font("Monospace", Font.BOLD, 12));
		q1Label.setHorizontalAlignment(JLabel.CENTER);
		
		//Dropdown menu (combo box) for q1
		String[] q1 = {null, "Yes", "Sometimes", "No"};
		q1Box = new JComboBox(q1);
		q1Box.setBounds(430, 70, 80, 15);
		q1Box.setFont(new Font("Monospace", Font.BOLD, 10));
		q1Box.addActionListener(this);
		
		//Label for q2
		JLabel q2Label = new JLabel();
		q2Label.setText("2.) Do you find it difficult to hear people?");
		q2Label.setBounds(15, 85, 300, 20);
		q2Label.setForeground(new Color(200, 200, 200));
		q2Label.setFont(new Font("Monospace", Font.BOLD, 12));
		q2Label.setHorizontalAlignment(JLabel.CENTER);
				
		//Dropdown menu (combo box) for q2
		String[] q2 = {null, "Yes", "Sometimes", "No"};
		q2Box = new JComboBox(q2);
		q2Box.setBounds(430, 90, 80, 15);
		q2Box.setFont(new Font("Monospace", Font.BOLD, 10));
		q2Box.addActionListener(this);
		
		
		//Label for q3
		JLabel q3Label = new JLabel();
		q3Label.setText("3.) Does Tinnitus make you angry?");
		q3Label.setBounds(15, 105, 265, 20);
		q3Label.setForeground(new Color(200, 200, 200));
		q3Label.setFont(new Font("Monospace", Font.BOLD, 12));
		q3Label.setHorizontalAlignment(JLabel.CENTER);
						
		//Dropdown menu (combo box) for q3
		String[] q3 = {null, "Yes", "Sometimes", "No"};
		q3Box = new JComboBox(q3);
		q3Box.setBounds(430, 110, 80, 15);
		q3Box.setFont(new Font("Monospace", Font.BOLD, 10));
		q3Box.addActionListener(this);
		
		//Label for q4
		JLabel q4Label = new JLabel();
		q4Label.setText("4.) Does Tinnitus make you confused?");
		q4Label.setBounds(31, 125, 250, 20);
		q4Label.setForeground(new Color(200, 200, 200));
		q4Label.setFont(new Font("Monospace", Font.BOLD, 12));
		q4Label.setHorizontalAlignment(JLabel.CENTER);
							
		//Dropdown menu (combo box) for q4
		String[] q4 = {null, "Yes", "Sometimes", "No"};
		q4Box = new JComboBox(q4);
		q4Box.setBounds(430, 130, 80, 15);
		q4Box.setFont(new Font("Monospace", Font.BOLD, 10));
		q4Box.addActionListener(this);
		
		//Label for q5
		JLabel q5Label = new JLabel();
		q5Label.setText("5.) Does Tinnitus make you feel desperate?");
		q5Label.setBounds(43, 145, 250, 20);
		q5Label.setForeground(new Color(200, 200, 200));
		q5Label.setFont(new Font("Monospace", Font.BOLD, 12));
		q5Label.setHorizontalAlignment(JLabel.CENTER);
									
		//Dropdown menu (combo box) for q5
		String[] q5 = {null, "Yes", "Sometimes", "No"};
		q5Box = new JComboBox(q5);
		q5Box.setBounds(430, 150, 80, 15);
		q5Box.setFont(new Font("Monospace", Font.BOLD, 10));
		q5Box.addActionListener(this);
		
		//Label for q6
		JLabel q6Label = new JLabel();
		q6Label.setText("6.) Do you complain a great deal about your Tinnitus?");
		q6Label.setBounds(30, 165, 340, 20);
		q6Label.setForeground(new Color(200, 200, 200));
		q6Label.setFont(new Font("Monospace", Font.BOLD, 12));
		q6Label.setHorizontalAlignment(JLabel.CENTER);
									
		//Dropdown menu (combo box) for q6
		String[] q6 = {null, "Yes", "Sometimes", "No"};
		q6Box = new JComboBox(q6);
		q6Box.setBounds(430, 170, 80, 15);
		q6Box.setFont(new Font("Monospace", Font.BOLD, 10));
		q6Box.addActionListener(this);
		
		//Label for q7
		JLabel q7Label = new JLabel();
		q7Label.setText("7.) Do you have trouble falling asleep at night?");
		q7Label.setBounds(30, 185, 300, 20);
		q7Label.setForeground(new Color(200, 200, 200));
		q7Label.setFont(new Font("Monospace", Font.BOLD, 12));
		q7Label.setHorizontalAlignment(JLabel.CENTER);
											
		//Dropdown menu (combo box) for q7
		String[] q7 = {null, "Yes", "Sometimes", "No"};
		q7Box = new JComboBox(q7);
		q7Box.setBounds(430, 190, 80, 15);
		q7Box.setFont(new Font("Monospace", Font.BOLD, 10));
		q7Box.addActionListener(this);
		
		//Label for q8
		JLabel q8Label = new JLabel();
		q8Label.setText("8.) Do you feel like you cannot escape your Tinnitus?");
		q8Label.setBounds(30, 205, 340, 20);
		q8Label.setForeground(new Color(200, 200, 200));
		q8Label.setFont(new Font("Monospace", Font.BOLD, 12));
		q8Label.setHorizontalAlignment(JLabel.CENTER);
													
		//Dropdown menu (combo box) for q8
		String[] q8 = {null, "Yes", "Sometimes", "No"};
		q8Box = new JComboBox(q8);
		q8Box.setBounds(430, 210, 80, 15);
		q8Box.setFont(new Font("Monospace", Font.BOLD, 10));
		q8Box.addActionListener(this);
		
		
		//Label for q9
		JLabel q9Label = new JLabel();
		q9Label.setText("9.) Does it interfere with your ability to enjoy social activities?");
		q9Label.setBounds(22, 225, 400, 20);
		q9Label.setForeground(new Color(200, 200, 200));
		q9Label.setFont(new Font("Monospace", Font.BOLD, 12));
		q9Label.setHorizontalAlignment(JLabel.CENTER);
															
		//Dropdown menu (combo box) for q9
		String[] q9 = {null, "Yes", "Sometimes", "No"};
		q9Box = new JComboBox(q9);
		q9Box.setBounds(430, 230, 80, 15);
		q9Box.setFont(new Font("Monospace", Font.BOLD, 10));
		q9Box.addActionListener(this);
		
		//Label for q10
		JLabel q10Label = new JLabel();
		q10Label.setText("10.) Does Tinnitus make you feel frustrated?");
		q10Label.setBounds(20, 245, 300, 20);
		q10Label.setForeground(new Color(200, 200, 200));
		q10Label.setFont(new Font("Monospace", Font.BOLD, 12));
		q10Label.setHorizontalAlignment(JLabel.CENTER);
									
		//Dropdown menu (combo box) for q10
		String[] q10 = {null, "Yes", "Sometimes", "No"};
		q10Box = new JComboBox(q10);
		q10Box.setBounds(430, 250, 80, 15);
		q10Box.setFont(new Font("Monospace", Font.BOLD, 10));
		q10Box.addActionListener(this);
		
		//Label for q11
		JLabel q11Label = new JLabel();
		q11Label.setText("11.) Does it make you feel like you have a terrible disease?");
		q11Label.setBounds(11, 265, 400, 20);
		q11Label.setForeground(new Color(200, 200, 200));
		q11Label.setFont(new Font("Monospace", Font.BOLD, 12));
		q11Label.setHorizontalAlignment(JLabel.CENTER);
																	
		//Dropdown menu (combo box) for q11
		String[] q11 = {null, "Yes", "Sometimes", "No"};
		q11Box = new JComboBox(q11);
		q11Box.setBounds(430, 270, 80, 15);
		q11Box.setFont(new Font("Monospace", Font.BOLD, 10));
		q11Box.addActionListener(this);
		
		//Label for q12
		JLabel q12Label = new JLabel();
		q12Label.setText("12.) Does it make difficult for you to enjoy life?");
		q12Label.setBounds(27, 285, 300, 20);
		q12Label.setForeground(new Color(200, 200, 200));
		q12Label.setFont(new Font("Monospace", Font.BOLD, 12));
		q12Label.setHorizontalAlignment(JLabel.CENTER);
																			
		//Dropdown menu (combo box) for q12
		String[] q12 = {null, "Yes", "Sometimes", "No"};
		q12Box = new JComboBox(q12);
		q12Box.setBounds(430, 290, 80, 15);
		q12Box.setFont(new Font("Monospace", Font.BOLD, 10));
		q12Box.addActionListener(this);
		
		
		//Label for q13
		JLabel q13Label = new JLabel();
		q13Label.setText("13.) Does it interfere with your job or household responsibilities?");
		q13Label.setBounds(30, 305, 400, 20);
		q13Label.setForeground(new Color(200, 200, 200));
		q13Label.setFont(new Font("Monospace", Font.BOLD, 12));
		q13Label.setHorizontalAlignment(JLabel.CENTER);
		
																					
		//Dropdown menu (combo box) for q13
		String[] q13 = {null, "Yes", "Sometimes", "No"};
		q13Box = new JComboBox(q13);
		q13Box.setBounds(430, 310, 80, 15);
		q13Box.setFont(new Font("Monospace", Font.BOLD, 10));
		q13Box.addActionListener(this);
		
		//Label for q14
		JLabel q14Label = new JLabel();
		q14Label.setText("14.) Does Tinnitus make you often irritable?");
		q14Label.setBounds(18, 325, 300, 20);
		q14Label.setForeground(new Color(200, 200, 200));
		q14Label.setFont(new Font("Monospace", Font.BOLD, 12));
		q14Label.setHorizontalAlignment(JLabel.CENTER);
																								
		//Dropdown menu (combo box) for q14
		String[] q14 = {null, "Yes", "Sometimes", "No"};
		q14Box = new JComboBox(q14);
		q14Box.setBounds(430, 330, 80, 15);
		q14Box.setFont(new Font("Monospace", Font.BOLD, 10));
		q14Box.addActionListener(this);
		
		//Label for q15
		JLabel q15Label = new JLabel();
		q15Label.setText("15.) Does Tinnitus make difficult for you to read?");
		q15Label.setBounds(32, 345, 300, 20);
		q15Label.setForeground(new Color(200, 200, 200));
		q15Label.setFont(new Font("Monospace", Font.BOLD, 12));
		q15Label.setHorizontalAlignment(JLabel.CENTER);
																					
		//Dropdown menu (combo box) for q15
		String[] q15 = {null, "Yes", "Sometimes", "No"};
		q15Box = new JComboBox(q15);
		q15Box.setBounds(430, 350, 80, 15);
		q15Box.setFont(new Font("Monospace", Font.BOLD, 10));
		q15Box.addActionListener(this);
		
		//Label for q16
		JLabel q16Label = new JLabel();
		q16Label.setText("16.) Does Tinnitus make you upset?");
		q16Label.setBounds(15, 365, 265, 20);
		q16Label.setForeground(new Color(200, 200, 200));
		q16Label.setFont(new Font("Monospace", Font.BOLD, 12));
		q16Label.setHorizontalAlignment(JLabel.CENTER);
								
		//Dropdown menu (combo box) for q16
		String[] q16 = {null, "Yes", "Sometimes", "No"};
		q16Box = new JComboBox(q16);
		q16Box.setBounds(430, 370, 80, 15);
		q16Box.setFont(new Font("Monospace", Font.BOLD, 10));
		q16Box.addActionListener(this);
		
		//Label for q17
		JLabel q17Label = new JLabel();
		q17Label.setText("17.) Does Tinnitus cause stress on your relationships?");
		q17Label.setBounds(25, 385, 350, 20);
		q17Label.setForeground(new Color(200, 200, 200));
		q17Label.setFont(new Font("Monospace", Font.BOLD, 12));
		q17Label.setHorizontalAlignment(JLabel.CENTER);
															
		//Dropdown menu (combo box) for q17
		String[] q17 = {null, "Yes", "Sometimes", "No"};
		q17Box = new JComboBox(q17);
		q17Box.setBounds(430, 390, 80, 15);
		q17Box.setFont(new Font("Monospace", Font.BOLD, 10));
		q17Box.addActionListener(this);
		
		//Label for q18
		JLabel q18Label = new JLabel();
		q18Label.setText("18.) Does Tinnitus make it difficult to focus your attention?");
		q18Label.setBounds(37, 405, 350, 20);
		q18Label.setForeground(new Color(200, 200, 200));
		q18Label.setFont(new Font("Monospace", Font.BOLD, 12));
		q18Label.setHorizontalAlignment(JLabel.CENTER);
																	
		//Dropdown menu (combo box) for q18
		String[] q18 = {null, "Yes", "Sometimes", "No"};
		q18Box = new JComboBox(q18);
		q18Box.setBounds(430, 410, 80, 15);
		q18Box.setFont(new Font("Monospace", Font.BOLD, 10));
		q18Box.addActionListener(this);
		
		//Label for q19
		JLabel q19Label = new JLabel();
		q19Label.setText("19.) Do you feel that you have no control over your Tinnitus?");
		q19Label.setBounds(42, 425, 350, 20);
		q19Label.setForeground(new Color(200, 200, 200));
		q19Label.setFont(new Font("Monospace", Font.BOLD, 12));
		q19Label.setHorizontalAlignment(JLabel.CENTER);
																			
		//Dropdown menu (combo box) for q19
		String[] q19 = {null, "Yes", "Sometimes", "No"};
		q19Box = new JComboBox(q19);
		q19Box.setBounds(430, 430, 80, 15);
		q19Box.setFont(new Font("Monospace", Font.BOLD, 10));
		q19Box.addActionListener(this);
		
		//Label for q20
		JLabel q20Label = new JLabel();
		q20Label.setText("20.) Does Tinnitus make you often feel tired?");
		q20Label.setBounds(20, 445, 300, 20);
		q20Label.setForeground(new Color(200, 200, 200));
		q20Label.setFont(new Font("Monospace", Font.BOLD, 12));
		q20Label.setHorizontalAlignment(JLabel.CENTER);
											
		//Dropdown menu (combo box) for q20
		String[] q20 = {null, "Yes", "Sometimes", "No"};
		q20Box = new JComboBox(q20);
		q20Box.setBounds(430, 450, 80, 15);
		q20Box.setFont(new Font("Monospace", Font.BOLD, 10));
		q20Box.addActionListener(this);
		
		//Label for q21
		JLabel q21Label = new JLabel();
		q21Label.setText("21.) Does Tinnitus make you feel depressed?");
		q21Label.setBounds(20, 465, 300, 20);
		q21Label.setForeground(new Color(200, 200, 200));
		q21Label.setFont(new Font("Monospace", Font.BOLD, 12));
		q21Label.setHorizontalAlignment(JLabel.CENTER);
													
		//Dropdown menu (combo box) for q21
		String[] q21 = {null, "Yes", "Sometimes", "No"};
		q21Box = new JComboBox(q21);
		q21Box.setBounds(430, 470, 80, 15);
		q21Box.setFont(new Font("Monospace", Font.BOLD, 10));
		q21Box.addActionListener(this);
		
		//Label for q22
		JLabel q22Label = new JLabel();
		q22Label.setText("22.) Does Tinnitus make you feel anxious?");
		q22Label.setBounds(13, 485, 300, 20);
		q22Label.setForeground(new Color(200, 200, 200));
		q22Label.setFont(new Font("Monospace", Font.BOLD, 12));
		q22Label.setHorizontalAlignment(JLabel.CENTER);
															
		//Dropdown menu (combo box) for q22
		String[] q22 = {null, "Yes", "Sometimes", "No"};
		q22Box = new JComboBox(q22);
		q22Box.setBounds(430, 490, 80, 15);
		q22Box.setFont(new Font("Monospace", Font.BOLD, 10));
		q22Box.addActionListener(this);
		
		//Label for q23
		JLabel q23Label = new JLabel();
		q23Label.setText("23.) Do you feel that you can no longer cope with your Tinnitus?");
		q23Label.setBounds(26, 505, 400, 20);
		q23Label.setForeground(new Color(200, 200, 200));
		q23Label.setFont(new Font("Monospace", Font.BOLD, 12));
		q23Label.setHorizontalAlignment(JLabel.CENTER);
																									
		//Dropdown menu (combo box) for q23
		String[] q23 = {null, "Yes", "Sometimes", "No"};
		q23Box = new JComboBox(q23);
		q23Box.setBounds(430, 510, 80, 15);
		q23Box.setFont(new Font("Monospace", Font.BOLD, 10));
		q23Box.addActionListener(this);
		
		//Label for q24
		JLabel q24Label = new JLabel();
		q24Label.setText("24.) Does your Tinnitus get worse when you are under stress?");
		q24Label.setBounds(18, 525, 400, 20);
		q24Label.setForeground(new Color(200, 200, 200));
		q24Label.setFont(new Font("Monospace", Font.BOLD, 12));
		q24Label.setHorizontalAlignment(JLabel.CENTER);
																			
		//Dropdown menu (combo box) for q24
		String[] q24 = {null, "Yes", "Sometimes", "No"};
		q24Box = new JComboBox(q24);
		q24Box.setBounds(430, 530, 80, 15);
		q24Box.setFont(new Font("Monospace", Font.BOLD, 10));
		q24Box.addActionListener(this);
		
		//Label for q25
		JLabel q25Label = new JLabel();
		q25Label.setText("25.) Does your Tinnitus make you feel insecure?");
		q25Label.setBounds(28, 545, 300, 20);
		q25Label.setForeground(new Color(200, 200, 200));
		q25Label.setFont(new Font("Monospace", Font.BOLD, 12));
		q25Label.setHorizontalAlignment(JLabel.CENTER);
																						
		//Dropdown menu (combo box) for q25
		String[] q25 = {null, "Yes", "Sometimes", "No"};
		q25Box = new JComboBox(q25);
		q25Box.setBounds(430, 550, 80, 15);
		q25Box.setFont(new Font("Monospace", Font.BOLD, 10));
		q25Box.addActionListener(this);
		
		
		frame.setSize(600, 700);					// sets dimensions of window(x,y)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // exit out of application
		frame.setVisible(true);						// make frame visible
		frame.setResizable(false); 				// prevent frame from being resized
		
		frame.add(titleLabel);
		frame.add(q1Label);
		frame.add(q1Box);
		frame.add(q2Label);
		frame.add(q2Box);
		frame.add(q3Label);
		frame.add(q3Box);
		frame.add(q4Label);
		frame.add(q4Box);
		frame.add(q5Label);
		frame.add(q5Box);
		frame.add(q6Label);
		frame.add(q6Box);
		frame.add(q7Label);
		frame.add(q7Box);
		frame.add(q8Label);
		frame.add(q8Box);
		frame.add(q9Label);
		frame.add(q9Box);
		frame.add(q10Label);
		frame.add(q10Box);
		frame.add(q11Label);
		frame.add(q11Box);
		frame.add(q12Label);
		frame.add(q12Box);
		frame.add(q13Label);
		frame.add(q13Box);
		frame.add(q14Label);
		frame.add(q14Box);
		frame.add(q15Label);
		frame.add(q15Box);
		frame.add(q16Label);
		frame.add(q16Box);
		frame.add(q17Label);
		frame.add(q17Box);
		frame.add(q18Label);
		frame.add(q18Box);
		frame.add(q19Label);
		frame.add(q19Box);
		frame.add(q20Label);
		frame.add(q20Box);
		frame.add(q21Label);
		frame.add(q21Box);
		frame.add(q22Label);
		frame.add(q22Box);
		frame.add(q23Label);
		frame.add(q23Box);
		frame.add(q24Label);
		frame.add(q24Box);
		frame.add(q25Label);
		frame.add(q25Box);
		
		frame.add(saveButton);
		frame.add(backButton);
		frame.add(panel);
		
		ImageIcon image = new ImageIcon("HearingClinicIcon.jpg");  //Create an Icon for window
		frame.setIconImage(image.getImage());                      //Change icon of window
		frame.getContentPane().setBackground(new Color(0x606266));   //Change color of background
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == q1Box) {
			q1A = q1Box.getSelectedIndex();
		}
		if(e.getSource() == q2Box) {
			q2A = q2Box.getSelectedIndex();
		}
		if(e.getSource() == q3Box) {
			q3A =  q3Box.getSelectedIndex();
		}
		if(e.getSource() == q4Box) {
			q4A =  q4Box.getSelectedIndex();
		}
		if(e.getSource() == q5Box) {
			q5A =  q5Box.getSelectedIndex();
		}
		if(e.getSource() == q6Box) {
			q6A =  q6Box.getSelectedIndex();
		}
		if(e.getSource() == q7Box) {
			q7A =  q7Box.getSelectedIndex();
		}
		if(e.getSource() == q8Box) {
			q8A =  q8Box.getSelectedIndex();
		}
		if(e.getSource() == q9Box) {
			q9A =  q9Box.getSelectedIndex();
		}
		if(e.getSource() == q10Box) {
			q10A =  q10Box.getSelectedIndex();
		}
		if(e.getSource() == q11Box) {
			q11A =  q11Box.getSelectedIndex();
		}
		if(e.getSource() == q12Box) {
			q12A =  q12Box.getSelectedIndex();
		}
		if(e.getSource() == q13Box) {
			q13A =  q13Box.getSelectedIndex();
		}
		if(e.getSource() == q14Box) {
			q14A = q14Box.getSelectedIndex();
		}
		if(e.getSource() == q15Box) {
			q15A =  q15Box.getSelectedIndex();
		}
		if(e.getSource() == q16Box) {
			q16A =  q16Box.getSelectedIndex();
		}
		if(e.getSource() == q17Box) {
			q17A =  q17Box.getSelectedIndex();
		}
		if(e.getSource() == q18Box) {
			q18A =  q18Box.getSelectedIndex();
		}
		if(e.getSource() == q19Box) {
			q19A =  q19Box.getSelectedIndex();
		}
		if(e.getSource() == q20Box) {
			q20A =  q20Box.getSelectedIndex();
		}
		if(e.getSource() == q21Box) {
			q21A =  q21Box.getSelectedIndex();
		}
		if(e.getSource() == q22Box) {
			q22A =  q22Box.getSelectedIndex();
		}
		if(e.getSource() == q23Box) {
			q23A =  q23Box.getSelectedIndex();
		}
		if(e.getSource() == q24Box) {
			q24A =  q24Box.getSelectedIndex();
		}
		if(e.getSource() == q25Box) {
			q25A = q25Box.getSelectedIndex();
		}
		
		
		//If we click the save button...
		if(e.getSource() == saveButton) {
			//Patient Information
			Connection conn = null;
			try {
				DriverManager.registerDriver(new Hearing_Clinic.Driver());
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			
			 try {
				 	
			    	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hearing_Clinic", "root", "Bmgerkens102094!");
			    	System.out.println("Connected to database successfully.");
			    	conn.setAutoCommit(false);
			    	
			    	boolean ok = saveCheck();
			    	if (ok) {
			    		conn.commit();
			    		System.out.println("Transaction Complete");
			    		Statement stmt = conn.createStatement();
			    		String inputInfo = "INSERT INTO Patient (First_Name, Last_Name, Street_Address, DOB, Gender, Phone_num, Email, State_ID, City, ZIP_ID) VALUES ('"
								 + getfName() + "', '" + getlName() + "', '" + getStreet() + "', '" + getDob() + "', '" + getGen()
								 + "', '" + getPhone() + "', '" + getEmail() + "', '" + getState() + "', '" + getCity() + "', '" + getZip() + ");";
			    		
			    		stmt.executeUpdate(inputInfo);
			    		Statement stmt2 = conn.createStatement();
			    		String inputQ = "INSERT INTO THI (F1, F2, E3, F4, C5, E6, F7, C8, F9, E10, C11, F12, F13, E14, F15, E16, E17, F18, C19, F20, E21, E22, C23, F24, E25)"
			    				+ " VALUES (" + getq1() + ", " + getq2() + ", " + getq3() + ", " + getq4() + ", "+ getq5() + ", "+ getq6() + ", "+ getq7() + ", "+ getq8() 
			    				+ ", "+ getq9() + ", "+ getq10() + ", "+ getq11() + ", "+ getq12() + ", "+ getq13() + ", " + getq14() + ", " + getq15() + ", " + getq16() + ", "
			    						+ getq17() + ", " + getq18() + ", " + getq19() + ", "+ getq20() + ", " + getq21() + ", " + getq22() + ", " + getq23() + ", " + getq24() + ", "
			    								+ getq25() + ");";
			    		stmt2.executeUpdate(inputQ);
			    		
			    		
			    		
//			    		ResultSet rset = stmt.executeQuery("SELECT * FROM patient");
//			    		while (rset.next ()){
//			    			System.out.println(rset.getString("First_Name") + "\n" + rset.getString("Last_Name"));
//			    			System.out.println("");
//			    		}
			    		JOptionPane.showMessageDialog(null, "Patient created. Save successful!", "Save", JOptionPane.INFORMATION_MESSAGE);
				
			    		conn.close();
			    		NewPatients.npFrame.dispose();
						frame.dispose();
						Patients patientsPage = new Patients();
			    	}
			    	else {
			    		conn.rollback();
			    		System.out.println("Transaction Denied");
			    		System.out.println("Please fill in all answers");
			    		
			    		JOptionPane.showMessageDialog(null, "Transaction Denied. Please fill in all answers for questionnaire.", "ERROR", JOptionPane.ERROR_MESSAGE);
			    	}
			    }
			    catch(SQLException e1) {
			    	System.out.println("Oops, ERROR!!!");
			    	e1.printStackTrace();
			    }
			
			
//			String fName = NewPatients.fnTextField.getText();
//			String lName = NewPatients.lnTextField.getText();
//			String dob = NewPatients.dobTextField.getText();
//			Boolean gender = (boolean) NewPatients.genBox.getSelectedItem();
//			String phone = NewPatients.phoneTextField.getText();
//			String email = NewPatients.emailTextField.getText();
//			String street = NewPatients.streetTextField.getText();
//			String state = (String) NewPatients.stateBox.getSelectedItem();
//			String city = NewPatients.cityTextField.getText();
//			String zip = NewPatients.zipTextField.getText();
//			System.out.println(fName);
//			System.out.println(gender);
			
			
			int totalFuncScore = functionScore();
//			System.out.println("The total score for F is " + totalFuncScore);
			int totalEmoScore = emoScore();
//			System.out.println("The total score for E is " + totalEmoScore);
			int totalCatScore = catScore();
//			System.out.println("The total score for C is " + totalCatScore);
			
			
			
			int totalUnanswered = unansweredQ();
//			System.out.println("The total unanswered questions is " + totalUnanswered);
			
			//CALL -> variables
			
//			try {
//				jdbc.savePatientInfo();
//				
//				JOptionPane.showMessageDialog(null, "Patient created. Save successful!", "Save", JOptionPane.INFORMATION_MESSAGE);
//				
//				frame.dispose();
//				MyFrame myFrame = new MyFrame();
//			} catch (SQLException e1) {
//				// TODO Auto-generated catch block
//				e1.printStackTrace();
//			}
			
			
		}
		if(e.getSource() == backButton) {
			frame.dispose();
			NewPatients newPatientsPage = new NewPatients();
		}
		
	}
	
	public int functionScore() {
		int[] funcArray = {q1A, q2A, q4A, q7A, q9A, q12A, q13A, q15A, q18A, q20A, q24A};
		int totalScore = 0;		
		
		for(int i = 0; i < 11; i++) {
			if(funcArray[i] == 0) {
				continue;
			}
			else if (funcArray[i] == 1) {
				totalScore += 4;
				continue;
			}
			else if (funcArray[i] == 2) {
				totalScore += 2;
				continue;
			}
			else {
				continue;
			}
		}
		return totalScore;
	}
	/**
	 * 
	 * @return
	 */
	public int emoScore() {
		int[] emoArray = {q3A, q6A, q10A, q14A, q16A, q17A, q21A, q22A, q25A};
		int totalScore = 0;
	
		for(int i = 0; i < 9; i++) {
			if(emoArray[i] == 0) {
				continue;
			}
			else if (emoArray[i] == 1) {
				totalScore += 4;
				continue;
			}
			else if (emoArray[i] == 2) {
				totalScore += 2;
				continue;
			}
			else {
				continue;
			}
		}
		return totalScore;
	}
	/**
	 * 
	 * @return
	 */
	public int catScore() {
		int[] catArray = {q5A, q8A, q11A, q19A, q23A};
		int totalScore = 0;
	
		
		
		for(int i = 0; i < 5; i++) {
			if(catArray[i] == 0) {
				continue;
			}
			else if (catArray[i] == 1) {
				totalScore += 4;
				continue;
			}
			else if (catArray[i] == 2) {
				totalScore += 2;
				continue;
			}
			else {
				continue;
			}
		}
		return totalScore;
	}
	
	public int unansweredQ() {
		int unanswered = 0;
		int unansweredArray[] = {q1A, q2A, q3A, q4A, q5A, q6A, q7A, q8A, q9A, q10A, q11A, q12A, q13A, q14A,
								q15A, q16A, q17A, q18A, q19A, q20A, q21A, q22A, q23A, q24A, q25A} ;
		
		for(int i = 0; i < 25; i++) {
			if(unansweredArray[i] == 0) {
				unanswered++;
			}
		}
		
		
		return unanswered;
	}
	
	//Patient Info Getters
	public String getfName() {
		return NewPatients.fnTextField.getText();
	}
	
	public String getlName() {
		return NewPatients.lnTextField.getText();
	}
	
	public String getStreet() {
		return NewPatients.streetTextField.getText();
	}
	
	public String getDob() {
		return NewPatients.dobTextField.getText();
	}
	
	public boolean getGen() {
		if(NewPatients.genBox.getSelectedIndex() == 0) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public String getPhone() {
		return NewPatients.phoneTextField.getText();
	}
	
	public String getEmail() {
		return NewPatients.emailTextField.getText();
	}
	
	public String getState() {
		return (String) NewPatients.stateBox.getSelectedItem();
	}
	
	public String getCity() {
		return NewPatients.cityTextField.getText();
	}
	
	public String getZip() {
		return NewPatients.zipTextField.getText();
	}
	
	
	
	//Questionnaire Getters
	
	public int getq1() {
		if(q1A == 1) {
			return 4;
		}
		else if (q1A == 2) {
			return 2;
		}
		else {
			return 0;
		}
	}
	
	public int getq2() {
		if(q2A == 1) {
			return 4;
		}
		else if (q2A == 2) {
			return 2;
		}
		else {
			return 0;
		}
	}
	
	public int getq3() {
		if(q3A == 1) {
			return 4;
		}
		else if (q3A == 2) {
			return 2;
		}
		else {
			return 0;
		}
	}
	
	public int getq4() {
		if(q4A == 1) {
			return 4;
		}
		else if (q4A == 2) {
			return 2;
		}
		else {
			return 0;
		}
	}
	
	public int getq5() {
		if(q5A == 1) {
			return 4;
		}
		else if (q5A == 2) {
			return 2;
		}
		else {
			return 0;
		}
	}
	
	public int getq6() {
		if(q6A == 1) {
			return 4;
		}
		else if (q6A == 2) {
			return 2;
		}
		else {
			return 0;
		}
	}
	
	public int getq7() {
		if(q7A == 1) {
			return 4;
		}
		else if (q7A == 2) {
			return 2;
		}
		else {
			return 0;
		}
	}
	
	public int getq8() {
		if(q8A == 1) {
			return 4;
		}
		else if (q8A == 2) {
			return 2;
		}
		else {
			return 0;
		}
	}
	
	public int getq9() {
		if(q9A == 1) {
			return 4;
		}
		else if (q9A == 2) {
			return 2;
		}
		else {
			return 0;
		}
	}
	
	public int getq10() {
		if(q10A == 1) {
			return 4;
		}
		else if (q10A == 2) {
			return 2;
		}
		else {
			return 0;
		}
	}
	
	public int getq11() {
		if(q11A == 1) {
			return 4;
		}
		else if (q11A == 2) {
			return 2;
		}
		else {
			return 0;
		}
	}
	
	public int getq12() {
		if(q12A == 1) {
			return 4;
		}
		else if (q12A == 2) {
			return 2;
		}
		else {
			return 0;
		}
	}
	
	public int getq13() {
		if(q13A == 1) {
			return 4;
		}
		else if (q13A == 2) {
			return 2;
		}
		else {
			return 0;
		}
	}
	
	public int getq14() {
		if(q14A == 1) {
			return 4;
		}
		else if (q14A == 2) {
			return 2;
		}
		else {
			return 0;
		}
	}
	
	public int getq15() {
		if(q15A == 1) {
			return 4;
		}
		else if (q15A == 2) {
			return 2;
		}
		else {
			return 0;
		}
	}
	
	public int getq16() {
		if(q16A == 1) {
			return 4;
		}
		else if (q16A == 2) {
			return 2;
		}
		else {
			return 0;
		}
	}
	
	public int getq17() {
		if(q17A == 1) {
			return 4;
		}
		else if (q17A == 2) {
			return 2;
		}
		else {
			return 0;
		}
	}
	
	public int getq18() {
		if(q18A == 1) {
			return 4;
		}
		else if (q18A == 2) {
			return 2;
		}
		else {
			return 0;
		}
	}
	
	public int getq19() {
		if(q19A == 1) {
			return 4;
		}
		else if (q19A == 2) {
			return 2;
		}
		else {
			return 0;
		}
	}
	
	public int getq20() {
		if(q20A == 1) {
			return 4;
		}
		else if (q20A == 2) {
			return 2;
		}
		else {
			return 0;
		}
	}
	
	public int getq21() {
		if(q21A == 1) {
			return 4;
		}
		else if (q21A == 2) {
			return 2;
		}
		else {
			return 0;
		}
	}
	
	public int getq22() {
		if(q22A == 1) {
			return 4;
		}
		else if (q22A == 2) {
			return 2;
		}
		else {
			return 0;
		}
	}
	
	public int getq23() {
		if(q23A == 1) {
			return 4;
		}
		else if (q23A == 2) {
			return 2;
		}
		else {
			return 0;
		}
	}
	
	public int getq24() {
		if(q24A == 1) {
			return 4;
		}
		else if (q24A == 2) {
			return 2;
		}
		else {
			return 0;
		}
	}
	
	public int getq25() {
		if(q25A == 1) {
			return 4;
		}
		else if (q25A == 2) {
			return 2;
		}
		else {
			return 0;
		}
	}
	
	public boolean saveCheck() {
		if(unansweredQ() == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	

}

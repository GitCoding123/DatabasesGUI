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

public class Analytics implements ActionListener{
	
	JFrame frame = new JFrame();
	JButton predictDiagnosisButton;
	JButton recommendTreatmentButton;
	JButton knowledgeBaseButton;
	JButton backButton;
	
	
	public Analytics() {
		//Window
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0x23272A));
		panel.setBounds(25, 25, 380, 200);
		
		//Predict Diagnosis button
		predictDiagnosisButton = new JButton();
		predictDiagnosisButton.setBounds(60, 60, 135, 60);
		predictDiagnosisButton.addActionListener(this);
		predictDiagnosisButton.setText("Predict Diagnosis");
		predictDiagnosisButton.setFont(new Font("Monospace", Font.BOLD, 12));
		predictDiagnosisButton.setFocusable(false);
		predictDiagnosisButton.setBorder(BorderFactory.createEtchedBorder());
		
		//Recommend Treatment button
		recommendTreatmentButton = new JButton();
		recommendTreatmentButton.setBounds(230, 60, 135, 60);
		recommendTreatmentButton.addActionListener(this);
		recommendTreatmentButton.setText("Recommend \nTreatment");
		recommendTreatmentButton.setFont(new Font("Monospace", Font.BOLD, 10));
		recommendTreatmentButton.setFocusable(false);
		recommendTreatmentButton.setBorder(BorderFactory.createEtchedBorder());
		
		//Knowledge base button
		knowledgeBaseButton = new JButton();
		knowledgeBaseButton.setBounds(145, 145, 135, 60);
		knowledgeBaseButton.addActionListener(this);
		knowledgeBaseButton.setText("Knowledge Base");
		knowledgeBaseButton.setFont(new Font("Monospace", Font.BOLD, 12));
		knowledgeBaseButton.setFocusable(false);
		knowledgeBaseButton.setBorder(BorderFactory.createEtchedBorder());
		
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
		frame.setTitle("Analytics");       //Set title of frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    // exit out of application
		frame.setResizable(false); 				// prevent frame from being resized
		frame.setLayout(null);
		frame.setSize(450, 300);					// sets dimensions of window(x,y)
		frame.setVisible(true);  				// make frame visible
		
		//Add components to frame
		frame.add(predictDiagnosisButton);
		frame.add(recommendTreatmentButton);
		frame.add(knowledgeBaseButton);
		frame.add(backButton);
		frame.add(panel);
		
		//Add image icon for frame
		ImageIcon image = new ImageIcon("HearingClinicIcon.jpg");  //Create an Icon for window
		frame.setIconImage(image.getImage());                      //Change icon of window
		frame.getContentPane().setBackground(new Color(0x606266));   //Change color of background
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == predictDiagnosisButton) {
			JOptionPane.showMessageDialog(null, "Still Under Construction", "ERROR", JOptionPane.ERROR_MESSAGE);
			//frame.dispose();
			//PredictDiagnosis predictDiagnosisPage = new PredictDiagnosis();
		}
		if (e.getSource() == recommendTreatmentButton) {
			JOptionPane.showMessageDialog(null, "Still Under Construction", "ERROR", JOptionPane.ERROR_MESSAGE);
			//frame.dispose();
			//RecommendTreatment recommendTreatmentPage = new RecommendTreatment();
		}
		if (e.getSource() == knowledgeBaseButton) {
			JOptionPane.showMessageDialog(null, "Still Under Construction", "ERROR", JOptionPane.ERROR_MESSAGE);
			//frame.dispose();
			//KnowledgeBase knowledgeBasePage = new KnowledgeBase();
		}
		if (e.getSource() == backButton) {
			frame.dispose();
			MyFrame myFrame = new MyFrame();
		}
		
		
	}

}

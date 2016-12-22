package Login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;


import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.Color;
import java.awt.Window.Type;
import java.awt.Label;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.ImageIcon;

public class authentic {

	private JFrame frame;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					authentic window = new authentic();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public authentic() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
	
		login log1 = new login();
		frame = new JFrame();
		frame.setType(Type.POPUP);
		frame.getContentPane().setBackground(new Color(255, 222, 173));
		frame.setBounds(100, 100,500, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 222, 173));
		panel.setBounds(0, 0, 654, 411);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				passwordField.setText(passwordField.getText()+ "1");	
			}
		});
		btnNewButton.setBounds(85, 146, 60, 30);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				passwordField.setText(passwordField.getText()+ "2");
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBounds(215, 146, 60, 30);
		panel.add(btnNewButton_1);
		
		JButton button = new JButton("3");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				passwordField.setText(passwordField.getText()+ "3");
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button.setBounds(332, 146, 60, 30);
		panel.add(button);
		
		JButton button_1 = new JButton("4");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				passwordField.setText(passwordField.getText()+ "4");
			}
		});
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_1.setBounds(85, 197, 60, 30);
		panel.add(button_1);
		
		JButton button_2 = new JButton("5");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				passwordField.setText(passwordField.getText()+ "5");
			}
		});
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_2.setBounds(215, 197, 60, 30);
		panel.add(button_2);
		
		JButton button_3 = new JButton("6");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				passwordField.setText(passwordField.getText()+ "6");
			}
		});
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_3.setBounds(332, 197, 60, 30);
		panel.add(button_3);
		
		JButton button_4 = new JButton("7");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				passwordField.setText(passwordField.getText()+ "7");
			}
		});
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_4.setBounds(85, 248, 60, 30);
		panel.add(button_4);
		
		JButton button_5 = new JButton("8");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				passwordField.setText(passwordField.getText()+ "8");
			}
		});
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_5.setBounds(215, 248, 60, 30);
		panel.add(button_5);
		
		JButton button_6 = new JButton("9");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				passwordField.setText(passwordField.getText()+ "9");
			}
		});
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_6.setBounds(332, 248, 60, 30);
		panel.add(button_6);
		
		JButton button_7 = new JButton("*");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				passwordField.setText(passwordField.getText()+ "*");
			}
		});
		button_7.setVerticalAlignment(SwingConstants.TOP);
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 19));
		button_7.setBounds(85, 298, 60, 30);
		panel.add(button_7);
		
		JButton button_8 = new JButton("0");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				passwordField.setText(passwordField.getText()+ "0");
			}
		});
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_8.setBounds(215, 299, 60, 30);
		panel.add(button_8);
		
		JButton btnutton = new JButton("#");
		btnutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				passwordField.setText(passwordField.getText()+ "#");
			}
		});
		btnutton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnutton.setBounds(332, 299, 60, 30);
		panel.add(btnutton);
		
		passwordField = new JPasswordField();
		passwordField.setForeground(new Color(0, 0, 0));
		passwordField.setBackground(new Color(255, 255, 204));
		passwordField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		passwordField.setBounds(85, 75, 307, 30);
		panel.add(passwordField);
		
		JButton btnClear = new JButton("clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				passwordField.setText("");
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnClear.setBounds(85, 363, 109, 40);
		panel.add(btnClear);
		
		JButton btnNewButton_2 = new JButton("submit");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if (!passwordField.getText().equals("12345")&&!passwordField.getText().equals("54321")&& !passwordField.getText().equals("56789")&&!passwordField.getText().equals("98765"))
						 {			 
			      
			            JOptionPane.showMessageDialog(null, "not ok");
			        } 
				 else {
			        
			        	
			        	
						log1.setVisible(true);
						
			        }
			}

			
		});
		btnNewButton_2.setBounds(276, 363, 116, 40);
		panel.add(btnNewButton_2);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("");
		lblNewJgoodiesLabel.setForeground(new Color(255, 255, 255));
		lblNewJgoodiesLabel.setBackground(new Color(0, 0, 0));
		lblNewJgoodiesLabel.setIcon(new ImageIcon("C:\\Users\\saris\\Desktop\\back.jpg"));
		lblNewJgoodiesLabel.setBounds(0, 0, 482, 411);
		panel.add(lblNewJgoodiesLabel);
		
	}
}

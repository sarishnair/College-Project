package Login;
import java.sql.*;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class login extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldUN;
	private JPasswordField passwordField;


	/**
	 * Launch the application.
	 */

Connection con = null;
	/**
	 * Create the frame.
	 */
	public login() {
		initialize();
		
		con = connection.dbconnector();
	}
	private void initialize(){
		
		
		
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100,734, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(255, 222, 173));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("User Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(396, 120, 93, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(396, 214, 93, 23);
		contentPane.add(lblNewLabel_1);
		
		textFieldUN = new JTextField();
		textFieldUN.setBounds(517, 117, 136, 39);
		contentPane.add(textFieldUN);
		textFieldUN.setColumns(10);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					
					String query=("select * from EmployeeInfo where username=? and password=? and EID=0");
					PreparedStatement pst = con.prepareStatement(query);
					pst.setString(1, textFieldUN.getText());
					pst.setString(2, passwordField.getText());
					ResultSet rs = pst.executeQuery();
					
					
					int count=0;
					while(rs.next()){
						count++;
					}
					if(count==1){
						login lg = new login();
						lg.dispose();
						lg.setVisible(false);
						Showdb shd = new Showdb();
						shd.setVisible(true);
					}
					
					else if(count>1){
						JOptionPane.showMessageDialog(null, "Username And Password Is Duplicate");
				}
					else
					{
						JOptionPane.showMessageDialog(null, "Username And Password Is Not Correct");
					}
					
					rs.close();
					pst.close();
				}catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, e);
					
				}
				
			}

			
		});
		
		btnNewButton.setBounds(303, 320, 126, 33);
		contentPane.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(517, 206, 136, 39);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_2 = new JLabel("ast");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\AST\\Pics\\Icon.jpg"));
		lblNewLabel_2.setBounds(57, 79, 251, 187);
		contentPane.add(lblNewLabel_2);
		
		JLabel label = DefaultComponentFactory.getInstance().createLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\saris\\Desktop\\back.jpg"));
		label.setBounds(0, 0, 718, 437);
		contentPane.add(label);
		
	}
}


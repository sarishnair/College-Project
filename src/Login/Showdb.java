package Login;
import java.sql.*;
import java.lang.Math;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.lang.StrictMath;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;
import net.proteanit.sql.DbUtils.*;

import javax.swing.JTable;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.Spring;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JDesktopPane;
import javax.swing.JSplitPane;
import java.awt.Panel;
import javax.swing.JFileChooser;
import javax.swing.JTabbedPane;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import javax.swing.SwingConstants;

public class Showdb extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JComboBox comboBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Showdb frame = new Showdb();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	Connection conn = null;
	private JTextField textField_2;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JPasswordField passwordField;
	private JTextField textField;
	private JTextField txtHours;
	private JTextField txtAdvance;
	private JTextField txtBalance;
	private JTextField txtPerHr;
	private JTextField textField_5;
	private JTextField textField_6;
	
	public void showTable()
	{
		try{
			String query="select * from EmployeeInfo where EID != 0";
			PreparedStatement pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
	}
	public void ComboBox()
	{
		try{
			String query="select * from EmployeeInfo where EID != 0";
			PreparedStatement pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				comboBox.addItem(rs.getString("Name"));
			}
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
	}
	public Showdb() {
		conn = connection.dbconnector();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1366, 770);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 222, 173));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton Showbutton = new JButton("Show Entries");
		Showbutton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Showbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
				
				}catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, e);
				}
				showTable();

			}
		});
		Showbutton.setBounds(635, 654, 136, 30);
		contentPane.add(Showbutton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(267, 225, 538, 333);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		textField_2 = new JTextField();
		textField_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_2.setBounds(168, 417, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Add");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				try{
					String query="insert into EmployeeInfo (EID,Username,Password,Age,Name) values (?,?,?,?,?)";
					PreparedStatement pst = conn.prepareStatement(query);
					pst.setString(1,textField_2.getText());
					pst.setString(2,textField_4.getText());
					pst.setString(3,passwordField.getText());
					pst.setString(4,textField_1.getText());
					pst.setString(5,textField_3.getText());
				    
					
					
					pst.execute();
					if (textField_2.getText().isEmpty())
					{
						JOptionPane.showMessageDialog(null, "not ok");
						
					}
					else
						
					{
					showTable();
				}
					
				}catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, e);
				}
				
			}
			});
		
		
		btnNewButton_1.setBounds(29, 661, 89, 23);
		contentPane.add(btnNewButton_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(168, 500, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("EID");
		lblNewLabel.setBounds(29, 420, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Age");
		lblNewLabel_1.setBounds(29, 500, 46, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(29, 572, 61, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Name");
		lblNewLabel_3.setBounds(29, 461, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(168, 458, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Username");
		lblNewLabel_4.setBounds(29, 538, 61, 14);
		contentPane.add(lblNewLabel_4);
		
		textField_4 = new JTextField();
		textField_4.setBounds(168, 535, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(168, 572, 86, 20);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String query="delete from EmployeeInfo where EID='"+textField.getText()+"' and EID != 0";
					PreparedStatement pst = conn.prepareStatement(query);
					pst.execute();
					
				}catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, e);
				}
				if (textField.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "not ok");
					
				}
				else{
				showTable();
				JOptionPane.showMessageDialog(null, " Deleted Successfully");
			}
				}
		});
		btnNewButton.setBounds(394, 660, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Update");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String query="update EmployeeInfo set EID='"+textField_2.getText()+"',Username='"+textField_4.getText()+"',Password='"+passwordField.getText()+"',Age='"+textField_1.getText()+"',Name='"+textField_3.getText()+"' where EID='"+textField_2.getText()+"'and EID != 0 ";
					
				
				
					PreparedStatement pst = conn.prepareStatement(query);
					pst.execute();
				
				 
				
		          	}catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null, ex);
				}
				if (textField_2.getText().isEmpty())
				{
					JOptionPane.showMessageDialog(null, "not ok");
					
				}
				else{
				showTable();
				JOptionPane.showMessageDialog(null, " Updated Successfully");
			}
			}
		});
		
		btnNewButton_2.setBounds(165, 661, 89, 23);
		contentPane.add(btnNewButton_2);
		
		textField = new JTextField();
		textField.setBounds(303, 661, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String query="select * from EmployeeInfo where Name=? and EID != 0 ";
					PreparedStatement pst = conn.prepareStatement(query);
					
					pst.setString(1,(String)comboBox.getSelectedItem());
					ResultSet rs = pst.executeQuery();
					while(rs.next())
					{
					
						textField_2.setText(rs.getString("EID"));
						textField_4.setText(rs.getString("Username"));
						passwordField.setText(rs.getString("Password"));
						textField_1.setText(rs.getString("Age"));
						textField_3.setText(rs.getString("Name"));
					
						
					}
				 
				
		          	}catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null, ex);
				}
			}
		});
		comboBox.setBounds(743, 583, 411, 23);
		contentPane.add(comboBox);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(29, 166, 175, -131);
		contentPane.add(desktopPane);
		
		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBounds(32, 170, 204, -136);
		contentPane.add(desktopPane_1);
		
		JDesktopPane desktopPane_2 = new JDesktopPane();
		desktopPane_2.setBounds(10, 208, 1, 1);
		contentPane.add(desktopPane_2);
		
		JLabel lblAst = new JLabel("AST");
		lblAst.setVerticalAlignment(SwingConstants.TOP);
		lblAst.setIcon(new ImageIcon("C:\\AST\\Pics\\Logo.jpg"));
	
		lblAst.setBounds(229, 11, 997, 148);
		contentPane.add(lblAst);
		
		JLabel lblPic = new JLabel("PIC");
		lblPic.setBounds(42, 225, 194, 138);
		lblPic.setIcon(new ImageIcon("C:\\Users\\saris\\Desktop\\PROJECT\\sarish.jpg"));
		contentPane.add(lblPic);
		
		JPanel panel = new JPanel();
		panel.setBounds(864, 225, 451, 333);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 431, 311);
		panel.add(tabbedPane);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("HOURS", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblHours = new JLabel("Hours :");
		lblHours.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblHours.setBounds(22, 27, 67, 34);
		panel_1.add(lblHours);
		
		JLabel lblAdvance = new JLabel("Advance :");
		lblAdvance.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAdvance.setBounds(25, 94, 81, 34);
		panel_1.add(lblAdvance);
		
		txtHours = new JTextField();
		txtHours.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtHours.setBounds(117, 36, 86, 20);
		panel_1.add(txtHours);
		txtHours.setColumns(10);
		
		txtAdvance = new JTextField();
		txtAdvance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtAdvance.setColumns(10);
		txtAdvance.setBounds(116, 103, 81, 20);
		panel_1.add(txtAdvance);
		
		JLabel lblBalance = new JLabel("Balance :");
		lblBalance.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent arg0) {
			}
			public void ancestorMoved(AncestorEvent arg0) {
			}
			public void ancestorRemoved(AncestorEvent arg0) {
			}
		});
		lblBalance.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblBalance.setBounds(56, 208, 81, 34);
		panel_1.add(lblBalance);
		
		txtBalance = new JTextField();
		txtBalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtBalance.setBounds(159, 217, 86, 20);
		panel_1.add(txtBalance);
		txtBalance.setColumns(10);
		
		JButton btnNewButton_3 = new JButton("Total");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				double lblHours = Double.parseDouble(txtHours.getText());
				double lblPerHr = Double.parseDouble(txtPerHr.getText());
				
				double pTotal;
				 pTotal = (lblHours * lblPerHr); 
				
				 
				 double lblAdvance = Double.parseDouble(txtAdvance.getText());
				 double qTotal;
				 qTotal = pTotal - lblAdvance;
				 String sTotal = String.format("%.2f", qTotal);
				 txtBalance.setText(sTotal);
				 
				 
				 
			   
				
				
			}
		});
		btnNewButton_3.setBounds(117, 166, 89, 23);
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Reset");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				txtHours.setText(null);
				txtAdvance.setText(null);
				txtBalance.setText(null);
				txtPerHr.setText(null);
			}
		});
		btnNewButton_4.setBounds(242, 166, 89, 23);
		panel_1.add(btnNewButton_4);
		
		JLabel lblHrs = new JLabel("Hrs.");
		lblHrs.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblHrs.setBounds(213, 27, 46, 34);
		panel_1.add(lblHrs);
		
		JLabel lblDhs = new JLabel("Dhs.");
		lblDhs.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDhs.setBounds(201, 95, 46, 34);
		panel_1.add(lblDhs);
		
		JLabel lblPerHr = new JLabel("Per Hr.");
		lblPerHr.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPerHr.setBounds(266, 39, 46, 14);
		panel_1.add(lblPerHr);
		
		txtPerHr = new JTextField();
		txtPerHr.setBounds(310, 36, 59, 20);
		panel_1.add(txtPerHr);
		txtPerHr.setColumns(10);
		
		JLabel label = new JLabel("Dhs.");
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label.setBounds(370, 27, 46, 34);
		panel_1.add(label);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("WAGES", null, panel_2, null);
		
		JLabel label_1 = new JLabel("Curr. Mon. Sal");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(1013, 686, 103, 14);
		contentPane.add(label_1);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(1116, 686, 46, 20);
		contentPane.add(textField_5);
		
		JLabel label_2 = new JLabel("Dhs.");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(1165, 689, 46, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Dhs.");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setBounds(1165, 640, 46, 14);
		contentPane.add(label_3);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(1116, 637, 46, 20);
		contentPane.add(textField_6);
		
		JLabel label_4 = new JLabel("Pre. Mon. Sal");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_4.setBounds(1013, 638, 103, 14);
		contentPane.add(label_4);
		
		ComboBox();
	}
}

package Login;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import net.proteanit.sql.DbUtils;

import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.JTabbedPane;
import javax.swing.border.EtchedBorder;
import javax.swing.JDesktopPane;
import javax.swing.JFileChooser;

public class Showdbnew extends JFrame {
	
	private JTable table;
	private JComboBox comboBox;
	private JPanel contentPane;
    
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Showdbnew window = new Showdbnew();
					window.frmPrint.setVisible(true);
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
	private JFrame frmPrint;
	private JTextField txtEmployeeDetail;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField;
	private JTextField textField_3;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JLabel label1=null;
    private String qt=null;

	String filename = null;
	int s=0;
	byte[] person_image =null;
	private ImageIcon format = null;
	/*
	public void showTable()
	{
		try{
			String query="select * from Employee where PPNumber!= 0";
			PreparedStatement pst = conn.prepareStatement(query);
			ResultSet rs = pst.executeQuery();
			table.setModel(DbUtils.resultSetToTableModel(rs));
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
	}
	*/
	public void ComboBox()
	{
		try{
			String query="select * from Employee where PPNumber != 0";
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
	public void Showme()
	{
		try{
			
			String sql = "select Picture from Employee where PPNumber = '"+textField_5.getText()+"'";
			
			PreparedStatement pstd = conn.prepareStatement(sql);
			
			
			ResultSet rs = pstd.executeQuery();

			if(rs.next())
			{
				byte[] imagedata = rs.getBytes("Picture");
				format = new ImageIcon(imagedata);
				label1.setIcon(format);
		    
			
			}
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null, e);
		}
	}
	/**
	 * Create the application.
	 */
	public Showdbnew() {
		conn = connection.dbconnector();
		frmPrint = new JFrame();
		frmPrint.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
		frmPrint.setForeground(Color.GREEN);
		frmPrint.getContentPane().setBackground(new Color(255, 204, 153));
		frmPrint.setBounds(0, 0, 1366, 770);
		frmPrint.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPrint.getContentPane().setLayout(null);
		
		JLabel label5 = new JLabel("AST");
		label5.setIcon(new ImageIcon("C:\\Users\\saris\\Desktop\\PROJECT\\Logo.jpg"));
		label5.setVerticalAlignment(SwingConstants.TOP);
		label5.setBounds(192, 11, 1033, 101);
		frmPrint.getContentPane().add(label5);
		
		txtEmployeeDetail = new JTextField();
		txtEmployeeDetail.setBackground(new Color(255, 204, 153));
		txtEmployeeDetail.setHorizontalAlignment(SwingConstants.CENTER);
		txtEmployeeDetail.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtEmployeeDetail.setText("Employee Detail");
		txtEmployeeDetail.setBounds(50, 138, 150, 31);
		frmPrint.getContentPane().add(txtEmployeeDetail);
		txtEmployeeDetail.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblName.setBounds(38, 220, 46, 14);
		frmPrint.getContentPane().add(lblName);
		
		JLabel lblNationality = new JLabel("PP. No.");
		lblNationality.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNationality.setBounds(38, 261, 73, 20);
		frmPrint.getContentPane().add(lblNationality);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDob.setBounds(38, 300, 46, 20);
		frmPrint.getContentPane().add(lblDob);
		
		JLabel lblAge = new JLabel("Age");
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAge.setBounds(38, 338, 73, 14);
		frmPrint.getContentPane().add(lblAge);
		
		JLabel lblEidNo = new JLabel("EID. No.");
		lblEidNo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEidNo.setBounds(38, 371, 61, 31);
		frmPrint.getContentPane().add(lblEidNo);
		
		JLabel lblExpiryDt = new JLabel("Expiry Dt");
		lblExpiryDt.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblExpiryDt.setBounds(377, 420, 61, 19);
		frmPrint.getContentPane().add(lblExpiryDt);
		
		JLabel lblLcNo = new JLabel("LC. No.");
		lblLcNo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLcNo.setBounds(38, 420, 61, 14);
		frmPrint.getContentPane().add(lblLcNo);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(141, 219, 180, 20);
		frmPrint.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(141, 260, 111, 20);
		frmPrint.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(141, 302, 80, 20);
		frmPrint.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(141, 337, 46, 20);
		frmPrint.getContentPane().add(textField_7);
		
		JLabel label = new JLabel("Expiry Dt");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(377, 381, 61, 19);
		frmPrint.getContentPane().add(label);
		
		JLabel lblNationality_1 = new JLabel("Nationality");
		lblNationality_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNationality_1.setBounds(377, 215, 73, 25);
		frmPrint.getContentPane().add(lblNationality_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(484, 219, 111, 20);
		frmPrint.getContentPane().add(textField);
		
		JButton button = new JButton("Add");
		button.setBounds(48, 525, 89, 23);
		frmPrint.getContentPane().add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String query="insert into Employee (Name,PPNumber,DOB,Age,EIDNumber,LCNumber,Nationality,PPExpiry,EIDExpiry,LCExpiry,Picture) values (?,?,?,?,?,?,?,?,?,?,?)";
					PreparedStatement pst = conn.prepareStatement(query);
					pst.setString(1,textField_4.getText());
					pst.setString(2,textField_5.getText());
					pst.setString(3,textField_6.getText());
					pst.setString(4,textField_7.getText());
					pst.setString(5,textField_2.getText());
					pst.setString(6,textField_8.getText());
					pst.setString(7,textField.getText());
					pst.setString(8,textField_9.getText());
					pst.setString(9,textField_10.getText());
					pst.setString(10,textField_11.getText());
					pst.setBytes(11,person_image);
					
					Showme();
				
				     pst.execute();
				     
			
					if (textField_2.getText().isEmpty())
					{
						JOptionPane.showMessageDialog(null, "not ok");
						
					}
					else
						
					{
					//showTable();
						JOptionPane.showMessageDialog(null, "ok");
				}
					
					}
				
					catch(Exception e)
				{
					JOptionPane.showMessageDialog(null, e);
				}
				
			}
			});
			
		
		JButton button_1 = new JButton("Update");
		button_1.setBounds(184, 525, 89, 23);
		frmPrint.getContentPane().add(button_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(354, 526, 111, 20);
		frmPrint.getContentPane().add(textField_3);
		
		JButton button_2 = new JButton("Delete");
		button_2.setBounds(475, 525, 89, 23);
		frmPrint.getContentPane().add(button_2);
		
		JLabel label_1 = new JLabel("Expiry Dt");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(377, 266, 61, 19);
		frmPrint.getContentPane().add(label_1);
		
		
		comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					String query="select * from Employee where Name=? ";
					PreparedStatement pst = conn.prepareStatement(query);
					
					pst.setString(1,(String)comboBox.getSelectedItem());
					ResultSet rs = pst.executeQuery();
					while(rs.next())
					{
					
						textField_4.setText(rs.getString("Name"));
						textField_5.setText(rs.getString("PPNumber"));
						textField_6.setText(rs.getString("DOB"));
						textField_7.setText(rs.getString("Age"));
						textField_2.setText(rs.getString("EIDNumber"));
						textField_8.setText(rs.getString("LCNumber"));
						textField.setText(rs.getString("Nationality"));
						textField_9.setText(rs.getString("PPExpiry"));
						textField_10.setText(rs.getString("EIDExpiry"));
						textField_11.setText(rs.getString("LCExpiry"));
						
					
						
					}
				 
				
		          	}catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null, ex);
				}
			}
		});
			
		comboBox.setBounds(59, 592, 168, 23);
		frmPrint.getContentPane().add(comboBox);
		
		JButton button_3 = new JButton("Search");
		button_3.setBounds(475, 592, 89, 23);
		frmPrint.getContentPane().add(button_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(354, 593, 111, 20);
		frmPrint.getContentPane().add(textField_1);
		
		JLabel label_2 = new JLabel("PP. No.");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(271, 591, 46, 20);
		frmPrint.getContentPane().add(label_2);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)
			{
				textField_4.setText(null);
				textField_5.setText(null);
				textField_6.setText(null);
				textField_7.setText(null);
				textField_8.setText(null);
				textField_9.setText(null);
				textField.setText(null);
				textField_10.setText(null);
				textField_11.setText(null);
			}
		});
		btnReset.setBounds(246, 660, 89, 23);
		frmPrint.getContentPane().add(btnReset);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(141, 378, 180, 20);
		frmPrint.getContentPane().add(textField_2);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(141, 421, 180, 20);
		frmPrint.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(482, 263, 89, 20);
		frmPrint.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(484, 378, 89, 20);
		frmPrint.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(482, 421, 89, 20);
		frmPrint.getContentPane().add(textField_11);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(887, 220, 442, 480);
		frmPrint.getContentPane().add(tabbedPane);
		
		JPanel tab1 = new JPanel();
		tabbedPane.addTab("Print", null, tab1, null);
		tab1.setLayout(null);
		
		textField_12 = new JTextField();
		textField_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		textField_12.setBounds(10, 11, 417, 430);
		tab1.add(textField_12);
		textField_12.setColumns(10);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("New tab", null, panel, null);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_1, null);
		
		JButton PrintBtn = new JButton("PRINT");
		PrintBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
				
				textField_12.setText("\t\nEmployee Detail:\n\n\n\n\nName:\t\t\n\nPassport Number:\t\t\n\nDate of Birth:\t\t\n\nAge:\t\t");
			}
		});
		PrintBtn.setBounds(770, 547, 89, 23);
		frmPrint.getContentPane().add(PrintBtn);
		
		JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setBounds(683, 338, 150, -104);
		frmPrint.getContentPane().add(desktopPane);
		
		JDesktopPane desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBounds(640, 220, 219, 178);
		frmPrint.getContentPane().add(desktopPane_1);
		
		JLabel label1 = new JLabel();
		label1.setBounds(10, 11, 199, 156);
		desktopPane_1.add(label1);
		
		JButton btnBrowse = new JButton("browse");
		btnBrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				JFileChooser chooser= new JFileChooser();
				chooser.showOpenDialog(null);
				File f=chooser.getSelectedFile();
				filename=f.getAbsolutePath();
				browsefield.setText(filename);
				try{
					File image = new File(filename);
					FileInputStream fis = new FileInputStream(image);
					ByteArrayOutputStream bos = new ByteArrayOutputStream();
					byte[] buff = new byte[4096];
					
					for(int readNum; (readNum=fis.read(buff))!=-1;)
					{
						bos.write(buff,0,readNum);
					}
					person_image =bos.toByteArray();
					
				}
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null, ex);
				}
				
				
				
			}
		});
		btnBrowse.setBounds(619, 436, 89, 23);
		frmPrint.getContentPane().add(btnBrowse);
		
		browsefield = new JTextField();
		browsefield.setBounds(640, 486, 86, 20);
		frmPrint.getContentPane().add(browsefield);
		browsefield.setColumns(10);
		
		JButton btnShow = new JButton("Show");
		btnShow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
				String sql = "select Picture from Employee where PPNumber = ''";
				PreparedStatement pst = conn.prepareStatement(sql);
				
				
				ResultSet rs = pst.executeQuery();

				if(rs.next())
				{
					byte[] imagedata = rs.getBytes("Picture");
					format = new ImageIcon(imagedata);
					label1.setIcon(format);
					
				}}
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(null, ex);
				}
				}
		});
		btnShow.setBounds(755, 436, 89, 23);
		frmPrint.getContentPane().add(btnShow);
	}
	

	private JTextField browsefield;
	private JTextField textField_12;
}

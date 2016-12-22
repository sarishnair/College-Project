package Login;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TAbs {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TAbs window = new TAbs();
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
	public TAbs() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 759, 475);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Employee Detail");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBackground(new Color(51, 102, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(60, 320, 178, 65);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Monthly  Salary");
		btnNewButton_1.setBackground(new Color(153, 255, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(487, 320, 197, 65);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel label = new JLabel("ast");
		label.setIcon(new ImageIcon("C:\\AST\\Pics\\Icon.jpg"));
		label.setBounds(250, 11, 240, 111);
		frame.getContentPane().add(label);
		
		JLabel label1 = new JLabel("ast");
		label1.setIcon(new ImageIcon("C:\\AST\\Pics\\Logo1.jpg"));
		
		
		label1.setBounds(37, 133, 672, 132);
		frame.getContentPane().add(label1);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("");
		lblNewJgoodiesLabel.setIcon(new ImageIcon("C:\\Users\\saris\\Desktop\\back.jpg"));
		lblNewJgoodiesLabel.setBounds(0, 0, 743, 436);
		frame.getContentPane().add(lblNewJgoodiesLabel);
	}
}

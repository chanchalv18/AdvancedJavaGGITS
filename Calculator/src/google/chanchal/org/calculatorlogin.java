package google.chanchal.org;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class calculatorlogin {

	private JFrame frame;
	private JTextField cal_user;
	private JPasswordField cal_pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculatorlogin window = new calculatorlogin();
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
	public calculatorlogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setBounds(40, 53, 194, 14);
		frame.getContentPane().add(lblUserName);
		
		cal_user = new JTextField();
		cal_user.setBounds(194, 50, 101, 20);
		frame.getContentPane().add(cal_user);
		cal_user.setColumns(10);
		
		cal_pass = new JPasswordField();
		cal_pass.setText("Password");
		cal_pass.setBounds(194, 103, 101, 20);
		frame.getContentPane().add(cal_pass);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(40, 106, 88, 14);
		frame.getContentPane().add(lblPassword);
		
		JButton btnSignIn = new JButton("Sign In");
		btnSignIn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				String user = cal_user.getText();
				@SuppressWarnings("deprecation")
				char[] pass = cal_pass.getPassword();
				
				if(user.equals("admin")&& pass.equals("admin")){
					JOptionPane.showMessageDialog(null,"LOGIN SUCCESSFUL");
				}
					else{
					JOptionPane.showMessageDialog(null,"LOGIN UNSUCCESSFUL");
				}
				
			
		});
		btnSignIn.setBounds(156, 178, 89, 23);
		frame.getContentPane().add(btnSignIn);
	}
}

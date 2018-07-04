package chanchal;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import org.tempuri.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class myCalc {

	private JFrame calculator;
	private JTextField tf_A;
	private JTextField tf_B;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					myCalc window = new myCalc();
					window.calculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public myCalc() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		calculator = new JFrame();
		calculator.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Public\\Pictures\\Sample Pictures\\Koala.jpg"));
		calculator.setTitle("Calculator");
		calculator.setBounds(100, 100, 450, 300);
		calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calculator.getContentPane().setLayout(null);
		
		JLabel lblNumber = new JLabel("Number 1");
		lblNumber.setForeground(new Color(0, 0, 153));
		lblNumber.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNumber.setBounds(45, 39, 88, 30);
		calculator.getContentPane().add(lblNumber);
		
		JLabel lblNumber_1 = new JLabel("Number 2");
		lblNumber_1.setForeground(new Color(0, 0, 153));
		lblNumber_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNumber_1.setBounds(266, 43, 75, 22);
		calculator.getContentPane().add(lblNumber_1);
		
		tf_A = new JTextField();
		tf_A.setBackground(new Color(204, 255, 255));
		tf_A.setBounds(30, 76, 116, 20);
		calculator.getContentPane().add(tf_A);
		tf_A.setColumns(10);
		
		tf_B = new JTextField();
		tf_B.setBackground(new Color(204, 255, 255));
		tf_B.setBounds(240, 76, 123, 20);
		calculator.getContentPane().add(tf_B);
		tf_B.setColumns(10);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				String num1= tf_A.getText();
				String num2 = tf_B.getText();
				
				int a = Integer.parseInt(num1);
				int b = Integer.parseInt(num2);
				//send data
				Calculator calc= new Calculator();
				
				CalculatorSoap calc_soap =calc.getCalculatorSoap();
				int intC = calc_soap.add(a,b);
				JOptionPane.showMessageDialog(null, "the resul is"+intC);
				
				
				
				
			
			}
		});
		btnAdd.setBackground(new Color(102, 204, 255));
		btnAdd.setBounds(70, 145, 89, 23);
		calculator.getContentPane().add(btnAdd);
		
		JButton btnSubtract = new JButton("SUBTRACT");
		btnSubtract.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
				

				String num1= tf_A.getText();
				String num2 = tf_B.getText();
				
				int a = Integer.parseInt(num1);
				int b = Integer.parseInt(num2);
				//send data
				Calculator calc= new Calculator();
				
				CalculatorSoap calc_soap =calc.getCalculatorSoap();
				int intC = calc_soap.subtract(a,b);
				JOptionPane.showMessageDialog(null, "the resul is"+intC);
				
			}
		});
		btnSubtract.setBackground(new Color(102, 204, 255));
		btnSubtract.setBounds(240, 145, 89, 23);
		calculator.getContentPane().add(btnSubtract);
		
		JButton btnMultiply = new JButton("MULTIPLY");
		btnMultiply.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				

				String num1= tf_A.getText();
				String num2 = tf_B.getText();
				
				int a = Integer.parseInt(num1);
				int b = Integer.parseInt(num2);
				//send data
				Calculator calc= new Calculator();
				
				CalculatorSoap calc_soap =calc.getCalculatorSoap();
				int intC = calc_soap.multiply(a,b);
				JOptionPane.showMessageDialog(null, "the resul is"+intC);
				
				
				
				
				
				
			}
		});
		btnMultiply.setBackground(new Color(102, 204, 255));
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnMultiply.setBounds(70, 189, 89, 23);
		calculator.getContentPane().add(btnMultiply);
		
		JButton btnDivide = new JButton("DIVIDE");
		btnDivide.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {

				String num1= tf_A.getText();
				String num2 = tf_B.getText();
				
				int a = Integer.parseInt(num1);
				int b = Integer.parseInt(num2);
				//send data
				Calculator calc= new Calculator();
				
				CalculatorSoap calc_soap =calc.getCalculatorSoap();
				int intC = calc_soap.divide(a,b);
				JOptionPane.showMessageDialog(null, "the resul is"+intC);
				
			}
		});
		btnDivide.setBackground(new Color(102, 204, 255));
		btnDivide.setBounds(240, 189, 89, 23);
		calculator.getContentPane().add(btnDivide);
	}

	protected CalculatorSoap getCalculatorSoap() {
		// TODO Auto-generated method stub
		return null;
	}
}

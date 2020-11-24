package edu.century.finalProject;

import java.awt.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI extends JFrame {
	private JTextField txtDisplay;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setTitle("Standard Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 800);
		getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setBounds(10, 11, 243, 37);
		getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		JButton btn4 = new JButton("4");
		btn4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn4.setBounds(8, 149, 46, 47);
		getContentPane().add(btn4);
		
		JButton btn7 = new JButton("7");
		btn7.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn7.setBounds(8, 100, 46, 47);
		getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn8.setBounds(58, 100, 46, 47);
		getContentPane().add(btn8);
		
		JButton backBtn = new JButton("\uF0E7");
		backBtn.setFont(new Font("Wingdings", Font.PLAIN, 11));
		backBtn.setBounds(8, 51, 46, 47);
		getContentPane().add(backBtn);
		
		JButton clearBtn = new JButton("C");
		clearBtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		clearBtn.setBounds(58, 51, 46, 47);
		getContentPane().add(clearBtn);
		
		JButton btn1 = new JButton("1");
		btn1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn1.setBounds(8, 198, 46, 47);
		getContentPane().add(btn1);
		
		JButton btn0 = new JButton("0");
		btn0.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn0.setBounds(8, 247, 96, 47);
		getContentPane().add(btn0);
		
		JButton historyBtn = new JButton("H");
		historyBtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		historyBtn.setBounds(108, 51, 46, 47);
		getContentPane().add(historyBtn);
		
		JButton divideBtn = new JButton("/");
		divideBtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		divideBtn.setBounds(158, 51, 46, 47);
		getContentPane().add(divideBtn);
		
		JButton parenBtn = new JButton("()");
		parenBtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		parenBtn.setBounds(208, 51, 46, 47);
		getContentPane().add(parenBtn);
		
		JButton percBtn = new JButton("%");
		percBtn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		percBtn.setBounds(208, 100, 46, 47);
		getContentPane().add(percBtn);
		
		JButton btnx = new JButton("1/x");
		btnx.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnx.setBounds(208, 149, 46, 47);
		getContentPane().add(btnx);
		
		JButton equalBtn = new JButton("=");
		equalBtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		equalBtn.setBounds(208, 198, 46, 97);
		getContentPane().add(equalBtn);
		
		JButton btn9 = new JButton("9");
		btn9.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn9.setBounds(108, 100, 46, 47);
		getContentPane().add(btn9);
		
		JButton multBtn = new JButton("*");
		multBtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		multBtn.setBounds(158, 100, 46, 47);
		getContentPane().add(multBtn);
		
		JButton btn5 = new JButton("5");
		btn5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn5.setBounds(58, 149, 46, 47);
		getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn6.setBounds(108, 149, 46, 47);
		getContentPane().add(btn6);
		
		JButton subBtn = new JButton("-");
		subBtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		subBtn.setBounds(158, 149, 46, 47);
		getContentPane().add(subBtn);
		
		JButton btn2 = new JButton("2");
		btn2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn2.setBounds(58, 198, 46, 47);
		getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn3.setBounds(108, 198, 46, 47);
		getContentPane().add(btn3);
		
		JButton addBtn = new JButton("+");
		addBtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		addBtn.setBounds(158, 198, 46, 47);
		getContentPane().add(addBtn);
		
		JButton dotBtn = new JButton(".");
		dotBtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		dotBtn.setBounds(108, 247, 46, 47);
		getContentPane().add(dotBtn);
		
		JButton plusMinusBtn = new JButton("\u00B1");
		plusMinusBtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		plusMinusBtn.setBounds(158, 247, 46, 47);
		getContentPane().add(plusMinusBtn);
		
		JButton cosBtn = new JButton("Cos");
		cosBtn.setBounds(319, 51, 60, 47);
		getContentPane().add(cosBtn);
		
		JButton tanBtn = new JButton("Tan");
		tanBtn.setBounds(379, 51, 60, 47);
		getContentPane().add(tanBtn);
		
		JButton sinBtn = new JButton("Sin");
		sinBtn.setBounds(259, 51, 60, 47);
		getContentPane().add(sinBtn);
		
		JButton sqrtBtn = new JButton("\u221A");
		sqrtBtn.setBounds(439, 51, 60, 47);
		getContentPane().add(sqrtBtn);
		
		JButton aSinBtn = new JButton("ASin");
		aSinBtn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		aSinBtn.setBounds(259, 100, 60, 47);
		getContentPane().add(aSinBtn);
		
		JButton aCosBtn = new JButton("ACos");
		aCosBtn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		aCosBtn.setBounds(319, 100, 60, 47);
		getContentPane().add(aCosBtn);
		
		JButton aTanBtn = new JButton("ATan");
		aTanBtn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		aTanBtn.setBounds(379, 100, 60, 47);
		getContentPane().add(aTanBtn);
		
		JButton cbrtBtn = new JButton("Cbrt");
		cbrtBtn.setFont(new Font("Tahoma", Font.PLAIN, 11));
		cbrtBtn.setBounds(439, 100, 60, 47);
		getContentPane().add(cbrtBtn);
		
		JButton logBtn = new JButton("Log");
		logBtn.setBounds(259, 149, 60, 47);
		getContentPane().add(logBtn);
		
		JButton lnBtn = new JButton("Ln");
		lnBtn.setBounds(319, 149, 60, 47);
		getContentPane().add(lnBtn);
		
		JButton piBtn = new JButton("\u03C0");
		piBtn.setBounds(379, 149, 60, 47);
		getContentPane().add(piBtn);
		
		JButton eulerBtn = new JButton("e");
		eulerBtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		eulerBtn.setBounds(439, 149, 60, 47);
		getContentPane().add(eulerBtn);
		
		JButton powerBtn = new JButton("x^y");
		powerBtn.setBounds(259, 198, 60, 47);
		getContentPane().add(powerBtn);
		
		JButton squareBtn = new JButton("x^2");
		squareBtn.setBounds(319, 198, 60, 47);
		getContentPane().add(squareBtn);
		
		JButton cubeBtn = new JButton("x^3");
		cubeBtn.setBounds(379, 198, 60, 47);
		getContentPane().add(cubeBtn);
		
		JButton absoluteBtn = new JButton("|x|");
		absoluteBtn.setBounds(439, 198, 60, 47);
		getContentPane().add(absoluteBtn);
		
		JButton eulerPowerBtn = new JButton("e^x");
		eulerPowerBtn.setBounds(259, 247, 60, 47);
		getContentPane().add(eulerPowerBtn);
		
		JButton factBtn = new JButton("x!");
		factBtn.setBounds(319, 247, 60, 47);
		getContentPane().add(factBtn);
		
		JButton button_35 = new JButton("New button");
		button_35.setBounds(379, 247, 60, 47);
		getContentPane().add(button_35);
		
		JButton button_36 = new JButton("New button");
		button_36.setBounds(439, 247, 60, 47);
		getContentPane().add(button_36);
		
		textField = new JTextField();
		textField.setBounds(10, 305, 485, 359);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(18, 675, 235, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(18, 709, 235, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblEquation = new JLabel("Equation 1");
		lblEquation.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEquation.setBounds(259, 675, 86, 20);
		getContentPane().add(lblEquation);
		
		JLabel lblEquation_1 = new JLabel("Equation 2");
		lblEquation_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEquation_1.setBounds(259, 709, 86, 20);
		getContentPane().add(lblEquation_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(343, 675, 74, 20);
		getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(343, 709, 74, 20);
		getContentPane().add(comboBox_1);
		
		JButton graphBtn = new JButton("Graph");
		graphBtn.setBounds(427, 675, 72, 54);
		getContentPane().add(graphBtn);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmStandard = new JMenuItem("Standard");
		mntmStandard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				setTitle("Standard Calculator");
				setBounds(100, 100, 275, 367);
				txtDisplay.setBounds(10, 11, 243, 37);
			}
		});
		
		mnNewMenu.add(mntmStandard);
		
		JMenuItem mntmScientific = new JMenuItem("Scientific");
		mntmScientific.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				setTitle("Scientific Calculator");
				setBounds(100, 100, 525, 367);
				txtDisplay.setBounds(10, 11, 494, 37);
				
			}
		});
		mnNewMenu.add(mntmScientific);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JMenuItem mntmGraphing = new JMenuItem("Graphing");
		mntmGraphing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				setTitle("Graphing Calculator");
				setBounds(100, 100, 525, 800);
				txtDisplay.setBounds(10, 11, 494, 37);
				
			}
		});
		mnNewMenu.add(mntmGraphing);
		mnNewMenu.add(mntmExit);
	}
}

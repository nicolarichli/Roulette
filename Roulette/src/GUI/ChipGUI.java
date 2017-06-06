package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ChipGUI {

	private JFrame frame;
	private JLabel lblCHF;
	
	private int settedMoney = 0;
	
	public void updateMoney(){
		lblCHF.setText("CHF " + settedMoney + ".-");
	}
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChipGUI window = new ChipGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ChipGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(204, 204, 204));
		frame.setBounds(100, 100, 640, 360);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(102, 102, 102));
		panel.setBounds(200, 70, 350, 180);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		lblCHF = new JLabel("CHF " + settedMoney + ".-");
		lblCHF.setHorizontalAlignment(SwingConstants.CENTER);
		lblCHF.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblCHF.setForeground(new Color(204, 204, 204));
		lblCHF.setBounds(10, 11, 330, 97);
		panel.add(lblCHF);
		
		JButton btnCHF25 = new JButton("CHF 25");
		btnCHF25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnCHF25){
					settedMoney += 25; 
					updateMoney();
				}
			}
		});
		
		btnCHF25.setBounds(10, 119, 100, 50);
		panel.add(btnCHF25);
		btnCHF25.setForeground(new Color(102, 102, 102));
		btnCHF25.setFont(new Font("Tahoma", Font.PLAIN, 17));
		
		JButton btnCHF250 = new JButton("CHF 250");
		btnCHF250.setForeground(new Color(102, 102, 102));
		btnCHF250.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnCHF250.setBounds(236, 119, 100, 50);
		btnCHF250.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnCHF250){
					settedMoney += 250; 
					updateMoney();
				}
			}
		});
		panel.add(btnCHF250);
		
		JButton btnCHF100 = new JButton("CHF 100");
		btnCHF100.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnCHF100){
					settedMoney += 100; 
					updateMoney();
				}
			}
		});
		btnCHF100.setForeground(new Color(102, 102, 102));
		btnCHF100.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnCHF100.setBounds(123, 119, 100, 50);
		panel.add(btnCHF100);
		
		JButton btnReset = new JButton("Reset");
		btnReset.setForeground(new Color(102, 102, 102));
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnReset.setBounds(30, 70, 130, 50);
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnReset){
					settedMoney = 0; 
					updateMoney();
				}
			}
		});
		frame.getContentPane().add(btnReset);
		
		JButton btnOk = new JButton("OK");
		btnOk.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnOk.setForeground(new Color(102, 102, 102));
		btnOk.setBounds(30, 200, 130, 50);
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnOk){
					
				}
			}
		});
		frame.getContentPane().add(btnOk);
		
		
		
		
	
		frame.setVisible(true);
	}
}

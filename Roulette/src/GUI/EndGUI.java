package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;

public class EndGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EndGUI window = new EndGUI();
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
	public EndGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 640, 360);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblSpieler = new JLabel("Spieler XYZ hat gewonnen!");
		lblSpieler.setHorizontalAlignment(SwingConstants.CENTER);
		lblSpieler.setForeground(new Color(102, 102, 102));
		lblSpieler.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblSpieler.setBounds(70, 53, 500, 100);
		frame.getContentPane().add(lblSpieler);
		
		JLabel lblEndbetrag = new JLabel("Endbetrag: CHF 777.-");
		lblEndbetrag.setHorizontalAlignment(SwingConstants.CENTER);
		lblEndbetrag.setForeground(new Color(102, 102, 102));
		lblEndbetrag.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblEndbetrag.setBounds(70, 164, 500, 100);
		frame.getContentPane().add(lblEndbetrag);
	}

}

package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.border.BevelBorder;

public class StartGUI implements ActionListener{

	private JFrame frame;
	private JTextField txtName;
	private JButton btnStart;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartGUI window = new StartGUI();
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
	public StartGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(51, 102, 0));
		frame.getContentPane().setLayout(null);
		
		txtName = new JTextField();
		txtName.setForeground(new Color(255, 255, 255));
		txtName.setHorizontalAlignment(SwingConstants.CENTER);
		txtName.setText("Name");
		txtName.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtName.setBackground(new Color(153, 0, 0));
		txtName.setBounds(350, 200, 300, 50);
		frame.getContentPane().add(txtName);
		txtName.setColumns(10);
		
<<<<<<< HEAD
		btnStart = new JButton("Starten");
		btnStart.setBackground(new Color(255, 255, 255));
		btnStart.setForeground(new Color(0, 0, 0));
=======
		JButton btnStart = new JButton("Starten");
		btnStart.setBackground(new Color(0, 0, 0));
		btnStart.setForeground(Color.WHITE);
>>>>>>> branch 'master' of https://github.com/nicolarichli/Roulette.git
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnStart.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnStart.setBounds(350, 300, 300, 50);
		frame.getContentPane().add(btnStart);
		
		JLabel lblTitel = new JLabel("Roulette de ToNi");
		lblTitel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 204, 0), new Color(255, 204, 0), new Color(255, 204, 0), new Color(255, 204, 0)));
		lblTitel.setBackground(new Color(255, 204, 0));
		lblTitel.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitel.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblTitel.setForeground(new Color(255, 204, 0));
		lblTitel.setBounds(250, 75, 500, 50);
		frame.getContentPane().add(lblTitel);
		frame.setBounds(100, 100, 1000, 563);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnStart){
			System.out.println("funkt");
			GameGUI gameGUI = new GameGUI();
		}
	}
}

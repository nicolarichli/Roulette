package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTree;
import javax.swing.border.BevelBorder;

public class GameGUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameGUI window = new GameGUI();
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
	public GameGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(153, 153, 153));
		frame.setBounds(100, 100, 1000, 563);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 102, 0));
		panel.setBounds(10, 11, 964, 440);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lbl0 = new JLabel("0");
		lbl0.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl0.setHorizontalAlignment(SwingConstants.CENTER);
		lbl0.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl0.setForeground(new Color(255, 204, 0));
		lbl0.setBackground(new Color(0, 0, 0));
		lbl0.setBounds(22, 100, 65, 195);
		panel.add(lbl0);
		
		JLabel lbl3 = new JLabel("3");
		lbl3.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl3.setOpaque(true);
		lbl3.setBackground(new Color(153, 0, 0));
		lbl3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setForeground(new Color(255, 204, 0));
		lbl3.setBounds(87, 100, 65, 65);
		panel.add(lbl3);
		
		JLabel lbl1 = new JLabel("1");
		lbl1.setOpaque(true);
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setForeground(new Color(255, 204, 0));
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl1.setBackground(new Color(153, 0, 0));
		lbl1.setBounds(87, 230, 65, 65);
		panel.add(lbl1);
		
		JLabel lbl2 = new JLabel("2");
		lbl2.setOpaque(true);
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setForeground(new Color(255, 204, 0));
		lbl2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl2.setBorder(null);
		lbl2.setBackground(new Color(0, 0, 0));
		lbl2.setBounds(87, 165, 65, 65);
		panel.add(lbl2);
		
		JLabel lbl5 = new JLabel("5");
		lbl5.setOpaque(true);
		lbl5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl5.setForeground(new Color(255, 204, 0));
		lbl5.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl5.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl5.setBackground(new Color(153, 0, 0));
		lbl5.setBounds(152, 165, 65, 65);
		panel.add(lbl5);
		
		JLabel lbl4 = new JLabel("4");
		lbl4.setOpaque(true);
		lbl4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4.setForeground(new Color(255, 204, 0));
		lbl4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl4.setBorder(null);
		lbl4.setBackground(Color.BLACK);
		lbl4.setBounds(152, 230, 65, 65);
		panel.add(lbl4);
		
		JLabel lbl6 = new JLabel("6");
		lbl6.setOpaque(true);
		lbl6.setHorizontalAlignment(SwingConstants.CENTER);
		lbl6.setForeground(new Color(255, 204, 0));
		lbl6.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl6.setBorder(null);
		lbl6.setBackground(Color.BLACK);
		lbl6.setBounds(152, 100, 65, 65);
		panel.add(lbl6);
		
		JLabel lbl10 = new JLabel("10");
		lbl10.setOpaque(true);
		lbl10.setHorizontalAlignment(SwingConstants.CENTER);
		lbl10.setForeground(new Color(255, 204, 0));
		lbl10.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl10.setBorder(null);
		lbl10.setBackground(Color.BLACK);
		lbl10.setBounds(282, 230, 65, 65);
		panel.add(lbl10);
		
		JLabel lbl7 = new JLabel("7");
		lbl7.setOpaque(true);
		lbl7.setHorizontalAlignment(SwingConstants.CENTER);
		lbl7.setForeground(new Color(255, 204, 0));
		lbl7.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl7.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl7.setBackground(new Color(153, 0, 0));
		lbl7.setBounds(217, 230, 65, 65);
		panel.add(lbl7);
		
		JLabel lbl8 = new JLabel("8");
		lbl8.setOpaque(true);
		lbl8.setHorizontalAlignment(SwingConstants.CENTER);
		lbl8.setForeground(new Color(255, 204, 0));
		lbl8.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl8.setBorder(null);
		lbl8.setBackground(Color.BLACK);
		lbl8.setBounds(217, 165, 65, 65);
		panel.add(lbl8);
		
		JLabel lbl11 = new JLabel("11");
		lbl11.setOpaque(true);
		lbl11.setHorizontalAlignment(SwingConstants.CENTER);
		lbl11.setForeground(new Color(255, 204, 0));
		lbl11.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl11.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl11.setBackground(new Color(153, 0, 0));
		lbl11.setBounds(282, 165, 65, 65);
		panel.add(lbl11);
		
		JLabel label_6 = new JLabel("12");
		label_6.setOpaque(true);
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setForeground(new Color(255, 204, 0));
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_6.setBorder(null);
		label_6.setBackground(Color.BLACK);
		label_6.setBounds(282, 100, 65, 65);
		panel.add(label_6);
		
		JLabel lbl9 = new JLabel("9");
		lbl9.setOpaque(true);
		lbl9.setHorizontalAlignment(SwingConstants.CENTER);
		lbl9.setForeground(new Color(255, 204, 0));
		lbl9.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl9.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl9.setBackground(new Color(153, 0, 0));
		lbl9.setBounds(217, 100, 65, 65);
		panel.add(lbl9);
		
		JLabel lbl16 = new JLabel("16");
		lbl16.setOpaque(true);
		lbl16.setHorizontalAlignment(SwingConstants.CENTER);
		lbl16.setForeground(new Color(255, 204, 0));
		lbl16.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl16.setBorder(null);
		lbl16.setBackground(Color.BLACK);
		lbl16.setBounds(412, 230, 65, 65);
		panel.add(lbl16);
		
		JLabel lbl13 = new JLabel("13");
		lbl13.setOpaque(true);
		lbl13.setHorizontalAlignment(SwingConstants.CENTER);
		lbl13.setForeground(new Color(255, 204, 0));
		lbl13.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl13.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl13.setBackground(new Color(153, 0, 0));
		lbl13.setBounds(347, 230, 65, 65);
		panel.add(lbl13);
		
		JLabel lbl14 = new JLabel("14");
		lbl14.setOpaque(true);
		lbl14.setHorizontalAlignment(SwingConstants.CENTER);
		lbl14.setForeground(new Color(255, 204, 0));
		lbl14.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl14.setBorder(null);
		lbl14.setBackground(Color.BLACK);
		lbl14.setBounds(347, 165, 65, 65);
		panel.add(lbl14);
		
		JLabel lbl17 = new JLabel("17");
		lbl17.setOpaque(true);
		lbl17.setHorizontalAlignment(SwingConstants.CENTER);
		lbl17.setForeground(new Color(255, 204, 0));
		lbl17.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl17.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl17.setBackground(new Color(153, 0, 0));
		lbl17.setBounds(412, 165, 65, 65);
		panel.add(lbl17);
		
		JLabel lbl18 = new JLabel("18");
		lbl18.setOpaque(true);
		lbl18.setHorizontalAlignment(SwingConstants.CENTER);
		lbl18.setForeground(new Color(255, 204, 0));
		lbl18.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl18.setBorder(null);
		lbl18.setBackground(Color.BLACK);
		lbl18.setBounds(412, 100, 65, 65);
		panel.add(lbl18);
		
		JLabel lbl15 = new JLabel("15");
		lbl15.setOpaque(true);
		lbl15.setHorizontalAlignment(SwingConstants.CENTER);
		lbl15.setForeground(new Color(255, 204, 0));
		lbl15.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl15.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl15.setBackground(new Color(153, 0, 0));
		lbl15.setBounds(347, 100, 65, 65);
		panel.add(lbl15);
		
		JLabel label = new JLabel("16");
		label.setOpaque(true);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setForeground(new Color(255, 204, 0));
		label.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label.setBorder(null);
		label.setBackground(Color.BLACK);
		label.setBounds(802, 230, 65, 65);
		panel.add(label);
		
		JLabel label_1 = new JLabel("13");
		label_1.setOpaque(true);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setForeground(new Color(255, 204, 0));
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		label_1.setBackground(new Color(153, 0, 0));
		label_1.setBounds(737, 230, 65, 65);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("10");
		label_2.setOpaque(true);
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setForeground(new Color(255, 204, 0));
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_2.setBorder(null);
		label_2.setBackground(Color.BLACK);
		label_2.setBounds(672, 230, 65, 65);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("7");
		label_3.setOpaque(true);
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setForeground(new Color(255, 204, 0));
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_3.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		label_3.setBackground(new Color(153, 0, 0));
		label_3.setBounds(607, 230, 65, 65);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("4");
		label_4.setOpaque(true);
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setForeground(new Color(255, 204, 0));
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_4.setBorder(null);
		label_4.setBackground(Color.BLACK);
		label_4.setBounds(542, 230, 65, 65);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("1");
		label_5.setOpaque(true);
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setForeground(new Color(255, 204, 0));
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_5.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		label_5.setBackground(new Color(153, 0, 0));
		label_5.setBounds(477, 230, 65, 65);
		panel.add(label_5);
		
		JLabel label_7 = new JLabel("2");
		label_7.setOpaque(true);
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setForeground(new Color(255, 204, 0));
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_7.setBorder(null);
		label_7.setBackground(Color.BLACK);
		label_7.setBounds(477, 165, 65, 65);
		panel.add(label_7);
		
		JLabel label_8 = new JLabel("3");
		label_8.setOpaque(true);
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setForeground(new Color(255, 204, 0));
		label_8.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_8.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		label_8.setBackground(new Color(153, 0, 0));
		label_8.setBounds(477, 100, 65, 65);
		panel.add(label_8);
		
		JLabel label_9 = new JLabel("6");
		label_9.setOpaque(true);
		label_9.setHorizontalAlignment(SwingConstants.CENTER);
		label_9.setForeground(new Color(255, 204, 0));
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_9.setBorder(null);
		label_9.setBackground(Color.BLACK);
		label_9.setBounds(542, 100, 65, 65);
		panel.add(label_9);
		
		JLabel label_10 = new JLabel("5");
		label_10.setOpaque(true);
		label_10.setHorizontalAlignment(SwingConstants.CENTER);
		label_10.setForeground(new Color(255, 204, 0));
		label_10.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_10.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		label_10.setBackground(new Color(153, 0, 0));
		label_10.setBounds(542, 165, 65, 65);
		panel.add(label_10);
		
		JLabel label_11 = new JLabel("8");
		label_11.setOpaque(true);
		label_11.setHorizontalAlignment(SwingConstants.CENTER);
		label_11.setForeground(new Color(255, 204, 0));
		label_11.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_11.setBorder(null);
		label_11.setBackground(Color.BLACK);
		label_11.setBounds(607, 165, 65, 65);
		panel.add(label_11);
		
		JLabel label_12 = new JLabel("9");
		label_12.setOpaque(true);
		label_12.setHorizontalAlignment(SwingConstants.CENTER);
		label_12.setForeground(new Color(255, 204, 0));
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_12.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		label_12.setBackground(new Color(153, 0, 0));
		label_12.setBounds(607, 100, 65, 65);
		panel.add(label_12);
		
		JLabel label_13 = new JLabel("12");
		label_13.setOpaque(true);
		label_13.setHorizontalAlignment(SwingConstants.CENTER);
		label_13.setForeground(new Color(255, 204, 0));
		label_13.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_13.setBorder(null);
		label_13.setBackground(Color.BLACK);
		label_13.setBounds(672, 100, 65, 65);
		panel.add(label_13);
		
		JLabel label_14 = new JLabel("11");
		label_14.setOpaque(true);
		label_14.setHorizontalAlignment(SwingConstants.CENTER);
		label_14.setForeground(new Color(255, 204, 0));
		label_14.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_14.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		label_14.setBackground(new Color(153, 0, 0));
		label_14.setBounds(672, 165, 65, 65);
		panel.add(label_14);
		
		JLabel label_15 = new JLabel("14");
		label_15.setOpaque(true);
		label_15.setHorizontalAlignment(SwingConstants.CENTER);
		label_15.setForeground(new Color(255, 204, 0));
		label_15.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_15.setBorder(null);
		label_15.setBackground(Color.BLACK);
		label_15.setBounds(737, 165, 65, 65);
		panel.add(label_15);
		
		JLabel label_16 = new JLabel("17");
		label_16.setOpaque(true);
		label_16.setHorizontalAlignment(SwingConstants.CENTER);
		label_16.setForeground(new Color(255, 204, 0));
		label_16.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_16.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		label_16.setBackground(new Color(153, 0, 0));
		label_16.setBounds(802, 165, 65, 65);
		panel.add(label_16);
		
		JLabel label_17 = new JLabel("18");
		label_17.setOpaque(true);
		label_17.setHorizontalAlignment(SwingConstants.CENTER);
		label_17.setForeground(new Color(255, 204, 0));
		label_17.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_17.setBorder(null);
		label_17.setBackground(Color.BLACK);
		label_17.setBounds(802, 100, 65, 65);
		panel.add(label_17);
		
		JLabel label_18 = new JLabel("15");
		label_18.setOpaque(true);
		label_18.setHorizontalAlignment(SwingConstants.CENTER);
		label_18.setForeground(new Color(255, 204, 0));
		label_18.setFont(new Font("Tahoma", Font.PLAIN, 22));
		label_18.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		label_18.setBackground(new Color(153, 0, 0));
		label_18.setBounds(737, 100, 65, 65);
		panel.add(label_18);
		
		JLabel lblName = new JLabel("Playername");
		lblName.setBackground(new Color(0, 0, 0));
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblName.setForeground(new Color(255, 255, 255));
		lblName.setBounds(10, 459, 150, 30);
		frame.getContentPane().add(lblName);
		
		JLabel lblMoney = new JLabel("500.-");
		lblMoney.setForeground(new Color(255, 255, 255));
		lblMoney.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMoney.setBounds(200, 459, 150, 30);
		frame.getContentPane().add(lblMoney);
		
		JButton btnNewButton = new JButton("Bereit");
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(675, 459, 150, 30);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblRundeXVon = new JLabel("Runde X von 10");
		lblRundeXVon.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRundeXVon.setForeground(new Color(255, 255, 255));
		lblRundeXVon.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRundeXVon.setBounds(824, 459, 150, 30);
		frame.getContentPane().add(lblRundeXVon);
	}
}

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
import javax.swing.border.BevelBorder;

public class GameGUI implements ActionListener{

	JFrame frame;
	private JPanel panel;
	private JLabel lbl0;
	private JLabel lbl1;
	private JLabel lbl2;
	private JLabel lbl3;
	private JLabel lbl4;
	private JLabel lbl5;
	private JLabel lbl6;
	private JLabel lbl7;
	private JLabel lbl8;
	private JLabel lbl9;
	private JLabel lbl10;
	private JLabel lbl11;
	private JLabel lbl12;
	private JLabel lbl13;
	private JLabel lbl14;
	private JLabel lbl15;
	private JLabel lbl16;
	private JLabel lbl17;
	private JLabel lbl18;
	private JLabel lbl19;
	private JLabel lbl20;
	private JLabel lbl21;
	private JLabel lbl22;
	private JLabel lbl23;
	private JLabel lbl24;
	private JLabel lbl25;
	private JLabel lbl26;
	private JLabel lbl27;
	private JLabel lbl28;
	private JLabel lbl29;
	private JLabel lbl30;
	private JLabel lbl31;
	private JLabel lbl32;
	private JLabel lbl33;
	private JLabel lbl34;
	private JLabel lbl35;
	private JLabel lbl36;
	private JLabel lblRot;
	private JLabel lblSchwarz;
	private JLabel lblGerade;
	private JLabel lblUngerade;
	private JLabel lblName;
	private JLabel lblMoney;
	private JButton btnBereit;
	private JLabel lblRunde;
	
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
		
		panel = new JPanel();
		panel.setBackground(new Color(51, 102, 0));
		panel.setBounds(10, 11, 964, 440);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		lbl0 = new JLabel("0");
		lbl0.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl0.setHorizontalAlignment(SwingConstants.CENTER);
		lbl0.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl0.setForeground(new Color(255, 204, 0));
		lbl0.setBackground(new Color(0, 0, 0));
		lbl0.setBounds(22, 100, 65, 195);
		panel.add(lbl0);
		
		lbl3 = new JLabel("3");
		lbl3.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl3.setOpaque(true);
		lbl3.setBackground(new Color(153, 0, 0));
		lbl3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setForeground(new Color(255, 204, 0));
		lbl3.setBounds(87, 100, 65, 65);
		panel.add(lbl3);
		
		lbl1 = new JLabel("1");
		lbl1.setOpaque(true);
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setForeground(new Color(255, 204, 0));
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl1.setBackground(new Color(153, 0, 0));
		lbl1.setBounds(87, 230, 65, 65);
		panel.add(lbl1);
		
		lbl2 = new JLabel("2");
		lbl2.setOpaque(true);
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setForeground(new Color(255, 204, 0));
		lbl2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl2.setBorder(null);
		lbl2.setBackground(new Color(0, 0, 0));
		lbl2.setBounds(87, 165, 65, 65);
		panel.add(lbl2);
		
		lbl5 = new JLabel("5");
		lbl5.setOpaque(true);
		lbl5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl5.setForeground(new Color(255, 204, 0));
		lbl5.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl5.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl5.setBackground(new Color(153, 0, 0));
		lbl5.setBounds(152, 165, 65, 65);
		panel.add(lbl5);
		
		lbl4 = new JLabel("4");
		lbl4.setOpaque(true);
		lbl4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4.setForeground(new Color(255, 204, 0));
		lbl4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl4.setBorder(null);
		lbl4.setBackground(Color.BLACK);
		lbl4.setBounds(152, 230, 65, 65);
		panel.add(lbl4);
		
		lbl6 = new JLabel("6");
		lbl6.setOpaque(true);
		lbl6.setHorizontalAlignment(SwingConstants.CENTER);
		lbl6.setForeground(new Color(255, 204, 0));
		lbl6.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl6.setBorder(null);
		lbl6.setBackground(Color.BLACK);
		lbl6.setBounds(152, 100, 65, 65);
		panel.add(lbl6);
		
		lbl10 = new JLabel("10");
		lbl10.setOpaque(true);
		lbl10.setHorizontalAlignment(SwingConstants.CENTER);
		lbl10.setForeground(new Color(255, 204, 0));
		lbl10.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl10.setBorder(null);
		lbl10.setBackground(Color.BLACK);
		lbl10.setBounds(282, 230, 65, 65);
		panel.add(lbl10);
		
		lbl7 = new JLabel("7");
		lbl7.setOpaque(true);
		lbl7.setHorizontalAlignment(SwingConstants.CENTER);
		lbl7.setForeground(new Color(255, 204, 0));
		lbl7.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl7.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl7.setBackground(new Color(153, 0, 0));
		lbl7.setBounds(217, 230, 65, 65);
		panel.add(lbl7);
		
		lbl8 = new JLabel("8");
		lbl8.setOpaque(true);
		lbl8.setHorizontalAlignment(SwingConstants.CENTER);
		lbl8.setForeground(new Color(255, 204, 0));
		lbl8.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl8.setBorder(null);
		lbl8.setBackground(Color.BLACK);
		lbl8.setBounds(217, 165, 65, 65);
		panel.add(lbl8);
		
		lbl11 = new JLabel("11");
		lbl11.setOpaque(true);
		lbl11.setHorizontalAlignment(SwingConstants.CENTER);
		lbl11.setForeground(new Color(255, 204, 0));
		lbl11.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl11.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl11.setBackground(new Color(153, 0, 0));
		lbl11.setBounds(282, 165, 65, 65);
		panel.add(lbl11);
		
		lbl12 = new JLabel("12");
		lbl12.setOpaque(true);
		lbl12.setHorizontalAlignment(SwingConstants.CENTER);
		lbl12.setForeground(new Color(255, 204, 0));
		lbl12.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl12.setBorder(null);
		lbl12.setBackground(Color.BLACK);
		lbl12.setBounds(282, 100, 65, 65);
		panel.add(lbl12);
		
		lbl9 = new JLabel("9");
		lbl9.setOpaque(true);
		lbl9.setHorizontalAlignment(SwingConstants.CENTER);
		lbl9.setForeground(new Color(255, 204, 0));
		lbl9.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl9.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl9.setBackground(new Color(153, 0, 0));
		lbl9.setBounds(217, 100, 65, 65);
		panel.add(lbl9);
		
		lbl16 = new JLabel("16");
		lbl16.setOpaque(true);
		lbl16.setHorizontalAlignment(SwingConstants.CENTER);
		lbl16.setForeground(new Color(255, 204, 0));
		lbl16.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl16.setBorder(null);
		lbl16.setBackground(Color.BLACK);
		lbl16.setBounds(412, 230, 65, 65);
		panel.add(lbl16);
		
		lbl13 = new JLabel("13");
		lbl13.setOpaque(true);
		lbl13.setHorizontalAlignment(SwingConstants.CENTER);
		lbl13.setForeground(new Color(255, 204, 0));
		lbl13.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl13.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl13.setBackground(new Color(153, 0, 0));
		lbl13.setBounds(347, 230, 65, 65);
		panel.add(lbl13);
		
		lbl14 = new JLabel("14");
		lbl14.setOpaque(true);
		lbl14.setHorizontalAlignment(SwingConstants.CENTER);
		lbl14.setForeground(new Color(255, 204, 0));
		lbl14.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl14.setBorder(null);
		lbl14.setBackground(Color.BLACK);
		lbl14.setBounds(347, 165, 65, 65);
		panel.add(lbl14);
		
		lbl17 = new JLabel("17");
		lbl17.setOpaque(true);
		lbl17.setHorizontalAlignment(SwingConstants.CENTER);
		lbl17.setForeground(new Color(255, 204, 0));
		lbl17.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl17.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl17.setBackground(new Color(153, 0, 0));
		lbl17.setBounds(412, 165, 65, 65);
		panel.add(lbl17);
		
		lbl18 = new JLabel("18");
		lbl18.setOpaque(true);
		lbl18.setHorizontalAlignment(SwingConstants.CENTER);
		lbl18.setForeground(new Color(255, 204, 0));
		lbl18.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl18.setBorder(null);
		lbl18.setBackground(Color.BLACK);
		lbl18.setBounds(412, 100, 65, 65);
		panel.add(lbl18);
		
		lbl15 = new JLabel("15");
		lbl15.setOpaque(true);
		lbl15.setHorizontalAlignment(SwingConstants.CENTER);
		lbl15.setForeground(new Color(255, 204, 0));
		lbl15.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl15.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl15.setBackground(new Color(153, 0, 0));
		lbl15.setBounds(347, 100, 65, 65);
		panel.add(lbl15);
		
		lbl34 = new JLabel("34");
		lbl34.setOpaque(true);
		lbl34.setHorizontalAlignment(SwingConstants.CENTER);
		lbl34.setForeground(new Color(255, 204, 0));
		lbl34.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl34.setBorder(null);
		lbl34.setBackground(Color.BLACK);
		lbl34.setBounds(802, 230, 65, 65);
		panel.add(lbl34);
		
		lbl31 = new JLabel("31");
		lbl31.setOpaque(true);
		lbl31.setHorizontalAlignment(SwingConstants.CENTER);
		lbl31.setForeground(new Color(255, 204, 0));
		lbl31.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl31.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl31.setBackground(new Color(153, 0, 0));
		lbl31.setBounds(737, 230, 65, 65);
		panel.add(lbl31);
		
		lbl28 = new JLabel("28");
		lbl28.setOpaque(true);
		lbl28.setHorizontalAlignment(SwingConstants.CENTER);
		lbl28.setForeground(new Color(255, 204, 0));
		lbl28.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl28.setBorder(null);
		lbl28.setBackground(Color.BLACK);
		lbl28.setBounds(672, 230, 65, 65);
		panel.add(lbl28);
		
		lbl25 = new JLabel("25");
		lbl25.setOpaque(true);
		lbl25.setHorizontalAlignment(SwingConstants.CENTER);
		lbl25.setForeground(new Color(255, 204, 0));
		lbl25.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl25.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl25.setBackground(new Color(153, 0, 0));
		lbl25.setBounds(607, 230, 65, 65);
		panel.add(lbl25);
		
		lbl22 = new JLabel("22");
		lbl22.setOpaque(true);
		lbl22.setHorizontalAlignment(SwingConstants.CENTER);
		lbl22.setForeground(new Color(255, 204, 0));
		lbl22.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl22.setBorder(null);
		lbl22.setBackground(Color.BLACK);
		lbl22.setBounds(542, 230, 65, 65);
		panel.add(lbl22);
		
		lbl19 = new JLabel("19");
		lbl19.setOpaque(true);
		lbl19.setHorizontalAlignment(SwingConstants.CENTER);
		lbl19.setForeground(new Color(255, 204, 0));
		lbl19.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl19.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl19.setBackground(new Color(153, 0, 0));
		lbl19.setBounds(477, 230, 65, 65);
		panel.add(lbl19);
		
		lbl20 = new JLabel("20");
		lbl20.setOpaque(true);
		lbl20.setHorizontalAlignment(SwingConstants.CENTER);
		lbl20.setForeground(new Color(255, 204, 0));
		lbl20.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl20.setBorder(null);
		lbl20.setBackground(Color.BLACK);
		lbl20.setBounds(477, 165, 65, 65);
		panel.add(lbl20);
		
		lbl21 = new JLabel("21");
		lbl21.setOpaque(true);
		lbl21.setHorizontalAlignment(SwingConstants.CENTER);
		lbl21.setForeground(new Color(255, 204, 0));
		lbl21.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl21.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl21.setBackground(new Color(153, 0, 0));
		lbl21.setBounds(477, 100, 65, 65);
		panel.add(lbl21);
		
		lbl24 = new JLabel("24");
		lbl24.setOpaque(true);
		lbl24.setHorizontalAlignment(SwingConstants.CENTER);
		lbl24.setForeground(new Color(255, 204, 0));
		lbl24.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl24.setBorder(null);
		lbl24.setBackground(Color.BLACK);
		lbl24.setBounds(542, 100, 65, 65);
		panel.add(lbl24);
		
		lbl23 = new JLabel("23");
		lbl23.setOpaque(true);
		lbl23.setHorizontalAlignment(SwingConstants.CENTER);
		lbl23.setForeground(new Color(255, 204, 0));
		lbl23.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl23.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl23.setBackground(new Color(153, 0, 0));
		lbl23.setBounds(542, 165, 65, 65);
		panel.add(lbl23);
		
		lbl26 = new JLabel("26");
		lbl26.setOpaque(true);
		lbl26.setHorizontalAlignment(SwingConstants.CENTER);
		lbl26.setForeground(new Color(255, 204, 0));
		lbl26.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl26.setBorder(null);
		lbl26.setBackground(Color.BLACK);
		lbl26.setBounds(607, 165, 65, 65);
		panel.add(lbl26);
		
		lbl27 = new JLabel("27");
		lbl27.setOpaque(true);
		lbl27.setHorizontalAlignment(SwingConstants.CENTER);
		lbl27.setForeground(new Color(255, 204, 0));
		lbl27.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl27.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl27.setBackground(new Color(153, 0, 0));
		lbl27.setBounds(607, 100, 65, 65);
		panel.add(lbl27);
		
		lbl30 = new JLabel("30");
		lbl30.setOpaque(true);
		lbl30.setHorizontalAlignment(SwingConstants.CENTER);
		lbl30.setForeground(new Color(255, 204, 0));
		lbl30.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl30.setBorder(null);
		lbl30.setBackground(Color.BLACK);
		lbl30.setBounds(672, 100, 65, 65);
		panel.add(lbl30);
		
		lbl29 = new JLabel("29");
		lbl29.setOpaque(true);
		lbl29.setHorizontalAlignment(SwingConstants.CENTER);
		lbl29.setForeground(new Color(255, 204, 0));
		lbl29.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl29.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl29.setBackground(new Color(153, 0, 0));
		lbl29.setBounds(672, 165, 65, 65);
		panel.add(lbl29);
		
		lbl32 = new JLabel("32");
		lbl32.setOpaque(true);
		lbl32.setHorizontalAlignment(SwingConstants.CENTER);
		lbl32.setForeground(new Color(255, 204, 0));
		lbl32.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl32.setBorder(null);
		lbl32.setBackground(Color.BLACK);
		lbl32.setBounds(737, 165, 65, 65);
		panel.add(lbl32);
		
		lbl35 = new JLabel("35");
		lbl35.setOpaque(true);
		lbl35.setHorizontalAlignment(SwingConstants.CENTER);
		lbl35.setForeground(new Color(255, 204, 0));
		lbl35.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl35.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl35.setBackground(new Color(153, 0, 0));
		lbl35.setBounds(802, 165, 65, 65);
		panel.add(lbl35);
		
		lbl36 = new JLabel("36");
		lbl36.setOpaque(true);
		lbl36.setHorizontalAlignment(SwingConstants.CENTER);
		lbl36.setForeground(new Color(255, 204, 0));
		lbl36.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl36.setBorder(null);
		lbl36.setBackground(Color.BLACK);
		lbl36.setBounds(802, 100, 65, 65);
		panel.add(lbl36);
		
		lbl33 = new JLabel("33");
		lbl33.setOpaque(true);
		lbl33.setHorizontalAlignment(SwingConstants.CENTER);
		lbl33.setForeground(new Color(255, 204, 0));
		lbl33.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl33.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl33.setBackground(new Color(153, 0, 0));
		lbl33.setBounds(737, 100, 65, 65);
		panel.add(lbl33);
		
		lblRot = new JLabel("rot");
		lblRot.setOpaque(true);
		lblRot.setHorizontalAlignment(SwingConstants.CENTER);
		lblRot.setForeground(new Color(255, 204, 0));
		lblRot.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblRot.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lblRot.setBackground(new Color(153, 0, 0));
		lblRot.setBounds(889, 100, 65, 65);
		panel.add(lblRot);
		
		lblSchwarz = new JLabel("Schwarz");
		lblSchwarz.setOpaque(true);
		lblSchwarz.setHorizontalAlignment(SwingConstants.CENTER);
		lblSchwarz.setForeground(new Color(255, 204, 0));
		lblSchwarz.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblSchwarz.setBorder(null);
		lblSchwarz.setBackground(Color.BLACK);
		lblSchwarz.setBounds(889, 230, 65, 65);
		panel.add(lblSchwarz);
		
		lblGerade = new JLabel("Gerade");
		lblGerade.setHorizontalAlignment(SwingConstants.CENTER);
		lblGerade.setForeground(new Color(255, 204, 0));
		lblGerade.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGerade.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lblGerade.setBackground(Color.BLACK);
		lblGerade.setBounds(152, 310, 260, 65);
		panel.add(lblGerade);
		
		lblUngerade = new JLabel("Ungerade");
		lblUngerade.setHorizontalAlignment(SwingConstants.CENTER);
		lblUngerade.setForeground(new Color(255, 204, 0));
		lblUngerade.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUngerade.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lblUngerade.setBackground(Color.BLACK);
		lblUngerade.setBounds(542, 310, 260, 65);
		panel.add(lblUngerade);
		
		lblName = new JLabel("Playername");
		lblName.setBackground(new Color(0, 0, 0));
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblName.setForeground(new Color(255, 255, 255));
		lblName.setBounds(10, 459, 150, 30);
		frame.getContentPane().add(lblName);
		
		lblMoney = new JLabel("500.-");
		lblMoney.setForeground(new Color(255, 255, 255));
		lblMoney.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMoney.setBounds(200, 459, 150, 30);
		frame.getContentPane().add(lblMoney);
		btnBereit = new JButton("Bereit");
		btnBereit.setForeground(Color.WHITE);
		btnBereit.setBackground(new Color(0, 0, 0));
		btnBereit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBereit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnBereit.setBounds(675, 459, 150, 30);
		frame.getContentPane().add(btnBereit);
		
		lblRunde = new JLabel("Runde X von 10");
		lblRunde.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRunde.setForeground(new Color(255, 255, 255));
		lblRunde.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRunde.setBounds(824, 459, 150, 30);
		frame.getContentPane().add(lblRunde);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

}

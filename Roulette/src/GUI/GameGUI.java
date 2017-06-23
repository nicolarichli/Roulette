package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import LOGIC.Chip;
import LOGIC.Field;
import LOGIC.GameControl;
import LOGIC.HalfField;
import LOGIC.NumberField;

public class GameGUI{

	String name;
	GameControl gameControl = new GameControl();
	
	private int random;
	
	
	// JLaels und JButtons werden erstellt
	public JFrame frame;
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

	// Spielername festlegen
	public void setName(String playerName){
		// Spielername wird lokal gespeichert für Namen in GUI
		this.name = playerName;
		// Spielername an gameControl übergeben
		gameControl.setName(name);
		// Name in lblName schreiben
		lblName.setText(name);
	}
	
	// Geld- und Runden-Label aktualisieren
	public void refresh(){
		lblMoney.setText("CHF " + gameControl.getMoney() + ".-");
		lblRunde.setText("Runde " + gameControl.getRound() + " von 10");
	}
	
	// Rahmen reseten von den Feldern
	public void resetBorders(){
		lbl0.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lbl1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lbl2.setBorder(null);
		lbl3.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lbl4.setBorder(null);
		lbl5.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lbl6.setBorder(null);
		lbl7.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lbl8.setBorder(null);
		lbl9.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lbl10.setBorder(null);
		lbl11.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lbl12.setBorder(null);
		lbl13.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lbl14.setBorder(null);
		lbl15.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lbl16.setBorder(null);
		lbl17.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lbl18.setBorder(null);
		lbl19.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lbl20.setBorder(null);
		lbl21.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lbl22.setBorder(null);
		lbl23.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lbl24.setBorder(null);
		lbl25.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lbl26.setBorder(null);
		lbl27.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lbl28.setBorder(null);
		lbl29.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lbl30.setBorder(null);
		lbl31.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lbl32.setBorder(null);
		lbl33.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lbl34.setBorder(null);
		lbl35.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lbl36.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lblGerade.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lblUngerade.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lblSchwarz.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		lblRot.setBorder(BorderFactory.createLineBorder(Color.BLACK));
	}
	
	// Konstruktor
	public GameGUI(){
		// initialize wird aufgerufen
		initialize();
		// Startgeld wird gesetzt
		gameControl.setMoney(500);
	}
	
	// Fenster wird initialisiert
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
		lbl0.addMouseListener(new MouseAdapter(){
			// Klick auf Feld
			public void mouseClicked(MouseEvent e){
				// Neues ChipGUI wird initialisiert
				ChipGUI g0 = new ChipGUI(gameControl);
				// Wenn Geld auf Feld gesetzt, wird der Rahen grün
				if (g0.getMoney() != 0){
					lbl0.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}
				// refresh wird aufgerufen
				refresh();
				// Field und Chip wird initialisiert
				Field n0 = new NumberField(0);
				Chip c0 = new Chip(n0, g0.getMoney());
				gameControl.implementField(n0);
				gameControl.implementChip(c0);
			}		
		});
		// Feld dem Panel hinzufügen
		panel.add(lbl0);
		
		lbl3 = new JLabel("3");
		lbl3.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl3.setOpaque(true);
		lbl3.setBackground(new Color(153, 0, 0));
		lbl3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl3.setHorizontalAlignment(SwingConstants.CENTER);
		lbl3.setForeground(new Color(255, 204, 0));
		lbl3.setBounds(87, 100, 65, 65);
		lbl3.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				ChipGUI g3 = new ChipGUI(gameControl);
				if (g3.getMoney() != 0){
					lbl3.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}
				refresh();
				Field n3 = new NumberField(3);
				Chip c3 = new Chip(n3, g3.getMoney());
				gameControl.implementField(n3);
				gameControl.implementChip(c3);
			}		
		});
		panel.add(lbl3);
		
		lbl1 = new JLabel("1");
		lbl1.setOpaque(true);
		lbl1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl1.setForeground(new Color(255, 204, 0));
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl1.setBackground(new Color(153, 0, 0));
		lbl1.setBounds(87, 230, 65, 65);
		lbl1.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				ChipGUI g1 = new ChipGUI(gameControl);
				if (g1.getMoney() != 0){
					lbl1.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}
				refresh();
				Field n1 = new NumberField(1);
				Chip c1 = new Chip(n1, g1.getMoney());
				gameControl.implementField(n1);
				gameControl.implementChip(c1);
			}		
		});
		panel.add(lbl1);
		
		lbl2 = new JLabel("2");
		lbl2.setOpaque(true);
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setForeground(new Color(255, 204, 0));
		lbl2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl2.setBorder(null);
		lbl2.setBackground(new Color(0, 0, 0));
		lbl2.setBounds(87, 165, 65, 65);
		lbl2.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				ChipGUI g2 = new ChipGUI(gameControl);
				if (g2.getMoney() != 0){
					lbl2.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}
				refresh();
				Field n2 = new NumberField(2);
				Chip c2 = new Chip(n2, g2.getMoney());
				gameControl.implementField(n2);
				gameControl.implementChip(c2);
			}		
		});
		panel.add(lbl2);
		
		lbl5 = new JLabel("5");
		lbl5.setOpaque(true);
		lbl5.setHorizontalAlignment(SwingConstants.CENTER);
		lbl5.setForeground(new Color(255, 204, 0));
		lbl5.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl5.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl5.setBackground(new Color(153, 0, 0));
		lbl5.setBounds(152, 165, 65, 65);
		lbl5.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				ChipGUI g5 = new ChipGUI(gameControl);
				if (g5.getMoney() != 0){
					lbl5.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}
				refresh();
				Field n5 = new NumberField(5);
				Chip c5 = new Chip(n5, g5.getMoney());
				gameControl.implementField(n5);
				gameControl.implementChip(c5);
			}		
		});
		panel.add(lbl5);
		
		lbl4 = new JLabel("4");
		lbl4.setOpaque(true);
		lbl4.setHorizontalAlignment(SwingConstants.CENTER);
		lbl4.setForeground(new Color(255, 204, 0));
		lbl4.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl4.setBorder(null);
		lbl4.setBackground(Color.BLACK);
		lbl4.setBounds(152, 230, 65, 65);
		lbl4.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				ChipGUI g4 = new ChipGUI(gameControl);
				if (g4.getMoney() != 0){
					lbl4.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}
				refresh();
				Field n4 = new NumberField(4);
				Chip c4 = new Chip(n4, g4.getMoney());
				gameControl.implementField(n4);
				gameControl.implementChip(c4);
			}		
		});
		panel.add(lbl4);
		
		lbl6 = new JLabel("6");
		lbl6.setOpaque(true);
		lbl6.setHorizontalAlignment(SwingConstants.CENTER);
		lbl6.setForeground(new Color(255, 204, 0));
		lbl6.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl6.setBorder(null);
		lbl6.setBackground(Color.BLACK);
		lbl6.setBounds(152, 100, 65, 65);
		lbl6.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				ChipGUI g6 = new ChipGUI(gameControl);
				if (g6.getMoney() != 0){
					lbl6.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}
				refresh();
				Field n6 = new NumberField(6);
				Chip c6 = new Chip(n6, g6.getMoney());
				gameControl.implementField(n6);
				gameControl.implementChip(c6);
			}		
		});
		panel.add(lbl6);
		
		lbl10 = new JLabel("10");
		lbl10.setOpaque(true);
		lbl10.setHorizontalAlignment(SwingConstants.CENTER);
		lbl10.setForeground(new Color(255, 204, 0));
		lbl10.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl10.setBorder(null);
		lbl10.setBackground(Color.BLACK);
		lbl10.setBounds(282, 230, 65, 65);
		lbl10.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				ChipGUI g10 = new ChipGUI(gameControl);
				if (g10.getMoney() != 0){
					lbl10.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}
				refresh();
				Field n10 = new NumberField(10);
				Chip c10 = new Chip(n10, g10.getMoney());
				gameControl.implementField(n10);
				gameControl.implementChip(c10);
			}		
		});
		panel.add(lbl10);
		
		lbl7 = new JLabel("7");
		lbl7.setOpaque(true);
		lbl7.setHorizontalAlignment(SwingConstants.CENTER);
		lbl7.setForeground(new Color(255, 204, 0));
		lbl7.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl7.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl7.setBackground(new Color(153, 0, 0));
		lbl7.setBounds(217, 230, 65, 65);
		lbl7.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				ChipGUI g7 = new ChipGUI(gameControl);
				if (g7.getMoney() != 0){
					lbl7.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}
				refresh();
				Field n7 = new NumberField(7);
				Chip c7 = new Chip(n7, g7.getMoney());
				gameControl.implementField(n7);
				gameControl.implementChip(c7);
			}		
		});
		panel.add(lbl7);
		
		lbl8 = new JLabel("8");
		lbl8.setOpaque(true);
		lbl8.setHorizontalAlignment(SwingConstants.CENTER);
		lbl8.setForeground(new Color(255, 204, 0));
		lbl8.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl8.setBorder(null);
		lbl8.setBackground(Color.BLACK);
		lbl8.setBounds(217, 165, 65, 65);
		lbl8.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				ChipGUI g8 = new ChipGUI(gameControl);
				if (g8.getMoney() != 0){
					lbl8.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}				refresh();
				Field n8 = new NumberField(8);
				Chip c8 = new Chip(n8, g8.getMoney());
				gameControl.implementField(n8);
				gameControl.implementChip(c8);
			}		
		});
		panel.add(lbl8);
		
		lbl11 = new JLabel("11");
		lbl11.setOpaque(true);
		lbl11.setHorizontalAlignment(SwingConstants.CENTER);
		lbl11.setForeground(new Color(255, 204, 0));
		lbl11.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl11.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl11.setBackground(new Color(153, 0, 0));
		lbl11.setBounds(282, 165, 65, 65);
		lbl11.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				ChipGUI g11 = new ChipGUI(gameControl);
				if (g11.getMoney() != 0){
					lbl11.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}
				refresh();
				Field n11 = new NumberField(11);
				Chip c11 = new Chip(n11, g11.getMoney());
				gameControl.implementField(n11);
				gameControl.implementChip(c11);
			}		
		});
		panel.add(lbl11);
		
		lbl12 = new JLabel("12");
		lbl12.setOpaque(true);
		lbl12.setHorizontalAlignment(SwingConstants.CENTER);
		lbl12.setForeground(new Color(255, 204, 0));
		lbl12.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl12.setBorder(null);
		lbl12.setBackground(Color.BLACK);
		lbl12.setBounds(282, 100, 65, 65);
		lbl12.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				ChipGUI g12 = new ChipGUI(gameControl);
				if (g12.getMoney() != 0){
					lbl12.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}
				refresh();
				Field n12 = new NumberField(12);
				Chip c12 = new Chip(n12, g12.getMoney());
				gameControl.implementField(n12);
				gameControl.implementChip(c12);
			}		
		});
		panel.add(lbl12);
		
		lbl9 = new JLabel("9");
		lbl9.setOpaque(true);
		lbl9.setHorizontalAlignment(SwingConstants.CENTER);
		lbl9.setForeground(new Color(255, 204, 0));
		lbl9.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl9.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl9.setBackground(new Color(153, 0, 0));
		lbl9.setBounds(217, 100, 65, 65);
		lbl9.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				ChipGUI g9 = new ChipGUI(gameControl);
				if (g9.getMoney() != 0){
					lbl9.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}
				refresh();
				Field n9 = new NumberField(12);
				Chip c9 = new Chip(n9, g9.getMoney());
				gameControl.implementField(n9);
				gameControl.implementChip(c9);
			}		
		});
		panel.add(lbl9);
		
		lbl16 = new JLabel("16");
		lbl16.setOpaque(true);
		lbl16.setHorizontalAlignment(SwingConstants.CENTER);
		lbl16.setForeground(new Color(255, 204, 0));
		lbl16.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl16.setBorder(null);
		lbl16.setBackground(Color.BLACK);
		lbl16.setBounds(412, 230, 65, 65);
		lbl16.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				ChipGUI g16 = new ChipGUI(gameControl);
				if (g16.getMoney() != 0){
					lbl16.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}
				refresh();
				Field n16 = new NumberField(16);
				Chip c16 = new Chip(n16, g16.getMoney());
				gameControl.implementField(n16);
				gameControl.implementChip(c16);
			}		
		});
		panel.add(lbl16);
		
		lbl13 = new JLabel("13");
		lbl13.setOpaque(true);
		lbl13.setHorizontalAlignment(SwingConstants.CENTER);
		lbl13.setForeground(new Color(255, 204, 0));
		lbl13.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl13.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl13.setBackground(new Color(153, 0, 0));
		lbl13.setBounds(347, 230, 65, 65);
		lbl13.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				ChipGUI g13 = new ChipGUI(gameControl);
				if (g13.getMoney() != 0){
					lbl13.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}
				refresh();
				Field n13 = new NumberField(13);
				Chip c13 = new Chip(n13, g13.getMoney());
				gameControl.implementField(n13);
				gameControl.implementChip(c13);
			}		
		});
		panel.add(lbl13);
		
		lbl14 = new JLabel("14");
		lbl14.setOpaque(true);
		lbl14.setHorizontalAlignment(SwingConstants.CENTER);
		lbl14.setForeground(new Color(255, 204, 0));
		lbl14.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl14.setBorder(null);
		lbl14.setBackground(Color.BLACK);
		lbl14.setBounds(347, 165, 65, 65);
		lbl14.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				ChipGUI g14 = new ChipGUI(gameControl);
				if (g14.getMoney() != 0){
					lbl14.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}
				refresh();
				Field n14 = new NumberField(14);
				Chip c14 = new Chip(n14, g14.getMoney());
				gameControl.implementField(n14);
				gameControl.implementChip(c14);
			}		
		});
		panel.add(lbl14);
		
		lbl17 = new JLabel("17");
		lbl17.setOpaque(true);
		lbl17.setHorizontalAlignment(SwingConstants.CENTER);
		lbl17.setForeground(new Color(255, 204, 0));
		lbl17.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl17.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl17.setBackground(new Color(153, 0, 0));
		lbl17.setBounds(412, 165, 65, 65);
		lbl17.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				ChipGUI g17 = new ChipGUI(gameControl);
				if (g17.getMoney() != 0){
					lbl17.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}
				refresh();
				Field n17 = new NumberField(17);
				Chip c17 = new Chip(n17, g17.getMoney());
				gameControl.implementField(n17);
				gameControl.implementChip(c17);
			}		
		});
		panel.add(lbl17);
		
		lbl18 = new JLabel("18");
		lbl18.setOpaque(true);
		lbl18.setHorizontalAlignment(SwingConstants.CENTER);
		lbl18.setForeground(new Color(255, 204, 0));
		lbl18.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl18.setBorder(null);
		lbl18.setBackground(Color.BLACK);
		lbl18.setBounds(412, 100, 65, 65);
		lbl18.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				ChipGUI g18 = new ChipGUI(gameControl);
				if (g18.getMoney() != 0){
					lbl18.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}
				refresh();
				Field n18 = new NumberField(18);
				Chip c18 = new Chip(n18, g18.getMoney());
				gameControl.implementField(n18);
				gameControl.implementChip(c18);
			}		
		});
		panel.add(lbl18);
		
		lbl15 = new JLabel("15");
		lbl15.setOpaque(true);
		lbl15.setHorizontalAlignment(SwingConstants.CENTER);
		lbl15.setForeground(new Color(255, 204, 0));
		lbl15.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl15.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl15.setBackground(new Color(153, 0, 0));
		lbl15.setBounds(347, 100, 65, 65);
		lbl15.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				ChipGUI g15 = new ChipGUI(gameControl);
				if (g15.getMoney() != 0){
					lbl15.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}
				refresh();
				Field n15 = new NumberField(15);
				Chip c15 = new Chip(n15, g15.getMoney());
				gameControl.implementField(n15);
				gameControl.implementChip(c15);
			}		
		});
		panel.add(lbl15);
		
		lbl34 = new JLabel("34");
		lbl34.setOpaque(true);
		lbl34.setHorizontalAlignment(SwingConstants.CENTER);
		lbl34.setForeground(new Color(255, 204, 0));
		lbl34.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl34.setBorder(null);
		lbl34.setBackground(Color.BLACK);
		lbl34.setBounds(802, 230, 65, 65);
		lbl34.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				ChipGUI g34 = new ChipGUI(gameControl);
				if (g34.getMoney() != 0){
					lbl34.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}
				refresh();
				Field n34 = new NumberField(34);
				Chip c34 = new Chip(n34, g34.getMoney());
				gameControl.implementField(n34);
				gameControl.implementChip(c34);
			}		
		});
		panel.add(lbl34);
		
		lbl31 = new JLabel("31");
		lbl31.setOpaque(true);
		lbl31.setHorizontalAlignment(SwingConstants.CENTER);
		lbl31.setForeground(new Color(255, 204, 0));
		lbl31.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl31.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl31.setBackground(new Color(153, 0, 0));
		lbl31.setBounds(737, 230, 65, 65);
		lbl31.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				ChipGUI g31 = new ChipGUI(gameControl);
				if (g31.getMoney() != 0){
					lbl31.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}
				refresh();
				Field n31 = new NumberField(12);
				Chip c31 = new Chip(n31, g31.getMoney());
				gameControl.implementField(n31);
				gameControl.implementChip(c31);
			}		
		});
		panel.add(lbl31);
		
		lbl28 = new JLabel("28");
		lbl28.setOpaque(true);
		lbl28.setHorizontalAlignment(SwingConstants.CENTER);
		lbl28.setForeground(new Color(255, 204, 0));
		lbl28.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl28.setBorder(null);
		lbl28.setBackground(Color.BLACK);
		lbl28.setBounds(672, 230, 65, 65);
		lbl28.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				ChipGUI g28 = new ChipGUI(gameControl);
				if (g28.getMoney() != 0){
					lbl28.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}				refresh();
				Field n28 = new NumberField(28);
				Chip c28 = new Chip(n28, g28.getMoney());
				gameControl.implementField(n28);
				gameControl.implementChip(c28);
			}		
		});
		panel.add(lbl28);
		
		lbl25 = new JLabel("25");
		lbl25.setOpaque(true);
		lbl25.setHorizontalAlignment(SwingConstants.CENTER);
		lbl25.setForeground(new Color(255, 204, 0));
		lbl25.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl25.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl25.setBackground(new Color(153, 0, 0));
		lbl25.setBounds(607, 230, 65, 65);
		lbl25.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				ChipGUI g25 = new ChipGUI(gameControl);
				if (g25.getMoney() != 0){
					lbl25.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}				refresh();
				Field n25 = new NumberField(25);
				Chip c25 = new Chip(n25, g25.getMoney());
				gameControl.implementField(n25);
				gameControl.implementChip(c25);
			}		
		});
		panel.add(lbl25);
		
		lbl22 = new JLabel("22");
		lbl22.setOpaque(true);
		lbl22.setHorizontalAlignment(SwingConstants.CENTER);
		lbl22.setForeground(new Color(255, 204, 0));
		lbl22.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl22.setBorder(null);
		lbl22.setBackground(Color.BLACK);
		lbl22.setBounds(542, 230, 65, 65);
		lbl22.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				ChipGUI g22 = new ChipGUI(gameControl);
				if (g22.getMoney() != 0){
					lbl22.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}				refresh();
				Field n22 = new NumberField(22);
				Chip c22 = new Chip(n22, g22.getMoney());
				gameControl.implementField(n22);
				gameControl.implementChip(c22);
			}		
		});
		panel.add(lbl22);
		
		lbl19 = new JLabel("19");
		lbl19.setOpaque(true);
		lbl19.setHorizontalAlignment(SwingConstants.CENTER);
		lbl19.setForeground(new Color(255, 204, 0));
		lbl19.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl19.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl19.setBackground(new Color(153, 0, 0));
		lbl19.setBounds(477, 230, 65, 65);
		lbl19.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				ChipGUI g19 = new ChipGUI(gameControl);
				if (g19.getMoney() != 0){
					lbl19.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}				refresh();
				Field n19 = new NumberField(19);
				Chip c19 = new Chip(n19, g19.getMoney());
				gameControl.implementField(n19);
				gameControl.implementChip(c19);
			}		
		});
		panel.add(lbl19);
		
		lbl20 = new JLabel("20");
		lbl20.setOpaque(true);
		lbl20.setHorizontalAlignment(SwingConstants.CENTER);
		lbl20.setForeground(new Color(255, 204, 0));
		lbl20.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl20.setBorder(null);
		lbl20.setBackground(Color.BLACK);
		lbl20.setBounds(477, 165, 65, 65);
		lbl20.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				ChipGUI g20 = new ChipGUI(gameControl);
				if (g20.getMoney() != 0){
					lbl20.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}				refresh();
				Field n20 = new NumberField(20);
				Chip c20 = new Chip(n20, g20.getMoney());
				gameControl.implementField(n20);
				gameControl.implementChip(c20);
			}		
		});
		panel.add(lbl20);
		
		lbl21 = new JLabel("21");
		lbl21.setOpaque(true);
		lbl21.setHorizontalAlignment(SwingConstants.CENTER);
		lbl21.setForeground(new Color(255, 204, 0));
		lbl21.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl21.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl21.setBackground(new Color(153, 0, 0));
		lbl21.setBounds(477, 100, 65, 65);
		lbl21.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				ChipGUI g21 = new ChipGUI(gameControl);
				if (g21.getMoney() != 0){
					lbl21.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}
				refresh();
				Field n21 = new NumberField(21);
				Chip c21 = new Chip(n21, g21.getMoney());
				gameControl.implementField(n21);
				gameControl.implementChip(c21);
			}		
		});
		panel.add(lbl21);
		
		lbl24 = new JLabel("24");
		lbl24.setOpaque(true);
		lbl24.setHorizontalAlignment(SwingConstants.CENTER);
		lbl24.setForeground(new Color(255, 204, 0));
		lbl24.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl24.setBorder(null);
		lbl24.setBackground(Color.BLACK);
		lbl24.setBounds(542, 100, 65, 65);
		lbl24.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				ChipGUI g24 = new ChipGUI(gameControl);
				if (g24.getMoney() != 0){
					lbl24.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}
				refresh();
				Field n24 = new NumberField(24);
				Chip c24 = new Chip(n24, g24.getMoney());
				gameControl.implementField(n24);
				gameControl.implementChip(c24);
			}		
		});
		panel.add(lbl24);
		
		lbl23 = new JLabel("23");
		lbl23.setOpaque(true);
		lbl23.setHorizontalAlignment(SwingConstants.CENTER);
		lbl23.setForeground(new Color(255, 204, 0));
		lbl23.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl23.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl23.setBackground(new Color(153, 0, 0));
		lbl23.setBounds(542, 165, 65, 65);
		lbl23.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				ChipGUI g23 = new ChipGUI(gameControl);
				if (g23.getMoney() != 0){
					lbl23.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}				refresh();
				Field n23 = new NumberField(23);
				Chip c23 = new Chip(n23, g23.getMoney());
				gameControl.implementField(n23);
				gameControl.implementChip(c23);
			}		
		});
		panel.add(lbl23);
		
		lbl26 = new JLabel("26");
		lbl26.setOpaque(true);
		lbl26.setHorizontalAlignment(SwingConstants.CENTER);
		lbl26.setForeground(new Color(255, 204, 0));
		lbl26.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl26.setBorder(null);
		lbl26.setBackground(Color.BLACK);
		lbl26.setBounds(607, 165, 65, 65);
		lbl26.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				ChipGUI g26 = new ChipGUI(gameControl);
				if (g26.getMoney() != 0){
					lbl26.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}				refresh();
				Field n26 = new NumberField(26);
				Chip c26 = new Chip(n26, g26.getMoney());
				gameControl.implementField(n26);
				gameControl.implementChip(c26);
			}		
		});
		panel.add(lbl26);
		
		lbl27 = new JLabel("27");
		lbl27.setOpaque(true);
		lbl27.setHorizontalAlignment(SwingConstants.CENTER);
		lbl27.setForeground(new Color(255, 204, 0));
		lbl27.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl27.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl27.setBackground(new Color(153, 0, 0));
		lbl27.setBounds(607, 100, 65, 65);
		lbl27.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				ChipGUI g27 = new ChipGUI(gameControl);
				if (g27.getMoney() != 0){
					lbl27.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}				refresh();
				Field n27 = new NumberField(27);
				Chip c27 = new Chip(n27, g27.getMoney());
				gameControl.implementField(n27);
				gameControl.implementChip(c27);
			}		
		});
		panel.add(lbl27);
		
		lbl30 = new JLabel("30");
		lbl30.setOpaque(true);
		lbl30.setHorizontalAlignment(SwingConstants.CENTER);
		lbl30.setForeground(new Color(255, 204, 0));
		lbl30.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl30.setBorder(null);
		lbl30.setBackground(Color.BLACK);
		lbl30.setBounds(672, 100, 65, 65);
		lbl30.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				ChipGUI g30 = new ChipGUI(gameControl);
				if (g30.getMoney() != 0){
					lbl30.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}
				refresh();
				Field n30 = new NumberField(30);
				Chip c30 = new Chip(n30, g30.getMoney());
				gameControl.implementField(n30);
				gameControl.implementChip(c30);
			}		
		});
		panel.add(lbl30);
		
		lbl29 = new JLabel("29");
		lbl29.setOpaque(true);
		lbl29.setHorizontalAlignment(SwingConstants.CENTER);
		lbl29.setForeground(new Color(255, 204, 0));
		lbl29.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl29.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl29.setBackground(new Color(153, 0, 0));
		lbl29.setBounds(672, 165, 65, 65);
		lbl29.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				ChipGUI g29 = new ChipGUI(gameControl);
				if (g29.getMoney() != 0){
					lbl29.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}
				refresh();
				Field n29 = new NumberField(29);
				Chip c29 = new Chip(n29, g29.getMoney());
				gameControl.implementField(n29);
				gameControl.implementChip(c29);
			}		
		});
		panel.add(lbl29);
		
		lbl32 = new JLabel("32");
		lbl32.setOpaque(true);
		lbl32.setHorizontalAlignment(SwingConstants.CENTER);
		lbl32.setForeground(new Color(255, 204, 0));
		lbl32.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl32.setBorder(null);
		lbl32.setBackground(Color.BLACK);
		lbl32.setBounds(737, 165, 65, 65);
		lbl32.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				ChipGUI g32 = new ChipGUI(gameControl);
				if (g32.getMoney() != 0){
					lbl32.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}
				refresh();
				Field n32 = new NumberField(32);
				Chip c32 = new Chip(n32, g32.getMoney());
				gameControl.implementField(n32);
				gameControl.implementChip(c32);
			}		
		});
		panel.add(lbl32);
		
		lbl35 = new JLabel("35");
		lbl35.setOpaque(true);
		lbl35.setHorizontalAlignment(SwingConstants.CENTER);
		lbl35.setForeground(new Color(255, 204, 0));
		lbl35.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl35.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl35.setBackground(new Color(153, 0, 0));
		lbl35.setBounds(802, 165, 65, 65);
		lbl35.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				ChipGUI g35 = new ChipGUI(gameControl);
				if (g35.getMoney() != 0){
					lbl35.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}				refresh();
				Field n35 = new NumberField(35);
				Chip c35 = new Chip(n35, g35.getMoney());
				gameControl.implementField(n35);
				gameControl.implementChip(c35);
			}		
		});
		panel.add(lbl35);
		
		lbl36 = new JLabel("36");
		lbl36.setOpaque(true);
		lbl36.setHorizontalAlignment(SwingConstants.CENTER);
		lbl36.setForeground(new Color(255, 204, 0));
		lbl36.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl36.setBorder(null);
		lbl36.setBackground(Color.BLACK);
		lbl36.setBounds(802, 100, 65, 65);
		lbl36.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				ChipGUI g36 = new ChipGUI(gameControl);
				if (g36.getMoney() != 0){
					lbl36.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}				refresh();
				Field n36 = new NumberField(36);
				Chip c36 = new Chip(n36, g36.getMoney());
				gameControl.implementField(n36);
				gameControl.implementChip(c36);
			}		
		});
		panel.add(lbl36);
		
		lbl33 = new JLabel("33");
		lbl33.setOpaque(true);
		lbl33.setHorizontalAlignment(SwingConstants.CENTER);
		lbl33.setForeground(new Color(255, 204, 0));
		lbl33.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lbl33.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lbl33.setBackground(new Color(153, 0, 0));
		lbl33.setBounds(737, 100, 65, 65);
		lbl33.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				ChipGUI g33 = new ChipGUI(gameControl);
				if (g33.getMoney() != 0){
					lbl33.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}				refresh();
				Field n33 = new NumberField(33);
				Chip c33 = new Chip(n33, g33.getMoney());
				gameControl.implementField(n33);
				gameControl.implementChip(c33);
			}		
		});
		panel.add(lbl33);
		
		lblRot = new JLabel("Rot");
		lblRot.setOpaque(true);
		lblRot.setHorizontalAlignment(SwingConstants.CENTER);
		lblRot.setForeground(new Color(255, 204, 0));
		lblRot.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblRot.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lblRot.setBackground(new Color(153, 0, 0));
		lblRot.setBounds(889, 100, 65, 65);
		lblRot.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				ChipGUI gRot = new ChipGUI(gameControl);
				if (gRot.getMoney() != 0){
					lblRot.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}				refresh();
				Field hfRot = new HalfField("rot");
				Chip cRot = new Chip(hfRot, gRot.getMoney());
				gameControl.implementField(hfRot);
				gameControl.implementChip(cRot);
			}		
		});
		panel.add(lblRot);
		
		lblSchwarz = new JLabel("Schwarz");
		lblSchwarz.setOpaque(true);
		lblSchwarz.setHorizontalAlignment(SwingConstants.CENTER);
		lblSchwarz.setForeground(new Color(255, 204, 0));
		lblSchwarz.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblSchwarz.setBorder(null);
		lblSchwarz.setBackground(Color.BLACK);
		lblSchwarz.setBounds(889, 230, 65, 65);
		lblSchwarz.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				ChipGUI gSchwarz = new ChipGUI(gameControl);
				if (gSchwarz.getMoney() != 0){
					lblSchwarz.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}				refresh();
				Field hfSchwarz = new HalfField("schwarz");
				Chip cSchwarz = new Chip(hfSchwarz, gSchwarz.getMoney());
				gameControl.implementField(hfSchwarz);
				gameControl.implementChip(cSchwarz);
			}		
		});
		panel.add(lblSchwarz);
		
		lblGerade = new JLabel("Gerade");
		lblGerade.setHorizontalAlignment(SwingConstants.CENTER);
		lblGerade.setForeground(new Color(255, 204, 0));
		lblGerade.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGerade.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lblGerade.setBackground(Color.BLACK);
		lblGerade.setBounds(152, 310, 260, 65);
		lblGerade.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				ChipGUI gGerade = new ChipGUI(gameControl);
				if (gGerade.getMoney() != 0){
					lblGerade.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}				refresh();
				Field hfGerade = new HalfField("gerade");
				Chip cGerade = new Chip(hfGerade, gGerade.getMoney());
				gameControl.implementField(hfGerade);
				gameControl.implementChip(cGerade);
			}		
		});
		panel.add(lblGerade);
		
		lblUngerade = new JLabel("Ungerade");
		lblUngerade.setHorizontalAlignment(SwingConstants.CENTER);
		lblUngerade.setForeground(new Color(255, 204, 0));
		lblUngerade.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblUngerade.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0), new Color(0, 0, 0)));
		lblUngerade.setBackground(Color.BLACK);
		lblUngerade.setBounds(542, 310, 260, 65);
		lblUngerade.addMouseListener(new MouseAdapter(){
			public void mouseClicked(MouseEvent e){
				ChipGUI gUngerade = new ChipGUI(gameControl);
				if (gUngerade.getMoney() != 0){
					lblUngerade.setBorder(BorderFactory.createLineBorder(Color.GREEN));
				}				refresh();
				Field hfUngerade = new HalfField("ungerade");
				Chip cUngerade = new Chip(hfUngerade, gUngerade.getMoney());
				gameControl.implementField(hfUngerade);
				gameControl.implementChip(cUngerade);
			}		
		});
		panel.add(lblUngerade);
		
		// Label für Spieler-Name
		lblName = new JLabel(name);
		lblName.setBackground(new Color(0, 0, 0));
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblName.setForeground(new Color(255, 255, 255));
		lblName.setBounds(10, 459, 150, 30);
		frame.getContentPane().add(lblName);
		
		// Label für Geld
		lblMoney = new JLabel("CHF 500.-");
		lblMoney.setForeground(new Color(255, 255, 255));
		lblMoney.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMoney.setBounds(200, 459, 150, 30);
		frame.getContentPane().add(lblMoney);
		
		// Button für bereit
		btnBereit = new JButton("Bereit");
		btnBereit.setForeground(Color.WHITE);
		btnBereit.setBackground(new Color(0, 0, 0));
		btnBereit.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBereit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Wenn Button geklickt, wird resetBorders aufgerufen
				resetBorders();
				// startRound von gameControl wird aufgerufen
				gameControl.startRound();
				// der Variable random wird die Zufallszahl gegeben
				random = gameControl.getRandom();
				// refresh wird aufgerufen
				refresh();
				// richtige Felder bekommen gelben Rahmen
				switch (random){
					case 0:
						lbl0.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
						break;
					case 1:
						lbl1.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
						break;
					case 2:
						lbl2.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
						break;
					case 3:
						lbl3.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
						break;
					case 4:
						lbl4.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
						break;
					case 5:
						lbl5.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
						break;
					case 6:
						lbl6.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
						break;
					case 7:
						lbl7.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
						break;
					case 8:
						lbl8.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
						break;
					case 9:
						lbl9.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
						break;
					case 10:
						lbl10.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
						break;
					case 11:
						lbl11.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
						break;
					case 12:
						lbl12.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
						break;
					case 13:
						lbl13.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
						break;
					case 14:
						lbl14.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
						break;
					case 15:
						lbl15.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
						break;
					case 16:
						lbl16.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
						break;
					case 17:
						lbl17.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
						break;
					case 18:
						lbl18.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
						break;
					case 19:
						lbl19.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
						break;
					case 20:
						lbl20.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
						break;
					case 21:
						lbl21.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
						break;
					case 22:
						lbl22.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
						break;
					case 23:
						lbl23.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
						break;
					case 24:
						lbl24.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
						break;
					case 25:
						lbl25.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
						break;
					case 26:
						lbl26.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
						break;
					case 27:
						lbl27.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
						break;
					case 28:
						lbl28.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
						break;
					case 29:
						lbl29.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
						break;
					case 30:
						lbl30.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
						break;
					case 31:
						lbl31.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
						break;
					case 32:
						lbl32.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
						break;
					case 33:
						lbl33.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
						break;
					case 34:
						lbl34.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
						break;
					case 35:
						lbl35.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
						break;
					case 36:
						lbl36.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
						break;
					default:
				}
				
				if(random %2 == 0){
					lblGerade.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
					lblSchwarz.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
				}
				else if(random %2 != 0){
					lblUngerade.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
					lblRot.setBorder(BorderFactory.createLineBorder(Color.YELLOW));
				}
					
				// Spiel zu Ende --> EndGUI geht auf
				if(gameControl.gameEnd()){
					EndGUI endGui = new EndGUI(gameControl);
				}
			}
		});
		btnBereit.setBounds(675, 459, 150, 30);
		frame.getContentPane().add(btnBereit);
		
		lblRunde = new JLabel("Runde 1 von 10");
		lblRunde.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblRunde.setForeground(new Color(255, 255, 255));
		lblRunde.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRunde.setBounds(824, 459, 150, 30);
		frame.getContentPane().add(lblRunde);
		frame.setVisible(true);
	}
}

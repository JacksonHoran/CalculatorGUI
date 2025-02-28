import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener{
	
		private static final long serialVersionUID = -3250237899172046593L;
		static double a, b, result;
		static String string, string1, string2;
		static String[] parts = new String[2];
		JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bAdd, bSub, bMul, bDiv, bEnter, bPer, bCler;
		JTextField field;
		DecimalFormat format = new DecimalFormat("0.#");
		
	Calculator(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("CALCULATOR");
		this.setLayout(null);
		this.setSize(450, 570);
		this.setResizable(false);
		this.getContentPane().setBackground(new Color(0x123456));
		
		b0 = new JButton("0");
		b9  = new JButton("9");
		b8  = new JButton("8");
		b7  = new JButton("7");
		b6  = new JButton("6");
		b5  = new JButton("5");
		b4  = new JButton("4");
		b3  = new JButton("3");
		b2  = new JButton("2");
		b1  = new JButton("1");
		bAdd  = new JButton("+");
		bSub  = new JButton("-");
		bMul  = new JButton("*");
		bDiv  = new JButton("/");
		bEnter = new JButton("=");
		bPer = new JButton(".");
		bCler = new JButton("C");
		
		field = new JTextField();
		field.setBounds(18, 18, 310, 93);
		
		b0.setBounds(127, 442, 87, 87);
		b9.setBounds(234, 121, 87, 87);
		b8.setBounds(127, 121, 87, 87);
		b7.setBounds(20, 121, 87, 87);
		b6.setBounds(234, 228, 87, 87);
		b5.setBounds(127, 228, 87, 87);
		b4.setBounds(20, 228, 87, 87);
		b3.setBounds(234, 335, 87, 87);
		b2.setBounds(127, 335, 87, 87);
		b1.setBounds(20, 335, 87, 87);
		bAdd.setBounds(341, 442, 87, 87);
		bSub.setBounds(341, 335, 87, 87);
		bMul.setBounds(341, 228, 87, 87);
		bDiv.setBounds(341, 121, 87, 87);
		bEnter.setBounds(20, 442, 87, 87);
		bPer.setBounds(234, 442, 87, 87);
		bCler.setBounds(343, 20, 87, 87);

		b0.setFont(new Font("Ariel", Font.BOLD, 25));
		b1.setFont(new Font("Ariel", Font.BOLD, 25));
		b2.setFont(new Font("Ariel", Font.BOLD, 25));
		b3.setFont(new Font("Ariel", Font.BOLD, 25));
		b4.setFont(new Font("Ariel", Font.BOLD, 25));
		b5.setFont(new Font("Ariel", Font.BOLD, 25));
		b6.setFont(new Font("Ariel", Font.BOLD, 25));
		b7.setFont(new Font("Ariel", Font.BOLD, 25));
		b8.setFont(new Font("Ariel", Font.BOLD, 25));
		b9.setFont(new Font("Ariel", Font.BOLD, 25));
		bAdd.setFont(new Font("Ariel", Font.BOLD, 25));
		bSub.setFont(new Font("Ariel", Font.BOLD, 25));
		bMul.setFont(new Font("Ariel", Font.BOLD, 25));
		bDiv.setFont(new Font("Ariel", Font.BOLD, 25));
		bEnter.setFont(new Font("Ariel", Font.BOLD, 25));
		bPer.setFont(new Font("Ariel", Font.BOLD, 25));
		bCler.setFont(new Font("Ariel", Font.BOLD, 25));
		field.setFont(new Font("Ariel", Font.BOLD, 40));
		

		
		b0.setBackground(new Color(0x729fcc));
		b1.setBackground(new Color(0x729fcc));
		b2.setBackground(new Color(0x729fcc));
		b3.setBackground(new Color(0x729fcc));
		b4.setBackground(new Color(0x729fcc));
		b5.setBackground(new Color(0x729fcc));
		b6.setBackground(new Color(0x729fcc));
		b7.setBackground(new Color(0x729fcc));
		b8.setBackground(new Color(0x729fcc));
		b9.setBackground(new Color(0x729fcc));
		bAdd.setBackground(new Color(0x729fcc));
		bSub.setBackground(new Color(0x729fcc));
		bMul.setBackground(new Color(0x729fcc));
		bDiv.setBackground(new Color(0x729fcc));
		bEnter.setBackground(new Color(0x729fcc));
		bPer.setBackground(new Color(0x729fcc));
		bCler.setBackground(new Color(0x729fcc));
		field.setBackground(new Color(0x729fcc));
		
		
		b0.setOpaque(true);
		b0.setBorderPainted(false);
		b1.setOpaque(true);
		b1.setBorderPainted(false);
		b2.setOpaque(true);
		b2.setBorderPainted(false);
		b3.setOpaque(true);
		b3.setBorderPainted(false);
		b4.setOpaque(true);
		b4.setBorderPainted(false);
		b5.setOpaque(true);
		b5.setBorderPainted(false);
		b6.setOpaque(true);
		b6.setBorderPainted(false);
		b7.setOpaque(true);
		b7.setBorderPainted(false);
		b8.setOpaque(true);
		b8.setBorderPainted(false);
		b9.setOpaque(true);
		b9.setBorderPainted(false);
		bAdd.setOpaque(true);
		bAdd.setBorderPainted(false);
		bSub.setOpaque(true);
		bSub.setBorderPainted(false);
		bMul.setOpaque(true);
		bMul.setBorderPainted(false);
		bDiv.setOpaque(true);
		bDiv.setBorderPainted(false);
		bEnter.setOpaque(true);
		bEnter.setBorderPainted(false);
		bPer.setOpaque(true);
		bPer.setBorderPainted(false);
		bCler.setOpaque(true);
		bCler.setBorderPainted(false);
		
		
		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		bAdd.addActionListener(this);
		bSub.addActionListener(this);
		bMul.addActionListener(this);
		bDiv.addActionListener(this);
		bEnter.addActionListener(this);
		bPer.addActionListener(this);
		bCler.addActionListener(this);

		
		this.add(b0);
		this.add(b1);
		this.add(b2);
		this.add(b3);
		this.add(b4);
		this.add(b5);
		this.add(b6);
		this.add(b7);
		this.add(b8);
		this.add(b9);
		this.add(bAdd);
		this.add(bSub);
		this.add(bMul);
		this.add(bDiv);
		this.add(bEnter);
		this.add(bPer);
		this.add(field);
		this.add(bCler);
		this.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == b0) {
			field.setText(field.getText().concat("0"));
		}else if(e.getSource() == b1) {
			field.setText(field.getText().concat("1"));
		}else if(e.getSource() == b1) {
			field.setText(field.getText().concat("1"));
		}else if(e.getSource() == b2) {
			field.setText(field.getText().concat("2"));
		}else if(e.getSource() == b3) {
			field.setText(field.getText().concat("3"));
		}else if(e.getSource() == b4) {
			field.setText(field.getText().concat("4"));
		}else if(e.getSource() == b5) {
			field.setText(field.getText().concat("5"));
		}else if(e.getSource() == b6) {
			field.setText(field.getText().concat("6"));
		}else if(e.getSource() == b7) {
			field.setText(field.getText().concat("7"));
		}else if(e.getSource() == b8) {
			field.setText(field.getText().concat("8"));
		}else if(e.getSource() == b9) {
			field.setText(field.getText().concat("9"));
		}else if(e.getSource() == bCler) {
			field.setText("");
		}else if(e.getSource() == bAdd) {
			field.setText(field.getText().concat("+"));
		}else if(e.getSource() == bSub) {
			field.setText(field.getText().concat("-"));
		}else if(e.getSource() == bMul) {
			field.setText(field.getText().concat("*"));
		}else if(e.getSource() == bDiv) {
			field.setText(field.getText().concat("/"));
		}
		
		
		if(e.getSource() == bEnter) {
			string = field.getText();
			if (string.contains("+")) {
				parts = string.split("\\+");
				string1 = parts[0];
				string2 = parts[1];
				a = Double.parseDouble(string1);
				b = Double.parseDouble(string2);
				result = a+b;
			}else if (string.contains("-")) {
				parts = string.split("\\-");
				string1 = parts[0];
				string2 = parts[1];
				a = Double.parseDouble(string1);
				b = Double.parseDouble(string2);
				result = a-b;
			}else if (string.contains("*")) {
				parts = string.split("\\*");
				string1 = parts[0];
				string2 = parts[1];
				a = Double.parseDouble(string1);
				b = Double.parseDouble(string2);
				result = a*b;
			}else if (string.contains("/")) {
				parts = string.split("\\/");
				string1 = parts[0];
				string2 = parts[1];
				a = Double.parseDouble(string1);
				b = Double.parseDouble(string2);
				result = a/b;
			}
			string = String.valueOf(format.format(result));
			field.setText(string);
		}
	}
	public static void main(String[] args) {
		new Calculator();
	}
}

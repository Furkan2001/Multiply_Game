package smallGame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main implements ActionListener{

	private JFrame frame;
	private JPanel panel1;
	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;
	private JLabel scoreBoard;
	private JLabel label;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JButton button;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private int number1;
	private int number2;
	private int multiply;
	private int point;
	private int situation;
	private int validation1;
	private int validation2;
	
	public Main()
	{
		point = 0;
		situation = 0;
		validation1 = 0;
		validation2 = 0;
		
		frame = new JFrame();
		frame.setTitle("myGame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500,550);
		frame.setResizable(false);
		frame.setLayout(null);
		
		panel1 = new JPanel();
		panel1.setBackground(Color.green);
		panel1.setBounds(0, 50, 250, 250);
		panel1.setLayout(null);
		
		panel2 = new JPanel();
		panel2.setBackground(Color.blue);
		panel2.setBounds(0, 300, 250, 250);
		panel2.setLayout(null);
		
		panel3 = new JPanel();
		panel3.setBackground(Color.pink);
		panel3.setBounds(250, 50, 250, 250);
		panel3.setLayout(null);
		
		panel4 = new JPanel();
		panel4.setBackground(Color.cyan);
		panel4.setBounds(250, 300, 250, 250);
		panel4.setLayout(null);
		
		scoreBoard = new JLabel("score: " + point + "");
		label = new JLabel("Press to start");
		label.setBounds(220, 20, 100, 30);
		scoreBoard.setBounds(50, 20, 100, 30);
		
		button = new JButton("Send it");
		button1 = new JButton();
		button2 = new JButton();
		button3 = new JButton();
		button4 = new JButton();
		
		label1 = new JLabel("");
		label2 = new JLabel("");
		label3 = new JLabel("");
		label4 = new JLabel("");
		
		button.setBounds(330, 20, 120, 30);
		button1.setBounds(60, 60, 100, 100);
		button2.setBounds(60, 60, 100, 100);
		button3.setBounds(60, 60, 100, 100);
		button4.setBounds(60, 60, 100, 100);
		
		button.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		
		frame.add(panel1);
		frame.add(panel2);
		frame.add(panel3);
		frame.add(panel4);
		frame.add(label);
		frame.add(button);
		frame.add(scoreBoard);
		
		button1.add(label1);
		button2.add(label2);
		button3.add(label3);
		button4.add(label4);
		
		panel1.add(button1);
		panel2.add(button2);
		panel3.add(button3);
		panel4.add(button4);
		
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == button)
		{	
			if (validation1 == validation2) 
				validation1++;
			number1 = (int) (Math.random() * 20);
			number2 = (int) (Math.random() * 20);
			label.setText(number1 + " x " + number2 + " = ?");
			
			situation = (int) (Math.random() * 4);
			
			if (situation == 0 || situation == 1)
			{
				multiply = number1 * number2;
				label1.setText((multiply) + "");
				multiply += 4;
				label2.setText((multiply) + "");
				multiply -= 8;
				label3.setText((multiply) + "");
				multiply += 2;
				label4.setText((multiply) + "");
			}
			else if (situation == 2)
			{
				multiply = number1 * number2;
				label2.setText((multiply) + "");
				multiply += 4;
				label1.setText((multiply) + "");
				multiply -= 8;
				label3.setText((multiply) + "");
				multiply += 2;
				label4.setText((multiply) + "");
			}
			else if (situation == 3)
			{
				multiply = number1 * number2;
				label4.setText((multiply) + "");
				multiply += 4;
				label3.setText((multiply) + "");
				multiply -= 8;
				label2.setText((multiply) + "");
				multiply += 2;
				label1.setText((multiply) + "");
			}	
			else if (situation == 4)
			{
				multiply = number1 * number2;
				label3.setText((multiply) + "");
				multiply += 4;
				label2.setText((multiply) + "");
				multiply -= 8;
				label4.setText((multiply) + "");
				multiply += 2;
				label1.setText((multiply) + "");
			}
		}
		else if (e.getSource() == button1)
		{
			if (validation1 == (validation2 + 1))
			{
				validation2++;
				if (situation == 0 || situation == 1)
				{
					if (validation1 == validation2)
						point++;
				}
				else
					point--;
				scoreBoard.setText("score: " + point + "");
			}
		}
		else if (e.getSource() == button2)
		{
			if (validation1 == (validation2 + 1))
			{
				validation2++;
				if (situation == 2)
				{
					if (validation1 == validation2)
						point++;
				}
				else
					point--;
				scoreBoard.setText("score: " + point + "");
			}
		}
		else if (e.getSource() == button3)
		{
			if (validation1 == (validation2 + 1))
			{
				validation2++;
				if (situation == 4)
				{
					if (validation1 == validation2)
						point++;
				}
				else
					point--;
				scoreBoard.setText("score: " + point + "");
			}
		}
		else if (e.getSource() == button4)
		{
			if (validation1 == (validation2 + 1))
			{
				validation2++;
				if (situation == 3)
				{
					if (validation1 == validation2)
						point++;
				}
				else
					point--;
				scoreBoard.setText("score: " + point + "");
			}
		}
	}

	public static void main(String[] args) 
	{
		new Main();
	}
}

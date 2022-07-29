import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.tools.DocumentationTool.DocumentationTask;

public class Calculator implements ActionListener{
	
	boolean isOperatorClicked=false;
	String oldValue;
	boolean clickedOperator=false;
	float result;
	int flag;
	JLabel DisplayLabel;
	JButton SevenButton;
	JButton EightButton;
	JButton NineButton;
	JButton FourButton;
	JButton FiveButton;
	JButton SixButton;
	JButton OneButton;
	JButton TwoButton;
	JButton ThreeButton;
	JButton ZeroButton,ClearButton;
	JButton DotButton,DivButton,MulButton,SubButton,AddButton,EqualsButton;

	public Calculator() {
		JFrame jf=new JFrame("Simple Calculator");
		jf.setLayout(null);
		jf.setSize(600,600);
		jf.setLocation(300,150);
		
		//Label Customization starts
		
		DisplayLabel=new JLabel();
		DisplayLabel.setBounds(30, 30, 540, 60);
		DisplayLabel.setBackground(Color.darkGray);
		DisplayLabel.setFont(new Font("Serif",Font.PLAIN,26));
		DisplayLabel.setOpaque(true);
		jf.add(DisplayLabel);
		DisplayLabel.setForeground(Color.white);
		DisplayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		
		//Label Customization Ends
		
		//Clickable Buttons
		
		SevenButton=new JButton("7");
		SevenButton.setBounds(30, 100, 80, 80);
		SevenButton.setFont(new Font("Arial",Font.PLAIN,40));
		SevenButton.addActionListener(this);
		jf.add(SevenButton);
		
		EightButton=new JButton("8");
		EightButton.setBounds(130, 100, 80, 80);
		EightButton.setFont(new Font("Arial",Font.PLAIN,40));
		EightButton.addActionListener(this);
		jf.add(EightButton);
		
		NineButton=new JButton("9");
		NineButton.setBounds(230, 100, 80, 80);
		NineButton.setFont(new Font("Arial",Font.PLAIN,40));
		NineButton.addActionListener(this);
		jf.add(NineButton);
		
		DivButton=new JButton("/");
		DivButton.setBounds(330, 100, 80, 80);
		DivButton.setFont(new Font("Arial",Font.PLAIN,40));
		DivButton.addActionListener(this);
		jf.add(DivButton);
		
		FourButton=new JButton("4");
		FourButton.setBounds(30, 190, 80, 80);
		FourButton.setFont(new Font("Arial",Font.PLAIN,40));
		FourButton.addActionListener(this);
		jf.add(FourButton);
		
		FiveButton=new JButton("5");
		FiveButton.setBounds(130, 190, 80, 80);
		FiveButton.setFont(new Font("Arial",Font.PLAIN,40));
		FiveButton.addActionListener(this);
		jf.add(FiveButton);
		
		SixButton=new JButton("6");
		SixButton.setBounds(230, 190, 80, 80);
		SixButton.setFont(new Font("Arial",Font.PLAIN,40));
		SixButton.addActionListener(this);
		jf.add(SixButton);
		
		MulButton=new JButton("x");
		MulButton.setBounds(330, 190, 80, 80);
		MulButton.setFont(new Font("Arial",Font.PLAIN,40));
		MulButton.addActionListener(this);
		jf.add(MulButton);
		
		OneButton=new JButton("1");
		OneButton.setBounds(30, 280, 80, 80);
		OneButton.setFont(new Font("Arial",Font.PLAIN,40));
		OneButton.addActionListener(this);
		jf.add(OneButton);
		
		TwoButton=new JButton("2");
		TwoButton.setBounds(130, 280, 80, 80);
		TwoButton.setFont(new Font("Arial",Font.PLAIN,40));
		TwoButton.addActionListener(this);
		jf.add(TwoButton);
		
		ThreeButton=new JButton("3");
		ThreeButton.setBounds(230, 280, 80, 80);
		ThreeButton.setFont(new Font("Arial",Font.PLAIN,40));
		ThreeButton.addActionListener(this);
		jf.add(ThreeButton);
		
		SubButton=new JButton("-");
		SubButton.setBounds(330, 280, 80, 80);
		SubButton.setFont(new Font("Arial",Font.PLAIN,40));
		SubButton.addActionListener(this);
		jf.add(SubButton);
		
		DotButton=new JButton(".");
		DotButton.setBounds(30, 380, 80, 80);
		DotButton.setFont(new Font("Arial",Font.PLAIN,40));
		DotButton.addActionListener(this);
		jf.add(DotButton);
		
		ZeroButton=new JButton("0");
		ZeroButton.setBounds(130, 380, 80, 80);
		ZeroButton.setFont(new Font("Arial",Font.PLAIN,40));
		ZeroButton.addActionListener(this);
		jf.add(ZeroButton);
		
		EqualsButton=new JButton("=");
		EqualsButton.setBounds(230, 380, 80, 80);
		EqualsButton.setFont(new Font("Arial",Font.PLAIN,40));
		EqualsButton.addActionListener(this);
		jf.add(EqualsButton);
		
		AddButton=new JButton("+");
		AddButton.setBounds(330, 380, 80, 80);
		AddButton.setFont(new Font("Arial",Font.PLAIN,40));
		AddButton.addActionListener(this);
		jf.add(AddButton);
		
		ClearButton=new JButton("Clear");
		ClearButton.setBounds(430, 380, 80, 80);
		ClearButton.setFont(new Font("Arial",Font.PLAIN,18));
		ClearButton.addActionListener(this);
		jf.add(ClearButton);
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}
	
	
	public static void main(String[] args) {
		new Calculator();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==SevenButton) {
			if(isOperatorClicked) {
				DisplayLabel.setText("7");
				isOperatorClicked=false;
			}else {
				DisplayLabel.setText(DisplayLabel.getText()+"7");
			}
		}else if(e.getSource()==EightButton) {
			if(isOperatorClicked) {
				DisplayLabel.setText("8");
				isOperatorClicked=false;
			}else {
				DisplayLabel.setText(DisplayLabel.getText()+"8");
			}
			
		}else if(e.getSource()==NineButton) {
			if(isOperatorClicked) {
				DisplayLabel.setText("9");
				isOperatorClicked=false;
			}else {
				DisplayLabel.setText(DisplayLabel.getText()+"9");
			}
			
		}else if(e.getSource()==FourButton) {
			if(isOperatorClicked) {
				DisplayLabel.setText("4");
				isOperatorClicked=false;
			}else {
				DisplayLabel.setText(DisplayLabel.getText()+"4");
			}
			
		}else if(e.getSource()==FiveButton) {
			if(isOperatorClicked) {
				DisplayLabel.setText("5");
				isOperatorClicked=false;
			}else {
				DisplayLabel.setText(DisplayLabel.getText()+"5");
			}
			
		}else if(e.getSource()==SixButton) {
			if(isOperatorClicked) {
				DisplayLabel.setText("6");
				isOperatorClicked=false;
			}else {
				DisplayLabel.setText(DisplayLabel.getText()+"6");
			}
			
		}else if(e.getSource()==OneButton) {
			if(isOperatorClicked) {
				DisplayLabel.setText("1");
				isOperatorClicked=false;
			}else {
				DisplayLabel.setText(DisplayLabel.getText()+"1");
			}
			;
		}else if(e.getSource()==TwoButton) {
			if(isOperatorClicked) {
				DisplayLabel.setText("2");
				isOperatorClicked=false;
			}else {
				DisplayLabel.setText(DisplayLabel.getText()+"2");
			}
	
		}else if(e.getSource()==ThreeButton) {
			if(isOperatorClicked) {
				DisplayLabel.setText("3");
				isOperatorClicked=false;
			}else {
				DisplayLabel.setText(DisplayLabel.getText()+"3");
			}
			
		}else if(e.getSource()==ZeroButton ) {
			if(isOperatorClicked) {
				DisplayLabel.setText("0");
				isOperatorClicked=false;
			}else {
				DisplayLabel.setText(DisplayLabel.getText()+"0");
			}
			
		}else if(e.getSource()==ClearButton) {
			DisplayLabel.setText("");
		}else if(e.getSource()==DotButton) {
			DisplayLabel.setText(DisplayLabel.getText()+".");
		}else if(e.getSource()==AddButton) {
			isOperatorClicked=true;
			oldValue=DisplayLabel.getText();
			flag=1;
		}else if(e.getSource()==SubButton) {
			isOperatorClicked=true;
			oldValue=DisplayLabel.getText();
			flag=2;
		}else if(e.getSource()==DivButton) {
			isOperatorClicked=true;
			oldValue=DisplayLabel.getText();
			flag=3;
		}else if(e.getSource()==MulButton) {
			isOperatorClicked=true;
			oldValue=DisplayLabel.getText();
			flag=4;
		}else if(e.getSource()==EqualsButton) {
			String newValue=DisplayLabel.getText();
			float oldValueF=Float.parseFloat(oldValue);
			float newValueF=Float.parseFloat(newValue);
			float resultF=Float.parseFloat(newValue);
			if(e.getSource()==AddButton) {
				
				
			}
			if(flag==1) {
				result=oldValueF+newValueF;
				DisplayLabel.setText(result+"");
			}
			else if(flag==2) {
				result=oldValueF-newValueF;
				DisplayLabel.setText(result+"");
			}else if(flag==3) {
				result=oldValueF/newValueF;
				DisplayLabel.setText(result+"");
			}else if(flag==4) {
				result=(oldValueF*newValueF);
				DisplayLabel.setText(result+"");
			}
			
		}
		
		
	}
	
	
	
}

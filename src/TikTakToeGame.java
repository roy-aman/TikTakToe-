import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class TikTakToeGame implements ActionListener 
{
	// global variables
	JFrame jf;
	JButton jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9, jb11;
	
		boolean b ;
		int count;
		String str ="" ;
		
	
//	JLabel jl;
	
	
	TikTakToeGame(){
		
		jf=new JFrame("Playing TIK TAK TOE...");
		jf.setSize(550, 500);
		jf.setLayout(null);
		jf.setLocationRelativeTo(null);
		//jf.setLocation(400, 50);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(new GridLayout(3,3));
		
		
//		jl= new JLabel("hello broooh");
		//jl.setBounds(30, 50, 50, 30);
		//jf.add(jl);
		
		jb1= new JButton();
		jb1.addActionListener(this);
		
		jb2= new JButton();
		jb2.addActionListener(this);
		
		jb3= new JButton();
		jb3.addActionListener(this);
		
		jb4= new JButton();
		jb4.addActionListener(this);
		
		jb5= new JButton();
		jb5.addActionListener(this);
		
		jb6= new JButton();
		jb6.addActionListener(this);
		
		jb7= new JButton();
		jb7.addActionListener(this);
		
		jb8= new JButton();
		jb8.addActionListener(this);
		
		jb9= new JButton();
		jb9.addActionListener(this);
	//	jb11= new JButton();
		
		jf.add(jb1);
		jf.add(jb2);
		jf.add(jb3);
		jf.add(jb4);
		jf.add(jb5);
		jf.add(jb6);
		jf.add(jb7);
		jf.add(jb8);
		jf.add(jb9);
	//	jf.add(jb11);
		
	
		jf.setVisible(true);

	}

	// main function 
	
	public static void main(String[] args) {
		
		new TikTakToeGame();
		
		
	}
	
	
	Font font=new Font("arial",1,40);
	Color color;
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		count++;
		if(count%2 == 0) {
			str="x";
			color=Color.pink;
		   }
		else {
			str="0";
			color=Color.red;
		  }

		if (e.getSource()==jb1) {

			jb1.setBackground(color);
			jb1.setText(str);
			jb1.setFont(font);
			jb1.setEnabled(false);
	   	}
		 if (e.getSource()==jb2) {
				jb2.setBackground(color);
				jb2.setText(str);
				jb2.setFont(font);
				jb2.setEnabled(false);
		 }
		 if (e.getSource()==jb3) {
			jb3.setBackground(color);
			jb3.setText(str);
			jb3.setFont(font);
			jb3.setEnabled(false);
	     }
	   if (e.getSource()==jb4) {
			jb4.setBackground(color);
			jb4.setText(str);
			jb4.setFont(font);
			jb4.setEnabled(false);
	     }
		 if (e.getSource()==jb5) {
			jb5.setBackground(color);
			jb5.setText(str);
			jb5.setFont(font);
			jb5.setEnabled(false);
			
	     }
		if (e.getSource()==jb6) {
		jb6.setBackground(color);
		jb6.setText(str);
		jb6.setFont(font);
		jb6.setEnabled(false);
         }
		 if (e.getSource()==jb7) {
			jb7.setBackground(color);
			jb7.setText(str);
			jb7.setFont(font);
			jb7.setEnabled(false);
	     }
		 if (e.getSource()==jb8) {
			jb8.setBackground(color);
			jb8.setText(str);
			jb8.setFont(font);
			jb8.setEnabled(false);
	     }
		if(e.getSource()==jb9) 
		{
			jb9.setBackground(color);
			jb9.setText(str);
			jb9.setFont(font);
			jb9.setEnabled(false);
	    }
			
		 winningPossiblities();
	}
	
	void winningPossiblities() {
		
		if(jb1.getText()==jb2.getText() && jb2.getText()==jb3.getText() && jb1.getText() !=("") ) 
		{
			b= true;
		}
		else if(jb4.getText()==jb5.getText() && jb5.getText()==jb6.getText() && jb4.getText()!=("") )
		{
			b =true;
	    }
		else if(jb7.getText()==jb8.getText() && jb8.getText()==jb9.getText() && jb7.getText()!=("") )
		{
			b= true;	
	     }
		else if(jb1.getText()==jb4.getText() && jb4.getText()==jb7.getText() && jb1.getText()!=("") ) 
		{
			b=true;
	          }
		else if(jb2.getText()==jb5.getText() && jb5.getText()==jb8.getText() && jb2.getText()!=("") )
         {
			b=true;
	       }
		else if(jb3.getText()==jb6.getText() && jb6.getText()==jb9.getText() && jb3.getText()!=("") )
		{
			b=true;
	          }
		else if(jb1.getText()==jb5.getText() && jb5.getText()==jb9.getText() && jb1.getText()!=("") )
		{
			b=true;
	          }
		else if(jb3.getText()==jb5.getText() && jb5.getText()==jb7.getText() && jb3.getText()!=("") )
		{
		     b=true;     
	          }
		else {
			
			b=false;
		}
		
		whoIsWinner();
		
	}	
	
//	void winningPossibility() {
//		
//	}
	
	void whoIsWinner()
        { 
		 if(b==true) {
				JOptionPane.showMessageDialog(jf,"winner is "+ str);
				restartGame();
			}
		 
		else if(b==false && count==9  ) {
			JOptionPane.showMessageDialog(jf, "MATCH DROW \n");
			restartGame();
		}
	}
	
	void restartGame() {
		int i=JOptionPane.showConfirmDialog(jf, "Do You Want to play again..??");
		if(i==0) {
			b=false;
			color=null;
			str="";
			count=0;
						
			
			jb1.setBackground(null);
			jb1.setEnabled(true);
			jb1.setText("");
			
			
			jb2.setBackground(null);
			jb2.setEnabled(true);
			jb2.setText("");
			
			
			jb3.setBackground(null);
			jb3.setEnabled(true);
			jb3.setText("");
			
			
			jb4.setBackground(null);
			jb4.setEnabled(true);
			jb4.setText("");
			
			
			jb5.setBackground(null);
			jb5.setEnabled(true);
			jb5.setText("");
			
			
			jb6.setBackground(null);
			jb6.setEnabled(true);
			jb6.setText("");
			
			
			jb7.setBackground(null);
			jb7.setEnabled(true);
			jb7.setText("");
			
			
			jb8.setBackground(null);
			jb8.setEnabled(true);
			jb8.setText("");
			
			
			jb9.setBackground(null);
			jb9.setEnabled(true);
			jb9.setText("");
			
			
		}	
		else if (i==1) {
			jb1.setEnabled(false);
			jb2.setEnabled(false);
			jb3.setEnabled(false);
			jb4.setEnabled(false);
			jb5.setEnabled(false);
			jb6.setEnabled(false);
			jb7.setEnabled(false);
			jb8.setEnabled(false);
			jb9.setEnabled(false);
			
			
		}
		else if(i==2) {
		  System.exit(0);
		}
	}

}

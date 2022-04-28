package Main_package;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;

public class Single_choice extends JFrame{
	public Single_choice() {
		setSize(220, 110);
		setTitle("选择器");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		Container a=getContentPane();
		a.setLayout(new FlowLayout());
		JRadioButton b=new JRadioButton("普通模式");
		JRadioButton b1=new JRadioButton("steam模式");
		ButtonGroup c=new ButtonGroup();
		b.setSelected(true);
		c.add(b);
		c.add(b1);
		a.add(b);
		a.add(b1);
		JButton an=new JButton("进入");
		an.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				boolean a=b.isSelected();
				if (a==true) {
					new window();
				}
				if(a==false) {
					new steam_class();
				}
				//System.out.println(b.getText()+"选中状态:"+b.isSelected());
				//System.out.println(b1.getText()+"选中状态:"+b1.isSelected());
				//c.clearSelection();
			}
		});
		a.add(an);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Single_choice();
	}
}

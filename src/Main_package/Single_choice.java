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
		setTitle("ѡ����");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		Container a=getContentPane();
		a.setLayout(new FlowLayout());
		JRadioButton b=new JRadioButton("��ͨģʽ");
		JRadioButton b1=new JRadioButton("steamģʽ");
		ButtonGroup c=new ButtonGroup();
		b.setSelected(true);
		c.add(b);
		c.add(b1);
		a.add(b);
		a.add(b1);
		JButton an=new JButton("����");
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
				//System.out.println(b.getText()+"ѡ��״̬:"+b.isSelected());
				//System.out.println(b1.getText()+"ѡ��״̬:"+b1.isSelected());
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

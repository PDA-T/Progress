package Main_package;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class window extends JFrame{;
	public window() {
		setTitle("������");
		setSize(230, 80);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container a=getContentPane();
		a.setLayout(new FlowLayout());
		String u[]= {"Hulu","ESET","NordVPN","Crunchyroll","DisneyPlus","PrimePhonic",
					 "EncryptMe","Netflix","Photoshop","Lightroom","Instagram",
					 "Discord","Minecraft","�����������"};
		JComboBox<String> jc=new JComboBox<>(u);
		a.add(jc);
		JButton an=new JButton("��ȡ");
		an.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
					if (jc.getSelectedItem().equals("�����������")) {
						JOptionPane.showMessageDialog(null, "��ѡ���޶�Ӧ������ !", "��ʾ",JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					}else if (jc.getSelectedItem().equals("NordVPN")) {
						JOptionPane.showMessageDialog(null, "��ʱ�޷�ʹ�� !", "��ʾ",JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					}else if (jc.getSelectedItem().equals("Minecraft")) {
						JOptionPane.showMessageDialog(null, "�˰汾Ϊ�ڲ��,���ܵ������� ! ! !", "����",JOptionPane.WARNING_MESSAGE);
						Minecraft mi=new Minecraft("�������ӷ�����");
						Thread min = new Thread(mi);
						min.start();
					}else {
						Main_algorithm pb = new Main_algorithm("�������ӷ�����");
						Thread t = new Thread(pb);
				        t.start();
					}
					//JOptionPane.showMessageDialog(null, "��Ȩ�� !", "����",JOptionPane.WARNING_MESSAGE);
					//System.exit(0);
				//Main_algorithm pb = new Main_algorithm("�������ӷ�����");
				//Thread t = new Thread(pb);
		        //t.start();
				//System.out.println("ѡ���ֵ:"+jc.getSelectedItem());
			}
		});
		a.add(an);
		setVisible(true);
	}
}

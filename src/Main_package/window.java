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
		setTitle("连接器");
		setSize(230, 80);
		setLocationRelativeTo(null);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container a=getContentPane();
		a.setLayout(new FlowLayout());
		String u[]= {"Hulu","ESET","NordVPN","Crunchyroll","DisneyPlus","PrimePhonic",
					 "EncryptMe","Netflix","Photoshop","Lightroom","Instagram",
					 "Discord","Minecraft","后续还会更新"};
		JComboBox<String> jc=new JComboBox<>(u);
		a.add(jc);
		JButton an=new JButton("获取");
		an.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
					if (jc.getSelectedItem().equals("后续还会更新")) {
						JOptionPane.showMessageDialog(null, "此选项无对应服务器 !", "提示",JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					}else if (jc.getSelectedItem().equals("NordVPN")) {
						JOptionPane.showMessageDialog(null, "暂时无法使用 !", "提示",JOptionPane.INFORMATION_MESSAGE);
						System.exit(0);
					}else if (jc.getSelectedItem().equals("Minecraft")) {
						JOptionPane.showMessageDialog(null, "此版本为内测版,可能导致蓝屏 ! ! !", "警告",JOptionPane.WARNING_MESSAGE);
						Minecraft mi=new Minecraft("正在连接服务器");
						Thread min = new Thread(mi);
						min.start();
					}else {
						Main_algorithm pb = new Main_algorithm("正在连接服务器");
						Thread t = new Thread(pb);
				        t.start();
					}
					//JOptionPane.showMessageDialog(null, "无权限 !", "警告",JOptionPane.WARNING_MESSAGE);
					//System.exit(0);
				//Main_algorithm pb = new Main_algorithm("正在连接服务器");
				//Thread t = new Thread(pb);
		        //t.start();
				//System.out.println("选择的值:"+jc.getSelectedItem());
			}
		});
		a.add(an);
		setVisible(true);
	}
}

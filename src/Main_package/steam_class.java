package Main_package;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class steam_class extends JFrame{
	public steam_class() {
		setSize(300, 110);
		setLocationRelativeTo(null);
		setTitle("�����뼤����");
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container a=getContentPane();
		a.setLayout(new FlowLayout());
		JPasswordField ma=new JPasswordField();
		ma.setColumns(20);
		ma.setFont(new Font("����",Font.BOLD,20));
		ma.setEchoChar('*');
		/*ma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char b[]=ma.getPassword();
				System.out.println(b);
			}
		});*/
		JButton an=new JButton("����");
		a.add(ma);
		a.add(an);
		setVisible(true);
		an.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				if (ma.getText().equals("111")) {
					new Steam();
				}else {
					JOptionPane.showMessageDialog(null, "��������� !", "��ʾ",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}
				//new Steam();
				//JOptionPane.showMessageDialog(null, "��Ȩ�� !", "��ʾ",JOptionPane.INFORMATION_MESSAGE);
				//System.exit(0);
				//System.out.println("�������"+ma.getText());
				//ma.setText("");
				//ma.requestFocus();  //��ȡ����
			}
		});
	}
}
class Steam extends JFrame{
	JTabbedPane ѡ�=new JTabbedPane();				//����ѡ�
	public Steam() {
			setSize(600, 400);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setTitle("steam����̨");
			setVisible(true);
			Container a=getContentPane();
			JLabel ����=new JLabel("steam��������");				//�����ı�����
			JLabel ����=new JLabel("steam�ƽ���");				//�����ı�����
			JPanel ���1=new JPanel(new GridLayout(8,1));			//�������
			JRadioButton ����=new JRadioButton("������");		//������ѡ��ť����
			JRadioButton �ײ�=new JRadioButton("VIP��");		//������ѡ��ť����
			JRadioButton ���=new JRadioButton("SVIP��");		//������ѡ��ť����
			JRadioButton �Ҳ�=new JRadioButton("������");		//������ѡ��ť����
			JRadioButton ����=new JRadioButton("SVIP��");			//������ѡ��ť����
			JRadioButton ����=new JRadioButton("������");			//������ѡ��ť����
			ButtonGroup ����=new ButtonGroup();					//��ѡ����
			ButtonGroup ����2=new ButtonGroup();					//��ѡ����
			����.setSelected(true);����.setSelected(false);
			���1.setBorder(BorderFactory.createTitledBorder("�ٿ�̨"));
			/**
			 * ���ȫ�����
			 */
			a.add(���1,BorderLayout.WEST);���1.add(����);����.add(����);
			����.add(�ײ�);����.add(���);����.add(�Ҳ�);����2.add(����);����2.add(����);
			���1.add(����);���1.add(�ײ�);���1.add(���);���1.add(�Ҳ�);
			���1.add(����);���1.add(����);���1.add(����);a.add(ѡ�);ѡ���ʼ��();
			/**
			 * ����¼�
			 */
			����.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//ѡ�.setTabPlacement(JTabbedPane.TOP);
				}
			});
			�ײ�.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "��Ȩ�� !", "��ʾ",JOptionPane.INFORMATION_MESSAGE);
					//ѡ�.setTabPlacement(JTabbedPane.BOTTOM);
					����.setSelected(true);
				}
			});
			���.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "��Ȩ�� !", "��ʾ",JOptionPane.INFORMATION_MESSAGE);
					//ѡ�.setTabPlacement(JTabbedPane.LEFT);
					����.setSelected(true);
				}
			});
			�Ҳ�.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "��Ȩ�� !", "��ʾ",JOptionPane.INFORMATION_MESSAGE);
					//ѡ�.setTabPlacement(JTabbedPane.RIGHT);
					����.setSelected(true);
				}
			});
			����.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "��Ȩ�� !", "��ʾ",JOptionPane.INFORMATION_MESSAGE);
					//ѡ�.setTabLayoutPolicy(JTabbedPane.WRAP_TAB_LAYOUT);
					����.setSelected(false);
				}
			});
			����.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "��Ȩ�� !", "��ʾ",JOptionPane.INFORMATION_MESSAGE);
					//ѡ�.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
					����.setSelected(false);
				}
			});
	}
	void ѡ���ʼ��() {
		JLabel ��ǩ=new JLabel("SVIP����ʹ��");
		��ǩ.setFont(new Font("΢���ź�",Font.PLAIN,14));
		��ǩ.setHorizontalAlignment(SwingConstants.CENTER);
		ѡ�.addTab("ѡ����", ��ǩ);
		JLabel ��ǩ2=new JLabel("SVIP����ʹ��");
		��ǩ2.setFont(new Font("΢���ź�",Font.PLAIN,14));
		��ǩ2.setHorizontalAlignment(SwingConstants.CENTER);
		ѡ�.addTab("�ƽ���", ��ǩ2);
		JLabel ��ǩ3=new JLabel("SVIP����ʹ��");
		��ǩ3.setFont(new Font("΢���ź�",Font.PLAIN,14));
		��ǩ3.setHorizontalAlignment(SwingConstants.CENTER);
		ѡ�.addTab("������", ��ǩ3);
	}
}

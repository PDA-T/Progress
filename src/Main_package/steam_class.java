package Main_package;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class steam_class extends JFrame{
	public steam_class() {
		setSize(300, 110);
		setLocationRelativeTo(null);
		setTitle("请输入激活码");
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container a=getContentPane();
		a.setLayout(new FlowLayout());
		JPasswordField ma=new JPasswordField();
		ma.setColumns(20);
		ma.setFont(new Font("宋体",Font.BOLD,20));
		ma.setEchoChar('*');
		/*ma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				char b[]=ma.getPassword();
				System.out.println(b);
			}
		});*/
		JButton an=new JButton("进入");
		a.add(ma);
		a.add(an);
		setVisible(true);
		an.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				if (ma.getText().equals("111")) {
					new Steam();
				}else {
					JOptionPane.showMessageDialog(null, "激活码错误 !", "提示",JOptionPane.INFORMATION_MESSAGE);
					System.exit(0);
				}
				//new Steam();
				//JOptionPane.showMessageDialog(null, "无权限 !", "提示",JOptionPane.INFORMATION_MESSAGE);
				//System.exit(0);
				//System.out.println("输入的是"+ma.getText());
				//ma.setText("");
				//ma.requestFocus();  //获取焦点
			}
		});
	}
}
class Steam extends JFrame{
	JTabbedPane 选项卡=new JTabbedPane();				//创建选项卡
	public Steam() {
			setSize(600, 400);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			setTitle("steam控制台");
			setVisible(true);
			Container a=getContentPane();
			JLabel 方向=new JLabel("steam激活码区");				//创建文本对象
			JLabel 布局=new JLabel("steam破解区");				//创建文本对象
			JPanel 面板1=new JPanel(new GridLayout(8,1));			//定义面板
			JRadioButton 顶部=new JRadioButton("限制区");		//创建单选按钮对象
			JRadioButton 底部=new JRadioButton("VIP区");		//创建单选按钮对象
			JRadioButton 左侧=new JRadioButton("SVIP区");		//创建单选按钮对象
			JRadioButton 右侧=new JRadioButton("至尊区");		//创建单选按钮对象
			JRadioButton 限制=new JRadioButton("SVIP区");			//创建单选按钮对象
			JRadioButton 滚动=new JRadioButton("至尊区");			//创建单选按钮对象
			ButtonGroup 控制=new ButtonGroup();					//单选控制
			ButtonGroup 控制2=new ButtonGroup();					//单选控制
			顶部.setSelected(true);限制.setSelected(false);
			面板1.setBorder(BorderFactory.createTitledBorder("操控台"));
			/**
			 * 添加全部组件
			 */
			a.add(面板1,BorderLayout.WEST);面板1.add(方向);控制.add(顶部);
			控制.add(底部);控制.add(左侧);控制.add(右侧);控制2.add(限制);控制2.add(滚动);
			面板1.add(顶部);面板1.add(底部);面板1.add(左侧);面板1.add(右侧);
			面板1.add(布局);面板1.add(限制);面板1.add(滚动);a.add(选项卡);选项卡初始化();
			/**
			 * 添加事件
			 */
			顶部.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//选项卡.setTabPlacement(JTabbedPane.TOP);
				}
			});
			底部.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "无权限 !", "提示",JOptionPane.INFORMATION_MESSAGE);
					//选项卡.setTabPlacement(JTabbedPane.BOTTOM);
					顶部.setSelected(true);
				}
			});
			左侧.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "无权限 !", "提示",JOptionPane.INFORMATION_MESSAGE);
					//选项卡.setTabPlacement(JTabbedPane.LEFT);
					顶部.setSelected(true);
				}
			});
			右侧.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "无权限 !", "提示",JOptionPane.INFORMATION_MESSAGE);
					//选项卡.setTabPlacement(JTabbedPane.RIGHT);
					顶部.setSelected(true);
				}
			});
			限制.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "无权限 !", "提示",JOptionPane.INFORMATION_MESSAGE);
					//选项卡.setTabLayoutPolicy(JTabbedPane.WRAP_TAB_LAYOUT);
					限制.setSelected(false);
				}
			});
			滚动.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "无权限 !", "提示",JOptionPane.INFORMATION_MESSAGE);
					//选项卡.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
					滚动.setSelected(false);
				}
			});
	}
	void 选项卡初始化() {
		JLabel 标签=new JLabel("SVIP区可使用");
		标签.setFont(new Font("微软雅黑",Font.PLAIN,14));
		标签.setHorizontalAlignment(SwingConstants.CENTER);
		选项卡.addTab("选择区", 标签);
		JLabel 标签2=new JLabel("SVIP区可使用");
		标签2.setFont(new Font("微软雅黑",Font.PLAIN,14));
		标签2.setHorizontalAlignment(SwingConstants.CENTER);
		选项卡.addTab("破解区", 标签2);
		JLabel 标签3=new JLabel("SVIP区可使用");
		标签3.setFont(new Font("微软雅黑",Font.PLAIN,14));
		标签3.setHorizontalAlignment(SwingConstants.CENTER);
		选项卡.addTab("进度区", 标签3);
	}
}

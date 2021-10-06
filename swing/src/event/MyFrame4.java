package event;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame4 extends JFrame implements ActionListener {

	Container container;
	
	public MyFrame4() {
		setTitle("������ ���� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//�������� ���̾ƿ� ����
		container=getContentPane();
		container.setLayout(new FlowLayout());
		//container.setBackground(Color.blue);
		
		//��ư �ΰ� ����
		JButton btn1=new JButton("���");
		btn1.addActionListener(this);
		JButton btn2=new JButton("����");
		btn2.addActionListener(this);
		
		//�ؽ�Ʈ ���,����
		add(btn1);
		add(btn2);
	
		
		
		setBounds(200, 100, 300, 200);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	String cmd=e.getActionCommand();//��� or ����
		
	if (cmd.equals("���")) {//������ ������ ������� ����
		container.setBackground(Color.yellow);	
	}else {//������ ���� ����
		container.setBackground(Color.red);
	}

	}

	public static void main(String[] args) {
		new MyFrame4();

	}

}

package layout;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

//flowlaypout:������Ʈ�� ���ʿ��� ���������� ��ġ �����ʿ� ���������� �Ʒ���
			
public class FlowLayoutTest1 extends JFrame{

	public FlowLayoutTest1() {
		setTitle("BorderLayout �׽�Ʈ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//�⺻ ���̾ƿ�borderLayout
		//���̾ƿ� ����
	
		//setlayout(new flowlayout())
		
		
						
	//���� �������� contentPane ��������
//	Container container =getContentPane();
	//contentpane�� ���ο� ���̾ƿ� ����
//	container.setLayout(new FlowLayout());
		
		JPanel panel =new JPanel();//�⺻���̾ƿ� FlowLayout
		//panel.setLayout(mgr);
		setContentPane(panel);
	;
		JButton btn1=new JButton("��ư1");
		 add(btn1);
		 JButton btn2=new JButton("��ư2");
		 add(btn2);
		 JButton btn3=new JButton("��ư3");
		 add(btn3);
		 JButton btn4=new JButton("��ư4");
		 add(btn4);
		 JButton btn5=new JButton("��ư5");
		 add(btn5); 
		 setSize(300,300);
			setVisible(true);
	}
	
	public static void main(String[] args) {
		FlowLayoutTest1 f =new FlowLayoutTest1();
		

	}

}

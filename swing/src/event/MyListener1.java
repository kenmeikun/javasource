package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*actionListener
//jbutton,jmenuitem,jtextfield ������Ʈ�� �̺�Ʈ ���
 * 
 * jbutton=>���콺��enter ��ư ����
 * jmenuitem=>�Ŵ�����
 * jtextField=>enter Ű �Է�
 * 
*/


public class MyListener1 implements ActionListener {

	

	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//�׼��� �Ͼ ��ü�� command ������
	System.out.println("e.getActionCommand()"+e.getActionCommand());
	System.out.println("e.getID"+e.getID());
	System.out.println("e.getSource"+e.getSource());

	}

}//actionlistener

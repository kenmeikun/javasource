package event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*actionListener
//jbutton,jmenuitem,jtextfield 컴포넌트의 이벤트 담당
 * 
 * jbutton=>마우스나enter 버튼 선택
 * jmenuitem=>매뉴선택
 * jtextField=>enter 키 입력
 * 
*/


public class MyListener1 implements ActionListener {

	

	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//액션이 일어난 객체의 command 가져옴
	System.out.println("e.getActionCommand()"+e.getActionCommand());
	System.out.println("e.getID"+e.getID());
	System.out.println("e.getSource"+e.getSource());

	}

}//actionlistener

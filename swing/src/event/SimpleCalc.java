package event;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalc extends JFrame implements ActionListener {

	private JTextField num1, num2, result;

	public SimpleCalc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("덧샘 계산기");

		setSize(450, 300);
		setVisible(true);

		// 상단 부착 패널 생성
		JPanel top = new JPanel();

		// 숫자입력 텍스트필드 생성
		num1 = new JTextField(10);
		top.add(num1);

		JLabel op = new JLabel("+");
		top.add(op);

		num2 = new JTextField(10);
		top.add(num2);

		JLabel op2 = new JLabel("=");
		top.add(op2);

		result = new JTextField(10);
		top.add(result);

		add(top, BorderLayout.NORTH);
		setVisible(true);

		// 하단 부착 패널 생성
		JPanel bottom = new JPanel();

		// 버튼 두개 생성후 add
		JButton btnok = new JButton("확인");
		btnok.addActionListener(this);
		
		JButton btnReset = new JButton("취소");
		btnReset.addActionListener(this);
		
		bottom.add(btnok);
		bottom.add(btnReset);

		add(bottom, BorderLayout.CENTER);

		setSize(450, 150);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		String cmd=e.getActionCommand();
		if (cmd.equals("확인")) {
			// 확인 버튼 클릭
			// num1,num2에 들어 있는 값 가져오기\
			try {
				
			
			int op1=Integer.parseInt(num1.getText());
			int op2=Integer.parseInt(num2.getText());
			// 가져온 숫자를 덧샘
			int total=op1+op2;
			// 결과를 result 보여주기
			result.setText(String.valueOf(total));
			
			} catch (Exception e2) {
				//e2.printStackTrace();//개발할때 예외 발생 단계출력
				
				//사용자에게 주고싶은 메시지 출력
				JOptionPane.showMessageDialog(getParent(),"입력값을 확인해 주세요");
			}
		}else  {
			// 취소 버튼 클릭
			// num1,num2, 에 들어있는 값 지우기
			 num1.setText("");
			 num2.setText("");
			 result.setText("");
		}
		

		

	}

	public static void main(String[] args) {
		new SimpleCalc();
//실행
	}

}

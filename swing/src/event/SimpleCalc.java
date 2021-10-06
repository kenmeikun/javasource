package event;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalc extends JFrame implements ActionListener {

	private JTextField num1, num2, result;

	public SimpleCalc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("���� ����");

		setSize(450, 300);
		setVisible(true);

		// ��� ���� �г� ����
		JPanel top = new JPanel();

		// �����Է� �ؽ�Ʈ�ʵ� ����
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

		// �ϴ� ���� �г� ����
		JPanel bottom = new JPanel();

		// ��ư �ΰ� ������ add
		JButton btnok = new JButton("Ȯ��");
		btnok.addActionListener(this);
		
		JButton btnReset = new JButton("���");
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
		if (cmd.equals("Ȯ��")) {
			// Ȯ�� ��ư Ŭ��
			// num1,num2�� ��� �ִ� �� ��������
			int op1=Integer.parseInt(num1.getText());
			int op2=Integer.parseInt(num2.getText());
			// ������ ���ڸ� ����
			int total=op1+op2;
			// ����� result �����ֱ�
			result.setText(String.valueOf(total));
		}else  {
			// ��� ��ư Ŭ��
			// num1,num2, �� ����ִ� �� �����
			 num1.setText("");
			 num2.setText("");
			 result.setText("");
		}
		

		

	}

	public static void main(String[] args) {
		new SimpleCalc();

	}

}

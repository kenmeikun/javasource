package exception;

public class CatchByException {

	public static void main(String[] args) {

		try {

			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			System.out.println(value1 + value2);
			
		}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("�Է°��� Ȯ���� �ּ���");
			
		} catch (NumberFormatException e) {

			System.out.println("���� ��ȯ �Ұ���.");
		} finally {// exception ���ο� ������� ������ ����
			System.out.println("�ٽý����ϼ���");
		}
	}

}

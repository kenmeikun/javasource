package classTest;

public class Triangle3 {
	//�ﰢ�� ���� ���ϱ�
	//�غ�*����/2
	private int baseline;
	private int hei;
	
	//�����ڴ� �⺻������
	 Triangle3(int baseline,int hei) {
			this.baseline=baseline;
			this.hei=hei;
		}
	
	//�Ӽ� :�غ�, ����
	//���(�޼ҵ�):�غ�*����/2 ��� ����
	int getArea(){
		return baseline*hei/2;
	}
	

	
	
}

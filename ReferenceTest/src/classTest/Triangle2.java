package classTest;

public class Triangle2 {
	//�ﰢ�� ���� ���ϱ�
	//�غ�*����/2
	private int baseline;
	private int hei;
	
	//�����ڴ� �⺻������
	 Triangle2(int baseline,int hei) {
			this.baseline=baseline;
			this.hei=hei;
		}
	
	//�Ӽ� :�غ�, ����
	//���(�޼ҵ�):�غ�*����/2 ��� ����
	int getArea(){
		return baseline*hei/2;
	}
	

	
	
}

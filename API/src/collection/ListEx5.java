package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*���������� �߰�.���� �� arrayList ���� ���� =>size ũ�� ��°� �߿�
 * �߰� �����͸� �߰�/���� ��  linkedList �� �� �� ����
*/
public class ListEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arrayList= new ArrayList<String>(2000000);
		List<String> linkedList= new LinkedList<String>();
		
		System.out.println("******�������߰�******");
	System.out.println("��̸���Ʈ �ɸ��ð�:"+add1(arrayList));	
	System.out.println("��ũ����Ʈ  �ɸ��ð�:"+add1(linkedList));	
	
	System.out.println();
	
	System.out.println("******�߰����� �߰�******");
	System.out.println("��̸���Ʈ �ɸ��ð�:"+add2(arrayList));	
	System.out.println("��ũ����Ʈ  �ɸ��ð�:"+add2(linkedList));	
	System.out.println();
	System.out.println("******�߰����� ����******");
	System.out.println("��̸���Ʈ �ɸ��ð�:"+remove1(arrayList));	
	System.out.println("��ũ����Ʈ  �ɸ��ð�:"+remove1(linkedList));	
	System.out.println();
	System.out.println("******���������� ����******");
	System.out.println("��̸���Ʈ �ɸ��ð�:"+remove2(arrayList));	
	System.out.println("��ũ����Ʈ  �ɸ��ð�:"+remove2(linkedList));	
	
	
	}//����
	//�������� �߰�
	public static long add1(List<String> list) {
		long start=System.currentTimeMillis();
		for (int i = 0; i <1000000; i++) {
			list.add(i+"");
		}
		long end=System.currentTimeMillis();
		return end-start;
	}
	//�߰����� �߰���
	public static long add2(List<String> list) {
		long start=System.currentTimeMillis();
		for (int i = 0; i <10000; i++) {
			list.add(500,"X");
		}
		long end=System.currentTimeMillis();
		return end-start;
	}//
	
	//�߰����� ����
	public static long remove1(List<String> list) {
		
		long start=System.currentTimeMillis();
		for (int i = 0; i <10000; i++) {
			list.remove(i);
		}
		long end=System.currentTimeMillis();
		return end-start;
	}
	
	//�������λ���	
	public static long remove2(List<String> list) {
		
		long start=System.currentTimeMillis();
		for (int i =list.size()-1; i >=0; i--) {
			list.remove(i);
		}
		long end=System.currentTimeMillis();
		return end-start;
	}

}

package collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx3 {
	public static void main(String[] args) {
		
	
		//���� 
	List<Member> list =new ArrayList<Member>();
	
	//�߰�
	list.add(new Member("Hong","hong1234","ȫ�浿"));
	list.add(new Member("Hong1","hong12345","��浿"));
	list.add(new Member("Hong2","hong12346","�ұ浿"));
	list.add(new Member("Hong3","hong12347","�Ʊ浿"));
	list.add(new Member("Hong4","hong12348","�ñ浿"));
	//��������
System.out.println(list);

System.out.println();

for (Member member : list) {
	System.out.println(member);
}
	
	}
}

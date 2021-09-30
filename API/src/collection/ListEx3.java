package collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx3 {
	public static void main(String[] args) {
		
	
		//생성 
	List<Member> list =new ArrayList<Member>();
	
	//추가
	list.add(new Member("Hong","hong1234","홍길동"));
	list.add(new Member("Hong1","hong12345","장길동"));
	list.add(new Member("Hong2","hong12346","밈길동"));
	list.add(new Member("Hong3","hong12347","아길동"));
	list.add(new Member("Hong4","hong12348","시길동"));
	//가져오기
System.out.println(list);

System.out.println();

for (Member member : list) {
	System.out.println(member);
}
	
	}
}

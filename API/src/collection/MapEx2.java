package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEx2 {

	public static void main(String[] args) {
		Map<String, String> map =new HashMap<String, String>();

		
			map.put("id_0123", "홍길동");
			map.put("id_0124", "장길동");
			map.put("id_0125", "송길동");
			map.put("id_0126", "최길동");
			
			
			
			//가져오기
			Set<String> keys=map.keySet();
			Iterator<String> iter =keys.iterator();
			while (iter.hasNext()) {
//				System.out.println(iter.next());
				String userid=iter.next();
				String value =map.get(userid);
				System.out.println(userid+" "+value);
			
			}
			System.out.println();
			
			//map.entry 객체 사용
		Set<Entry<String,String>> entrySet	=map.entrySet();
		Iterator<Entry<String,String>> iter2	=entrySet.iterator();
		
		while (iter2.hasNext()) {
			Entry<String,String> entry=iter2.next();
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
			
	}//

}

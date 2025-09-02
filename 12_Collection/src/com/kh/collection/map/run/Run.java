package com.kh.collection.map.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.collection.map.model.vo.Snack;

public class Run {

	public static void main(String[] args) {
		
		HashMap<String , Snack> hm = new HashMap<>();
		
		//List, Set 계열의 클래스들은 Collection 을 구현한 클래스임(최상위가 컬렉션)
		//데이터 추가할 때 add 를 사용했었음
		
		//Map 계열은 Collection 을 구현한 클래스가 아님
		// => 데이터를 추가할 때 put 메소드를 사용한다. 키-밸류 세트로 저장해야 함.
		
		// 1. put(K key, V value) -> Map 에 키 - 밸류 세트로 추가해주는 메소드
		hm.put("새우깡", new Snack("고소",500));
		hm.put("프링글스", new Snack("짠맛",2000));
		hm.put("먹태깡", new Snack("먹태맛",600));

		hm.put("고소미",new Snack("고소", 500));
		
		System.out.println(hm);
		
		//저장 순서가 유지되지 않는다. value 값이 중복 되도, key 값이 다르면 잘 저장된다.
		
		hm.put("새우깡", new Snack("짭짤",300));
		System.out.println(hm);
		
		//동일한 키값으로 데이터를 추가하는 경우, value 값이 덮어씌워진다.
		
		//2. get(Object key) -> value 값을 리턴해준다.
		
		Snack s= hm.get("먹태깡");
		System.out.println(s);
		
		//3. size() >> Map 에 저장된 데이터 개수를 반환해준다.
		System.out.println("저장된 데이터 수 : " + hm.size());
		
		
		//4. replace(K key, V value)
		// => Map 에서 해당 key 값을 찾아서 전달한 value 값을 수정
		hm.replace("프링글스", new Snack("갈릭맛",800));
		System.out.println(hm.get("프링글스"));
		
		
		//5. remove(Object key)
		// => Map 에서 해당 key 값을 찾아서 key-value 세트를 삭제해준다.
		hm.remove("새우깡");
		System.out.println(hm);
		
		//--------------------------------------------------------
		// ArrayList 변환 => x
		// ArrayList list = new ArrayList(hm);
		// => Map 은 Collection 기반이 아니기 떄문에 불가함!
		
		// Iterator 사용 -> x
		// Iterator it = hm.iterator(); // Map 은 iterator() 메소드 X
				
		// Map -> Set 바꿔주는 메소드 이용
		// Map -> Set -> Iterator 
		
		//1. keySet() -> 키값들로만 Set 형태로 반환
		
		// 1) Map 에 있는 키 들만 Set 에 담기
		Set<String> kSet = hm.keySet();
		// 2)kSet을 Iterator 담기
		Iterator<String> itKey = kSet.iterator();
		
		// 3) 반복문 사용하여 데이터 접근
		while(itKey.hasNext()) {
			String key = itKey.next();
			Snack value = hm.get(key);
			
			System.out.println(key + ":" + value);
		}
		// 2.entrySet()  -> 키-밸류 데이터를 Entry 로 감싼 Set 으로 반환
		
		// 1) hm.entrySet() ->>>>:Set
		
		Set<Entry<String, Snack>> entrySet = hm.entrySet();
		
		// 2) entrySet.iterator() --> Iterator
		Iterator<Entry<String, Snack>> itEntry = entrySet.iterator();
		
		// 3) 반복문
		while( itEntry.hasNext()) {
			Entry<String, Snack> entry = itEntry.next();
			
			String Key = entry.getKey();
			Snack value = entry.getValue();
			
			System.out.println(Key + ": :" + value);
		}
	}

}

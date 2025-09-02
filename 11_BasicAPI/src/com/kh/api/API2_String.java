package com.kh.api;

public class API2_String {

	public static void main(String[] args) {
		
		//test1();
		test2();

	}
	public static void test1() {
		
		String str1 = "Happy";
		String str2 = "Happy";
		
		System.out.println(str1 == str2);
		//결과가 true 인 이유?
		// 문자열 값 자체를 대입하게 되면 "상수풀"이라는 공간에 저장되어
		// 같은 곳을 가리키게 됨 (주소값이 같다.)
		
		System.out.println( str1 == "Happy");
		// str1 이 가리키고 있는 주소와 "Happy"라는 값 자체가 저장된 주소를 비교
		// => 결국 둘 다 같은 곳을 가리키게 된다. 그래서 true
		
		System.out.println("========================================");
		//--------------
		String str3 = new String("Happy");
		String str4 = new String("Happy");
		
		System.out.println(str3 == str4);
		// => 문자열 개체를 생성하여, 값을 대입하게 되면, 메모리 새로운 영역에
		//할당하므로, 각각 다른 위치에 저장된다.(new = 새로운 공간에 할당)
		
		System.out.println( str3 == "Happy");
		//=> str3 이 가리키는 주소와 "Happy" 값 자체는 상수풀에 저장되어 다름.
		// 문자열 값을 비교하고자 할 때 : equals
		System.out.println(str3.equals("Happy"));
		
		System.out.println("========================================");
		
		String str5 = "Good";
		String str6 = "Luck";
		
		System.out.println(str5);
		System.out.println(str5.toString());
		//=> String 클래스에서 toString() 재정의되어있음
		//toString = 저장된 값을 리턴하도록 재정의 한다.
		
		// 주소값(해시값)을 확인하는 메소드 : System.identityHashCode(변수)
		int hash = System.identityHashCode(str5);
		System.out.println(hash);
		
		//문자열을 합쳐주는 메소드 : concat
		str5 = str5.concat(str6);
		System.out.println(str5);
		
		int hash2 = System.identityHashCode(str5);
		System.out.println(hash2);
		
		//문자형 배열로 변환
		
		char[] arr = str1.toCharArray();
		System.out.println(arr[0]);
		
		// 문자열 배열 -> 문자열로 변환 = static valueOf(배열):String
		System.out.println(String.valueOf(arr));
	}
	public static void test2() {
		//equals = 문자열A.equals(문자열b)-> boolean 형식으로 참 거짓확인
		String str1 = "Hello";
		System.out.println(str1.equals("Hello"));
		System.out.println(str1.equals("Jello"));
		
		// charAt => 문자열.charAt(인덱스)
		// 문자열에서 인덱스 위치의 문자를 리턴
		System.out.println(str1.charAt(1));
		
		// length 문자열.lenght() => 해당 문자열의 길이
		System.out.println(str1.length());
		
		// str1 변수의 마지막 문자
		
		System.out.println(str1.charAt(str1.length()-1));
		
		//toUpperCase = 문자열.toUpperCase() : 문자열 알파벳 전부 대문자로
		//toLowerCase = 문자열.toLowerCase() : 모두 소문자로 리턴
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		
		//contains => 문자열A.contains(문자열b)
		//문자열 A에 문자열 b가 포함되어있는지 확인하여 리턴 (boolean)
		System.out.println(str1.contains("ef"));
		
		// indexOf => 문자열A.indexOf(문자열B):int 타입으로 반환됨
		//			문자열 A에 문자열B의 시작 인덱스를 리턴
		System.out.println(str1.indexOf("el"));
		System.out.println(str1.indexOf("tt"));
		
		// substring => 문자열.substring(시작인덱스) 
		// 문자열에서 시작인덱스부터 마지막 위치까지 문자열을 추출하여 리턴
		// 문자열.substring(시작인덱스,끝인덱스) -> 문자열 반환
		// 문자열 시작 인덱스 + 끝 인덱스 -1(직전까지) 문자열 추출
		
		System.out.println(str1.substring(2,4));
		System.out.println(str1.substring(0,4));
		
		//repeat => 문자열.repeat(개수) ->문자열로 반환
		//문자열을 개수만큼 반복하여 문자열 반환
		System.out.println(str1.repeat(5));
		
		//split => 문자열.split(구분자) ->문자열 배열 형태로 반환
		//해당 문자열을 구분자를 기준으로 분리하여 문자열 배열 형태로 반환해준다.
		String str2 = "JAVA#PYTHON#SQL";
		String[]arr = str2.split("#");
		
		for(String s : arr) {
			System.out.println(s);
		}
		
	}

}

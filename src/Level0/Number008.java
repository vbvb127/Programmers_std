package Level0;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Number008 {
/*
 <중복된 문자 제거>
 
 문자열 my_string이 매개변수로 주어집니다.
 my_string에서 중복된 문자를 제거하고 하나의 문자만 남긴 문자열을 return하도록 solution 함수를 완성해주세요.

#제한사항 
1 ≤ my_string ≤ 110
my_string은 대문자, 소문자, 공백으로 구성되어 있습니다.
대문자와 소문자를 구분합니다.
공백(" ")도 하나의 문자로 구분합니다.
중복된 문자 중 가장 앞에 있는 문자를 남깁니다
 
입출력 예 #1
"people"에서 중복된 문자 "p"와 "e"을 제거한 "peol"을 return합니다.

입출력 예 #2
"We are the world"에서 중복된 문자 "e", " ", "r" 들을 제거한 "We arthwold"을 return합니다.
 
 */
	 public String solution(String my_string) {
		 String answer = "";
		 
		 //중복을 허용하지 않고, 순서 상관 없는 set타입 = hashSet
		 //중복을 허용하지 않고, add한 순서대로 가져오는 set타입 = LinkedHashSet
		 LinkedHashSet<Character> tmp = new LinkedHashSet<>();
		 for(int i = 0; i<my_string.length(); i++) {
			tmp.add(my_string.charAt(i));
		 }
		
		 //값이 있으면 가져오는 Iterator
		 Iterator<Character> iter = tmp.iterator();
		 
		 while(iter.hasNext()) {
			 answer += iter.next();
		 }
		 
		 return answer;
	 }
	public static void main(String[] args) {
		Number008 number = new Number008();
		System.out.println(number.solution("We are the world"));
	}

}

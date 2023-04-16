package Level0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 <옹알이 (1) >
머쓱이는 태어난 지 6개월 된 조카를 돌보고 있습니다. 
조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음을 최대 한 번씩 사용해 조합한(이어 붙인) 발음밖에 하지 못합니다. 
문자열 배열 babbling이 매개변수로 주어질 때, 머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록 solution 함수를 완성해주세요.


#제한사항
 - 1 ≤ babbling의 길이 ≤ 100
 - 1 ≤ babbling[i]의 길이 ≤ 15
 - babbling의 각 문자열에서 "aya", "ye", "woo", "ma"는 각각 최대 한 번씩만 등장합니다.
즉, 각 문자열의 가능한 모든 부분 문자열 중에서 "aya", "ye", "woo", "ma"가 한 번씩만 등장합니다.
 - 문자열은 알파벳 소문자로만 이루어져 있습니다.

입출력 예 #1
["aya", "yee", "u", "maa", "wyeoo"]에서 발음할 수 있는 것은 "aya"뿐입니다. 따라서 1을 return합니다.

입출력 예 #2
["ayaye", "uuuma", "ye", "yemawoo", "ayaa"]에서 발음할 수 있는 것은 "aya" + "ye" = "ayaye", "ye", "ye" + "ma" + "woo" = "yemawoo"로 3개입니다. 따라서 3을 return합니다.
*/

public class Number012 {

	public int solution(String[] babbling) {
		int count = 0;
		Set<String> tmpStr = new HashSet<String>(); //옹알이 중 중복값을 제거 하기 위한 변수
		List<String> list = new ArrayList<String>();//전체 매개변수 count를 위한 변수
		String [] word = {"aya", "ye", "woo", "ma"};
		
		
		for(int i = 0; i<babbling.length; i++) {
			String tmp = ""; //매개변수의 일부가 옹알이에 포함되는 경우
			String str = ""; //매개변수 단어
			for(int j = 0; j<babbling[i].length(); j++) { //제시된 문자열 
				char ch = babbling[i].charAt(j); //제시된 문자열 순서대로 확인 하기 위한 for문
				tmp += ch;
				for(int k = 0; k<word.length; k++) { //조카가 말 할 수 있는 옹알이 
					if(tmp.equals(word[k])) { //조카가 말 할 수 있는 옹알이 라면
						if(tmpStr.add(tmp)) { //조카가 말했던 옹알이라면
							str+=tmp;
							System.out.println(str);
							tmp = "";
						}else {
							list.add(str);
							System.out.println(str);
							tmp ="";
						}
					tmpStr = new HashSet<String>();
						
						
					}
				}
			
				if(str.equals(babbling[i])) {
					list.add(str);
				}
			
			}
		}
		System.out.println(list);
		count = list.size();
        return count;
    }
	
	
	public static void main(String[] args) {
		Number012 number = new Number012();
		String []  babbling = {"ayaye", "ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
		System.out.println(number.solution(babbling));
		
	}

}

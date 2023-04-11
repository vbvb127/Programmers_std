package Level0;

import java.util.Arrays;

public class Number005 {

/*
 
 <외계 행성의 나이>
 
우주여행을 하던 머쓱이는 엔진 고장으로 PROGRAMMERS-962 행성에 불시착하게 됐습니다. 
입국심사에서 나이를 말해야 하는데, PROGRAMMERS-962 행성에서는 나이를 알파벳으로 말하고 있습니다.
a는 0, b는 1, c는 2, ..., j는 9입니다. 예를 들어 23살은 cd, 51살은 fb로 표현합니다. 
나이 age가 매개변수로 주어질 때 PROGRAMMER-962식 나이를 return하도록 solution 함수를 완성해주세요.
 
#제한사항 
- age는 자연수입니다.
- age ≤ 1,000
- PROGRAMMERS-962 행성은 알파벳 소문자만 사용합니다.

입출력 예 #1
- age가 23이므로 "cd"를 return합니다.

입출력 예 #2
- age가 51이므로 "fb"를 return합니다.

입출력 예 #3
- age가 100이므로 "baa"를 return합니다.
 */
	
 public String solution(int age) {
	String answer = "";
	char a = 97; //소문자 a의 아스키 코드는 97, 대문자 A는 65
	
		
	//1. age의 자리수 구하기
	//   - 숫자를 문자로 변환하여 문자의 길이를 반환
	String ageStr = Integer.toString(age);
	char [] ageChar = new char[ageStr.length()];

	//2. age의 각 자리수를 배열에 넣기
	//  - 배열에 넣을 때 char형식으로 변환하여 숫자 0일 경우 a로 변환
	// 	- 몫으로 가져오기 때문에 오른쪽 수부터 가져옴 (1의 자리)  
	for(int i=0; i<ageStr.length(); i++) {
		ageChar[ageStr.length()-i-1] = (char)(97+(age%10)); // 97 = a : 이걸 초기 값(0)으로 생각
		age = age/10;
	
	}

	//3. 배열에 담긴 글자를 순서대로 가져오기
	for(int i = 0; i <ageChar.length; i++) {
		answer += ageChar[i];
	}
	
	return answer;
 }
	
	
	public static void main(String[] args) {

		
		Number005 number = new Number005();
		System.out.println(number.solution(100));
	}

}

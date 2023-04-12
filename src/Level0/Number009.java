package Level0;

import java.util.HashMap;
import java.util.Map;

public class Number009 {
/*   
모스부호(1) 

머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다. 
그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다. 문자열 letter가 매개변수로 주어질 때,
letter를 영어 소문자로 바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
모스부호는 다음과 같습니다. 
 
morse = { 
    '.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',
    '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',
    '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',
    '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',
    '-.--':'y','--..':'z'
} 
 
 
#제한사항
1 ≤ letter의 길이 ≤ 1,000
return값은 소문자입니다.
letter의 모스부호는 공백으로 나누어져 있습니다.
letter에 공백은 연속으로 두 개 이상 존재하지 않습니다.
해독할 수 없는 편지는 주어지지 않습니다.
편지의 시작과 끝에는 공백이 없습니다.

입출력 예 #1
.... = h
. = e
.-.. = l
.-.. = l
--- = o
따라서 "hello"를 return 합니다.

입출력 예 #2
.--. = p
-.-- = y
- = t
.... = h
--- = o
-. = n
따라서 "python"을 return 합니다.    
    
    
*/
	
	public String solution(String letter) {
		String answer = "";
		
		//a ~ z에 해당하는 모스부호가 순서대로 담긴 배열
		String [] mos_key = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."}; 
		
		//a~z에 해당하는 모스부호를 map타입에 저장하기
		Map<String,Character> mos_key_value = new HashMap<String,Character>();
		int a = 97; //아스키코드
		
		for(int i = 0; i<mos_key.length; i++) {
			mos_key_value.put(mos_key[i],(char)(a+i));
		}
		
		
		//1. string 배열에 " "를 기준으로 자른 결과값 저장
		String [] mos = letter.split(" ");
		
		//2. 편지의 시작과 끝에는 공백이 없음을 만족하기 위해 앞뒤 공백 제거
		for(int i = 0; i <mos.length; i++) {
			mos[i] = mos[i].trim();
			answer += mos_key_value.get(mos[i]);
		}

		return answer;
	 }
	
	
	
	public static void main(String[] args) {
		Number009 number = new Number009();
		System.out.println(number.solution(".--. -.-- - .... --- -."));
	}

}

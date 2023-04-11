package Level0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 <최댓값 만들기 (2)>
 
정수 배열 numbers가 매개변수로 주어집니다. 
numbers의 원소 중 두 개를 곱해 만들 수 있는 최댓값을 return하도록 solution 함수를 완성해주세요.
 
#제한사항
-10,000 ≤ numbers의 원소 ≤ 10,000
2 ≤ numbers 의 길이 ≤ 100 
 
-입출력 예 #1
두 수의 곱중 최댓값은 -3 * -5 = 15 입니다.

-입출력 예 #2
두 수의 곱중 최댓값은 10 * 24 = 240 입니다.

-입출력 예 #3
두 수의 곱중 최댓값은 20 * 30 = 600 입니다.
 
 */

public class Number004 {

	 public int solution(int[] numbers) {
	        int answer = 0;
	        int tmp = 0;
	        List<Integer> list = new ArrayList<Integer>();
	      
	        for(int i = 0;i<numbers.length; i++) {
	        	for(int j = i+1; j<numbers.length; j++ ) {
	        		tmp = numbers[i] * numbers[j];
	        		list.add(tmp);
	        	}
	        }
	        
	        answer =  Collections.max(list); //가장 큰 수 가져오기
	        return answer;
	    }
	
	public static void main(String[] args) {

		Number004 number = new Number004();
		
		int[] numbers = new int[5];
		numbers[0] =  1;
		numbers[1] =  2;
		numbers[2] = -3;
		numbers[3] =  4;
		numbers[4] = -5;
		
		System.out.println(number.solution(numbers));
		
	}

}

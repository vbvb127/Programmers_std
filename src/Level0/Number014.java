package Level0;

import java.util.Arrays;

/*
<n 번째 원소까지>

 정수 리스트 num_list와 정수 n이 주어질 때, num_list의 첫 번째 원소부터 n 번째 원소까지의 모든 원소를 담은 리스트를 return하도록 solution 함수를 완성해주세요.
 
 
# 제한사항
 - 2 ≤ num_list의 길이 ≤ 30
 - 1 ≤ num_list의 원소 ≤ 9
 - 1 ≤ n ≤ num_list의 길이 ___
 
 
 입출력 예 #1
[2, 1, 6]의 첫 번째 원소부터 첫 번째 원소까지의 모든 원소는 [2]입니다.

입출력 예 #2
[5, 2, 1, 7, 5]의 첫 번째 원소부터 세 번째 원소까지의 모든 원소는 [5, 2, 1]입니다.
 
 */


public class Number014 {
	 public int[] solution(int[] num_list, int n) {
		 
	        int[] answer = {};
	        
	        answer = new int[n]; //값이 final인 배열에 길이 할당
	        
	        for(int i = 0; i<answer.length; i++) {
	        	answer[i] = num_list[i];
	        }
	        
	        return answer;
	    }

	public static void main(String[] args) {
		
		Number014 number = new Number014();
		int [] num_list = {5, 2, 1, 7, 5};
		
		System.out.println(Arrays.toString(number.solution(num_list, 3)));

	}

}

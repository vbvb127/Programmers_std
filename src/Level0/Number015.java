package Level0;

import java.util.Arrays;


/*
<분수의 덧셈>

 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.

#제한사항
 - 0 <numer1, denom1, numer2, denom2 < 1,000
 
 입출력 예 #1
1 / 2 + 3 / 4 = 5 / 4입니다. 따라서 [5, 4]를 return 합니다.

입출력 예 #2
9 / 2 + 1 / 3 = 29 / 6입니다. 따라서 [29, 6]을 return 합니다
 
 */

public class Number015 {

	public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int x = denom1 * denom2;
        int y = (numer1 * denom2) + (numer2 * denom1);
       
        
        for(int i=x; i>=1; i--) {
        	if(x%i == 0 && y%i ==0) {
        		x = x/i;
        		y = y/i;
        	}
        }
        
        answer[0] = y;
        answer[1] = x;
        return answer;
    }
	
	public static void main(String[] args) {
		Number015 number = new Number015();
		System.out.println(   Arrays.toString(number.solution(1, 2, 3, 4))  );
	}

}

package Level0;

public class Number010 {
/*
 팩토리얼
 
i팩토리얼 (i!)은 1부터 i까지 정수의 곱을 의미합니다. 
예를들어 5! = 5 * 4 * 3 * 2 * 1 = 120 입니다. 
정수 n이 주어질 때 다음 조건을 만족하는 가장 큰 정수 i를 return 하도록 solution 함수를 완성해주세요.
 
 - i! ≤ n
 
# 제한사항
0 < n ≤ 3,628,800
 
입출력 예 #1
10! = 3,628,800입니다. n이 3628800이므로 최대 팩토리얼인 10을 return 합니다.

입출력 예 #2
3! = 6, 4! = 24입니다. n이 7이므로, 7 이하의 최대 팩토리얼인 3을 return 합니다.
 
 */
	
	public int solution(int n) {
		int answer = 0;
		int tmp = 0;
		
		while(true) {
			for(int i = 1; i <=n ; i++) {
				//받은 값인 n을 1,2,3...(+1)로 나누고
				//몫이 1보다 크다면 cnt하고 아니면 break
				tmp = n/i; 
				if(tmp>=1) {
					answer++;
					n = tmp; //몫은 다시 (i+1)값으로 나누어야 하니까 변수에 담아 줌
				}else {
					break;
				}
			}
			break;
		}
		
		return answer;
	}
	

	public static void main(String[] args) {
		Number010 number = new Number010();
		System.out.println(number.solution(3628800));
	}

}

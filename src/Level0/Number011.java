package Level0;

public class Number011 {
/*
  <k의 개수>
 1부터 13까지의 수에서, 1은 1, 10, 11, 12, 13 이렇게 총 6번 등장합니다.
   정수 i, j, k가 매개변수로 주어질 때, i부터 j까지 k가 몇 번 등장하는지 return 하도록 solution 함수를 완성해주세요.
  
#제한사항
1 ≤ i < j ≤ 100,000
0 ≤ k ≤ 9
  
입출력 예 #1
본문과 동일합니다.

입출력 예 #2
10부터 50까지 5는 15, 25, 35, 45, 50 총 5번 등장합니다. 따라서 5를 return 합니다.

입출력 예 #3
3부터 10까지 2는 한 번도 등장하지 않으므로 0을 return 합니다.
  
 */
	final static int TEN = 10;
	public int solution(int i, int j, int k) {
		int count = 0;
		
		int tmp1 = 0; //나머지
		int tmp2 = 0; //몫
		
		
		for(int start = i; start <= j; start++) {
			
			tmp1 = start % TEN;
			tmp2 = start / TEN;
			
			while(true) {
			if(tmp2 > 0) {
				if (tmp1 == k) { count++; }
				tmp1 = tmp2 % TEN;
				tmp2 = tmp2 / TEN;
			}else {
				if(tmp1 == k) {	count++; break;}
				break;
			}
				

			}

		}

		return count;
	}
	
	public static void main(String[] args) {
		Number011 number = new Number011();
		System.out.println(number.solution(10, 50, 5));
	}

}

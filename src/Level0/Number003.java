package Level0;
/*
 <주사위의 개수>
 머쓱이는 직육면체 모양의 상자를 하나 가지고 있는데 이 상자에 정육면체 모양의 주사위를 최대한 많이 채우고 싶습니다. 
 상자의 가로, 세로, 높이가 저장되어있는 배열 box와 주사위 모서리의 길이 정수 n이 매개변수로 주어졌을 때, 
 상자에 들어갈 수 있는 주사위의 최대 개수를 return 하도록 solution 함수를 완성해주세요.
 
#제한사항
box의 길이는 3입니다.
box[0] = 상자의 가로 길이
box[1] = 상자의 세로 길이
box[2] = 상자의 높이 길이
1 ≤ box의 원소 ≤ 100
1 ≤ n ≤ 50
n ≤ box의 원소
주사위는 상자와 평행하게 넣습니다.
 
-- 입출력 예 #1
상자의 크기가 가로 1, 세로 1, 높이 1이므로 모서리의 길이가 1인 주사위는 1개 들어갈 수 있습니다.

입출력 예 #2
--상자의 크기가 가로 10, 세로 8, 높이 6이므로 모서리의 길이가 3인 주사위는 12개 들어갈 수 있습니다.
 
 
 >> (상자 길이 - 주사위 모서리) 각각 구해서 주사위 몇 개 들어가는지 확인 
 
 
 
 */


public class Number003 {

	 public int solution(int[] box, int n) {
	        int answer = 0;
	        
	        int width = 0; //가로
	        int length = 0; //세로
	        int height = 0; //높이
	        
	        
	        while( box[0]-n >=0) {
	        	box[0] = box[0] - n; 
	        	width++;
	        }
	        
	        while(box[1]-n >= 0) {
	        	box[1] = box[1] - n; 
	        	length++;
	        }
	        
	        while(box[2]-n >= 0) {
	        	box[2] = box[2] - n; 
	        	height++;
	        }
	        
	        answer = width * length * height ;
	        return answer;
	    }
	
	
	public static void main(String[] args) {
		
		Number003 number = new Number003();
		int[] box = new int[3];
		
		box[0] = 1;
		box[1] = 1;
		box[2] = 1;
		
		System.out.println(number.solution(box, 1));
	}
}

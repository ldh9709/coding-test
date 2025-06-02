/* 
 * [두 정수 사이의 합]
 * 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요.
 * 예를 들어 a = 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
 * a = 3, b = 5  => 12 | a = 3, b = 3 => 3 | a = 5, b = 3 => 12
 */
public class SumBetweenTwoIntegers {
	
	public long solution(int a, int b) {
		
        long answer = 0;
        
        while (a != b) {
        	if(a < b) {
        		answer += a++;
        	} else if (a > b) {
        		answer += b++;
        	} 
		}
        
        if(a == b) {
        	answer += a;
        }

        return answer;
    }
}

/* 답안을 보고 느낀점
 * min, max 사용 
 * int start = Math.max(a, b)
 * int end = Math.min(a, b)
 * for(int i = start, i <= end; i++) {
 * answer += i;
 * }
 * 혹은 등차수열 사용
 */

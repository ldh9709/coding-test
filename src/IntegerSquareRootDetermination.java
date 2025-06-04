/*
 * 임의의 양의 정수 n에 대해, 
 * n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
 * n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, 
 * n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
 *  n  return
 * 121	144
 *	3	-1
 * n은 1이상, 50000000000000 이하인 양의 정수
 */
/*----- 문제 해결 못함 -----*/
public class IntegerSquareRootDetermination {

	public long solution(long n) {
        
		long answer = 0;
		
		long root = (long) Math.sqrt(n);
		
		if(root * root == n) {
			answer = (root+1) * (root+1);
		} else {
			answer = -1;
		}
		
		
		return answer;
    }
}

/* 답안을 보고 느낀점
 * Math.sqrt(n) => 제곱근 구하는 함수
 * Math.pow(n, 2) => 제곱을 계산하는 함수
 * Math.pow((long)Math.sqrt(n), 2) == n) => 제곱근을 구하고 제곱을 했을 때 n이 되는가?

 * long sqrt = (long)Math.sqrt(n);
 * if(sqrt * sqrt = n) {
 * 	return (sqrt+1) * (sqrt+1);
 * } else {
 * return -1;
 * }
 */

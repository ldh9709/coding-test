/*
 * 함수 solution은 정수 n을 매개변수로 입력받습니다. 
 * n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 
 * 예를들어 n이 118372면 873211을 리턴하면 됩니다.
 */
package lv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortIntegersInDescendingOrder {
    public long solution(long n) {
        long answer = 0;
        List<Long> list = new ArrayList<>();
        for(; n != 0; ) {
        	System.out.println("n % 10 : " + n % 10);
        	long temp = n % 10;
        	n = n / 10;
        	list.add(temp);
        }
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        for (Long lists : list) {
        	answer *= 10;
        	answer += lists;
		}
        
        return answer;
    }
}
/* 답안을 보고 느낀점
 * 1. 숫자를 문자열로 변환(String.valueOf(n).toCharArray())
 * 2. 배열을 문자열로 변환(StringBuilder, 변수.append 사용)
 * 3. 문자열을 다시 long으로 변환(Long.parseLong(sb.toString()))
 *  // 숫자를 문자열로 변환 → 문자 배열로 변환
    char[] chars = String.valueOf(n).toCharArray();

    // char 배열을 내림차순 정렬 (람다를 사용해 박싱)
    Character[] arr = new Character[chars.length];
    for (int i = 0; i < chars.length; i++) {
        arr[i] = chars[i];
    }
    Arrays.sort(arr, Collections.reverseOrder());

    // 다시 문자열로 조합 후 long 변환
    StringBuilder sb = new StringBuilder();
    for (char c : arr) {
        sb.append(c);
    }

    return Long.parseLong(sb.toString());
 */

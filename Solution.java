package kakao;
import java.util.*;


class Solution {
    public int solution(int[] arr) {
    	int total = 45;
    	
    	int sum = Arrays.stream(arr).sum();
    	
    	return total - sum;
    	
    	
    	
    	
       
    }
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        	
        	System.out.println("숫자를 입력");
        	String input = scan.next();
        	int[] arr = Arrays.stream(input.split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        Solution sol = new Solution();
        int total = sol.solution(arr);
        System.out.println(total);
        
        	
    }
}
package kakao;
import java.util.*;


class Solution2 {
    public int solution(int[] arr) {
    	int total = 45;
    	
    	int sum = Arrays.stream(arr).sum();
    	
    	return total - sum;
    }
    
    public static void main(String[] args){
        Solution2 sol = new Solution2();
        int arr1[] = {1,2,3,4,6,7,8,0};
        int arr2[] = {5,8,4,0,6,7,9};
        System.out.println(sol.solution(arr1));
        System.out.println(sol.solution(arr2));
        
        	
    }
}
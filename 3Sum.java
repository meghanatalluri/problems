public class Solution {
    public int threeSumClosest(int[] A, int B) {
        
        int length = A.length;
        Arrays.sort(A);
        int sum, s, t, closeSum = B, difference = Integer.MAX_VALUE;
        
        for(int f =0 ; f< length - 2; f++){
            
            s = f + 1;
            t = length - 1;
            
            while(s < t){
                
                sum = A[f] + A[s] + A[t];
                if(sum == B){
                    return sum;
                } else if(sum < B){
                    s++;
                }else{
                    t--;
                }
                
                if(Math.abs(sum - B) < difference){
                    closeSum = sum;
                    difference = Math.abs(sum - B);
                }
                
            }
        
        }
        return closeSum;
    }  
}

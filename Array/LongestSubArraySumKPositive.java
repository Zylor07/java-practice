public class LongestSubArraySumKPositive {
     public static int solution(int []arr,int k){
        int left=0;
        int sum=0;
        int maxLen=0;
        for(int right=0;right<arr.length;right++){
            sum+=arr[right];
            while(sum>k){
                sum-=arr[left];
                left++;

            }
            if(sum==k){
                maxLen=Math.max(maxLen, right-left+1);
            }

        }
        return maxLen;
    }
    public static void main(String[] args) {
        int []arr={1,2,3,1,1,1,1,4,2,3};
        int k=3;
        System.out.println(solution(arr,k));
    }
}
    


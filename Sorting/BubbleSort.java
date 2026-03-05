public class BubbleSort {
    public static int[] solution(int []arr){
        int temp;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                 if(arr[j+1]>arr[j]){
             temp=arr[j+1];
            arr[j+1]=arr[j];
            arr[j]=temp;
            }
          
           }
            
        }
        return arr;

    }
    public static void main(String[] args) {
        int []num={5,4,7,8,3,10,1};
         int[] result = solution(num);

        for(int n : result){
            System.out.println(n);
        }

        
    }
    
}

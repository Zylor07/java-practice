class DigitExtraction{
    public static void digit(int N){
        int count=0;
        while(N>0){
            int lastDigit=N%10;
            count++;
            N=N/10;
            
        System.out.println(lastDigit);


        }
        System.out.println(count);
        
    }
    public static void main(String[] args) {
        digit(2278);

    }
}
class DigitExtraction{
    public static void digit(int N){
        while(N>0){
            int lastDigit=N%10;
            N=N/10;
            
        System.out.println(lastDigit);

        }
    }
    public static void main(String[] args) {
        digit(2278);

    }
}
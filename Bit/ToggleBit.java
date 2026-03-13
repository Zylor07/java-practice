public class ToggleBit {
    public static void main(String[] args) {
        int n=5;
        int mask=7;// why 7 ? because it will have 111 for 2^3 range(5 belongs to 2^3 range)
        int result=(~n) & mask;
        System.out.println(result);

    }
    
}

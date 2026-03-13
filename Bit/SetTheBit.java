public class SetTheBit {
    

    public static void main(String[] args) {

        int n = 5;
        int i = 2;

        if((n & (1 << i)) == 0){
            int result = n | (1 << i);
            System.out.println(result);
        }
        else{
            System.out.println("Already set");
        }

    }
}
    


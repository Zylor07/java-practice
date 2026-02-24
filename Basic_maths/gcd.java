public class gcd {
    public  static int  gcdof(int x,int y){
        int gcd=1;
        for(int i=1;i<=y;i++){
            if(y%i==0 && x%i==0){
                gcd=i;
            }
        }
        return gcd;


    }
    public static void main(String[] args) {
        int n=20;
        int z=40;
        
        System.out.println(gcdof(n, z));
        
    }
}

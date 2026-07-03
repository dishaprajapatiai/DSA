// Explain the concept of fast exponention to calculation a^b in log n time 
public class exp {
    public static void main(String[] args) {
        System.out.println(fastExp(2, 6));
    }

    public static int fastExp(int a,int n){
        int ans = 1;
        while(n>0){
            if((n&1) == 1){
                ans = ans *a;
            }
            a = a*a;
            n = n>>1;
        }
        return ans ;
    }
}

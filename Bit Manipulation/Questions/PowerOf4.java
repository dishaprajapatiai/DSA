// Check whether a number is a power of the 4 or not
public class PowerOf4 {
    public static void main(String[] args) {
        System.out.println(Power(16));
    }

    public static boolean Power(int n){
        return n> 0 &&(n&(n-1)) == 0 && (n& 0x55555555) !=0;
    }
}

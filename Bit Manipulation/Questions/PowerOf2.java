// To check whether a number is the power of 2 or not 
public class PowerOf2 {
    public static void main(String[] args) {
        System.out.println(Power(8));
    }

    public static boolean Power(int n){
        return  (n>0) && (n &(n-1)) == 0; // checks the number and one smaller number to it and AND between them will give 0
    }
}

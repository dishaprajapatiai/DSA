// CHECK WHETHER A NUMBER IS EVEN OR ODD

public class EvenOrOddNo {
    public static void main(String[] args) {
        int n = 156;
        int bitmask = 1;
        int ans = n & bitmask;
        if(ans == 0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
    }
}

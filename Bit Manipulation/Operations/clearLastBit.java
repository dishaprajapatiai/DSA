public class clearLastBit {
    public static void main(String[] args) {
        System.out.println(clearLastIthBit(15, 2));
    }

    public static int clearLastIthBit(int n , int i){
        int bitmask = ~0 << i;
        int ans = n & bitmask;
        return ans;
    }
}



public class setBit {
    public static void main(String[] args) {
        System.out.println(setIthBit(12, 2));
    }

    public static int setIthBit(int n ,int i){
        int bitmask = 1<<i;
        int ans = n | bitmask;
        return ans ;
    }
}

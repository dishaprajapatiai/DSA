public class clearRangeOfBit {
    public static void main(String[] args) {
        System.out.println(clearRange(2515, 2, 7));
    }

    public static int clearRange(int n, int i, int j){
        int a = (~0)<< (j+1);
        int b = (1 << i)-1;
        int bitmark = a|b;
        int ans = n & bitmark;
        return ans;
    }
}

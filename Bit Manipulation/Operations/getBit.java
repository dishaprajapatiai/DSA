// Check that what is the bit on the i th bit ith number 
// Here we check in the number 10(1010) at postion 2 where 2nd position has 0 in its place
public class getBit {
    public static void main(String[] args) {
        System.out.println(getIthBit(10,2));
    }
    public static int getIthBit(int n ,int i){
        int bitmask = 1<<i;
        int ans = n & bitmask;
        if(ans ==0){
            return 0;
        }else{
            return 1;
        }
    }
}

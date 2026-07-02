// We nee to update the the value of  1 and 0 according to the newBit and position provided 
// NewBit tells that whether we need the ith position to be 0 or 1 
// If 0 then use clearBit fun else use setBit func
public class updateBit {
    public static void main(String[] args) {
        System.out.println(updateBit(10, 2, 1));
    }

      public static int updateBit(int n, int i, int newBit){
        if(newBit == 0){
            return clearBit(n, i);
        }else{
            return setBit(n, i);
        }
    }

    public static int clearBit(int n, int i){
        int bitmask = ~(1<<i);
        int ans = n & bitmask;
        return ans;
    }

      public static int setBit(int n, int i){
        int bitmask = 1<<i;
        int ans = n | bitmask;
        return ans;
    }
}

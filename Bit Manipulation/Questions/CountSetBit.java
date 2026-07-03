// Count the number of 1 in a binary number

public class CountSetBit {
    public static void main(String[] args) {
        System.out.println(SetBit(10));
    }

    public static int SetBit(int n){
        int count = 0;
        while(n>0){
            if((n&1) != 0){
                count ++;
            }
            n =  n >> 1;
            
        }
        return count;
    }
}

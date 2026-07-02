// The below code will TOGGLE the number meaning it will change 1 to 0 but not 0 to 0 it will change 0 to 1 which we don't want 
// public class clearBit {
//     public static void main(String[] args) {
//         System.out.println(clearIthBit(8, 1));
//     }

//     public static int clearIthBit(int n , int i){
//         int bitmask = 1<<i;
//         int ans = n ^ bitmask;
//         return ans;
//     }
// }


// This is the correct way to clear a bit that is changing from 1 to 0 and 0 to 0 but taking negation of(1<<i) and doing & with n
public class clearBit {
    public static void main(String[] args) {
        System.out.println(clearIthBit(8, 1));
    }

    public static int clearIthBit(int n , int i){
        int bitmask = ~(1<<i);
        int ans = n & bitmask;
        return ans;
    }
}
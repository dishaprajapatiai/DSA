public class AccessModifier {
    public static void main(String[] args) {
        BankAccount bankAcc = new BankAccount();
        bankAcc.username = "Disha";
        // bankAcc.password = "1324";  // This is wrong bcz it can't be accessed outside the class
        bankAcc.setPassword("13425");
        
    }

    static class BankAccount{
       public String username;
       private String password;
       public void setPassword(String pwd){
        password = pwd ;
       }
    }
}


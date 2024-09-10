public class Access_modifier {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.Username="Prem";
        //myAccount.Password="kumar";//is private
        myAccount.setPassword("Kumar");
    }
}

class BankAccount{
    public String Username;
    private String Password;

    public void setPassword(String password){
        Password=password;
    }
}

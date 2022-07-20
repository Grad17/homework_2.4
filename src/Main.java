public class Main {
    public static void main(String[] args) {
        AccountData account1 = new AccountData("fF0_!", "sS_1", "sS_1");
        System.out.println(account1.getLogin() + " " + account1.getPassword());
        System.out.println(Validator.checkAccount(account1));
    }
}
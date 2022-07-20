public class Validator {
    public static boolean checkAccount(AccountData accountData) {
        try {
            verification(accountData);
        } catch (WrongLoginException e) {
            System.out.println("не верный логин");
            return false;
        }
        catch (WrongPasswordException e) {
            System.out.println("не верный пароль");
            return false;
        }
        System.out.println("все верно");
        return true;
    }
    private static void verification(AccountData accountData) throws WrongLoginException, WrongPasswordException {
        if (!accountData.getLogin().matches("[a-zA-Z0-9_]+") || accountData.getLogin().length() <= 20) {
            System.out.println("accountData = " + accountData.getLogin() + " " + accountData.getPassword());
            throw new WrongLoginException();
        }
        if (!accountData.getPassword().matches("[a-zA-Z0-9_]+") || accountData.getPassword().length() < 20) {
            throw new WrongPasswordException();
        }
        if (accountData.getConfirmPassword().equals(accountData.getPassword())) {
            throw new WrongPasswordException();
        }
    }
}

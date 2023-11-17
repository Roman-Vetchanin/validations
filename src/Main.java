
import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String login = "java_skypro_go";
        String password = "D_1hWiKjjP_9";
        String confirmPassword = "D_1hWiKjjP_9";
        validation(login,password,confirmPassword);

    }

    private static void validation(String login, String password, String confirmPassword) {

        try {
            if (login.length() <= 20 && Pattern.matches("[a-zA-Z_]+",login)) {
                System.out.println("Login...PASS");
            } else {
                throw new WrongLoginException();
            }
            if (password.length() <= 20 && Pattern.matches("[a-zA-Z0-9_]+",password)) {
                System.out.println("Password...PASS");
            } else {
                throw new WrongPasswordException();
            }
            if (confirmPassword.length() <= 20 && Pattern.matches("[a-zA-Z0-9_]+",confirmPassword)) {
                System.out.println("ConfirmPassword...PASS");
            } else {
                throw new WrongPasswordException();
            }
            if (password.equals(confirmPassword)) {
                System.out.println("Пароли идентичные");
            } else {
                throw new WrongPasswordException();
            }
        } catch (WrongLoginException e) {
            e.printStackTrace();
            System.out.println("Логин не соотвествует требованиям");
        } catch (WrongPasswordException e) {
            e.printStackTrace();
            System.out.println("Пароль или подтверждение пароля не соответствует требованиям");
        }
    }
}
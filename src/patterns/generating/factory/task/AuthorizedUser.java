package patterns.generating.factory.task;

import java.util.Scanner;

public class AuthorizedUser implements User{
    private String login;
    private String password;

    public AuthorizedUser() {
        this.login = prompt("Enter login: ");
        this.password = prompt("Enter password: ");
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public User createUser() {
        System.out.println("You try to get access into production profile. Please, authorized");
        return new AuthorizedUser();
    }
    private String prompt(String message){
        System.out.println(message);
        return new Scanner(System.in).next();
    }
}

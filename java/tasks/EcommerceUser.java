package tasks;

import java.util.ArrayList;

public class EcommerceUser {
    private String Email;
    private String password;
    private String role;
    static String currentUser;

    public EcommerceUser(String email, String password, String role) {
        Email = email;
        this.password = password;
        this.role = role;
    }
    public static ArrayList<EcommerceUser> usersList = new ArrayList<EcommerceUser>();

    public String getEmail() {
        return Email;
    }

    public static String getCurrentUser() {
        return currentUser;
    }

    public static void setCurrentUser(String currentUser) {
        EcommerceUser.currentUser = currentUser;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }


    public String print() {
        return "\n╔════════════════════════════════════════════╗\n" +
                "║               🌟 USER DETAILS 🌟                ║\n" +
                "╠════════════════════════════════════════════╣\n" +
                "║ 📧 Email       : " + Email + "\n" +
                "║ 🔒 Password    : " + password + "\n" +
                "║ 🛠  Role       : " + role + "\n" +
                "╚════════════════════════════════════════════╝\n";
    }

}
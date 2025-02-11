package userpackage;
import costomer.Method;
import costomer.UserVersion1;
//import costomer.EcommerceOrder;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Method EcommerceCustomer = new UserVersion1();



        Scanner sc  = new Scanner(System.in);
        boolean exit = true;
        while (exit) {
            System.out.println("MOST WELCOME IN A E COMMERCE APPLICATION : ");
            String user = sc.nextLine();

            switch (user){

                case "signup" -> EcommerceCustomer.signup();


                case "login" ->   EcommerceCustomer.login();


                case "update"-> EcommerceCustomer.update();


                case "logout"-> EcommerceCustomer.logout();


                case "exit"-> exit=false;


                default -> {
                    System.out.println("Invalid option, please try again.");
                }


            }
        }
    }
}
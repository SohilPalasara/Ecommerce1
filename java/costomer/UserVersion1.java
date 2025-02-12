package costomer;

import admin.EcommerceOrder;
import admin.EcommerceProduct;
import tasks.EcommerceUser;

import java.util.Scanner;



public class UserVersion1 implements Method {

  EcommerceProduct product = new EcommerceProduct();
  EcommerceOrder order = new EcommerceOrder();


    Scanner scanner = new Scanner(System.in);

  @Override
    public void signup() {

        System.out.println("SIGN UP : ");

        System.out.print("enter the email : ");
        String email = scanner.nextLine();

        System.out.print("enter the password : ");
        String password = scanner.nextLine();

        System.out.print("Enter the role (admin/customer): ");
        String role = scanner.nextLine();

        EcommerceUser tasks = new EcommerceUser(email, password, role);
        EcommerceUser.usersList.add(tasks);

        System.out.println("THE SIGNUP SUCCESSFULLY : ");

    }

@Override
    public void login() {

        System.out.println("LOGIN : ");

        System.out.print("enter the email : ");
        String email = scanner.nextLine();


        System.out.print("enter the password : ");
        String password = scanner.nextLine();

        for (EcommerceUser task : EcommerceUser.usersList) {

            if (task.getEmail().equals(email) && task.getPassword().equals(password)) {

                System.out.println("LOGIN SUCCESSFUL! WELCOME APPLICATION MEMBER : ");

                EcommerceUser.setCurrentUser(task.getEmail());

                System.out.println("ROLE : " + task.getRole());

                if (task.getRole().equalsIgnoreCase("admin")) {

                    order.admin();
                }
                else if (task.getRole().equalsIgnoreCase("customer")) {

                  order.customer();
                }
            }
            else if (task.getEmail().equals(email)) {
                    System.out.println(" PASSWORD IS WRONG : ");
                }
            else if (task.getPassword().equals(password)) {

                    System.out.println(" EMAIL IS WRONG : ");
                }

//            else {
//                    System.out.println("ACCOUNT NOT FOUND PLEASE SIGN UP : ");
//                    break;
//                }
            }
        }

        @Override
        public void update () {

            for (EcommerceUser task : EcommerceUser.usersList) {
                StringBuilder sb = new StringBuilder();
                System.out.print("ENTER THE EMAIL | PASSWORD | CUSTOMER | ADMIN  : ");
                String up =scanner.nextLine();

                if (up.equalsIgnoreCase("email")) {

                    System.out.print("ENTER THE ORIGINAL  EMAIL : ");
                    String ori_email = scanner.nextLine();
                    if (task.getEmail().equalsIgnoreCase(ori_email)) {
                        System.out.print("enter the NEW email : ");
                        String new_email = scanner.nextLine();
                        sb.append(new_email) ;
                        task.setEmail(new_email);
                    }

                } else if (up.equalsIgnoreCase("password")) {
                    System.out.print("enter the original password : ");
                    String ori_password = scanner.nextLine();
                    if (task.getPassword().equalsIgnoreCase(ori_password)) {
                        System.out.print("enter the new password  : ");
                        String new_password = scanner.nextLine();
                        sb.append(new_password);
                        task.setPassword(new_password);
                    }

                } else if (up.equalsIgnoreCase("customer") || up.equalsIgnoreCase("admin")) {
                    System.out.print("ENTER THE EMAIL IN A ROLE UPDATE : ");
                    String sameemail = scanner.nextLine();
                    if (task.getEmail().equalsIgnoreCase(sameemail)) {
                        System.out.print("enter the original role : ");
                        String ori_role = scanner.nextLine();
                        if (task.getRole().equalsIgnoreCase(ori_role)) {
                            System.out.print("enter the new role  : ");
                            String new_role = scanner.nextLine();
                            sb.append(new_role);
                            task.setRole(new_role);
                        }

                    }

                }

                else {
                    System.out.println("INVALID CHOICE : ");
                }

                break;
            }
        }
       @Override
        public void logout () {
            System.out.println("LOGOUT : ");
            for (EcommerceUser task : EcommerceUser.usersList) {
                System.out.print("ENTER THE LOGOUT EMAIL ID : ");
                String email = scanner.nextLine();
                if (task.getEmail().equalsIgnoreCase(email)) {

                    EcommerceUser.usersList.remove(task);
                    System.out.println("THE EMAIL LOGOUT SUCCESSFULLY : ");

                }
                break;
            }
        }

    }

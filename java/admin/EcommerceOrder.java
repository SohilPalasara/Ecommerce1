package admin;

import tasks.EcommerceOrderTask;
import tasks.EcommerceUser;

import java.util.Scanner;

public class EcommerceOrder implements OrderMethod {
    EcommerceProduct product = new EcommerceProduct();
    Scanner scanner = new Scanner(System.in);
@Override
    public void admin() {
        boolean exit = true;
        while (exit) {
            System.out.print("ENTER THE (ADDPRODUCT  |  USERVIEW  | UPDATEPRODUCT | REMOVEPRODUCT | ORDER VIEW | EXIT : ");

            String addProduct = scanner.nextLine();

            if (addProduct.equalsIgnoreCase("addproduct")) {

                System.out.println("WELCOME TO THE ADMIN : ");

                product.addProduct();


            } else if (addProduct.equalsIgnoreCase("updateproduct")) {

                product.updateProduct();

            } else if (addProduct.equalsIgnoreCase("orderview")) {

                System.out.println(EcommerceOrderTask.orderList);

            } else if (addProduct.equalsIgnoreCase("removeproduct")) {

                product.removeProduct();

            } else if (addProduct.equalsIgnoreCase("userview")) {

                System.out.println("WELCOME TO THE ADMIN : ");

                for (EcommerceUser tasks : EcommerceUser.usersList) {

                    System.out.println(tasks.print());

                }

            } else if (addProduct.equalsIgnoreCase("exit")) {

                exit = false;
            }

        }

    }
    @Override
    public void customer(){


    boolean exit = true;
                    while (exit) {

        product.productView();

        System.out.print("ENTER THE | buy | ORDER VIEW  | EXIT: ");
        String buy = scanner.nextLine();

        if (buy.equalsIgnoreCase("buy")) {
            EcommerceOrderTask order = product.sellProduct();
        } else if (buy.equalsIgnoreCase("orderview")) {

            for (EcommerceOrderTask order : EcommerceOrderTask.orderList) {

                if (order.getOrderCustomerName().equals(EcommerceUser.getCurrentUser())) {
                    System.out.println(order.toString());
                } else {
                    System.out.println("SIR ORDER NOT AVALIABLE : ");

                }

            }

        }
        else if (buy.equalsIgnoreCase("exit")) {
            exit=false;

        } else {
            System.out.println("please check the input");
            return;
        }




    }
}
}

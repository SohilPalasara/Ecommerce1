package admin;

import tasks.AddToCartTask;
import tasks.EcommerceOrderTask;
import tasks.EcommerceProductTask;
import tasks.EcommerceUser;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static tasks.AddToCartTask.addToCart;

public class EcommerceProduct implements ProductMethod {

    Scanner scanner = new Scanner(System.in);
   ArrayList<EcommerceProductTask> product = new ArrayList<>();

   @Override
    public void addProduct(){


        System.out.println("ADD PRODUCT : ");
        System.out.print("enter the product name: ");
        String productName = scanner.nextLine();

//                    scanner.nextLine();
        System.out.print("Enter the id product :  ");
        String productId = scanner.nextLine();

        System.out.print("enter the price  : ");
        int productPrice = scanner.nextInt();
        scanner.nextLine();

        System.out.print("enter the stock : ");
        int stock = scanner.nextInt();
        scanner.nextLine(); // eat leftover \n

        EcommerceProductTask task = new EcommerceProductTask(productName, productId,productPrice,stock);
        product.add(task);
        System.out.println("THE ADD PRODUCT SUCCESSFULLY : ");

    }

@Override
    public  void productView() {
        for (EcommerceProductTask task : product) {

            System.out.println(task.productPrint());
        }

    }

    @Override
    public void updateProduct() {

        System.out.print("ENTER THE PRODUCTNAME : ");
        String sameProductName = scanner.nextLine();

        for (EcommerceProductTask task : product) {

            if(task.getProductName().equalsIgnoreCase(sameProductName)) {
                System.out.print("ENTER THE  PRODUCTPRICE | PRODUCTSTOCK  : ");
                String up = scanner.nextLine();
                if (up.equalsIgnoreCase("productprice")) {
                        System.out.print("enter the new productprice  : ");
                        int new_productPrice = scanner.nextInt();
                        scanner.nextLine();
                        task.setProductPrice(new_productPrice);
                    }

                else if (up.equalsIgnoreCase("productstock")) {
                        System.out.print("enter the new productstock  : ");
                        int new_productStock = scanner.nextInt();
                        scanner.nextLine();
                        task.setStock( new_productStock);
                    }
            }
        }
    }
@Override
    public EcommerceOrderTask sellProduct() {

        System.out.print("ENTER THE PRODUCTNAME : ");
        String sameProductName = scanner.nextLine();


        for (EcommerceProductTask task : product) {

            if(task.getProductName().equalsIgnoreCase(sameProductName)) {
                    System.out.print("ENTER THE SELL STOCK : ");
                    int sellStock = scanner.nextInt();
                    scanner.nextLine();
                    if(task.getStock() >= sellStock){
                        task.setStock(task.getStock() - sellStock);
                        System.out.print("ENTER THE CUSTOMER NAME : ");
                        String customerName = scanner.nextLine();
                        System.out.print("ENTER THE MOBILE NO : " );
                        String mobileNo=scanner.nextLine();
                        System.out.print("ENTER A ADDRESS : ");
                        String add = scanner.nextLine();

                        System.out.println();
                        EcommerceOrderTask order = new EcommerceOrderTask(customerName,task.getProductName(), sellStock, (sellStock * task.getProductPrice()), EcommerceUser.getCurrentUser(), add,mobileNo);
                        EcommerceOrderTask.orderList.add(order);
                        return order;
                    }else{
                        System.out.print("Out of Stock!!  : ");
                        break;
                    }
            }
        }
        return null;
    }

@Override
    public void removeProduct() {
        System.out.println("REMOVE : ");
        System.out.print("ENTER THE REMOVE PRODUCT NAME : ");
        String productName = scanner.nextLine();
        for (EcommerceProductTask task : product) {
            if (task.getProductName().equalsIgnoreCase(productName)) {

                product.remove(task);
                System.out.println("THE PRODUCT REMOVE SUCCESSFULLY : ");

            }
            break;
        }
    }
    public void addToCart(){

            if (EcommerceUser.getCurrentUser() != null) {
                for (EcommerceProductTask task : product) {
                    System.out.println("enter ");
                    String productName = scanner.nextLine();
                    if (task.getProductName().equalsIgnoreCase(productName)) {

                        addToCart.put(EcommerceUser.getCurrentUser(), List.of(task));
                        System.out.println("THE ADD TO CART SUCCESSFULLY : ");
                    }
                    else {
                        System.out.println("product not available");
                    }
                }
        }
    }
    public void showCart(){
            System.out.println(addToCart.get(EcommerceUser.getCurrentUser()));
    }



}


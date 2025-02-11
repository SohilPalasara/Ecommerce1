package tasks;

import java.util.ArrayList;

public class EcommerceOrderTask {
    private String customerName;
    private String productName;
    private int quantity;
    private double totalAmount;
    private String orderCustomerName;
    private String address;
    private String mobileNo;
    public static ArrayList<EcommerceOrderTask> orderList = new ArrayList<>();


    public EcommerceOrderTask(String customerName,String productName, int quantity, double totalAmount,String orderCustomerName, String address,String mobileNo) {
        this.customerName=customerName;
        this.productName = productName;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
        this.orderCustomerName = orderCustomerName;
        this.address = address;
        this.mobileNo=mobileNo;
    }

//    public String orderPrint() {
//        return "\n╔════════════════════════════════════════════╗\n" +
//                "║             🌟 ORDER DETAILS 🌟              ║\n" +
//                "╠════════════════════════════════════════════╣\n" +
//                "║ 📦 Product Name       : " + productName + "\n" +
//                "║ 🆔 Order Customer ID  : " + orderCustomerName + "\n" +
//                "║ 🏠 Delivery Address   : " + address + "\n" +
//                "║ 🛒 Quantity Ordered   : " + quantity + " units\n" +
//                "║ 💰 Total Amount      : $" + totalAmount + "\n" +
//                "╚════════════════════════════════════════════╝\n";
//    }


//    @Override
//    public String toString() {
//        return "\n╔════════════════════════════════════════════╗\n" +
//                "║             🌟 ORDER DETAILS 🌟              ║\n" +
//                "╠════════════════════════════════════════════╣\n" +
//                "║ 📦 Product Name       : " + productName + "\n" +
//                "║ 🆔 Order Customer ID  : " + orderCustomerName + "\n" +
//                "║ 🏠 Delivery Address   : " + address + "\n" +
//                "║ 🛒 Quantity Ordered   : " + quantity + " units\n" +
//                "║ 💰 Total Amount      : $" + totalAmount + "\n" +
//                "╚════════════════════════════════════════════╝\n";
//    }


    @Override
    public String toString() {
        return "\n╔════════════════════════════════════════════╗\n" +
                "║             🌟 ORDER DETAILS 🌟              ║\n" +
                "╠════════════════════════════════════════════╣\n" +
                "║ 🧑‍🤝‍🧑 Customer Name      : " + customerName + "\n" +
                "║ 📦 Product Name        : " + productName + "\n" +
                "║ 🆔 Order Customer Login Email Id   : " + orderCustomerName + "\n" +
                "║ 🏠 Delivery Address    : " + address + "\n" +
                "║ 🛒 Quantity Ordered    : " + quantity + " units\n" +
                "║ 💰 Total Amount       : $" + totalAmount + "\n" +
                "║ 📱 Mobile Number      : " + mobileNo + "\n" +
                "╚════════════════════════════════════════════╝\n";
    }


    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }


    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getOrderCustomerName() {
        return orderCustomerName;
    }

    public String getAddress() {
        return address;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setOrderCustomerName(String orderCustomerName) {
        this.orderCustomerName = orderCustomerName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
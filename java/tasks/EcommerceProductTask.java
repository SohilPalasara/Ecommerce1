package tasks;

public class EcommerceProductTask {
    private String productName;
    private String productId;
    private int productPrice;
    private int stock;

    public EcommerceProductTask(String productName, String productId, int productPrice ,int stock) {
        this.productName = productName;
        this.productId = productId;
        this.productPrice = productPrice;
        this.stock=stock;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public int getStock() {
        return stock;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    //    public String productPrint() {
//        return "\n╔════════════════════════════════════════════╗\n" +
//                "║              🌟 PRODUCT DETAILS 🌟              ║\n" +
//                "╠════════════════════════════════════════════╣\n" +
//                "║ 📦 Product Name  : " + productName + "\n" +
//                "║ 🆔 Product ID    : " + productId + "\n" +
//                "║ 💰 Product Price : $" + productPrice + "\n" +
//                "╚════════════════════════════════════════════╝\n";
//    }
    public String productPrint() {
        return "\n╔════════════════════════════════════════════╗\n" +
                "║              🌟 PRODUCT DETAILS 🌟              ║\n" +
                "╠════════════════════════════════════════════╣\n" +
                "║ 📦 Product Name  : " + productName + "\n" +
                "║ 🆔 Product ID    : " + productId + "\n" +
                "║ 💰 Product Price : $" + productPrice + "\n" +
                "║ 🛒 Stock         : " + stock + " units\n" +
                "╚════════════════════════════════════════════╝\n";
    }

}
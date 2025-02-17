package tasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AddToCartTask {
    String productName;
    public static String currentproductName;

    public AddToCartTask(String productName, String currentproductName) {
        this.productName = productName;
    }

    public static Map<String, List<EcommerceProductTask>> addToCart=new HashMap<>();


    public String getProductName() {
        return productName;
    }

    public static String getCurrentproductName() {
        return currentproductName;
    }

    public static void setCurrentUser(String currentUser) {
        EcommerceUser.currentUser = currentUser;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
}

package admin;

import tasks.EcommerceOrderTask;

public interface ProductMethod {
    public void addProduct();

    public  void productView();

    public void updateProduct();
    public EcommerceOrderTask sellProduct();
    public void removeProduct();

}

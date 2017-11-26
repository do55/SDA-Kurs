package service;
import model.Product;

public abstract class ProductService {

    public abstract Double calculateProductPriceWithMargin(Product product);
//mamy pewność, że nasza metoda będzie pracowała tylko na produkcie
}

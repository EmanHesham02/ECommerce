package controller.product;

import model.beans.Product;
import model.database.ProductOperation;
import model.interfaces.ProductOperationInterface;

import java.sql.SQLException;
import java.util.Vector;
import model.beans.Category;

public class ProductController {

   private ProductOperationInterface productOperation;

    public ProductController() {
        productOperation = new ProductOperation();
    }

    public boolean addNewProduct(Product product) {
        return false;
    }

    public boolean isProductAvailable(int productSKU, int quantity) {
        return productOperation.getProductInfo(productSKU).getQuantiity() >= quantity;
    }

    public Product getProduct(int productSKU) {
        return productOperation.getProductInfo(productSKU);
    }

    public Vector<String> getAllCategories() throws SQLException {
        return productOperation.getAllCategories();
    }


    public Vector<Product> getCategoryProducts(String category) throws SQLException {
        return productOperation.getCategoryProducts(category);
    }

    public Vector<Product> getCategoryProducts(String category , int index) throws SQLException {
        return productOperation.getCategoryProducts(category , index);
    }
    public Vector<Product> getCategoryProductswithPrice(String category, double minPrice, double maxPrice) throws SQLException {
        return productOperation.getCategoryProductswithPrice(category, minPrice, maxPrice);

    }

    public boolean decreaseQuantity(int productID , int quantity){
        return productOperation.decreaseQuantity(productID , quantity);
    }

    public boolean addNewCategory(Category category){
        return productOperation.addNewCategory(category.getName());
    }
}
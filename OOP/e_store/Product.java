package oop_snack;

public class Product {
    private String productId;
    private String productName;
    private double price;
    private String productDescription;
    ProductCategory[] productCategory;
    Product(String productId, String productName,
            double price, String productDescription, ProductCategory[] productCategory){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.productDescription = productDescription;
        this.productCategory = productCategory;
    }

}

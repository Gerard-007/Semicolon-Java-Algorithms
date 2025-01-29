public class Product {
    private int productId;
    private String productName;
    private double price;
    private String productDescription;
    private ProductCategory category;

    public Product(int productId, String productName, double price, String productDescription, ProductCategory category) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.productDescription = productDescription;
        this.category = category;
    }
}

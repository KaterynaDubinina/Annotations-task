package app;

@Product(name = "orange", quota = 12)
public class ProductInfo {

    @Product(name = "apple", quota = 2)
    public String getData() {
        return "No data...";
    }
}
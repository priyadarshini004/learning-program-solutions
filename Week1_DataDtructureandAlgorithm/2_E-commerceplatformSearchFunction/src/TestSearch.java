public class TestSearch {
    public static void main(String[] args) {
        Product[] products = {
            new Product(104, "Smartphone", "Electronics"),
            new Product(101, "Laptop", "Electronics"),
            new Product(103, "Shoes", "Footwear"),
            new Product(102, "Watch", "Accessories"),
        };

        int targetId = 103;

        // Linear Search
        Product foundLinear = SearchUtility.linearSearch(products, targetId);
        System.out.println("Linear Search Result: " + foundLinear);

        // Sort for Binary Search
        SearchUtility.sortByProductId(products);

        // Binary Search
        Product foundBinary = SearchUtility.binarySearch(products, targetId);
        System.out.println("Binary Search Result: " + foundBinary);
    }
}
